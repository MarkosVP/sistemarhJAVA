/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rh_java;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
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
 * Classe que gera o cadastro de Candidatos
 *
 * @author marco
 */
public class CadCandidato extends javax.swing.JInternalFrame {
    private List<Candidato> lstCandidatos;

    /**
     * Creates new form CadCandidato
     */
    public CadCandidato() {
        //Criando variável para conectar com o banco
        CadCandidatoDAO candidatoDAO = new CadCandidatoDAO();
        //Modelando lista para nossa tabela
        lstCandidatos = new ArrayList<>();
        //Inserindo os dados do banco na lista
        lstCandidatos = candidatoDAO.lista();
        //Declarando nossa lista como Observável
        lstCandidatos = ObservableCollections.observableList(lstCandidatos);
        
        initComponents();
        
        BindingGroup bg = new BindingGroup();
        
        JTableBinding tb = SwingBindings.createJTableBinding(
                AutoBinding.UpdateStrategy.READ_WRITE, lstCandidatos, tbTabelaCandidatos
        );
        
        ColumnBinding cb = tb.addColumnBinding(BeanProperty.create("cpf"));
        cb.setColumnName("CPF");
        
        cb = tb.addColumnBinding(BeanProperty.create("nome"));
        cb.setColumnName("Nome");
        
        cb = tb.addColumnBinding(BeanProperty.create("sobrenome"));
        cb.setColumnName("Sobrenome");
        
        cb = tb.addColumnBinding(BeanProperty.create("pais"));
        cb.setColumnName("País");
        
        cb = tb.addColumnBinding(BeanProperty.create("cidade"));
        cb.setColumnName("Cidade");
        
        cb = tb.addColumnBinding(BeanProperty.create("estado"));
        cb.setColumnName("Estado");
        
        cb = tb.addColumnBinding(BeanProperty.create("cep"));
        cb.setColumnName("CEP");
        
        cb = tb.addColumnBinding(BeanProperty.create("logradouro"));
        cb.setColumnName("Logradouro");
        
        cb = tb.addColumnBinding(BeanProperty.create("numero"));
        cb.setColumnName("Numero");
        
        cb = tb.addColumnBinding(BeanProperty.create("bairro"));
        cb.setColumnName("Bairro");
        
        bg.addBinding(tb);
        
        //Vinculando Tabelas com TextFields
        Binding b = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE,
                tbTabelaCandidatos, BeanProperty.create("selectedElement.cpf"),
                tfCPF, BeanProperty.create("text"));
        bg.addBinding(b);
        
        b = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE,
                tbTabelaCandidatos, BeanProperty.create("selectedElement.nome"),
                tfNome, BeanProperty.create("text"));
        bg.addBinding(b);
        
        b = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE,
                tbTabelaCandidatos, BeanProperty.create("selectedElement.pais"),
                tfPais, BeanProperty.create("text"));
        bg.addBinding(b);
        
        b = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE,
                tbTabelaCandidatos, BeanProperty.create("selectedElement.cidade"),
                tfCidade, BeanProperty.create("text"));
        bg.addBinding(b);
        
        b = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE,
                tbTabelaCandidatos, BeanProperty.create("selectedElement.estado"),
                tfEstado, BeanProperty.create("text"));
        bg.addBinding(b);
        
        b = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE,
                tbTabelaCandidatos, BeanProperty.create("selectedElement.cep"),
                tfCEP, BeanProperty.create("text"));
        bg.addBinding(b);
        
        b = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE,
                tbTabelaCandidatos, BeanProperty.create("selectedElement.logradouro"),
                tfLogradouro, BeanProperty.create("text"));
        bg.addBinding(b);
        
        b = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE,
                tbTabelaCandidatos, BeanProperty.create("selectedElement.numero"),
                tfNumero, BeanProperty.create("text"));
        bg.addBinding(b);
        
        b = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE,
                tbTabelaCandidatos, BeanProperty.create("selectedElement.bairro"),
                tfBairro, BeanProperty.create("text"));
        bg.addBinding(b);
        
        b = Bindings.createAutoBinding(AutoBinding.UpdateStrategy.READ_WRITE,
                tbTabelaCandidatos, BeanProperty.create("selectedElement.sobrenome"),
                tfSobrenome, BeanProperty.create("text"));
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

        tbpSubMenus = new javax.swing.JTabbedPane();
        pnInfoPessoais = new javax.swing.JPanel();
        pnlInfoPessoais = new javax.swing.JPanel();
        lblCamposInfoPessoais = new javax.swing.JLabel();
        lblNome = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        lblSobrenome = new javax.swing.JLabel();
        tfSobrenome = new javax.swing.JTextField();
        lblPais = new javax.swing.JLabel();
        tfPais = new javax.swing.JTextField();
        lblCidade = new javax.swing.JLabel();
        tfCidade = new javax.swing.JTextField();
        lblEstado = new javax.swing.JLabel();
        tfEstado = new javax.swing.JTextField();
        lblCPF = new javax.swing.JLabel();
        tfCPF = new javax.swing.JTextField();
        pnlInfoAdicionais = new javax.swing.JPanel();
        lblCamposInfoAdicionais = new javax.swing.JLabel();
        lblCEP = new javax.swing.JLabel();
        tfCEP = new javax.swing.JTextField();
        lblLogradouro = new javax.swing.JLabel();
        tfLogradouro = new javax.swing.JTextField();
        lblNumero = new javax.swing.JLabel();
        tfNumero = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        tfBairro = new javax.swing.JTextField();
        pnBotoes = new javax.swing.JPanel();
        bttInserir = new javax.swing.JButton();
        bttAlterar = new javax.swing.JButton();
        bttExcluir = new javax.swing.JButton();
        spnTabelaCandidatos = new javax.swing.JScrollPane();
        tbTabelaCandidatos = new javax.swing.JTable();
        pnTelefones = new javax.swing.JPanel();
        pnCompetencias = new javax.swing.JPanel();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setClosable(true);
        setIconifiable(true);
        setTitle("Cadastrar Candidatos");
        setToolTipText("Menu de Cadastro de Candidatos");
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

        pnlInfoPessoais.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCamposInfoPessoais.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCamposInfoPessoais.setText("* Informações Pessoais");

        lblNome.setText("Nome:");

        tfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                None(evt);
            }
        });

        lblSobrenome.setText("Sobrenome:");

        lblPais.setText("País:");

        lblCidade.setText("Cidade:");

        lblEstado.setText("Estado:");

        lblCPF.setText("CPF:");

        tfCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCPFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlInfoPessoaisLayout = new javax.swing.GroupLayout(pnlInfoPessoais);
        pnlInfoPessoais.setLayout(pnlInfoPessoaisLayout);
        pnlInfoPessoaisLayout.setHorizontalGroup(
            pnlInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCamposInfoPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlInfoPessoaisLayout.createSequentialGroup()
                        .addGroup(pnlInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInfoPessoaisLayout.createSequentialGroup()
                                .addComponent(lblNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblSobrenome))
                            .addGroup(pnlInfoPessoaisLayout.createSequentialGroup()
                                .addComponent(lblCPF)
                                .addGap(18, 18, 18)
                                .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblPais)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPais, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblCidade)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInfoPessoaisLayout.createSequentialGroup()
                                .addComponent(tfCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tfSobrenome))))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        pnlInfoPessoaisLayout.setVerticalGroup(
            pnlInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlInfoPessoaisLayout.createSequentialGroup()
                .addComponent(lblCamposInfoPessoais, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSobrenome)
                    .addComponent(tfSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPF)
                    .addComponent(lblPais)
                    .addComponent(tfPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCidade)
                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEstado)
                    .addComponent(tfEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pnlInfoAdicionais.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblCamposInfoAdicionais.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCamposInfoAdicionais.setText("Informações Adicionais");

        lblCEP.setText("CEP:");

        lblLogradouro.setText("Logradouro:");

        lblNumero.setText("Número:");

        lblBairro.setText("Bairro:");

        javax.swing.GroupLayout pnlInfoAdicionaisLayout = new javax.swing.GroupLayout(pnlInfoAdicionais);
        pnlInfoAdicionais.setLayout(pnlInfoAdicionaisLayout);
        pnlInfoAdicionaisLayout.setHorizontalGroup(
            pnlInfoAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoAdicionaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlInfoAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlInfoAdicionaisLayout.createSequentialGroup()
                        .addComponent(lblCamposInfoAdicionais)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlInfoAdicionaisLayout.createSequentialGroup()
                        .addGroup(pnlInfoAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlInfoAdicionaisLayout.createSequentialGroup()
                                .addComponent(lblNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlInfoAdicionaisLayout.createSequentialGroup()
                                .addComponent(lblCEP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(pnlInfoAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlInfoAdicionaisLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblLogradouro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlInfoAdicionaisLayout.createSequentialGroup()
                                .addComponent(lblBairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfBairro)))))
                .addContainerGap())
        );
        pnlInfoAdicionaisLayout.setVerticalGroup(
            pnlInfoAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlInfoAdicionaisLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(lblCamposInfoAdicionais)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlInfoAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCEP)
                    .addComponent(tfCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogradouro))
                .addGap(18, 18, 18)
                .addGroup(pnlInfoAdicionaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumero)
                    .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBairro)
                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 17, Short.MAX_VALUE))
        );

        pnBotoes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bttInserir.setText("Inserir");
        bttInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttInserirActionPerformed(evt);
            }
        });

        bttAlterar.setText("Alterar");
        bttAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttAlterarActionPerformed(evt);
            }
        });

        bttExcluir.setText("Excluir");

        javax.swing.GroupLayout pnBotoesLayout = new javax.swing.GroupLayout(pnBotoes);
        pnBotoes.setLayout(pnBotoesLayout);
        pnBotoesLayout.setHorizontalGroup(
            pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bttInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175)
                .addComponent(bttAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bttExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnBotoesLayout.setVerticalGroup(
            pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBotoesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bttInserir)
                    .addComponent(bttAlterar)
                    .addComponent(bttExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbTabelaCandidatos.setModel(new javax.swing.table.DefaultTableModel(
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
        spnTabelaCandidatos.setViewportView(tbTabelaCandidatos);

        javax.swing.GroupLayout pnInfoPessoaisLayout = new javax.swing.GroupLayout(pnInfoPessoais);
        pnInfoPessoais.setLayout(pnInfoPessoaisLayout);
        pnInfoPessoaisLayout.setHorizontalGroup(
            pnInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnInfoPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(spnTabelaCandidatos)
                    .addComponent(pnBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlInfoAdicionais, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlInfoPessoais, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnInfoPessoaisLayout.setVerticalGroup(
            pnInfoPessoaisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnInfoPessoaisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlInfoPessoais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlInfoAdicionais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spnTabelaCandidatos, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tbpSubMenus.addTab("Informações Pessoais", pnInfoPessoais);

        javax.swing.GroupLayout pnTelefonesLayout = new javax.swing.GroupLayout(pnTelefones);
        pnTelefones.setLayout(pnTelefonesLayout);
        pnTelefonesLayout.setHorizontalGroup(
            pnTelefonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 676, Short.MAX_VALUE)
        );
        pnTelefonesLayout.setVerticalGroup(
            pnTelefonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
        );

        tbpSubMenus.addTab("Telefones", pnTelefones);

        javax.swing.GroupLayout pnCompetenciasLayout = new javax.swing.GroupLayout(pnCompetencias);
        pnCompetencias.setLayout(pnCompetenciasLayout);
        pnCompetenciasLayout.setHorizontalGroup(
            pnCompetenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 676, Short.MAX_VALUE)
        );
        pnCompetenciasLayout.setVerticalGroup(
            pnCompetenciasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
        );

        tbpSubMenus.addTab("Competências", pnCompetencias);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbpSubMenus)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbpSubMenus, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCPFActionPerformed

    private void None(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_None
        // TODO add your handling code here:
    }//GEN-LAST:event_None

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
        JDesktopPane painel = getDesktopPane();
        if(painel instanceof AreadeTrabalho){
            ((AreadeTrabalho)painel).fecharCadCandidato();
        }
    }//GEN-LAST:event_formInternalFrameClosing

    private void bttAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttAlterarActionPerformed
        // Alterando um elemento da lista da Tela
    }//GEN-LAST:event_bttAlterarActionPerformed

    private void bttInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttInserirActionPerformed
        // Inserção na lista de candidatos da Tela
        CadCandidatoDAO candidatoDAO = new CadCandidatoDAO();
        
        if(tbTabelaCandidatos.getSelectedRows().length == 0){
            Candidato c = new Candidato();
            
            //Dados obrigatórios
            c.setNome(tfNome.getText());
            c.setSobrenome(tfSobrenome.getText());
            c.setCpf(tfCPF.getText());
            c.setPais(tfPais.getText());
            c.setCidade(tfCidade.getText());
            c.setEstado(tfEstado.getText());
            //Dados Opcionais
            if(!"".equals(tfNumero.getText())){
                c.setCep(tfCEP.getText());
                c.setLogradouro(tfLogradouro.getText());
                c.setNumero(Integer.parseInt(tfNumero.getText()));
                c.setBairro(tfBairro.getText());
            }
            
            //Adiciono meu cliente a lista
            lstCandidatos.add(c);
            
            //Removo os dados dos TextFields
            tfNome.setText("");
            tfSobrenome.setText("");
            tfCPF.setText("");
            tfPais.setText("");
            tfCidade.setText("");
            tfEstado.setText("");
            tfCEP.setText("");
            tfLogradouro.setText("");
            tfNumero.setText("");
            tfBairro.setText("");
            
            //Inserindo no banco
            if(candidatoDAO.inserir(c)){
                JOptionPane.showMessageDialog(null, "Inserção no banco concluída!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Falha na inserção!!");
            }
        }
        else{
            //Buscando se já existe algum CPF semelhante
            if( candidatoDAO.BuscaCandidato(tfCPF.getText()) ){
                JOptionPane.showMessageDialog(null, "Candidato com mesmo CPF já cadastrado no sistema!");
            }
            else{   //Não existe Candidato semelhante, Cria um novo
                Candidato c = new Candidato();
            
                //Dados obrigatórios
                c.setNome(tfNome.getText());
                c.setSobrenome(tfSobrenome.getText());
                c.setCpf(tfCPF.getText());
                c.setPais(tfPais.getText());
                c.setCidade(tfCidade.getText());
                c.setEstado(tfEstado.getText());
                //Dados Opcionais
                if(!"".equals(tfNumero.getText())){
                    c.setCep(tfCEP.getText());
                    c.setLogradouro(tfLogradouro.getText());
                    c.setNumero(Integer.parseInt(tfNumero.getText()));
                    c.setBairro(tfBairro.getText());
                }
                //Adiciono meu cliente a lista
                lstCandidatos.add(c);

                //Removo os dados dos TextFields
                tfNome.setText("");
                tfSobrenome.setText("");
                tfCPF.setText("");
                tfPais.setText("");
                tfCidade.setText("");
                tfEstado.setText("");
                tfCEP.setText("");
                tfLogradouro.setText("");
                tfNumero.setText("");
                tfBairro.setText("");
                
                //Inserindo no banco
                if(candidatoDAO.inserir(c)){
                    JOptionPane.showMessageDialog(null, "Inserção no banco concluída!");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Falha na inserção!!");
                }
            }
        }
    }//GEN-LAST:event_bttInserirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttAlterar;
    private javax.swing.JButton bttExcluir;
    private javax.swing.JButton bttInserir;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCamposInfoAdicionais;
    private javax.swing.JLabel lblCamposInfoPessoais;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblLogradouro;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblSobrenome;
    private javax.swing.JPanel pnBotoes;
    private javax.swing.JPanel pnCompetencias;
    private javax.swing.JPanel pnInfoPessoais;
    private javax.swing.JPanel pnTelefones;
    private javax.swing.JPanel pnlInfoAdicionais;
    private javax.swing.JPanel pnlInfoPessoais;
    private javax.swing.JScrollPane spnTabelaCandidatos;
    private javax.swing.JTable tbTabelaCandidatos;
    private javax.swing.JTabbedPane tbpSubMenus;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCEP;
    private javax.swing.JTextField tfCPF;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfEstado;
    private javax.swing.JTextField tfLogradouro;
    private javax.swing.JTextField tfNome;
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfPais;
    private javax.swing.JTextField tfSobrenome;
    // End of variables declaration//GEN-END:variables
}
