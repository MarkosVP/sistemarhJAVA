/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rh_java;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;


/**
 * Classe que modela nossa Área de Trabalho
 * Aqui serão mostradas nossas telas
 *
 * @author marco
 */
public class AreadeTrabalho extends JDesktopPane
{
    private JInternalFrame contFunc;
    private JInternalFrame criarVaga;
    private CadastroUsuario cadUsuario;
    private InstituicaoParceira InstPaceira;
    private CadCandidato CadCandidato;
    private CadRequisito CadRequisito;
    
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
    
     public void abrirInstituicaoParceira(){
        if(InstPaceira==null){
            InstPaceira = new InstituicaoParceira();
            InstPaceira.setVisible(true);
            add(InstPaceira);
        }
    }
     
     public void fecharInstituicaoParceira(){
         InstPaceira = null;
     }
     
     public void abrirCadCandidato(){
         if(CadCandidato == null){
             CadCandidato = new CadCandidato();
             CadCandidato.setVisible(true);
             add(CadCandidato);
         }
     }
     
     public void fecharCadCandidato(){
         CadCandidato = null;
     }
     
     public void abrirCadRequisitos(){
         if(CadRequisito == null){
             CadRequisito = new CadRequisito();
             CadRequisito.setVisible(true);
             add(CadRequisito);
         }
     }
     
     public void fecharCadRequisito(){
         CadRequisito = null;
     }
}
