package br.edu.view.gui.cliente;

import br.edu.model.bean.ClienteBEAN;
import br.edu.model.dao.ClienteDAO;
import br.edu.model.util.ValidadorDeCPF;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;

public class GuiCadastrarCliente extends javax.swing.JInternalFrame {

    public GuiCadastrarCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgSexo = new javax.swing.ButtonGroup();
        tfNomeCompleto = new javax.swing.JTextField();
        tfCidade = new javax.swing.JTextField();
        lbRua = new javax.swing.JLabel();
        tfRua = new javax.swing.JTextField();
        lbNúmero = new javax.swing.JLabel();
        tfNúmero = new javax.swing.JTextField();
        lbBairro = new javax.swing.JLabel();
        tfBairro = new javax.swing.JTextField();
        lbComplemento = new javax.swing.JLabel();
        tfComplemento = new javax.swing.JTextField();
        lbTelefone = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lbCadastrar = new javax.swing.JLabel();
        btCadastrar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        lbNomeCompleto = new javax.swing.JLabel();
        lbSexo = new javax.swing.JLabel();
        ftfCpf = new javax.swing.JFormattedTextField();
        ftfTelefone = new javax.swing.JFormattedTextField();
        lbCpf = new javax.swing.JLabel();
        lbCidade = new javax.swing.JLabel();
        rbFeminino = new javax.swing.JRadioButton();
        rbMasculino = new javax.swing.JRadioButton();
        rbOutro = new javax.swing.JRadioButton();

        setClosable(true);
        setMaximizable(true);

        tfNomeCompleto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfNomeCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNomeCompletoActionPerformed(evt);
            }
        });

        tfCidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCidadeActionPerformed(evt);
            }
        });

        lbRua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbRua.setText("Rua:");

        tfRua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lbNúmero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNúmero.setText("Nº");

        tfNúmero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lbBairro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbBairro.setText("Bairro:");

        tfBairro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfBairroActionPerformed(evt);
            }
        });

        lbComplemento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbComplemento.setText("Complemento:");

        tfComplemento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lbTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTelefone.setText("Telefone:");

        lbEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbEmail.setText("E-mail:");

        tfEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lbCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbCadastrar.setText("CADASTRO");

        btCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btCadastrar.setText("Cadastrar");
        btCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarActionPerformed(evt);
            }
        });

        btCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        lbNomeCompleto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNomeCompleto.setText("Nome completo:");

        lbSexo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbSexo.setText("Sexo:");

        try {
            ftfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            ftfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbCpf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCpf.setText("CPF:");

        lbCidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCidade.setText("Cidade:");

        btgSexo.add(rbFeminino);
        rbFeminino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbFeminino.setText("Feminino");
        rbFeminino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFemininoActionPerformed(evt);
            }
        });

        btgSexo.add(rbMasculino);
        rbMasculino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbMasculino.setText("Masculino");
        rbMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMasculinoActionPerformed(evt);
            }
        });

        btgSexo.add(rbOutro);
        rbOutro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbOutro.setText("Outro");
        rbOutro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOutroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(lbCadastrar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(133, 133, 133)
                            .addComponent(lbSexo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(rbFeminino)
                            .addGap(18, 18, 18)
                            .addComponent(rbMasculino)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rbOutro))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbNomeCompleto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(75, 75, 75)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btCancelar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btCadastrar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lbCidade)
                                            .addComponent(lbCpf)
                                            .addComponent(lbRua)
                                            .addComponent(lbBairro)
                                            .addComponent(lbComplemento)
                                            .addComponent(lbTelefone)
                                            .addComponent(lbEmail))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(tfCidade)
                                            .addComponent(tfEmail)
                                            .addComponent(tfComplemento)
                                            .addComponent(tfBairro)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(tfRua, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(lbNúmero)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tfNúmero, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(ftfCpf)
                                            .addComponent(ftfTelefone))))))))
                .addContainerGap(154, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lbCadastrar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeCompleto)
                    .addComponent(tfNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbFeminino)
                    .addComponent(rbMasculino)
                    .addComponent(rbOutro))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ftfCpf, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(lbCpf))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCidade)
                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRua)
                    .addComponent(tfRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNúmero)
                    .addComponent(tfNúmero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbBairro)
                    .addComponent(tfBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbComplemento)
                    .addComponent(tfComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTelefone)
                    .addComponent(ftfTelefone, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEmail)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrar)
                    .addComponent(btCancelar))
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNomeCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNomeCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNomeCompletoActionPerformed

    private void tfCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCidadeActionPerformed

    private void tfBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBairroActionPerformed

    private void btCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarActionPerformed
        ClienteBEAN cliente = new ClienteBEAN();

        if (verificarCampos()) {
            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }else if(!ValidadorDeCPF.isCPF(ftfCpf.getText())){
            JOptionPane.showMessageDialog(null, "CPF invalido!",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }else {
            cliente.setNomeCompleto(tfNomeCompleto.getText());
            cliente.setCpf(ftfCpf.getText());
            cliente.setCidade(tfCidade.getText());
            cliente.setRua(tfRua.getText());
            
            if(!tfNúmero.getText().isEmpty()){
                cliente.setNumeroDaCasa(Integer.parseInt(tfNúmero.getText()));
            }else{
                cliente.setNumeroDaCasa(-1);
            }
            
            cliente.setBairro(tfBairro.getText());
            cliente.setComplemento(tfComplemento.getText());
            cliente.setTelefone(ftfTelefone.getText());
            cliente.setEmail(tfEmail.getText());
            
            if(rbFeminino.isSelected()){
                cliente.setSexo("F");
            }else if(rbMasculino.isSelected()){
                cliente.setSexo("M");
            }else{
                cliente.setSexo("O");
            }
            
            boolean verif = ClienteDAO.add(cliente);
            
            if(verif){
                int dialogResult = JOptionPane.showConfirmDialog(null, "Cliente cadastrado com sucesso! "
                        + "\nDeseja cadastrar outro cliente?",
                        "Cadastro", JOptionPane.INFORMATION_MESSAGE);
                
                if(dialogResult == JOptionPane.YES_OPTION){
                    limparCampos();
                }else{
                    this.setVisible(false);
                }
            }
        }
    }//GEN-LAST:event_btCadastrarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void rbMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMasculinoActionPerformed

    private void rbOutroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOutroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbOutroActionPerformed

    private void rbFemininoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFemininoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFemininoActionPerformed

    private boolean verificarCampos() {
        return (tfNomeCompleto.getText().isEmpty()) || (ftfCpf.getText().isEmpty())
                || (tfCidade.getText().isEmpty()) || (tfBairro.getText().isEmpty());
    }
    
    private void limparCampos(){
        tfNomeCompleto.setText("");
        tfCidade.setText("");
        tfComplemento.setText("");
        tfEmail.setText("");
        tfRua.setText("");
        tfNúmero.setText("");
        tfBairro.setText("");
        btgSexo.clearSelection();
        ftfCpf.setText("");
        ftfTelefone.setText("");
    }
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCadastrar;
    private javax.swing.JButton btCancelar;
    private javax.swing.ButtonGroup btgSexo;
    private javax.swing.JFormattedTextField ftfCpf;
    private javax.swing.JFormattedTextField ftfTelefone;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCadastrar;
    private javax.swing.JLabel lbCidade;
    private javax.swing.JLabel lbComplemento;
    private javax.swing.JLabel lbCpf;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbNomeCompleto;
    private javax.swing.JLabel lbNúmero;
    private javax.swing.JLabel lbRua;
    private javax.swing.JLabel lbSexo;
    private javax.swing.JLabel lbTelefone;
    private javax.swing.JRadioButton rbFeminino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JRadioButton rbOutro;
    private javax.swing.JTextField tfBairro;
    private javax.swing.JTextField tfCidade;
    private javax.swing.JTextField tfComplemento;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNomeCompleto;
    private javax.swing.JTextField tfNúmero;
    private javax.swing.JTextField tfRua;
    // End of variables declaration//GEN-END:variables
}
