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

    /*
    public Instituicao(String RazaoSocial, String CNPJ, String Apelido, String CEP, String Logradouro, String Numero, String Cidade, String Estado, String Pais) {
        this.RazaoSocial = RazaoSocial;
        this.CNPJ = CNPJ;
        this.Apelido = Apelido;
        this.CEP = CEP;
        this.Logradouro = Logradouro;
        this.Numero = Numero;
        this.Cidade = Cidade;
        this.Estado = Estado;
        this.Pais = Pais;
    }
    */
    
    //RAZAO SOCIAL
    private String RazaoSocial;

    public String getRazaoSocial() {
        return RazaoSocial;
    }
    public void setRazaoSocial(String RazaoSocial) {
        this.RazaoSocial = RazaoSocial;
    }
    
    
    //CNPJ
    private String CNPJ;

    public String getCNPJ() {
        return CNPJ;
    }
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }
    
    
    //APELIDO
    private String Apelido;

    public String getApelido() {
        return Apelido;
    }
    public void setApelido(String Apelido) {
        this.Apelido = Apelido;
    }
    
    
    //CEP
    private String CEP;

    public String getCEP() {
        return CEP;
    }
    public void setCEP(String CEP) {
        this.CEP = CEP;
    }
    
    
    //LOGRADOURO
    private String Logradouro;

    public String getLogradouro() {
        return Logradouro;
    }
    public void setLogradouro(String Logradouro) {
        this.Logradouro = Logradouro;
    }
    
    
    //NUMERO
    private String Numero;

    public String getNumero() {
        return Numero;
    }
    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    
    
    //CIDADE
    private String Cidade;

    public String getCidade() {
        return Cidade;
    }
    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }
    
    
    //ESTADO
    private String Estado;

    public String getEstado() {
        return Estado;
    }
    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
    
    //PAIS
    private String Pais;

    public String getPais() {
        return Pais;
    }
    public void setPais(String Pais) {
        this.Pais = Pais;
    }




    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }

}
