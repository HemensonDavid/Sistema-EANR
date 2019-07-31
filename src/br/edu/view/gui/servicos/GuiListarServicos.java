package br.edu.view.gui.servicos;

import br.edu.model.tableModel.ServicoTableModel;

public class GuiListarServicos extends javax.swing.JInternalFrame {
    
    private ServicoTableModel tableModel;
    
    public GuiListarServicos() {
        this.tableModel = new ServicoTableModel();
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbListar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbListaServicos = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);

        lbListar.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbListar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbListar.setText("LISTA DE SERVIÇOS");

        tbListaServicos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbListaServicos.setModel(this.tableModel);
        jScrollPane1.setViewportView(tbListaServicos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(lbListar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 658, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbListar)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbListar;
    private javax.swing.JTable tbListaServicos;
    // End of variables declaration//GEN-END:variables
}
