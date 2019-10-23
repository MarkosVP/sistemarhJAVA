/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rh_java;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author pedro
 */
public class Instituicao {

    
    // ID
    private Integer idPrato;
    public Integer getId() {
        return idPrato;
    }
    public void setId(Integer idPrato) {
        this.idPrato = idPrato;
    }
    
    
    //RAZAO SOCIAL
    private String razaosocial;
    public static final String PROP_RAZAOSOCIAL = "razaosocial";
    public String getRazaosocial() {
        return razaosocial;
    }
    public void setRazaosocial(String razaosocial) {
        String oldRazaosocial = this.razaosocial;
        this.razaosocial = razaosocial;
        propertyChangeSupport.firePropertyChange(PROP_RAZAOSOCIAL, oldRazaosocial, razaosocial);
    }

    
    //CNPJ
    private String cnpj;
    public static final String PROP_CNPJ = "cnpj";
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        String oldCnpj = this.cnpj;
        this.cnpj = cnpj;
        propertyChangeSupport.firePropertyChange(PROP_CNPJ, oldCnpj, cnpj);
    }

   
    //APELIDO
    private String apelido;
    public static final String PROP_APELIDO = "apelido";
    public String getApelido() {
        return apelido;
    }
    public void setApelido(String apelido) {
        String oldApelido = this.apelido;
        this.apelido = apelido;
        propertyChangeSupport.firePropertyChange(PROP_APELIDO, oldApelido, apelido);
    }
    
    
    //CEP
    private String cep;
    public static final String PROP_CEP = "cep";
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        String oldCep = this.cep;
        this.cep = cep;
        propertyChangeSupport.firePropertyChange(PROP_CEP, oldCep, cep);
    }
    
    
    //LOGRADOURO
    private String logradouro;
    public static final String PROP_LOGRADOURO = "logradouro";
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        String oldLogradouro = this.logradouro;
        this.logradouro = logradouro;
        propertyChangeSupport.firePropertyChange(PROP_LOGRADOURO, oldLogradouro, logradouro);
    }
    
    
    //NUMERO
    private String numero;
    public static final String PROP_NUMERO = "numero";
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        String oldNumero = this.numero;
        this.numero = numero;
        propertyChangeSupport.firePropertyChange(PROP_NUMERO, oldNumero, numero);
    }

        
    //CIDADE
     private String cidade;
    public static final String PROP_CIDADE = "cidade";
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        String oldCidade = this.cidade;
        this.cidade = cidade;
        propertyChangeSupport.firePropertyChange(PROP_CIDADE, oldCidade, cidade);
    }
    
    
    //ESTADO
    private String estado;
    public static final String PROP_ESTADO = "estado";
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        String oldEstado = this.estado;
        this.estado = estado;
        propertyChangeSupport.firePropertyChange(PROP_ESTADO, oldEstado, estado);
    }
    
    
    //PAIS
    private String pais;
    public static final String PROP_PAIS = "pais";
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        String oldPais = this.pais;
        this.pais = pais;
        propertyChangeSupport.firePropertyChange(PROP_PAIS, oldPais, pais);
    }



    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

}
