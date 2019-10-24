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
 * Classe que realiza a conexão com o Banco de Dados, junto das querys
 * realizadas ao longo do Projeto para os Candidatos
 *
 * @author marco
 */
public class CadCandidatoDAO extends DAO<Candidato>{

    /**
     * Função que Insere um Candidato ao Banco
     * 
     * @param element Candidato
     * @return Boolean
     */
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
            PreparedStatement stmt = conn.prepareStatement(qry, Statement.RETURN_GENERATED_KEYS);
            
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
                //Obtendo o ID do elemento inserido no banco
                ResultSet rs = stmt.getGeneratedKeys();
                rs.next();
                element.setId(rs.getInt(1));
                System.out.printf("%d", element.getID());
                
                return true;
            }
        }
        catch(SQLException ex){
            System.out.println("Erro ao inserir: "+ ex.getMessage());
        }
        return false;
    }

    /**
     * Função para alterar um Candidato no banco
     * 
     * @param element Candidato
     * @return boolean
     */
    @Override
    public boolean alterar(Candidato element) {
        try{
            //Montando a Query
            String qry = "UPDATE candidatos SET "
                    + "nome = ?, "
                    + "sobrenome = ?, "
                    + "cpf = ?, "
                    + "cep = ?, "
                    + "logradouro = ?, "
                    + "numero = ?, "
                    + "bairro = ?, "
                    + "cidade = ?, "
                    + "estado = ?, "
                    + "pais = ? "
                    + "WHERE id_candidato = ?";
            
            //Montando a Query para autalizar candidato
            PreparedStatement stmt = conn.prepareStatement(qry);
            
            //Inserindo dados na query
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
            stmt.setInt(11, element.getID());
            
            int linhas = stmt.executeUpdate();
            if (linhas > 0) {
                System.out.println("Atualizado!");
                return true;
            }
        }
        catch(SQLException ex){
            System.out.println("Erro ao inserir: "+ ex.getMessage());
        }
        return false;
    }

    /**
     * Função que remove um elemento selecionado do Banco de Dados
     *
     * @param element Candidato
     * @return Boolean
     */
    @Override
    public boolean apagar(Candidato element) {
        //Função que remove um dado determinado do banco
        int id = element.getID();
        
        //Executando Remoção
        try{
            //Quety para remover elemento
            String qry = "DELETE FROM candidatos WHERE id_candidato = ?";
            
            PreparedStatement stmt = conn.prepareStatement(qry);
            
            //Setando ID na query
            stmt.setInt(1, id);
            stmt.executeUpdate();
            
            //Retorna True
            return true;
        }
        catch(SQLException ex){
            System.out.println("Erro ao inserir: "+ ex.getMessage());
            return false;
        }
    }

    /**
     * Função que lista os dados dos candidatos do banco
     * 
     * @return ArrayList
     */
    @Override
    public List<Candidato> listar() {
        List<Candidato> qryResult = new ArrayList<>();
        qryResult = ObservableCollections.observableList(qryResult);
        
        //Query da busca
        String qry = "SELECT * FROM candidatos";
        
        try{
            //Conectando com o banco
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(qry);
            
            while(rs.next()){
                
                //Recriando um novo Candidato para limpar
                Candidato c = new Candidato();
                
                //Setando os dados
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
                
                //Adicionando na lista de resposta
                qryResult.add(c);
            }
        }
        catch(SQLException ex){
            System.out.println("Erro ao listar: " + ex);
        }
        
        //retornando a lista gerada     
        return qryResult;
    }
    
    /**
     * Função que realiza Busca a partir de um CPF, retornando se existe ou não
     * 
     * @param cpf String
     * @return Boolean
     */
    public boolean BuscaCandidato(String cpf){
        //Variável da busca
        Candidato c = new Candidato();
        
        try{
            //Montando a Query
            String qry = "SELECT * FROM candidatos WHERE cpf = ?;";
            
            //Buscando conexão e executando Query
            PreparedStatement stmt = conn.prepareStatement(qry, Statement.RETURN_GENERATED_KEYS);
            
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
