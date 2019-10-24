/*
 * Arquivo que gera a Conexão com o Banco de Dados
 */
package rh_java;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdesktop.observablecollections.ObservableCollections;

public class RequisitoDAO extends DAO<Requisito> {
    
    @Override
    public boolean inserir(Requisito element) {
       String comando = "INSERT INTO requisitos (descRequisito) VALUES (?)";
       try{
            PreparedStatement stmt = conn.prepareStatement(comando,Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, element.getDescricao());

            if(stmt.executeUpdate()==1){
                ResultSet rs = stmt.getGeneratedKeys();
                rs.next();
                element.setId_requisito();
                return true;
            }
            
        }catch(SQLException e){
            System.out.println("erro ao inserir: "+ e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao inserir\n");
        }
        return false;
    }

    @Override
    public boolean apagar(Requisito element) {
        String comando = "DELETE FROM usuario WHERE id_usuario = ?";
       try{
            PreparedStatement stmt = conn.prepareStatement(comando);
            
            stmt.setInt(1, element.getId_requisito());
            
            stmt.execute();
            
        }catch(SQLException e){
            System.out.println("erro ao inserir: "+ e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao inserir\n");
        }
        return false;
    }
    @Override
    public boolean alterar(Requisito element) {
        String sql = "UPDATE requisitos SET descRequisito = ? WHERE idRequsito = ?";
        try{
          
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, element.getDescricao());
            stmt.setInt(2, element.getId_requisito());
            
            int linhas = stmt.executeUpdate();
            if (linhas > 0) {
                System.out.println("Atualizado!");
            }
            
            //JOptionPane.showMessageDialog(null, "Alterado com sucesso!\n");
           }catch(SQLException e){
            System.out.println("erro ao alterar: "+ e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao inserir, tente novamente!\n");
        }
        return false;
    }
    
    @Override
    public List<Requisito> listar() {
        List<Requisito> lstRequisitos = new LinkedList<>();
        lstRequisitos = ObservableCollections.observableList(lstRequisitos);
        
        String sql = "SELECT * from requisito;";
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Requisito r = new Requisito(rs.getString("idRequisito"));
                r.sobrescreverId(rs.getInt("idRequisito"));
                lstRequisitos.add(r);
            }
            
        }catch(SQLException e){
            System.out.println("erro ao listar"+ e.getMessage());
        }
        return lstRequisitos;
    }     
}