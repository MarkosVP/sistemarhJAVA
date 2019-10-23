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
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdesktop.observablecollections.ObservableCollections;
/**
 *
 * @author pedro
 */
public class InstituicaoDAO extends DAO<Instituicao>{
    
    @Override
    public boolean inserir(Instituicao element) {
       try{
            String sql = "INSERT INTO instituicao(razao_social, cnpj, apelido, cep, logradouro, numero, cidade, estado, pais) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            
            PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, element.getRazaosocial());
            stmt.setString(2, element.getCnpj());
            stmt.setString(3, element.getApelido());
            stmt.setString(4, element.getCep());
            stmt.setString(5, element.getLogradouro());
            stmt.setString(6, element.getNumero());
            stmt.setString(7, element.getCidade());
            stmt.setString(8, element.getEstado());
            stmt.setString(9, element.getPais());
            
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
    public boolean alterar(Instituicao element) {
        String sql = "update instituicao set razao_social = ?, cnpj = ?, apelido = ?, cep = ?, logradouro = ?, numero = ?, cidade = ?, estado = ?, pais = ? where id_instituicao = ?";
        try{
          
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, element.getRazaosocial());
            stmt.setString(2, element.getCnpj());
            stmt.setString(3, element.getApelido());
            stmt.setString(4, element.getCep());
            stmt.setString(5, element.getLogradouro());
            stmt.setString(6, element.getNumero());
            stmt.setString(7, element.getCidade());
            stmt.setString(8, element.getEstado());
            stmt.setString(9, element.getPais());
            stmt.setInt(10, element.getId());
            
            int linhas = stmt.executeUpdate();
            if (linhas > 0) {
                System.out.println("Atualizado!");                
            }
            
           }catch(SQLException e){
            System.out.println("erro ao alterar: "+ e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao alterar, tente novamente!\n");
        }
        return false;
    }
    
    
    @Override
    public boolean apagar(Instituicao element) {
        String sql = "DELETE FROM instituicao WHERE id_instituicao = ?";
        try{            
            PreparedStatement stmt = conn.prepareStatement(sql);           
            stmt.setInt(1, element.getId());       
            int linhas = stmt.executeUpdate();
            return true;
        }catch(SQLException e){
            System.out.append("Erro ao excluir");
            e.printStackTrace();
        }
        return false;
    }
    
    
    @Override
    public List<Instituicao> listar() {
        List<Instituicao> lst = new LinkedList<>();
        lst = org.jdesktop.observablecollections.ObservableCollections.observableList(lst);
        
        String sql = "SELECT * from instituicao;";
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Instituicao i = new Instituicao();
                i.setId(rs.getInt("id_instituicao"));
                i.setRazaosocial(rs.getString("razao_social"));
                i.setCnpj(rs.getString("cnpj"));
                i.setApelido(rs.getString("apelido"));
                i.setCep(rs.getString("cep"));
                i.setLogradouro(rs.getString("logradouro"));
                i.setNumero(rs.getString("numero"));
                i.setCidade(rs.getString("cidade"));
                i.setEstado(rs.getString("estado"));
                i.setPais(rs.getString("pais"));
                lst.add(i);
            }
            
        }catch(SQLException e){
            System.out.println("Erro ao listar: " + e);
        }
        
        return lst;
    }
}
