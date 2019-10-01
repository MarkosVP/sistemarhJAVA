/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rh_java;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;


/**
 *
 * @author marco
 */
public class AreadeTrabalho extends JDesktopPane
{
    private JInternalFrame contFunc;
    private JInternalFrame criarVaga;
    private CadastroUsuario cadUsuario;
    
    public void AbrirContFuncionario(){
        if(contFunc == null)
        {
            contFunc = new contratarFuncionarios();
            contFunc.setVisible(true);
            add(contFunc);
        }  
    }
    
    public void FecharContFuncionario(){
        contFunc=null;
    }
    
    public void abrirCriarVaga(){
        if(criarVaga==null){
            criarVaga = new CriarVaga();
            criarVaga.setVisible(true);
            add(criarVaga);
        }
    }
    public void fecharCriarVaga(){
        criarVaga=null;
    }
    
    void AbrirCadastroUsuario(){
        if(cadUsuario == null){        
            cadUsuario = new CadastroUsuario();
            add(cadUsuario);
            cadUsuario.setVisible(true);
        }
    }
    
    void FecharCadastroUsuario(){
        cadUsuario = null;
    }
}
