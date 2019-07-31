package br.edu.view.gui.servicos;

import br.edu.model.bean.ServicoBEAN;
import br.edu.model.dao.ServicoDAO;
import javax.swing.JOptionPane;

public class GuiBuscarServico extends javax.swing.JInternalFrame {

    public GuiBuscarServico() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbNumeroServico = new javax.swing.JLabel();
        btBuscar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        lbBuscarServico = new javax.swing.JLabel();
        tfNumeroServico = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);

        lbNumeroServico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNumeroServico.setText("Informe o número do serviço para busca");

        btBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        btCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        lbBuscarServico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbBuscarServico.setText("BUSCAR SERVIÇO");

        tfNumeroServico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(tfNumeroServico, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbBuscarServico)
                            .addComponent(lbNumeroServico)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lbBuscarServico)
                .addGap(28, 28, 28)
                .addComponent(lbNumeroServico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfNumeroServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btBuscar)
                    .addComponent(btCancelar))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        int numero = -1;
        ServicoBEAN servico = null;
        
        numero = Integer.parseInt(tfNumeroServico.getText());
        servico = ServicoDAO.getServicoByNumber(numero);
        
        if(servico != null){
            int confirm = JOptionPane.showConfirmDialog(null,"Informação\n\n"+
                    servico.toString()+"\n\nDeseja buscar mais algum serviço? ",
                    "Serviço", JOptionPane.INFORMATION_MESSAGE);

            if(confirm == JOptionPane.YES_OPTION){
                tfNumeroServico.setText("");
            }else{
                setVisible(false);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum serviço encontrado!",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JLabel lbBuscarServico;
    private javax.swing.JLabel lbNumeroServico;
    private javax.swing.JTextField tfNumeroServico;
    // End of variables declaration//GEN-END:variables
}
