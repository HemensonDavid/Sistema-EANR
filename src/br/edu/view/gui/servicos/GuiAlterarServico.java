package br.edu.view.gui.servicos;

import br.edu.model.bean.ServicoBEAN;
import br.edu.model.dao.ClienteDAO;
import br.edu.model.dao.ServicoDAO;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class GuiAlterarServico extends javax.swing.JInternalFrame {

    ServicoBEAN servico;

    public GuiAlterarServico(ServicoBEAN s) {
        initComponents();

        servico = new ServicoBEAN();
        servico.setId(s.getId());
        servico.setCpfDoClienteInteressado(s.getCpfDoClienteInteressado());
        servico.setDataAgendamento(s.getDataAgendamento());
        servico.setEquipamento(s.getEquipamento());
        servico.setStatusServico(s.getStatusServico());

        lbNumeroServicoValor.setText(String.valueOf(s.getId()));
        cbTipoServico.setSelectedItem(s.getTipoDeServico());
        lbNomeCliente.setText(ClienteDAO.getClienteByCPF(
                s.getCpfDoClienteInteressado()).getNomeCompleto());
        lbNomeDoEquipamento.setText(s.getEquipamento());
        
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy"); 
        lbAgendamentoData.setText(dataFormat.format(s.getDataAgendamento()));
        tfTerminoData.setText(dataFormat.format(s.getDataTermino()));
        
        tfCustoServico.setText(String.valueOf(s.getValorServico()));
        lbStatus.setText(s.getStatusServico());
        taObservacao.setText(s.getObservacao());
        taEspecificacoes.setText(s.getEspecificacoes());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        lbObservacao = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbTipoServiço = new javax.swing.JLabel();
        cbTipoServico = new javax.swing.JComboBox<>();
        lbCliente = new javax.swing.JLabel();
        lbEquipamento = new javax.swing.JLabel();
        lbAgendamento = new javax.swing.JLabel();
        lbCusto = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taEspecificacoes = new javax.swing.JTextArea();
        btCancelar = new javax.swing.JButton();
        lbTermino = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        lbNumeroServico = new javax.swing.JLabel();
        lbNumeroServicoValor = new javax.swing.JLabel();
        lbStatusServico = new javax.swing.JLabel();
        lbEspecificacoes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taObservacao = new javax.swing.JTextArea();
        tfTerminoData = new javax.swing.JTextField();
        tfCustoServico = new javax.swing.JTextField();
        lbAgendamentoData = new javax.swing.JLabel();
        lbNomeCliente = new javax.swing.JLabel();
        lbNomeDoEquipamento = new javax.swing.JLabel();
        lbStatus = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setClosable(true);
        setMaximizable(true);

        lbObservacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbObservacao.setText("Observação:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ORDEM DE SERVIÇO");

        lbTipoServiço.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTipoServiço.setText("Tipo de serviço:");

        cbTipoServico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbTipoServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Conserto", "Manutenção" }));
        cbTipoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoServicoActionPerformed(evt);
            }
        });

        lbCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCliente.setText("Cliente:");

        lbEquipamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbEquipamento.setText("Equipamento:");

        lbAgendamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbAgendamento.setText("Agendamento:");

        lbCusto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCusto.setText("Custo do serviço:");

        taEspecificacoes.setColumns(20);
        taEspecificacoes.setRows(5);
        jScrollPane1.setViewportView(taEspecificacoes);

        btCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        lbTermino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTermino.setText("Previsão de término:");

        btSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btSalvar.setText("Alterar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        lbNumeroServico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNumeroServico.setText("Número do serviço:");

        lbNumeroServicoValor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNumeroServicoValor.setText("Numero do servico");

        lbStatusServico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbStatusServico.setText("Status do serviço:");

        lbEspecificacoes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbEspecificacoes.setText("Especificações:");

        taObservacao.setColumns(20);
        taObservacao.setRows(5);
        jScrollPane2.setViewportView(taObservacao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lbNumeroServico)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNumeroServicoValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lbObservacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lbEquipamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbNomeDoEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lbCliente)
                        .addGap(18, 18, 18)
                        .addComponent(lbNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbTipoServiço, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbCusto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCustoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbAgendamento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbAgendamentoData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lbTermino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfTerminoData))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(lbStatusServico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(lbEspecificacoes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1)))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumeroServico)
                    .addComponent(lbNumeroServicoValor))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTipoServiço))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCliente)
                    .addComponent(lbNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEquipamento)
                    .addComponent(lbNomeDoEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAgendamentoData, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbAgendamento)
                        .addComponent(lbTermino)
                        .addComponent(tfTerminoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbStatus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCusto)
                        .addComponent(lbStatusServico)
                        .addComponent(tfCustoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbObservacao)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEspecificacoes)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btSalvar))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbTipoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoServicoActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        servico.setTipoDeServico(cbTipoServico.getSelectedItem().toString());
        
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
        String custo = tfCustoServico.getText().replace(",", ".");
        boolean verificarData = true;
        
        try {
            servico.setValorServico(Double.parseDouble(custo));

            Date datatermino = new Date(dataFormat.parse(tfTerminoData.getText()).getTime());
            servico.setDataTermino(datatermino);

            if(servico.getDataAgendamento().compareTo(datatermino)>=0){
                verificarData= false;
            }
        } catch (ParseException | NumberFormatException ex ) {
            JOptionPane.showMessageDialog(null, "Erro ao converter a data ou valor\n"
                    + "verifique e tente novamente",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        servico.setObservacao(taObservacao.getText());
        servico.setEspecificacoes(taEspecificacoes.getText());
        
        if (verificarData && ServicoDAO.update(servico)) {
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!",
                    "Aviso", JOptionPane.INFORMATION_MESSAGE);
            
            setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Não adicionado,"
                    + " Verifique os campos e tente novamente");
        }
    }//GEN-LAST:event_btSalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<String> cbTipoServico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbAgendamento;
    private javax.swing.JLabel lbAgendamentoData;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbCusto;
    private javax.swing.JLabel lbEquipamento;
    private javax.swing.JLabel lbEspecificacoes;
    private javax.swing.JLabel lbNomeCliente;
    private javax.swing.JLabel lbNomeDoEquipamento;
    private javax.swing.JLabel lbNumeroServico;
    private javax.swing.JLabel lbNumeroServicoValor;
    private javax.swing.JLabel lbObservacao;
    private javax.swing.JLabel lbStatus;
    private javax.swing.JLabel lbStatusServico;
    private javax.swing.JLabel lbTermino;
    private javax.swing.JLabel lbTipoServiço;
    private javax.swing.JTextArea taEspecificacoes;
    private javax.swing.JTextArea taObservacao;
    private javax.swing.JTextField tfCustoServico;
    private javax.swing.JTextField tfTerminoData;
    // End of variables declaration//GEN-END:variables
}
