/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rh_java;

//import java.util.ArrayList;
import javax.swing.JDesktopPane;

import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.Binding;
import org.jdesktop.beansbinding.BindingGroup;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.swingbinding.JTableBinding;
import org.jdesktop.swingbinding.JTableBinding.ColumnBinding;
import org.jdesktop.swingbinding.SwingBindings;
import java.util.List;
//import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.swing.JOptionPane;

public class CadastroUsuario extends javax.swing.JInternalFrame {

    private List<Usuario> lstUsuarios;
        
    UsuarioDAO ud = new UsuarioDAO();

            
    public CadastroUsuario() {
        UsuarioDAO ud = new UsuarioDAO();
        lstUsuarios = ud.listar();
       
        initComponents();
        
                
        BindingGroup bg = new BindingGroup();
        JTableBinding tb = SwingBindings.createJTableBinding(AutoBinding.UpdateStrategy.READ_WRITE,
                    lstUsuarios, tbResult);
        
        
        ColumnBinding cb = tb.addColumnBinding(BeanProperty.create("nomeUsuario"));
        cb.setColumnName("Nome");
        cb.setColumnClass(String.class);
        
        cb = tb.addColumnBinding(BeanProperty.create("cpfUsuario"));
        cb.setColumnName("CPF");
        cb.setColumnClass(String.class);
    
        
        cb = tb.addColumnBinding(BeanProperty.create("emailUsuario"));
        cb.setColumnName("Email");
        cb.setColumnClass(String.class);
        
        cb = tb.addColumnBinding(BeanProperty.create("telefoneUsuario"));
        cb.setColumnName("Telefone");
        cb.setColumnClass(String.class);
        
        bg.addBinding(tb);
        
        Binding b;
        b = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE,
                tbResult, BeanProperty.create("selectedElement.nomeUsuario"),
                lblName, BeanProperty.create("text"));
        bg.addBinding(b);
        
        //b = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ,
          //      tbResult, BeanProperty.create("selectedElement.idUsuario"),
          //         cb., BeanProperty.create("text"));
        
        
        b = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE,
                tbResult, BeanProperty.create("selectedElement.cpfUsuario"),
                lblCpf, BeanProperty.create("text"));
        bg.addBinding(b);


        
        b = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE,
                tbResult, BeanProperty.create("selectedElement.emailUsuario"),
                lblEmail, BeanProperty.create("text")
            );
        bg.addBinding(b);
        
        b = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE,
                tbResult, BeanProperty.create("selectedElement.telefoneUsuario"),
                lblPhone, BeanProperty.create("text")
            );
        bg.addBinding(b);
        
        
        b = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE,
                tbResult, BeanProperty.create("selectedElement.senhaUsuario"),
                lblPassword, BeanProperty.create("text")
            );
        bg.addBinding(b);
        
        bg.bind();   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btApagar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        lblName = new javax.swing.JTextField();
        lblCpf = new javax.swing.JTextField();
        lblEmail = new javax.swing.JTextField();
        lblPhone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbResult = new javax.swing.JTable();
        btInserir = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        lblPassword = new javax.swing.JTextField();

        jScrollPane2.setViewportView(jEditorPane1);

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

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel5.setText("Telefone:");

        btApagar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btApagar.setText("Apagar");
        btApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btApagarActionPerformed(evt);
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
        lblName.setMaximumSize(new java.awt.Dimension(30, 30));
        lblName.setMinimumSize(new java.awt.Dimension(5, 5));
        lblName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblNameActionPerformed(evt);
            }
        });

        lblCpf.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblCpf.setMaximumSize(new java.awt.Dimension(13, 13));
        lblCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblCpfActionPerformed(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        lblPhone.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        lblPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblPhoneActionPerformed(evt);
            }
        });

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

        btInserir.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btInserir.setText("Inserir");
        btInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btInserirActionPerformed(evt);
            }
        });

        btSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btInserir)
                        .addGap(18, 18, 18)
                        .addComponent(btApagar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(btCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(8, 8, 8))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btApagar)
                    .addComponent(btSalvar)
                    .addComponent(btInserir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing

        JDesktopPane painel = getDesktopPane();
        
        if(painel instanceof AreadeTrabalho){
            ((AreadeTrabalho)painel).FecharCadastroUsuario();
        }
        
    }//GEN-LAST:event_formInternalFrameClosing
    
    
    private void lblCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblCpfActionPerformed

    private void btApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btApagarActionPerformed
      
                UsuarioDAO ud = new UsuarioDAO();

        if(tbResult.getSelectedRows().length > 0){
            System.out.println("BOTAO");
           
            int selecionados = tbResult.getSelectedRows().length;
            System.out.println("");
            
            for(int i = 0; i < selecionados; i++){
                
                System.out.println("DENTRO DO FOR 1");
                
                 for(Usuario user: lstUsuarios){
                     System.out.println("lista " + lstUsuarios.size() + "user " + user.getEmailUsuario());
                   System.out.println("DENTRO DO FOR 2" + user.getId());
                    if(user.getId()!=null){
                        ud.apagar(user);
                }

            }
                //lstUsuarios.remove(tbResult.getSelectedRows()[0]);
            }
            
            
             
            lblName.setText("");
            lblCpf.setText("");
            lblEmail.setText("");
            lblPhone.setText(""); 
        }
        
        
       
        
    }//GEN-LAST:event_btApagarActionPerformed

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

    private void lblPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblPhoneActionPerformed

    private void btInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btInserirActionPerformed
        Usuario user = new Usuario();

        if(lblCpf.getText().trim().equals("")||lblName.getText().trim().equals("")){
            System.out.println("Há campos obrigatórios em branco");
            String[] opcoes = {"Fechar"};
            JOptionPane.showOptionDialog(null, "Há campos obrigatórios em branco", "Erro!", JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE, null, opcoes, opcoes[0]);
        }
        else{
      
            if(tbResult.getSelectedRows().length==0)
            {
                user.getId();
                user.setCpfUsuario(lblCpf.getText()); 
                user.setEmailUsuario(lblEmail.getText());
                user.setNomeUsuario(lblName.getText());
                user.setTelefoneUsuario(lblPhone.getText());
                user.setSenhaUsuario(lblPassword.getText());
            }
            lstUsuarios.add(user);  
            
        }                         
    }//GEN-LAST:event_btInserirActionPerformed

    private void lblPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lblPasswordActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        
            UsuarioDAO cd = new UsuarioDAO();
            
            for(Usuario user: lstUsuarios){
                if(user.getId()==null)
                    cd.inserir(user);
                else
                    cd.alterar(user);
            }
            JOptionPane.showMessageDialog(null, "Usuarios inseridos com sucesso!\n");
    }//GEN-LAST:event_btSalvarActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btApagar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btInserir;
    private javax.swing.JButton btSalvar;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lblCpf;
    private javax.swing.JTextField lblEmail;
    private javax.swing.JTextField lblName;
    private javax.swing.JTextField lblPassword;
    private javax.swing.JTextField lblPhone;
    private javax.swing.JTable tbResult;
    // End of variables declaration//GEN-END:variables
}



