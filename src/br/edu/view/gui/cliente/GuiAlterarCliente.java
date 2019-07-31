package br.edu.view.gui.cliente;

import br.edu.model.bean.ClienteBEAN;
import br.edu.model.dao.ClienteDAO;
import javax.swing.JOptionPane;

public class GuiAlterarCliente extends javax.swing.JInternalFrame {

    ClienteBEAN cliente;

    public GuiAlterarCliente(ClienteBEAN c) {
        initComponents();
        
        cliente = new ClienteBEAN();
        cliente.setCpf(c.getCpf());
        
        tfNomeCompleto.setText(c.getNomeCompleto());
        //radio
        if (c.getSexo().equalsIgnoreCase("m")) {
            rbMasculino.setSelected(true);
        } else if (c.getSexo().equalsIgnoreCase("f")) {
            rbFeminino.setSelected(true);
        } else {
            rbOutro.setSelected(true);
        }
        lbCPFClientePreenchido.setText(c.getCpf());
        tfCidade.setText(c.getCidade());
        tfRua.setText(c.getRua());
        tfBairro.setText(c.getBairro());
        tfNumero.setText(String.valueOf(c.getNumeroDaCasa()));
        tfBairro.setText(c.getBairro());
        tfComplemento.setText(c.getComplemento());
        
        String telefone = c.getTelefone();
        telefone = telefone.replace("(,),-", "");
                
        ftfTelefone.setText(telefone);
        
        tfEmail.setText(c.getEmail());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lbEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lbAlterarCliente = new javax.swing.JLabel();
        btFinalizar = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        tfCidade = new javax.swing.JTextField();
        lbRua = new javax.swing.JLabel();
        tfRua = new javax.swing.JTextField();
        lbNúmero = new javax.swing.JLabel();
        tfNumero = new javax.swing.JTextField();
        lbBairro = new javax.swing.JLabel();
        tfBairro = new javax.swing.JTextField();
        lbComplemento = new javax.swing.JLabel();
        tfComplemento = new javax.swing.JTextField();
        lbNomeCompleto = new javax.swing.JLabel();
        lbSexo = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        rbFeminino = new javax.swing.JRadioButton();
        rbOutro = new javax.swing.JRadioButton();
        lbCpf = new javax.swing.JLabel();
        lbCidade = new javax.swing.JLabel();
        tfNomeCompleto = new javax.swing.JTextField();
        lbTelefone = new javax.swing.JLabel();
        ftfTelefone = new javax.swing.JFormattedTextField();
        lbCPFClientePreenchido = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setTitle("Alterar Cliente");

        lbEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbEmail.setText("E-mail:");

        tfEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lbAlterarCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbAlterarCliente.setText("ALTERAR CLIENTE");

        btFinalizar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btFinalizar.setText("Finalizar");
        btFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFinalizarActionPerformed(evt);
            }
        });

        btVoltar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btVoltar.setText("Voltar");

        tfCidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lbRua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbRua.setText("Rua:");

        tfRua.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lbNúmero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNúmero.setText("Nº");

        tfNumero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

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

        lbNomeCompleto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNomeCompleto.setText("Nome completo:");

        lbSexo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbSexo.setText("Sexo:");

        buttonGroup1.add(rbMasculino);
        rbMasculino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbMasculino.setText("Masculino");
        rbMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbMasculinoActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbFeminino);
        rbFeminino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbFeminino.setText("Feminino");

        buttonGroup1.add(rbOutro);
        rbOutro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbOutro.setText("Outro");

        lbCpf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCpf.setText("CPF:");

        lbCidade.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCidade.setText("Cidade:");

        tfNomeCompleto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        lbTelefone.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTelefone.setText("Telefone:");

        try {
            ftfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)# ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lbCPFClientePreenchido.setText("CPF DO CLIENTE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(lbSexo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbMasculino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbFeminino)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbOutro))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(lbAlterarCliente))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(lbNomeCompleto)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(75, 75, 75)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btVoltar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btFinalizar))
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
                                            .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(ftfTelefone)
                                        .addComponent(lbCPFClientePreenchido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addContainerGap(140, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lbAlterarCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNomeCompleto)
                    .addComponent(tfNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbMasculino)
                    .addComponent(rbFeminino)
                    .addComponent(rbOutro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCpf)
                    .addComponent(lbCPFClientePreenchido, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbCidade)
                    .addComponent(tfCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbRua)
                    .addComponent(tfRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNúmero)
                    .addComponent(tfNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(ftfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEmail)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btFinalizar)
                    .addComponent(btVoltar))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBairroActionPerformed

    private void btFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFinalizarActionPerformed
        cliente.setNomeCompleto(tfNomeCompleto.getText());
        if (rbMasculino.isSelected()) {
            cliente.setSexo("m");
        } else if (rbFeminino.isSelected()) {
            cliente.setSexo("f");
        } else {
            cliente.setSexo("o");
        }
        cliente.setCidade(tfCidade.getText());
        cliente.setRua(tfRua.getText());
        cliente.setNumeroDaCasa(Integer.parseInt(tfNumero.getText()));
        cliente.setBairro(tfBairro.getText());
        cliente.setComplemento(tfComplemento.getText());
        cliente.setTelefone(ftfTelefone.getText());
        cliente.setEmail(tfEmail.getText());

        if (verificarCampos()) {
            JOptionPane.showMessageDialog(null, "Os campos não podem retornar vazios");
        } else {
            if(ClienteDAO.update(cliente)){
                JOptionPane.showMessageDialog(null, "Cliente " + tfNomeCompleto.getText() 
                        + " alterado com sucesso! ");
                setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "Ocorreu algum erro "
                        + "inesperado e não foi possivel atualizar o cliente");
            }
        }
    }//GEN-LAST:event_btFinalizarActionPerformed

    private void rbMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbMasculinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbMasculinoActionPerformed

    private boolean verificarCampos() {
        return (tfNomeCompleto.getText().isEmpty()) || (tfCidade.getText().isEmpty()) 
                || (tfBairro.getText().isEmpty());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btFinalizar;
    private javax.swing.JButton btVoltar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JFormattedTextField ftfTelefone;
    private javax.swing.JLabel lbAlterarCliente;
    private javax.swing.JLabel lbBairro;
    private javax.swing.JLabel lbCPFClientePreenchido;
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
    private javax.swing.JTextField tfNumero;
    private javax.swing.JTextField tfRua;
    // End of variables declaration//GEN-END:variables
}
