/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rh_java;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.Binding;
import org.jdesktop.beansbinding.BindingGroup;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.swingbinding.JTableBinding;
import org.jdesktop.swingbinding.JTableBinding.ColumnBinding;
import org.jdesktop.swingbinding.SwingBindings;

/**
 *
 * @author Jujuba
 */
public class CriarVaga extends javax.swing.JInternalFrame {
    
    private List<Vaga> lstVagas;
    /**
     * Creates new form CriarVaga
     */
    public CriarVaga() {
        lstVagas = new ArrayList<>();
        lstVagas = ObservableCollections.observableList(lstVagas);
        
        initComponents();
        
        BindingGroup bg = new BindingGroup();
        
        JTableBinding tb = SwingBindings.createJTableBinding(AutoBinding.UpdateStrategy.READ_WRITE,
                lstVagas, tbVagas);
        JTableBinding.ColumnBinding cb = tb.addColumnBinding(BeanProperty.create("cargo"));
        cb.setColumnName("Cargo");
        
        cb = tb.addColumnBinding(BeanProperty.create("substituicao"));
        cb.setColumnName("Substituicao");
        
        cb = tb.addColumnBinding(BeanProperty.create("extra_orcamento"));
        cb.setColumnName("Extra Orcamento");
        
        cb = tb.addColumnBinding(BeanProperty.create("aumentoQuadro"));
        cb.setColumnName("Aumento Quadro");
        
        cb = tb.addColumnBinding(BeanProperty.create("sexo"));
        cb.setColumnName("Sexo");
        
        cb = tb.addColumnBinding(BeanProperty.create("internet"));
        cb.setColumnName("Internet");
        
        cb = tb.addColumnBinding(BeanProperty.create("motorista"));
        cb.setColumnName("Motorista");
        
        cb = tb.addColumnBinding(BeanProperty.create("requisitos"));
        cb.setColumnName("Requisitos");
        
        cb = tb.addColumnBinding(BeanProperty.create("horario_trabalho"));
        cb.setColumnName("Horario Trabalho");
        
        cb = tb.addColumnBinding(BeanProperty.create("custo"));
        cb.setColumnName("Custo");
        
        cb = tb.addColumnBinding(BeanProperty.create("consideracoes"));
        cb.setColumnName("Consideracões");
        
        
        bg.addBinding(tb);
        
        Binding b = Bindings.createAutoBinding(
                AutoBinding.UpdateStrategy.READ_WRITE,
                tbVagas, BeanProperty.create("selectedElement.substituicao"),
                txtSubstituicao, BeanProperty.create("text"));
        bg.addBinding(b);
        
        b = Bindings.createAutoBinding(
                AutoBinding.UpdateStrategy.READ_WRITE,
                tbVagas, BeanProperty.create("selectedElement.extra_orcamento"),
                txtExtraOrcamento, BeanProperty.create("text"));
        bg.addBinding(b);
        
        b = Bindings.createAutoBinding(
                AutoBinding.UpdateStrategy.READ_WRITE,
                tbVagas, BeanProperty.create("selectedElement.aumentoQuadro"),
                txtAumentoQuadro, BeanProperty.create("text"));
        bg.addBinding(b);
        
        b = Bindings.createAutoBinding(
                AutoBinding.UpdateStrategy.READ_WRITE,
                tbVagas, BeanProperty.create("selectedElement.sexo"),
                txtSexo, BeanProperty.create("text"));
        bg.addBinding(b);
        
        b = Bindings.createAutoBinding(
                AutoBinding.UpdateStrategy.READ_WRITE,
                tbVagas, BeanProperty.create("selectedElement.internet"),
                txtInternet, BeanProperty.create("text"));
        bg.addBinding(b);
        
        b = Bindings.createAutoBinding(
                AutoBinding.UpdateStrategy.READ_WRITE,
                tbVagas, BeanProperty.create("selectedElement.motorista"),
                txtMotorista, BeanProperty.create("text"));
        bg.addBinding(b);
        
         b = Bindings.createAutoBinding(
                AutoBinding.UpdateStrategy.READ_WRITE,
                tbVagas, BeanProperty.create("selectedElement.requisitos"),
                txtRequisitos, BeanProperty.create("text"));
        bg.addBinding(b);
        
        b = Bindings.createAutoBinding(
                AutoBinding.UpdateStrategy.READ_WRITE,
                tbVagas, BeanProperty.create("selectedElement.horario_trabalho"),
                txtHorarioTrabalho, BeanProperty.create("text"));
        bg.addBinding(b);
        
        b = Bindings.createAutoBinding(
                AutoBinding.UpdateStrategy.READ_WRITE,
                tbVagas, BeanProperty.create("selectedElement.custo"),
                txtCusto, BeanProperty.create("text"));
        bg.addBinding(b);
        
        b = Bindings.createAutoBinding(
                AutoBinding.UpdateStrategy.READ_WRITE,
                tbVagas, BeanProperty.create("selectedElement.cargo"),
                txtCargo, BeanProperty.create("text"));
        bg.addBinding(b);
        
        b = Bindings.createAutoBinding(
                AutoBinding.UpdateStrategy.READ_WRITE,
                tbVagas, BeanProperty.create("selectedElement.consideracoes"),
                txtaConsideracoes, BeanProperty.create("text"));
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblCargo = new javax.swing.JLabel();
        lblSubstituicao = new javax.swing.JLabel();
        lblExtraAumento = new javax.swing.JLabel();
        lblAumentoQuadro = new javax.swing.JLabel();
        txtCargo = new javax.swing.JTextField();
        txtSubstituicao = new javax.swing.JTextField();
        txtAumentoQuadro = new javax.swing.JTextField();
        txtExtraOrcamento = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lblSexo = new javax.swing.JLabel();
        lblRequisitos = new javax.swing.JLabel();
        lblInternet = new javax.swing.JLabel();
        lblHorarioTrabalhp = new javax.swing.JLabel();
        lblMotorista = new javax.swing.JLabel();
        lblCusto = new javax.swing.JLabel();
        txtHorarioTrabalho = new javax.swing.JTextField();
        txtCusto = new javax.swing.JTextField();
        txtRequisitos = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        txtInternet = new javax.swing.JTextField();
        txtMotorista = new javax.swing.JTextField();
        lblConsideracoes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaConsideracoes = new javax.swing.JTextArea();
        btnCriarVaga = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbVagas = new javax.swing.JTable();
        btnExcluir = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
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

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CREATE Vaga");

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        lblCargo.setText("Cargo: ");

        lblSubstituicao.setText("Substituição: ");

        lblExtraAumento.setText("Aumento do Quadro (Extra Orçamento): ");

        lblAumentoQuadro.setText("Aumento do Quadro: ");

        txtCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblSubstituicao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSubstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblCargo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblExtraAumento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtExtraOrcamento))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblAumentoQuadro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAumentoQuadro, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExtraAumento)
                    .addComponent(txtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtExtraOrcamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAumentoQuadro)
                    .addComponent(lblSubstituicao)
                    .addComponent(txtSubstituicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAumentoQuadro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        lblSexo.setText("Sexo: ");

        lblRequisitos.setText("Requisitos:");

        lblInternet.setText("Internet: ");

        lblHorarioTrabalhp.setText("Horário de Trablho: ");

        lblMotorista.setText("Motorista: ");

        lblCusto.setText("Custo: ");

        txtCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustoActionPerformed(evt);
            }
        });

        txtMotorista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMotoristaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblRequisitos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRequisitos, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblSexo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblInternet)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtInternet, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblHorarioTrabalhp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtHorarioTrabalho)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblMotorista)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lblCusto)
                        .addGap(18, 18, 18)
                        .addComponent(txtCusto)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSexo)
                    .addComponent(lblInternet)
                    .addComponent(lblMotorista)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInternet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRequisitos)
                    .addComponent(lblHorarioTrabalhp)
                    .addComponent(lblCusto)
                    .addComponent(txtHorarioTrabalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRequisitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        lblConsideracoes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblConsideracoes.setText("Considerações: ");

        txtaConsideracoes.setColumns(20);
        txtaConsideracoes.setRows(5);
        jScrollPane1.setViewportView(txtaConsideracoes);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addComponent(lblConsideracoes)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblConsideracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCriarVaga.setText("Criar Vaga");
        btnCriarVaga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCriarVagaActionPerformed(evt);
            }
        });

        tbVagas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tbVagas);

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(btnCriarVaga, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCriarVaga, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustoActionPerformed

    private void btnCriarVagaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCriarVagaActionPerformed
        
        Vaga v = new Vaga();
        if(tbVagas.getSelectedRows().length==0){
            v.setCargo(txtCargo.getText());
            v.setSubstituicao(txtSubstituicao.getText());
            v.setExtraOrcamento(txtExtraOrcamento.getText());
            v.setAumentoQuadro(txtAumentoQuadro.getText());
            v.setSexo(txtSexo.getText());
            v.setInternet(txtInternet.getText());
            v.setMotorista(txtMotorista.getText());
            v.setRequisitos(txtRequisitos.getText());
            v.setHorario_trabalho(txtHorarioTrabalho.getText());
            v.setCusto(txtCusto.getText());
            v.setConsideracoes(txtaConsideracoes.getText());
            
            lstVagas.add(v);
            
            txtaConsideracoes.setText("");
            txtCargo.setText("");
            txtSubstituicao.setText("");
            txtExtraOrcamento.setText("");
            txtAumentoQuadro.setText("");
            txtSexo.setText("");
            txtInternet.setText("");
            txtMotorista.setText("");
            txtRequisitos.setText("");
            txtHorarioTrabalho.setText("");
            txtCusto.setText("");
        }else{
            lstVagas.add(v);
            tbVagas.getSelectionModel().setSelectionInterval(
                    lstVagas.size()-1, 
                    lstVagas.size()-1);
        }
    }//GEN-LAST:event_btnCriarVagaActionPerformed

    private void txtCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCargoActionPerformed

    private void txtMotoristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMotoristaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMotoristaActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        int r[] = tbVagas.getSelectedRows();
        List<Vaga> v = new LinkedList<>();
        
        for(int i=0;i<r.length;i++){ 
            
            int idxTabela = r[i];
            int idxList = tbVagas.convertRowIndexToModel(idxTabela);
            v.add(lstVagas.get(idxList));
        }
        lstVagas.removeAll(v);     
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        if(getDesktopPane() instanceof AreaDeTrabalho){
            ((AreaDeTrabalho)getDesktopPane()).fecharCriarVaga();
        }
    }//GEN-LAST:event_formInternalFrameClosing


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCriarVaga;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAumentoQuadro;
    private javax.swing.JLabel lblCargo;
    private javax.swing.JLabel lblConsideracoes;
    private javax.swing.JLabel lblCusto;
    private javax.swing.JLabel lblExtraAumento;
    private javax.swing.JLabel lblHorarioTrabalhp;
    private javax.swing.JLabel lblInternet;
    private javax.swing.JLabel lblMotorista;
    private javax.swing.JLabel lblRequisitos;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblSubstituicao;
    private javax.swing.JTable tbVagas;
    private javax.swing.JTextField txtAumentoQuadro;
    private javax.swing.JTextField txtCargo;
    private javax.swing.JTextField txtCusto;
    private javax.swing.JTextField txtExtraOrcamento;
    private javax.swing.JTextField txtHorarioTrabalho;
    private javax.swing.JTextField txtInternet;
    private javax.swing.JTextField txtMotorista;
    private javax.swing.JTextField txtRequisitos;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtSubstituicao;
    private javax.swing.JTextArea txtaConsideracoes;
    // End of variables declaration//GEN-END:variables
}
