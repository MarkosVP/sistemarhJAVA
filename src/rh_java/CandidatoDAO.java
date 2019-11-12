/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rh_java;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author otavi
 */
public class CandidatoDAO extends DAO<Candidato> {
    
    @Override
    public boolean inserir(Candidato element) {
       try{
            String query = "INSERT INTO candidatos(nome, sobrenome, cpf, cep, logradouro, numero, bairro, cidade, estado, pais, ativo) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement stmt = Conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, element.getNome());
            stmt.setString(2, element.getSobrenome());
            stmt.setString(3, element.getCpf());
            stmt.setString(4, element.getCep());
            stmt.setString(5, element.getLogradouro());
            stmt.setInt(6, element.getNumero());
            stmt.setString(7, element.getBairro());
            stmt.setString(8, element.getCidade());
            stmt.setString(9, element.getEstado());
            stmt.setString(10, element.getPais());
            stmt.setInt(11, 1);
            
            int linha = stmt.executeUpdate();
            
            if(linha == 1) {
                ResultSet rs = stmt.getGeneratedKeys();
                rs.next();
                element.setId(rs.getInt(1));
                return true;
            }
            
        }catch(SQLException e){
            System.out.println("Erro ao inserir: "+ e.getMessage());
        }
        return false;
    }

    @Override
    public boolean alterar(Candidato element) {
        try{
            String query = "UPDATE candidatos SET nome = ?, sobrenome = ?, cpf = ?, cep = ?, logradouro = ?, numero = ?, bairro = ?, cidade = ?, estado = ?, pais = ?, ativo = 1 WHERE id_funcionario = ?";
            
            PreparedStatement stmt = Conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, element.getNome());
            stmt.setString(2, element.getSobrenome());
            stmt.setString(3, element.getCpf());
            stmt.setString(4, element.getCep());
            stmt.setString(5, element.getLogradouro());
            stmt.setInt(6, element.getNumero());
            stmt.setString(7, element.getBairro());
            stmt.setString(8, element.getCidade());
            stmt.setString(9, element.getEstado());
            stmt.setString(10, element.getPais());
            stmt.setInt(11, element.getId());
            
            int linha = stmt.executeUpdate();
            
            if(linha == 1) {
                ResultSet rs = stmt.getGeneratedKeys();
                rs.next();
                return true;
            }
            
        }catch(SQLException e){
            System.out.println("Erro ao alterar: "+ e.getMessage());
        }
        return false;
    }

    @Override
    public boolean excluir(Candidato element) {
        try{
            String query = "UPDATE candidatos SET ativo = 0 WHERE id_candidato = ?";
            
            PreparedStatement stmt = Conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
            stmt.setInt(1, element.getId());
            
            int linha = stmt.executeUpdate();
            
            if(linha == 1) {
                ResultSet rs = stmt.getGeneratedKeys();
                rs.next();
                return true;
            }
            
        }catch(SQLException e){
            System.out.println("Erro ao excluir: "+ e.getMessage());
        }
        return false;
    }

    @Override
    public List<Candidato> listar() {
        List<Candidato> listaCandidato = new ArrayList<>();
        listaCandidato = ObservableCollections.observableList(listaCandidato);
        
        String sql = "SELECT * from candidatos WHERE ativo = 1;";
        try{
            Statement stmt = Conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Candidato c = new Candidato();
                c.setId(rs.getInt("id_candidato"));
                c.setNome(rs.getString("nome"));
                c.setSobrenome(rs.getString("sobrenome"));
                c.setCpf(rs.getString("cpf"));
                c.setCep(rs.getString("cep"));
                c.setLogradouro(rs.getString("logradouro"));
                c.setNumero(rs.getInt("numero"));
                c.setBairro(rs.getString("bairro"));
                c.setCidade(rs.getString("cidade"));
                c.setEstado(rs.getString("estado"));
                c.setPais(rs.getString("pais"));
                listaCandidato.add(c);
            }
            
        }catch(SQLException e){
            System.out.println("Erro ao listar: " + e);
        }
        return listaCandidato;
    }
    
    public boolean buscar(Candidato element) {
        try{
            String query = "SELECT * FROM candidatos WHERE cpf = ?";
            
            PreparedStatement stmt = Conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, element.getCpf());
            
            ResultSet result = stmt.executeQuery();
            if(result.next()){
                return true;
            }
            return false;
            
        }catch(SQLException e){
            System.out.println("Erro ao ativar: "+ e.getMessage());
        }
        
        return false;
    }
    
    public boolean ativar(String cpf) {
        try{
            String query = "UPDATE candidatos SET ativo = 1 WHERE cpf = ?";
            
            PreparedStatement stmt = Conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, cpf);
            
            int linha = stmt.executeUpdate();
            
            if(linha == 1) {
                ResultSet rs = stmt.getGeneratedKeys();
                rs.next();
                return true;
            }
            
        }catch(SQLException e){
            System.out.println("Erro ao ativar: "+ e.getMessage());
        }
        return false;
    }
    
    public Candidato ativo(String cpf) {
        Candidato c = new Candidato();
        try{
            String query = "SELECT * FROM candidatos WHERE cpf = ?";
            
            PreparedStatement stmt = Conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, cpf);
            
            ResultSet result = stmt.executeQuery();
            if(result.next()){
                c.setId(result.getInt("id_candidato"));
                c.setNome(result.getString("nome"));
                c.setSobrenome(result.getString("sobrenome"));
                c.setCpf(result.getString("cpf"));
                c.setCep(result.getString("cep"));
                c.setLogradouro(result.getString("logradouro"));
                c.setNumero(result.getInt("numero"));
                c.setBairro(result.getString("bairro"));
                c.setCidade(result.getString("cidade"));
                c.setEstado(result.getString("estado"));
                c.setPais(result.getString("pais"));
            }
            return c;
            
        }catch(SQLException e){
            System.out.println("Erro ao ativar: "+ e.getMessage());
        }
        
        return c;
    }
    
    public Candidato getById(int id) {
        Candidato c = new Candidato();
        try{
            String query = "SELECT * FROM candidatos WHERE id_candidato = ?";
            
            PreparedStatement stmt = Conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
            stmt.setInt(1, id);
            
            ResultSet result = stmt.executeQuery();
            if(result.next()){
                c.setId(result.getInt("id_candidato"));
                c.setNome(result.getString("nome"));
                c.setSobrenome(result.getString("sobrenome"));
                c.setCpf(result.getString("cpf"));
                c.setCep(result.getString("cep"));
                c.setLogradouro(result.getString("logradouro"));
                c.setNumero(result.getInt("numero"));
                c.setBairro(result.getString("bairro"));
                c.setCidade(result.getString("cidade"));
                c.setEstado(result.getString("estado"));
                c.setPais(result.getString("pais"));
            }
            return c;
            
        }catch(SQLException e){
            System.out.println("Erro ao ativar: "+ e.getMessage());
        }
        
        return c;
    }
    
    /*public static void main(String args[]){
        Funcionario f = new Funcionario();
        FuncionarioDAO fd = new FuncionarioDAO();
        f.setId(2);
        f.setNome("Otavio");
        f.setSobrenome("romualdo");
        f.setCpf("98745632112");
        
        //fd.alterar(f);
        List<Funcionario> lista = fd.lista();
        System.out.println(lista);
    }*/
    
}
