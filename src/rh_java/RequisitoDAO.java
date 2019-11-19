/*
 * Arquivo que gera a Conexão com o Banco de Dados
 */
package rh_java;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.jdesktop.observablecollections.ObservableCollections;

public class RequisitoDAO extends DAO<Requisito> {
    
    @Override
    public boolean inserir(Requisito element) {
       String comando = "INSERT INTO requisito (nm_requisito) VALUES (?)";
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
        }
        return false;
    }

    @Override
    public boolean apagar(Requisito element) {
        String comando = "DELETE FROM requisito WHERE id = ?";
       try{
            PreparedStatement stmt = conn.prepareStatement(comando);
            
            stmt.setInt(1, element.getId_requisito());
            stmt.execute();
            return true;
            
        }catch(SQLException e){
            System.out.println("erro ao inserir: "+ e.getMessage());
        }
        return false;
    }
    @Override
    public boolean alterar(Requisito element) {
        String sql = "UPDATE requisito SET nm_requisito = ? WHERE id = ?";
        try{
          
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, element.getDescricao());
            stmt.setInt(2, element.getId_requisito());
            
            int linhas = stmt.executeUpdate();
            if (linhas > 0) {
                return true;
            }
            
           }catch(SQLException e){
            System.out.println("erro ao alterar: "+ e.getMessage());
        }
        return false;
    }
    
    @Override
    public List<Requisito> listar() {
        List<Requisito> lstRequisitos = new ArrayList<>();
        lstRequisitos = ObservableCollections.observableList(lstRequisitos);
        
        String sql = "SELECT * from requisito ORDER BY id;";
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Requisito r = new Requisito(rs.getString("nm_requisito"));
                r.sobrescreverId(rs.getInt("id"));
                lstRequisitos.add(r);
            }
            
        }catch(SQLException e){
            System.out.println("erro ao listar"+ e.getMessage());
        }
        return lstRequisitos;
    }
    
    public Requisito getById(int id){
        Requisito r = null;
        String sql = "SELECT * FROM requisito WHERE id = "+id;
        
        try{
            Statement stmt = conn.createStatement();
            
            ResultSet rq = stmt.executeQuery(sql);
            
            while(rq.next()){
                r = new Requisito(rq.getString("nm_requisito"));                                              
            }
        }catch(SQLException e){
            
            System.out.println("é erro");
            
        }
        
        return r;
    }
}
