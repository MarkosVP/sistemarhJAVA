/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rh_java;

import java.util.ArrayList;
import javax.swing.JDesktopPane;

/**
 *
 * @author jotap
 */
public class CadastroUsuario extends javax.swing.JInternalFrame {

    /**
     * Creates new form CadastroUsuario
     */
    
    Usuario user = new Usuario();
    
    int j=0;
   
            
    public CadastroUsuario() {
        initComponents();
        lblPassword.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btInserir = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        brLimpar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        lblName = new javax.swing.JTextField();
        lblCpf = new javax.swing.JTextField();
        lblEmail = new javax.swing.JTextField();
        lblPhone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbResult = new javax.swing.JTable();
        lblPassword = new javax.swing.JPasswordField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastro de Usuário ");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel1.setText("Nome:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel2.setText("Email:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setText("CPF:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel4.setText("Senha:");

        btInserir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Telefone:");

        brLimpar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        brLimpar.setText("Limpar");
        brLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                brLimparActionPerformed(evt);
            }
        });

        btCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        lblName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblNameActionPerformed(evt);
            }
        });

        lblCpf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblCpfActionPerformed(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        lblPhone.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        tbResult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nomes", "CPF", "Email", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(tbResult);

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblPassword.setText("lblPassword");
        lblPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        lblPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(btInserir)
                        .addGap(18, 18, 18)
                        .addComponent(brLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(btCancelar)
                        .addGap(87, 87, 87)))
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btInserir)
                    .addComponent(brLimpar)
                    .addComponent(btCancelar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing

        JDesktopPane painel = getDesktopPane();
        
        if(painel instanceof AreadeTrabalho){
            ((AreadeTrabalho)painel).FecharCadastroUsuario();
        }
        
    }//GEN-LAST:event_formInternalFrameClosing

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        user.setCpfUsuario(lblCpf.getText()); 
        user.setEmailUsuario(lblEmail.getText());
        user.setNomeUsuario(lblName.getText());
        user.setTelefoneUsuario(lblPhone.getText());;
        
        ArrayList<Usuario> listaUsuario = new ArrayList<Usuario>();
        
        listaUsuario.add(user);
        
        System.out.println("SALVOU");
        
            
            for(int i = 0; i < listaUsuario.size(); i++) {   
                System.out.println(listaUsuario.get(i).getNomeUsuario());
                System.out.println(listaUsuario.get(i).getCpfUsuario());
                System.out.println(listaUsuario.get(i).getEmailUsuario());
                System.out.println(listaUsuario.get(i).getTelefoneUsuario());                 
               
                
                tbResult.setValueAt(user.getNomeUsuario(), 0 + j, 0);            
                tbResult.setValueAt(user.getCpfUsuario(), 0 + j, 1);            
                tbResult.setValueAt(user.getEmailUsuario(), 0 + j, 2);            
                tbResult.setValueAt(user.getTelefoneUsuario(), 0 + j, 3);            
                
                j++;
                
                lblName.setText("");
                lblCpf.setText("");
                lblPassword.setText("");
                lblEmail.setText("");
                lblPhone.setText("");
            }  
        
    }//GEN-LAST:event_btInserirActionPerformed
    
    
    private void lblCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCpfActionPerformed

    private void brLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_brLimparActionPerformed
        
        
                tbResult.setValueAt("", 0, 0);            
                tbResult.setValueAt("", 0, 1);            
                tbResult.setValueAt("", 0, 2);            
                tbResult.setValueAt("", 0, 3); 
                tbResult.setValueAt("", 1, 0);            
                tbResult.setValueAt("", 1, 1);            
                tbResult.setValueAt("", 1, 2);            
                tbResult.setValueAt("", 1, 3); 
                tbResult.setValueAt("", 2, 0);            
                tbResult.setValueAt("", 2, 1);            
                tbResult.setValueAt("", 2, 2);            
                tbResult.setValueAt("", 2, 3);
                tbResult.setValueAt("", 3, 0);            
                tbResult.setValueAt("", 3, 1);            
                tbResult.setValueAt("", 3, 2);            
                tbResult.setValueAt("", 3, 3); 
                
                j=0;
         
    }//GEN-LAST:event_brLimparActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        JDesktopPane painel = getDesktopPane();
        
        if(painel instanceof AreadeTrabalho){
            ((AreadeTrabalho)painel).FecharCadastroUsuario();
        }
        this.dispose();
    }//GEN-LAST:event_btCancelarActionPerformed

    private void lblNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblNameActionPerformed

    private void lblPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblPasswordActionPerformed
        
    }//GEN-LAST:event_lblPasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brLimpar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btInserir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lblCpf;
    private javax.swing.JTextField lblEmail;
    private javax.swing.JTextField lblName;
    private javax.swing.JPasswordField lblPassword;
    private javax.swing.JTextField lblPhone;
    private javax.swing.JTable tbResult;
    // End of variables declaration//GEN-END:variables


}


