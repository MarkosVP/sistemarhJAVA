package rh_java;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;
import org.jdesktop.observablecollections.ObservableCollections;

public class UsuarioDAO extends DAO<Usuario>{

    @Override
    public boolean inserir(Usuario element) {
       String comando = "INSERT INTO usuario (nome_usuario,cpf_usuario,email_usuario,tel_usuario,senha_usuario) VALUES (?,?,?,?,?)";
       try{
            
            PreparedStatement stmt = conn.prepareStatement(comando,Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, element.getNomeUsuario());
            stmt.setString(2, element.getCpfUsuario());
            stmt.setString(3, element.getTelefoneUsuario());
            stmt.setString(4, element.getEmailUsuario());
            stmt.setString(5, element.getSenhaUsuario());

            if(stmt.executeUpdate()==1){
                ResultSet rs = stmt.getGeneratedKeys();
                rs.next();
                element.setId(rs.getInt(1));
                return true;
            }
            
        }catch(SQLException e){
            System.out.println("erro ao inserir: "+ e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao inserir\n");
        }
        return false;
    }

    @Override
    public boolean apagar(Usuario element) {
        String comando = "DELETE FROM usuario WHERE id_usuario = ?";
       try{
            PreparedStatement stmt = conn.prepareStatement(comando);
            
            stmt.setInt(1, element.getId());
            
            stmt.execute();
            
            System.out.println("a");
        }catch(SQLException e){
            System.out.println("erro ao inserir: "+ e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao inserir\n");
        }
        return false;
    }
    @Override
    public boolean alterar(Usuario element) {
        String sql = "update usuario set nome_usuario = ?,cpf_usuario = ?,email_usuario = ?,tel_usuario = ?,senha_usuario = ? where id_usuario = ?";
        try{
          
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            stmt.setString(1, element.getNomeUsuario());
            stmt.setString(2, element.getCpfUsuario());
            stmt.setString(3, element.getEmailUsuario());
            stmt.setString(4, element.getTelefoneUsuario());
            stmt.setString(5, element.getSenhaUsuario());
            stmt.setInt(6, element.getId());
            
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
    public List<Usuario> listar() {
       List<Usuario> lstUsuarios = new LinkedList<>();
        lstUsuarios = ObservableCollections.observableList(lstUsuarios);
        
        String sql = "SELECT * from usuario;";
        try{
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                Usuario user = new Usuario();
                user.setId(rs.getInt("id_usuario"));
                user.setNomeUsuario(rs.getString("nome_usuario"));
                user.setCpfUsuario(rs.getString("cpf_usuario"));
                user.setEmailUsuario(rs.getString("email_usuario"));
                user.setTelefoneUsuario(rs.getString("tel_usuario"));
                user.setSenhaUsuario(rs.getString("senha_usuario"));
                lstUsuarios.add(user);
            }
            
        }catch(SQLException e){
            System.out.println("erro ao listar"+ e.getMessage());
        }
        return lstUsuarios;
    }
    
}
