package br.edu.view.gui.cliente;

import br.edu.model.bean.ClienteBEAN;
import br.edu.model.dao.ClienteDAO;
import br.edu.model.tableModel.ClienteTableModel;
import java.util.ArrayList;

public class GuiListarCliente extends javax.swing.JInternalFrame {

    private ClienteTableModel tableModel;
    
    public GuiListarCliente() {
        this.tableModel = new ClienteTableModel();
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lbListarCliente = new javax.swing.JLabel();
        lbFiltro = new javax.swing.JLabel();
        tfFiltro = new javax.swing.JTextField();
        rbNome = new javax.swing.JRadioButton();
        rbCpf = new javax.swing.JRadioButton();
        btBuscar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbTabelaListar = new javax.swing.JTable();

        setClosable(true);
        setMaximizable(true);
        setTitle("Listar Cliente");

        lbListarCliente.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbListarCliente.setText("LISTAR CLIENTE");

        lbFiltro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbFiltro.setText("Filtro:");

        tfFiltro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        buttonGroup1.add(rbNome);
        rbNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbNome.setText("Nome");

        buttonGroup1.add(rbCpf);
        rbCpf.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbCpf.setText("CPF");

        btBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        tbTabelaListar.setModel(this.tableModel);
        jScrollPane2.setViewportView(tbTabelaListar);
        if (tbTabelaListar.getColumnModel().getColumnCount() > 0) {
            tbTabelaListar.getColumnModel().getColumn(1).setMinWidth(50);
            tbTabelaListar.getColumnModel().getColumn(1).setMaxWidth(50);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(174, 174, 174)
                            .addComponent(lbListarCliente))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(54, 54, 54)
                            .addComponent(lbFiltro)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(8, 8, 8)
                            .addComponent(rbNome)
                            .addGap(5, 5, 5)
                            .addComponent(rbCpf)
                            .addGap(18, 18, 18)
                            .addComponent(btBuscar))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lbListarCliente)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFiltro)
                    .addComponent(tfFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbNome)
                    .addComponent(rbCpf)
                    .addComponent(btBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        String filtro = tfFiltro.getText();
        String radioEscolha = "";
        
        if(rbCpf.isSelected()){
            radioEscolha = "cpf";
        }else if(rbNome.isSelected()){
            radioEscolha = "nome";
        }
        
        ArrayList<ClienteBEAN> novoDado = new ArrayList<>();
        
        if(radioEscolha.equals("cpf")){
            novoDado.clear();
            novoDado.add(ClienteDAO.getClienteByCPF(filtro));
            tableModel.setDados(novoDado);
        }else if(radioEscolha.equals("nome")){
            novoDado = new ArrayList<>(ClienteDAO.getClienteByName(filtro));
            tableModel.setDados(novoDado);
        }
    }//GEN-LAST:event_btBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbFiltro;
    private javax.swing.JLabel lbListarCliente;
    private javax.swing.JRadioButton rbCpf;
    private javax.swing.JRadioButton rbNome;
    private javax.swing.JTable tbTabelaListar;
    private javax.swing.JTextField tfFiltro;
    // End of variables declaration//GEN-END:variables
}
