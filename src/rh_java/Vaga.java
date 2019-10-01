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
 * @author Jujuba
 */
public class Vaga {
    
    
    public static final String PROP_CARGO = "cargo";
    public static final String PROP_SUBSTITUICAO = "substituicao";
    public static final String PROP_EXTRA_ORCAMENTO = "extra_orcamento";
    public static final String PROP_AUMENTO_QUADRO = "aumentoQuadro";
    public static final String PROP_SEXO = "sexo";
    public static final String PROP_INTERNET = "internet";
    public static final String PROP_MOTORISTA = "motorista";
    public static final String PROP_REQUISITOS = "requisitos";
    public static final String PROP_HORARIO_TRABALHO = "horario_trabalho";
    public static final String PROP_CUSTO = "custo";
    public static final String PROP_CONSIDERACOES = "consideracoes";
    
    private String cargo;
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        String oldCargo = this.cargo;
        this.cargo = cargo;
        propertyChangeSupport.firePropertyChange(PROP_CARGO, oldCargo, cargo);
    }
    
    private String substituicao;
    
    
    public String getSubstituicao() {
        return substituicao;
    }

    public void setSubstituicao(String substituicao) {
        String oldSubstituicao = this.substituicao;
        this.substituicao = substituicao;
        propertyChangeSupport.firePropertyChange(PROP_SUBSTITUICAO, oldSubstituicao, substituicao);
    }
    
    private String extra_orcamento;
    
    
    public String getExtraOrcamento() {
        return extra_orcamento;
    }

    public void setExtraOrcamento(String extra_orcamento) {
        String oldExtraOrcamento = this.extra_orcamento;
        this.extra_orcamento = extra_orcamento;
        propertyChangeSupport.firePropertyChange(PROP_EXTRA_ORCAMENTO, oldExtraOrcamento, extra_orcamento );
    }
    private String aumentoQuadro;
    
    
    public String getAumentoQuadro() {
        return aumentoQuadro;
    }

    public void setAumentoQuadro(String aumentoQuadro) {
        String oldAumentoQuadro = this.aumentoQuadro;
        this.aumentoQuadro = aumentoQuadro;
        propertyChangeSupport.firePropertyChange(PROP_AUMENTO_QUADRO, oldAumentoQuadro, aumentoQuadro);
    }
    private String Sexo;


    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        String oldSexo = this.Sexo;
        this.Sexo = Sexo;
        propertyChangeSupport.firePropertyChange(PROP_SEXO, oldSexo, Sexo);
    }
    
    private String internet;

    

    public String getInternet() {
        return internet;
    }

    public void setInternet(String internet) {
        String oldInternet = this.internet;
        this.internet = internet;
        propertyChangeSupport.firePropertyChange(PROP_INTERNET, oldInternet, internet);
    }
    
    private String motorista;

    

    public String getMotorista() {
        return motorista;
    }

    public void setMotorista(String motorista) {
        String oldMotorista = this.motorista;
        this.motorista = motorista;
        propertyChangeSupport.firePropertyChange(PROP_MOTORISTA, oldMotorista, motorista);
    }

    private String requisitos;

    

    public String getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(String requisitos) {
        String oldRequisitos = this.requisitos;
        this.requisitos = requisitos;
        propertyChangeSupport.firePropertyChange(PROP_REQUISITOS, oldRequisitos, requisitos);
    }

    private String horario_trabalho;

    

    public String getHorario_trabalho() {
        return horario_trabalho;
    }

    public void setHorario_trabalho(String horario_trabalho) {
        String oldHorario_trabalho = this.horario_trabalho;
        this.horario_trabalho = horario_trabalho;
        propertyChangeSupport.firePropertyChange(PROP_HORARIO_TRABALHO, oldHorario_trabalho, horario_trabalho);
    }

    private String custo;

    

    public String getCusto() {
        return custo;
    }

    public void setCusto(String custo) {
        String oldCusto = this.custo;
        this.custo = custo;
        propertyChangeSupport.firePropertyChange(PROP_CUSTO, oldCusto, custo);
    }
    
        private String consideracoes;

    

    public String getConsideracoes() {
        return consideracoes;
    }

    public void setConsideracoes(String consideracoes) {
        String oldConsideracoes = this.consideracoes;
        this.consideracoes = consideracoes;
        propertyChangeSupport.firePropertyChange(PROP_CONSIDERACOES, oldConsideracoes, consideracoes);
    }

    
    private transient final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertyChangeSupport.removePropertyChangeListener(listener);
    }
}
