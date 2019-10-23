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
    private String desc_requisito;

    public Requisito(String desc_requisito) {
        this.desc_requisito = desc_requisito;
        this.setId_requisito();
    }
    
    public static final String PROP_ID_REQUISITO = "id_requisito";
    public static final String PROP_DESC_REQUISITO = "desc_requisito";

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
        this.id_requisito = this.id_requisito++;
        propertyChangeSupport.firePropertyChange(PROP_ID_REQUISITO, oldId_requisito, id_requisito);
    }
    
    /**
     * Get the value of desc_requisito
     *
     * @return the value of desc_requisito
     */
    public String getDesc_requisito() {
        return desc_requisito;
    }

    /**
     * Set the value of desc_requisito
     *
     * @param desc_requisito new value of desc_requisito
     */
    public void setDesc_requisito(String desc_requisito) {
        String oldDesc_requisito = this.desc_requisito;
        this.desc_requisito = desc_requisito;
        propertyChangeSupport.firePropertyChange(PROP_DESC_REQUISITO, oldDesc_requisito, desc_requisito);
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
