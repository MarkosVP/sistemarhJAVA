/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contratar_funcionario;

import java.util.ArrayList;
import java.util.List;
import org.jdesktop.beansbinding.AutoBinding;
import org.jdesktop.beansbinding.BeanProperty;
import org.jdesktop.beansbinding.Binding;
import org.jdesktop.beansbinding.BindingGroup;
import org.jdesktop.beansbinding.Bindings;
import org.jdesktop.observablecollections.ObservableCollections;
import org.jdesktop.swingbinding.JTableBinding;
import org.jdesktop.swingbinding.SwingBindings;

/**
 *
 * @author otavi
 */
public class contratarFuncionarios extends javax.swing.JInternalFrame {

    private List<Funcionario> funcionarios;
    /**
     * Creates new form contratarFuncionarios
     */
    public contratarFuncionarios() {
        initComponents();
        
        funcionarios = new ArrayList<>();
        funcionarios = ObservableCollections.observableList(funcionarios);
        
        BindingGroup bg = new BindingGroup();
        
        JTableBinding tb = SwingBindings.createJTableBinding(
            AutoBinding.UpdateStrategy.READ_WRITE,
            funcionarios,
            Tabela
        ); 
        
        JTableBinding.ColumnBinding cb = tb.addColumnBinding(BeanProperty.create("nome"));
        cb.setColumnName("Nome");
        cb = tb.addColumnBinding(BeanProperty.create("sobrenome"));
        cb.setColumnName("Sobrenome");
        cb = tb.addColumnBinding(BeanProperty.create("cpf"));
        cb.setColumnName("CPF");
        cb = tb.addColumnBinding(BeanProperty.create("cep"));
        cb.setColumnName("CEP");
        cb = tb.addColumnBinding(BeanProperty.create("logradouro"));
        cb.setColumnName("Logradouro");
        cb = tb.addColumnBinding(BeanProperty.create("numero"));
        cb.setColumnName("Número");
        cb = tb.addColumnBinding(BeanProperty.create("bairro"));
        cb.setColumnName("Bairro");
        cb = tb.addColumnBinding(BeanProperty.create("cidade"));
        cb.setColumnName("Cidade");
        cb = tb.addColumnBinding(BeanProperty.create("estado"));
        cb.setColumnName("Estado");
        cb = tb.addColumnBinding(BeanProperty.create("pais"));
        cb.setColumnName("País");
        
        bg.addBinding(tb);
        
        Binding b = Bindings.createAutoBinding(
                AutoBinding.UpdateStrategy.READ_WRITE, 
                Tabela,
                BeanProperty.create("selectedElement.nome"),
                txtNome,
                BeanProperty.create("text")
        );
        
        bg.addBinding(b);
        
        b = Bindings.createAutoBinding(
                AutoBinding.UpdateStrategy.READ_WRITE, 
                Tabela,
                BeanProperty.create("selectedElement.sobrenome"),
                txtSobrenome,
                BeanProperty.create("text")
        );
        
        bg.addBinding(b);        
        
        b = Bindings.createAutoBinding(
                AutoBinding.UpdateStrategy.READ_WRITE, 
                Tabela,
                BeanProperty.create("selectedElement.cpf"),
                txtCPF,
                BeanProperty.create("text")
        );
        
        bg.addBinding(b);        
        
        b = Bindings.createAutoBinding(
                AutoBinding.UpdateStrategy.READ_WRITE, 
                Tabela,
                BeanProperty.create("selectedElement.cep"),
                txtCEP,
                BeanProperty.create("text")
        );
        
        bg.addBinding(b);        
        
        b = Bindings.createAutoBinding(
                AutoBinding.UpdateStrategy.READ_WRITE, 
                Tabela,
                BeanProperty.create("selectedElement.logradouro"),
                txtLogradouro,
                BeanProperty.create("text")
        );
        
        bg.addBinding(b);        
        
        b = Bindings.createAutoBinding(
                AutoBinding.UpdateStrategy.READ_WRITE, 
                Tabela,
                BeanProperty.create("selectedElement.numero"),
                txtNumero,
                BeanProperty.create("text")
        );
        
        bg.addBinding(b);        
        
        b = Bindings.createAutoBinding(
                AutoBinding.UpdateStrategy.READ_WRITE, 
                Tabela,
                BeanProperty.create("selectedElement.bairro"),
                txtBairro,
                BeanProperty.create("text")
        );
        
        bg.addBinding(b);        
        
        b = Bindings.createAutoBinding(
                AutoBinding.UpdateStrategy.READ_WRITE, 
                Tabela,
                BeanProperty.create("selectedElement.cidade"),
                txtCidade,
                BeanProperty.create("text")
        );
        
        bg.addBinding(b);        
        
        b = Bindings.createAutoBinding(
                AutoBinding.UpdateStrategy.READ_WRITE, 
                Tabela,
                BeanProperty.create("selectedElement.estado"),
                txtEstado,
                BeanProperty.create("text")
        );
        
        bg.addBinding(b);        
        
        b = Bindings.createAutoBinding(
                AutoBinding.UpdateStrategy.READ_WRITE, 
                Tabela,
                BeanProperty.create("selectedElement.pais"),
                txtPais,
                BeanProperty.create("text")
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

        lblCidade = new javax.swing.JLabel();
        lblBairro = new javax.swing.JLabel();
        lblPais = new javax.swing.JLabel();
        txtSobrenome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCEP = new javax.swing.JTextField();
        txtLogradouro = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtPais = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        lblNome = new javax.swing.JLabel();
        lblSobrenome = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        lblCPF = new javax.swing.JLabel();
        btnAdicionar = new javax.swing.JButton();
        lblCEP = new javax.swing.JLabel();
        lblEstado = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        lblLogradouro = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();

        lblCidade.setText("Cidade:");

        lblBairro.setText("Bairro:");

        lblPais.setText("País:");

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitulo.setText("CONTRATAR FUNCIONÁRIO");

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
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
        Tabela.setToolTipText("Lista de funcionários");
        jScrollPane1.setViewportView(Tabela);

        lblNome.setText("Nome:");

        lblSobrenome.setText("Sobrenome:");

        btnAlterar.setText("Alterar");

        lblCPF.setText("CPF:");

        btnAdicionar.setText("Adicionar");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        lblCEP.setText("CEP:");

        lblEstado.setText("Estado:");

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        lblLogradouro.setText("Logradouro:");

        lblNumero.setText("Número:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 954, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAlterar)
                        .addGap(12, 12, 12)
                        .addComponent(btnAdicionar)))
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitulo)
                        .addGap(192, 192, 192))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(lblBairro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBairro))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lblLogradouro)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtLogradouro))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEstado)
                                    .addComponent(lblCidade))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCidade)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 342, Short.MAX_VALUE)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNome)
                                    .addComponent(lblCPF))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCPF)
                                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblCEP)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblSobrenome)
                                        .addGap(14, 14, 14)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtSobrenome)
                                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(403, 403, 403)
                                .addComponent(lblPais)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblTitulo)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSobrenome)
                    .addComponent(txtSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCEP)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLogradouro)
                    .addComponent(txtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBairro)
                    .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCidade)
                    .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstado)
                    .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPais)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnAdicionar))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        Funcionario f = new Funcionario();
        if(Tabela.getSelectedRows().length == 0){
            f.setNome(txtNome.getText());
            f.setSobrenome(txtSobrenome.getText());
            f.setCpf(txtCPF.getText());
            f.setCep(txtCEP.getText());
            f.setLogradouro(txtLogradouro.getText());
            try{
                f.setNumero(Integer.parseInt(txtNumero.getText()));
            }
            catch(NumberFormatException error){
                f.setNumero(0);
            }
            f.setBairro(txtBairro.getText());
            f.setCidade(txtCidade.getText());
            f.setEstado(txtEstado.getText());
            f.setPais(txtPais.getText());
            funcionarios.add(f);
            txtNome.setText("");
            txtSobrenome.setText("");
            txtCPF.setText("");
            txtCEP.setText("");
            txtLogradouro.setText("");
            txtNumero.setText("");
            txtBairro.setText("");
            txtCidade.setText("");
            txtEstado.setText("");
            txtPais.setText("");
        }
        else{
            funcionarios.add(f);
        }
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if(Tabela.getSelectedRows().length > 0){
            int selecionados = Tabela.getSelectedRows().length;
            for(int i = 0; i < selecionados; i++){
                funcionarios.remove(Tabela.getSelectedRows()[0]);
            }
            txtNome.setText("");
            txtSobrenome.setText("");
            txtCPF.setText("");
            txtCEP.setText("");
            txtLogradouro.setText("");
            txtNumero.setText("");
            txtBairro.setText("");
            txtCidade.setText("");
            txtEstado.setText("");
            txtPais.setText("");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCidade;
    private javax.swing.JLabel lblEstado;
    private javax.swing.JLabel lblLogradouro;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblSobrenome;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtLogradouro;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPais;
    private javax.swing.JTextField txtSobrenome;
    // End of variables declaration//GEN-END:variables
}
