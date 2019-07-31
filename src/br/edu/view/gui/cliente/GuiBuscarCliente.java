package br.edu.view.gui.cliente;

import br.edu.model.bean.ClienteBEAN;
import br.edu.model.dao.ClienteDAO;
import javax.swing.JOptionPane;

public class GuiBuscarCliente extends javax.swing.JInternalFrame {

    public GuiBuscarCliente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbBuscarClientePor = new javax.swing.JLabel();
        lbCpf = new javax.swing.JLabel();
        ftfCpf = new javax.swing.JFormattedTextField();
        btBuscar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();

        setClosable(true);
        setMaximizable(true);
        setTitle("Buscar Cliente");

        lbBuscarClientePor.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbBuscarClientePor.setText("BUSCAR CLIENTE");

        lbCpf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCpf.setText("Informe o CPF para busca");

        try {
            ftfCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(lbBuscarClientePor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbCpf)
                            .addComponent(ftfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(lbBuscarClientePor)
                .addGap(29, 29, 29)
                .addComponent(lbCpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ftfCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btBuscar))
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed

        this.setVisible(false);

    }//GEN-LAST:event_btCancelarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        String cpf = ftfCpf.getText();
        ClienteBEAN cliente = ClienteDAO.getClienteByCPF(cpf);
        JOptionPane.showMessageDialog(null, cliente.toString(), "Cliente", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JFormattedTextField ftfCpf;
    private javax.swing.JLabel lbBuscarClientePor;
    private javax.swing.JLabel lbCpf;
    // End of variables declaration//GEN-END:variables
}
