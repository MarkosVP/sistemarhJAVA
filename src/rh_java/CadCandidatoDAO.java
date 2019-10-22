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
 * @author marco
 */
public class CadCandidatoDAO extends DAO<Candidato>{

    @Override
    public boolean inserir(Candidato element) {
        try{
            //Gerando Query
            String qry = "INSERT INTO candidatos("
                    + "nome, sobrenome, cpf,"
                    + "pais, cidade, estado,"
                    + "cep, logradouro, numero, bairro)"
                    + "VALUES(?,?,?,?,?,?,?,?,?,?)";
            
            //Buscando conexão e executando Query
            PreparedStatement stmt = Conn.prepareStatement(qry, Statement.RETURN_GENERATED_KEYS);
            
            //Informando parâmetros da Query
            stmt.setString(1, element.getNome());
            stmt.setString(2, element.getSobrenome());
            stmt.setString(3, element.getCpf());
            stmt.setString(4, element.getPais());
            stmt.setString(5, element.getCidade());
            stmt.setString(6, element.getEstado());
            stmt.setString(7, element.getCep());
            stmt.setString(8, element.getLogradouro());
            stmt.setInt(9, element.getNumero());
            stmt.setString(10, element.getBairro());
            
            //Identificando as linhas que sofreram alteração na DB
            int linhasAlteradas = stmt.executeUpdate();
            
            //Validando Resultado
            if(linhasAlteradas == 1){
                ResultSet rs = stmt.getGeneratedKeys();
                rs.next();
                element.setId(rs.getInt(1));
                
                return true;
            }
        }
        catch(SQLException ex){
            System.out.println("Erro ao inserir: "+ ex.getMessage());
        }
        return false;
    }


    @Override
    public boolean alterar(Candidato element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean excluir(Candidato element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Candidato> lista() {
        List<Candidato> qryResult = new ArrayList<>();
        qryResult = ObservableCollections.observableList(qryResult);
        
        //Query da busca
        String qry = "SELECT * FROM candidatos";
        
        try{
            //Conectando com o banco
            Statement stmt = Conn.createStatement();
            ResultSet rs = stmt.executeQuery(qry);
            Candidato c = new Candidato();
            
            while(rs.next()){
                
            }
        }
        catch(SQLException ex){
            System.out.println("Erro ao listar: " + ex);
        }
        
        //retornando a lista gerada     
        return qryResult;
    }
    
    public boolean BuscaCandidato(String cpf){
        //Variável da busca
        Candidato c = new Candidato();
        
        try{
            //Montando a Query
            String qry = "SELECT * FROM candidatos WHERE cpf = ?;";
            
            //Buscando conexão e executando Query
            PreparedStatement stmt = Conn.prepareStatement(qry, Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, cpf);
            
            ResultSet rs = stmt.executeQuery();
            if(rs.next()){
                return true;
            }
            
        }
        catch(SQLException ex){
            System.out.println("Erro ao inserir: "+ ex.getMessage());
        }
        return false;
    }
    
}
