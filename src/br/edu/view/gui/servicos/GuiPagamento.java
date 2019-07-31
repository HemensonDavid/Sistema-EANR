package br.edu.view.gui.servicos;

import br.edu.model.bean.PagamentoBEAN;
import br.edu.model.bean.ServicoBEAN;
import br.edu.model.dao.ClienteDAO;
import br.edu.model.dao.PagamentoDAO;
import br.edu.model.dao.ServicoDAO;
import javax.swing.JOptionPane;

public class GuiPagamento extends javax.swing.JInternalFrame {
    
    private PagamentoBEAN pagamento;
    
    public GuiPagamento(int idServico) {
        //obtendo o pagamento referente ao serviço
        this.pagamento = PagamentoDAO.getPagamentoByNumeroServico(idServico);
        
        //setando o custo do servico
        ServicoBEAN s = ServicoDAO.getServicoByNumber(idServico);
        pagamento.setCustoTotal(s.getValorServico());
        
        //caso o pagamento ja esteja finalizado
        if(this.pagamento.getStatusPagamento().equalsIgnoreCase("Finalizado")){
            JOptionPane.showMessageDialog(null, "O pagamento ja foi finalizado!\n\n\t\tDados\n\n"
                    + pagamento.toString(),
                    "Pagamento",JOptionPane.INFORMATION_MESSAGE);
        }else{
            initComponents();   

            lbNumeroServicoValor.setText(String.valueOf(this.pagamento.getNumeroServico()));

            ClienteDAO.getClienteByCPF(pagamento.getCpfCliente());
            
            lbNomeCliente.setText(ClienteDAO.getClienteByCPF(
                    pagamento.getCpfCliente()).getNomeCompleto());
            
            //valor total do serviço
            if(pagamento.getValorRestante() == 0){
                    lbValorTotal.setText(String.valueOf(pagamento.getCustoTotal()));
            }else{
                    lbValorTotal.setText(String.valueOf(pagamento.getValorRestante()));
            }

            //deixando a label de troco invisivel
            lbTroco.setVisible(false);
            lbTrocoValor.setText("");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pagmento = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbNumeroServicoValor = new javax.swing.JLabel();
        lbCliente = new javax.swing.JLabel();
        lbNomeCliente = new javax.swing.JLabel();
        lbFormaPagamento = new javax.swing.JLabel();
        cbFormaPagamento = new javax.swing.JComboBox<>();
        lbValorServico = new javax.swing.JLabel();
        lbValorRecebido = new javax.swing.JLabel();
        lbTroco = new javax.swing.JLabel();
        lbTrocoValor = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        tfValorRecebido = new javax.swing.JTextField();
        lbValorTotal = new javax.swing.JLabel();

        setClosable(true);
        setMaximizable(true);
        setTitle("Pagamento");

        Pagmento.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Pagmento.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Pagmento.setText("PAGAMENTO");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Número do serviço:");

        lbNumeroServicoValor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNumeroServicoValor.setText("NumeroServico");

        lbCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCliente.setText("Cliente:");

        lbNomeCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNomeCliente.setText("Nome cliente");

        lbFormaPagamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbFormaPagamento.setText("Forma de pagamento:");

        cbFormaPagamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbFormaPagamento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--------------------", "Dinheiro", "Cartão - Crédito", "Cartão - Débito", "Cheque" }));

        lbValorServico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbValorServico.setText("Valor total:");

        lbValorRecebido.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbValorRecebido.setText("Valor recebido:");

        lbTroco.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbTroco.setText("Troco:");

        lbTrocoValor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btSalvar.setText("Finalizar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbFormaPagamento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbFormaPagamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(6, 6, 6)
                                        .addComponent(lbNumeroServicoValor))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbTroco)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbTrocoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbCliente)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbNomeCliente))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(134, 134, 134)
                                        .addComponent(Pagmento)))
                                .addGap(0, 102, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lbValorServico)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbValorRecebido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfValorRecebido)))))
                .addGap(127, 127, 127))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(Pagmento)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbNumeroServicoValor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCliente)
                    .addComponent(lbNomeCliente))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFormaPagamento)
                    .addComponent(cbFormaPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbValorTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbValorServico)
                        .addComponent(lbValorRecebido)
                        .addComponent(tfValorRecebido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbTroco))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lbTrocoValor, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btSalvar))
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        pagamento.setTipoDePagamento(String.valueOf(cbFormaPagamento.getSelectedItem()));
        
        pagamento.setValorRecebido(pagamento.getValorRecebido() 
                + Double.parseDouble(tfValorRecebido.getText()));
        
        double valor = Double.parseDouble(lbValorTotal.getText()) 
                - Double.parseDouble(tfValorRecebido.getText());
        
        if(valor<=0){
            pagamento.setValorRestante(0);
            pagamento.setStatusPagamento("Finalizado");
            pagamento.setTroco(valor);
            
            lbTroco.setVisible(true);
            lbTrocoValor.setText(String.valueOf(valor));
        }else{
            pagamento.setValorRestante(valor);
            pagamento.setStatusPagamento("Pendente");
        }
        
        if(!verificarCampos() && PagamentoDAO.update(pagamento)){
            JOptionPane.showMessageDialog(null, "Pagamento finalizado!"
                    + "\nStatus: "+pagamento.getStatusPagamento()
                    +"\nValor restante: "+pagamento.getValorRestante(),
                    "Pagamento",JOptionPane.INFORMATION_MESSAGE);
            setVisible(false);
        }else{
            JOptionPane.showMessageDialog(null, "Erro ao finalizar o pagamento!"
                    + "\nVerifique os campos e tente novamente",
                    "Pagamento",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        JOptionPane.showMessageDialog(null, "Pagamento não finalizado!",
                    "Pagamento",JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);
    }//GEN-LAST:event_btCancelarActionPerformed

    private boolean verificarCampos(){
        return cbFormaPagamento.getSelectedIndex() == 0 ||
                tfValorRecebido.getText().isEmpty();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Pagmento;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JComboBox<String> cbFormaPagamento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbCliente;
    private javax.swing.JLabel lbFormaPagamento;
    private javax.swing.JLabel lbNomeCliente;
    private javax.swing.JLabel lbNumeroServicoValor;
    private javax.swing.JLabel lbTroco;
    private javax.swing.JLabel lbTrocoValor;
    private javax.swing.JLabel lbValorRecebido;
    private javax.swing.JLabel lbValorServico;
    private javax.swing.JLabel lbValorTotal;
    private javax.swing.JTextField tfValorRecebido;
    // End of variables declaration//GEN-END:variables
}
