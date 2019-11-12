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
public class FuncionarioDAO extends DAO<Funcionario> {
    
    @Override
    public boolean inserir(Funcionario element) {
       try{
            String query = "INSERT INTO funcionarios(nome, sobrenome, cpf, cep, logradouro, numero, bairro, cidade, estado, pais, ativo, id_candidato) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
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
            stmt.setInt(12, element.getCandidato().getId());
            
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
    public boolean alterar(Funcionario element) {
        try{
            String query = "UPDATE funcionarios SET nome = ?, sobrenome = ?, cpf = ?, cep = ?, logradouro = ?, numero = ?, bairro = ?, cidade = ?, estado = ?, pais = ?, ativo = 1, id_candidato = ? WHERE id_funcionario = ?";
            
            PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
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
            stmt.setInt(12, element.getCandidato().getId());
            
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
    public boolean apagar(Funcionario element) {
        try{
            String query = "UPDATE funcionarios SET ativo = 0 WHERE id_funcionario = ?";
            
            PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
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
    public List<Funcionario> listar() {
        List<Funcionario> listaFuncionario = new ArrayList<>();
        listaFuncionario = ObservableCollections.observableList(listaFuncionario);
        CandidatoDAO cd = new CandidatoDAO();
        
        String sql = "SELECT * from funcionarios WHERE ativo = 1;";
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Funcionario f = new Funcionario();
                f.setId(rs.getInt("id_funcionario"));
                f.setNome(rs.getString("nome"));
                f.setSobrenome(rs.getString("sobrenome"));
                f.setCpf(rs.getString("cpf"));
                f.setCep(rs.getString("cep"));
                f.setLogradouro(rs.getString("logradouro"));
                f.setNumero(rs.getInt("numero"));
                f.setBairro(rs.getString("bairro"));
                f.setCidade(rs.getString("cidade"));
                f.setEstado(rs.getString("estado"));
                f.setPais(rs.getString("pais"));
                f.setCandidato(cd.getById(rs.getInt("id_candidato")));
                listaFuncionario.add(f);
            }
            
        }catch(SQLException e){
            System.out.println("Erro ao listar: " + e);
        }
        return listaFuncionario;
    }
    
    public boolean buscar(Funcionario element) {
        try{
            String query = "SELECT * FROM funcionarios WHERE cpf = ?";
            
            PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
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
            String query = "UPDATE funcionarios SET ativo = 1 WHERE cpf = ?";
            
            PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
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
    
    public Funcionario ativo(String cpf) {
        Funcionario f = new Funcionario();
        CandidatoDAO cd = new CandidatoDAO();
        try{
            String query = "SELECT * FROM funcionarios WHERE cpf = ?";
            
            PreparedStatement stmt = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, cpf);
            
            ResultSet result = stmt.executeQuery();
            if(result.next()){
                f.setId(result.getInt("id_funcionario"));
                f.setNome(result.getString("nome"));
                f.setSobrenome(result.getString("sobrenome"));
                f.setCpf(result.getString("cpf"));
                f.setCep(result.getString("cep"));
                f.setLogradouro(result.getString("logradouro"));
                f.setNumero(result.getInt("numero"));
                f.setBairro(result.getString("bairro"));
                f.setCidade(result.getString("cidade"));
                f.setEstado(result.getString("estado"));
                f.setPais(result.getString("pais"));
                f.setCandidato(cd.getById(result.getInt("id_candidato")));
            }
            return f;
            
        }catch(SQLException e){
            System.out.println("Erro ao ativar: "+ e.getMessage());
        }
        
        return f;
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
