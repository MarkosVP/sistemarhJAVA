
package rh_java;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Date;
/**
 *
 * @author jotap
 */
public class Usuario {
    private Integer id;
    private String nomeUsuario;
    private String cpfUsuario;
    private String emailUsuario;
    private String telefoneUsuario;
    private String senhaUsuario;
    
    public static final String PROP_ID = "id";
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        propertyChangeSupport.firePropertyChange(PROP_ID, oldId, id);
    }
    
   
    public static final String PROP_NOME = "nomeUsuario";
    
    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        String oldNome = this.nomeUsuario;
        this.nomeUsuario = nomeUsuario;
        propertyChangeSupport.firePropertyChange(PROP_NOME, oldNome, nomeUsuario);
    }

    public static final String PROP_CPF = "cpfUsuario";
    public String getCpfUsuario() {
        return cpfUsuario;
    }

    public void setCpfUsuario(String cpfUsuario) {
        String oldCpf = this.cpfUsuario;
        this.cpfUsuario = cpfUsuario;
        propertyChangeSupport.firePropertyChange(PROP_CPF, oldCpf, cpfUsuario);
    }

    public static final String PROP_EMAIL = "emailUsuario";
    public String getEmailUsuario() {
        return emailUsuario;
    }

    public void setEmailUsuario(String emailUsuario) {
        String oldEmail = this.emailUsuario;
        this.emailUsuario = emailUsuario;
        propertyChangeSupport.firePropertyChange(PROP_EMAIL, oldEmail, emailUsuario);
    }

    public static final String PROP_TELEFONE = "telefoneUsuario";
    public String getTelefoneUsuario() {
        return telefoneUsuario;
    }

    public void setTelefoneUsuario(String telefoneUsuario) {
        String oldTelefone = this.telefoneUsuario;
        this.telefoneUsuario = telefoneUsuario;
        propertyChangeSupport.firePropertyChange(PROP_TELEFONE, oldTelefone, telefoneUsuario);
    }

    public static final String PROP_SENHA = "senhaUsuario";
    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        String oldSenha = this.senhaUsuario;
        this.senhaUsuario = senhaUsuario;
        propertyChangeSupport.firePropertyChange(PROP_SENHA, oldSenha, senhaUsuario);
    }
    
    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    
     public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
}
