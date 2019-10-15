/*
 * Arquivo que gera a Conexão com o Banco de Dados
 */
package rh_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public abstract class DAO<E> {
    protected Connection Conn;
    
    public abstract boolean inserir(E element);;
    public abstract boolean alterar(E element);
    public abstract boolean excluir(E element);
    public abstract List<E> lista();
    
    public DAO(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/aula?serverTimezone=UTC";
            String user = "root";
            String pass = "";
            
            Conn = DriverManager.getConnection(url, user, pass);
            
        }
        catch(ClassNotFoundException e){
            System.out.printf("Erro no drive");
        }
        catch(SQLException e){
            System.out.printf("Erro na Conexão com o Banco!");
        }
    }

}
