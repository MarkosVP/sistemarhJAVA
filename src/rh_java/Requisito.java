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
 * @author juliana
 */
public class Requisito {
    
    private int id_requisito = 1;
    private String descricao;

    public Requisito(String descricao) {
        this.descricao = descricao;
        this.setId_requisito();
    }
    
    public static final String PROP_ID_REQUISITO = "id_requisito";
    public static final String PROP_DESCRICAO = "descricao";

    /**
     * Get the value of id_requisito
     *
     * @return the value of id_requisito
     */
    public int getId_requisito() {
        return id_requisito;
    }

    /**
     * Set the value of id_requisito
     */
    public void setId_requisito() {
        int oldId_requisito = this.id_requisito;
        this.id_requisito = ++this.id_requisito;
        propertyChangeSupport.firePropertyChange(PROP_ID_REQUISITO, oldId_requisito, id_requisito);
    }
    
    // Sobrescreve Id quando já existe o id 
    public void sobrescreverId(int id) {
        int oldId = this.id_requisito;
        this.id_requisito = id;
        propertyChangeSupport.firePropertyChange(PROP_ID_REQUISITO, oldId, id);
    }
    
    /**
     * Get the value of desc_requisito
     *
     * @return the value of desc_requisito
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Set the value of desc_requisito
     *
     * @param desc_requisito new value of desc_requisito
     */
    public void setDescricao(String desc_requisito) {
        String oldDescricao = this.descricao;
        this.descricao = desc_requisito;
        propertyChangeSupport.firePropertyChange(PROP_DESCRICAO, oldDescricao, descricao);
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

    
}
