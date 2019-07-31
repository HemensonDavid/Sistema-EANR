package br.edu.view.gui.servicos;

import br.edu.model.bean.ClienteBEAN;
import br.edu.model.bean.ServicoBEAN;
import br.edu.model.dao.ClienteDAO;
import br.edu.model.dao.ServicoDAO;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class GuiCadastroServico extends javax.swing.JInternalFrame {
    
    protected Date dataAgendamento;
    
    public GuiCadastroServico() {
        initComponents();
        
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
        dataAgendamento = new Date(System.currentTimeMillis());
        
        lbAgendamentoData.setText(dataFormat.format(dataAgendamento));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        lbTipoServiço = new javax.swing.JLabel();
        cbTipoServico = new javax.swing.JComboBox<>();
        lbCliente = new javax.swing.JLabel();
        cbCliente = new javax.swing.JComboBox<>();
        lbEquipamento = new javax.swing.JLabel();
        lbAgendamento = new javax.swing.JLabel();
        lbCusto = new javax.swing.JLabel();
        lbTermino = new javax.swing.JLabel();
        lbObservacao = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        taObservacao = new javax.swing.JTextArea();
        btCancelar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        lbEspecificacoes = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        taEspecificacoes = new javax.swing.JTextArea();
        tfEquipamento = new javax.swing.JTextField();
        tfCustoServico = new javax.swing.JTextField();
        tfPrevisaoTermino = new javax.swing.JTextField();
        lbAgendamentoData = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setTitle("Ordem de serviço");

        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("ORDEM DE SERVIÇO");

        lbTipoServiço.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTipoServiço.setText("Tipo de serviço:");

        cbTipoServico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbTipoServico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--------------", "Conserto", "Manutenção" }));
        cbTipoServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoServicoActionPerformed(evt);
            }
        });

        lbCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCliente.setText("Cliente:");

        cbCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbCliente.setModel(preencherComboBoxCliente());
        cbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbClienteActionPerformed(evt);
            }
        });

        lbEquipamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbEquipamento.setText("Equipamento:");

        lbAgendamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbAgendamento.setText("Agendamento:");

        lbCusto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCusto.setText("Custo do serviço:");

        lbTermino.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTermino.setText("Previsão de término:");

        lbObservacao.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbObservacao.setText("Observação:");

        taObservacao.setColumns(20);
        taObservacao.setRows(5);
        jScrollPane1.setViewportView(taObservacao);

        btCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        lbEspecificacoes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbEspecificacoes.setText("Especificações:");

        taEspecificacoes.setColumns(20);
        taEspecificacoes.setRows(5);
        jScrollPane2.setViewportView(taEspecificacoes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 781, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbEspecificacoes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbObservacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbEquipamento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfEquipamento))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbCliente, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbTipoServiço)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbCusto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfCustoServico, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbAgendamento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbAgendamentoData, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbTermino)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfPrevisaoTermino)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lbTitulo)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTipoServiço)
                    .addComponent(cbTipoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCliente))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEquipamento)
                    .addComponent(tfEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAgendamentoData, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbAgendamento)
                        .addComponent(lbTermino)
                        .addComponent(tfPrevisaoTermino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCusto)
                    .addComponent(tfCustoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbObservacao)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbEspecificacoes)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btSalvar))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (verificarCampos()) {
            JOptionPane.showMessageDialog(null, "Algum campo está vazio", "erro", JOptionPane.ERROR_MESSAGE);
        } else {
            ClienteBEAN cliente = ClienteDAO.findALL().get(cbCliente.getSelectedIndex());

            ServicoBEAN s = new ServicoBEAN();
            boolean verificarData = true; //Verifica se as datas foram inseridas de maneira correta

            s.setTipoDeServico(cbTipoServico.getSelectedItem().toString());
            
            s.setCpfDoClienteInteressado(cliente.getCpf());
            
            SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
            s.setDataAgendamento(dataAgendamento);
            
            String custo = tfCustoServico.getText().replace(",", ".");
            
            boolean erroData = false;
            
            try {
                s.setValorServico(Double.parseDouble(custo));
                
                Date datatermino = new Date(dataFormat.parse(tfPrevisaoTermino.getText()).getTime());
                s.setDataTermino(datatermino);
                
                if(dataAgendamento.compareTo(datatermino)>=0){
                    verificarData= false;
                }
            } catch (ParseException | NumberFormatException ex ) {
                JOptionPane.showMessageDialog(null, "Erro ao converter a data ou valor\n"
                        + "verifique e tente novamente",
                        "Erro", JOptionPane.ERROR_MESSAGE);
                erroData = true;
            }
            
            if(!erroData){
                s.setEquipamento(tfEquipamento.getText());
                s.setObservacao(taObservacao.getText());
                s.setEspecificacoes(taEspecificacoes.getText());

                if (verificarData && ServicoDAO.add(s)) {
                    int confirm = JOptionPane.showConfirmDialog(null, "Serviço adicionado!"
                            + "\nDeseja adicionar mais algum serviço? ",
                            "Aviso", JOptionPane.INFORMATION_MESSAGE);

                    if(confirm == JOptionPane.YES_OPTION){
                        limparCampos();
                    }else{
                        setVisible(false);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Não adicionado,"
                            + " Verifique os campos e tente novamente");
                }
            }
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void cbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbClienteActionPerformed

    private void cbTipoServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoServicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTipoServicoActionPerformed

    private boolean verificarCampos() {
        return cbCliente.getSelectedIndex() == -1 || tfEquipamento.getText().isEmpty()
                || tfCustoServico.getText().isEmpty() || cbTipoServico.getSelectedIndex() == 0;
    }
    
    private DefaultComboBoxModel preencherComboBoxCliente(){
        ArrayList<ClienteBEAN> clientes = new ArrayList<>(ClienteDAO.findALL());
        
        List<String> nomesClientes = new ArrayList<>();
        
        for(ClienteBEAN c: clientes){
            nomesClientes.add(c.getNomeCompleto());
        }
        
        DefaultComboBoxModel defaultComboBox = new DefaultComboBoxModel(nomesClientes.toArray());
        
        return defaultComboBox;
    }
    
    private void limparCampos(){
        cbTipoServico.setSelectedIndex(0);
        cbCliente.setSelectedIndex(0);
        tfEquipamento.setText("");
        tfPrevisaoTermino.setText("");
        tfCustoServico.setText("");
        taObservacao.setText("");
        taEspecificacoes.setText("");
        
        SimpleDateFormat dataFormat = new SimpleDateFormat("dd/MM/yyyy");
        dataAgendamento = new Date(System.currentTimeMillis());
        lbAgendamentoData.setText(dataFormat.format(dataAgendamento));
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<String> cbCliente;
    private javax.swing.JComboBox<String> cbTipoServico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbAgendamento;
    private javax.swing.JLabel lbAgendamentoData;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbCusto;
    private javax.swing.JLabel lbEquipamento;
    private javax.swing.JLabel lbEspecificacoes;
    private javax.swing.JLabel lbObservacao;
    private javax.swing.JLabel lbTermino;
    private javax.swing.JLabel lbTipoServiço;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextArea taEspecificacoes;
    private javax.swing.JTextArea taObservacao;
    private javax.swing.JTextField tfCustoServico;
    private javax.swing.JTextField tfEquipamento;
    private javax.swing.JTextField tfPrevisaoTermino;
    // End of variables declaration//GEN-END:variables
}
