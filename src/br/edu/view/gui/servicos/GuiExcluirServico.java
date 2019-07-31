package br.edu.view.gui.servicos;

import br.edu.model.dao.ServicoDAO;
import javax.swing.JOptionPane;

public class GuiExcluirServico extends javax.swing.JInternalFrame {

    public GuiExcluirServico() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNumeroServico = new javax.swing.JLabel();
        btExcluir = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        lbExcluirServico = new javax.swing.JLabel();
        tfNumeroServico = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);

        lbNumeroServico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNumeroServico.setText("Informe o número do serviço para remoção");

        btExcluir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btExcluir.setText("Remover");
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });

        btCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        lbExcluirServico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbExcluirServico.setText("REMOVER SERVIÇO");

        tfNumeroServico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(lbExcluirServico))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbNumeroServico)
                                .addComponent(tfNumeroServico, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lbExcluirServico)
                .addGap(29, 29, 29)
                .addComponent(lbNumeroServico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfNumeroServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btExcluir)
                    .addComponent(btCancelar))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        int numero = Integer.parseInt(tfNumeroServico.getText());
        boolean verif = ServicoDAO.remove(numero);
        
        if(verif){
            int confirm = JOptionPane.showConfirmDialog(null, "Serviço excluido!"
                    + "\nDeseja excluir mais algum serviço? ",
                    "Serviço", JOptionPane.INFORMATION_MESSAGE);

            if(confirm == JOptionPane.YES_OPTION){
                tfNumeroServico.setText("");
            }else{
                setVisible(false);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Serviço não encontrado!",
                    "Serviço", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btExcluir;
    private javax.swing.JLabel lbExcluirServico;
    private javax.swing.JLabel lbNumeroServico;
    private javax.swing.JTextField tfNumeroServico;
    // End of variables declaration//GEN-END:variables
}
