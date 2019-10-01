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
    
    public void AbrirContFuncionario()
    {
        if(contFunc == null)
        {
            contFunc = new contratarFuncionarios();
            contFunc.setVisible(true);
            add(contFunc);
        }  
    }
}
