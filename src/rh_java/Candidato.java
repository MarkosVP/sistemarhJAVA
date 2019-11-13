/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rh_java;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Objects;

/**
 *
 * @author otavi
 */
public class Candidato {
    
    private String cpf;

    public static final String PROP_CPF = "cpf";

    /**
     * Get the value of cpf
     *
     * @return the value of cpf
     */
    public String getCpf() {
        return cpf;
    }
    
        private String pais;

    public static final String PROP_PAIS = "pais";

    /**
     * Get the value of pais
     *
     * @return the value of pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * Set the value of pais
     *
     * @param pais new value of pais
     */
    public void setPais(String pais) {
        String oldPais = this.pais;
        this.pais = pais;
        propertyChangeSupport.firePropertyChange(PROP_PAIS, oldPais, pais);
    }


    private String cidade;

    public static final String PROP_CIDADE = "cidade";

    /**
     * Get the value of cidade
     *
     * @return the value of cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * Set the value of cidade
     *
     * @param cidade new value of cidade
     */
    public void setCidade(String cidade) {
        String oldCidade = this.cidade;
        this.cidade = cidade;
        propertyChangeSupport.firePropertyChange(PROP_CIDADE, oldCidade, cidade);
    }

    private String estado;

    public static final String PROP_ESTADO = "estado";

    /**
     * Get the value of estado
     *
     * @return the value of estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * Set the value of estado
     *
     * @param estado new value of estado
     */
    public void setEstado(String estado) {
        String oldEstado = this.estado;
        this.estado = estado;
        propertyChangeSupport.firePropertyChange(PROP_ESTADO, oldEstado, estado);
    }

    private String bairro;

    public static final String PROP_BAIRRO = "bairro";

    /**
     * Get the value of bairro
     *
     * @return the value of bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * Set the value of bairro
     *
     * @param bairro new value of bairro
     */
    public void setBairro(String bairro) {
        String oldBairro = this.bairro;
        this.bairro = bairro;
        propertyChangeSupport.firePropertyChange(PROP_BAIRRO, oldBairro, bairro);
    }
    
    private int numero;

    public static final String PROP_NUMERO = "numero";

    /**
     * Get the value of numero
     *
     * @return the value of numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Set the value of numero
     *
     * @param numero new value of numero
     */
    public void setNumero(int numero) {
        int oldNumero = this.numero;
        this.numero = numero;
        propertyChangeSupport.firePropertyChange(PROP_NUMERO, oldNumero, numero);
    }


    

    private String logradouro;

    public static final String PROP_LOGRADOURO = "logradouro";

    /**
     * Get the value of logradouro
     *
     * @return the value of logradouro
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * Set the value of logradouro
     *
     * @param logradouro new value of logradouro
     */
    public void setLogradouro(String logradouro) {
        String oldLogradouro = this.logradouro;
        this.logradouro = logradouro;
        propertyChangeSupport.firePropertyChange(PROP_LOGRADOURO, oldLogradouro, logradouro);
    }

    private String cep;

    public static final String PROP_CEP = "cep";

    /**
     * Get the value of cep
     *
     * @return the value of cep
     */
    public String getCep() {
        return cep;
    }

    /**
     * Set the value of cep
     *
     * @param cep new value of cep
     */
    public void setCep(String cep) {
        String oldCep = this.cep;
        this.cep = cep;
        propertyChangeSupport.firePropertyChange(PROP_CEP, oldCep, cep);
    }

    private String sobrenome;

    public static final String PROP_SOBRENOME = "sobrenome";

    /**
     * Get the value of sobrenome
     *
     * @return the value of sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * Set the value of sobrenome
     *
     * @param sobrenome new value of sobrenome
     */
    public void setSobrenome(String sobrenome) {
        String oldSobrenome = this.sobrenome;
        this.sobrenome = sobrenome;
        propertyChangeSupport.firePropertyChange(PROP_SOBRENOME, oldSobrenome, sobrenome);
    }


    /**
     * Set the value of cpf
     *
     * @param cpf new value of cpf
     */
    public void setCpf(String cpf) {
        String oldCpf = this.cpf;
        this.cpf = cpf;
        propertyChangeSupport.firePropertyChange(PROP_CPF, oldCpf, cpf);
    }
private String nome;

    public static final String PROP_NOME = "nome";

    /**
     * Get the value of nome
     *
     * @return the value of nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Set the value of nome
     *
     * @param nome new value of nome
     */
    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        propertyChangeSupport.firePropertyChange(PROP_NOME, oldNome, nome);
    }

    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    /**
     * Add PropertyChangeListener.
     *
     * @param listener
     */
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    /**
     * Remove PropertyChangeListener.
     *
     * @param listener
     */
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

    private Integer id;

    public static final String PROP_ID = "id";

    /**
     * Get the value of id
     *
     * @return the value of id
     */
    public Integer getId() {
        return id;
    }

    /**
     * Set the value of id
     *
     * @param id new value of id
     */
    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        propertyChangeSupport.firePropertyChange(PROP_ID, oldId, id);
    }

    @Override
    public String toString() {
        return  nome;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.cpf);
        hash = 31 * hash + Objects.hashCode(this.pais);
        hash = 31 * hash + Objects.hashCode(this.cidade);
        hash = 31 * hash + Objects.hashCode(this.estado);
        hash = 31 * hash + Objects.hashCode(this.bairro);
        hash = 31 * hash + this.numero;
        hash = 31 * hash + Objects.hashCode(this.logradouro);
        hash = 31 * hash + Objects.hashCode(this.cep);
        hash = 31 * hash + Objects.hashCode(this.sobrenome);
        hash = 31 * hash + Objects.hashCode(this.nome);
        hash = 31 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Candidato other = (Candidato) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.pais, other.pais)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        if (!Objects.equals(this.logradouro, other.logradouro)) {
            return false;
        }
        if (!Objects.equals(this.cep, other.cep)) {
            return false;
        }
        if (!Objects.equals(this.sobrenome, other.sobrenome)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
    
    

}
