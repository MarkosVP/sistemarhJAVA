/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rh_java;

import java.sql.Statement;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import org.jdesktop.observablecollections.ObservableCollections;

/**
 *
 * @author Jujuba
 */
public class CriarVagaDAO extends DAO<Vaga>{
    
    @Override
    public boolean inserir(Vaga element) {
        String sql = "INSERT INTO vaga (id_requisito, nm_cargo, substituicao," 
                + "extra_orcamento, aumento_quadro, sexo, conexao_internet, "
                + "motorista,  horario_trabalho, salario) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        
        try{
            
            PreparedStatement stmt = conn.prepareStatement(sql,
                    Statement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, element.getRequisitos());
            stmt.setString(2, element.getCargo());
            stmt.setString(3, element.getSubstituicao());
            stmt.setString(4, element.getExtraOrcamento());
            stmt.setString(5, element.getAumentoQuadro());
            stmt.setString(6, element.getSexo());
            stmt.setString(7, element.getInternet());
            stmt.setString(8, element.getMotorista());
            stmt.setString(9, element.getHorario_trabalho());
            stmt.setFloat(10, element.getCusto());
            
            
            if(stmt.executeUpdate() == 1){
                ResultSet rs = stmt.getGeneratedKeys();
                rs.next();
                element.setIdVaga(rs.getInt(1));
                return true;
            }
            
            return stmt.execute(sql);
            
        }catch(SQLException e){
            System.out.append("Erro ao inserir");
            e.printStackTrace();
        }
        return false;
    }
    
    @Override
    public boolean alterar(Vaga element) {
        String sql = "UPDATE vaga "
                + "SET id_requisito = ?, "
                + "nm_cargo = ?, "
                + "substituicao = ?," 
                + "extra_orcamento = ?, "
                + "aumento_quadro = ?, "
                + "sexo = ?, "
                + "conexao_internet = ?, "
                + "motorista = ?,  "
                + "horario_trabalho = ?, "
                + "salario = ? "
                + "WHERE id = ?;";
        
        try{
            
            PreparedStatement stmt = conn.prepareStatement(sql,
                    Statement.RETURN_GENERATED_KEYS);
            stmt.setInt(1, element.getRequisitos());
            stmt.setString(2, element.getCargo());
            stmt.setString(3, element.getSubstituicao());
            stmt.setString(4, element.getExtraOrcamento());
            stmt.setString(5, element.getAumentoQuadro());
            stmt.setString(6, element.getSexo());
            stmt.setString(7, element.getInternet());
            stmt.setString(8, element.getMotorista());
            stmt.setString(9, element.getHorario_trabalho());
            stmt.setFloat(10, element.getCusto());
            stmt.setInt(11, element.getIdVaga());
            
            int linhas = stmt.executeUpdate();
            return true;
        }catch(SQLException e){
            System.out.append("Erro ao alterar");
            e.printStackTrace();
        }
        return false;
    }        

    @Override
    public boolean excluir(Vaga element) {
        String sql = "DELETE FROM vaga "
                    + "WHERE id = ?";
        try{            
            PreparedStatement stmt = conn.prepareStatement(sql);           
            stmt.setInt(1, element.getIdVaga());       
            int linhas = stmt.executeUpdate();
            return true;
        }catch(SQLException e){
            System.out.append("Erro ao excluir");
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Vaga> listar() {
        List<Vaga> lstVagas = new ArrayList<>();
        lstVagas = ObservableCollections.observableList(lstVagas);
        
        String sql = "SELECT * FROM vaga;";
        try{
            Statement stmt = conn.createStatement();            
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()==true){
                Vaga v = new Vaga();
                v.setIdVaga(rs.getInt("id"));
                v.setRequisitos(rs.getInt("id_requisito"));
                v.setCargo(rs.getString("nm_cargo"));
                v.setSubstituicao(rs.getString("substituicao"));
                v.setExtraOrcamento(rs.getString("extra_orcamento"));
                v.setAumentoQuadro(rs.getString("aumento_quadro"));
                v.setSexo(rs.getString("sexo"));
                v.setInternet(rs.getString("conexao_internet"));
                v.setMotorista(rs.getString("motorista"));
                v.setHorario_trabalho(rs.getString("horario_trabalho"));
                v.setCusto(rs.getFloat("salario"));
                lstVagas.add(v);                
            }
            
        }catch(SQLException e){
            System.out.println("Erro ao listar: "+ e.getMessage());
        }

        return lstVagas;
    }
}
