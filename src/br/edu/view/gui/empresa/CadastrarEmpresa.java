
package br.edu.view.gui.empresa;
import br.edu.model.bean.EmpresaBEAN;
import br.edu.model.dao.EmpresaDAO;
import br.edu.view.gui.GuiLogin;
import javax.swing.JOptionPane;

public class CadastrarEmpresa extends javax.swing.JFrame {
    
    public CadastrarEmpresa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ftfCnpj = new javax.swing.JFormattedTextField();
        pfSenha = new javax.swing.JPasswordField();
        btSalvar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        lbNome = new javax.swing.JLabel();
        lbEmpresa = new javax.swing.JLabel();
        lbCnpj = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();
        tfNome = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        try {
            ftfCnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###-####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        ftfCnpj.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        pfSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btSalvar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        btCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        lbNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNome.setText("Nome:");

        lbEmpresa.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbEmpresa.setText("EMPRESA");

        lbCnpj.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCnpj.setText("CNPJ:");

        lbEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbEmail.setText("Email:");

        lbSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbSenha.setText("Senha:");

        tfNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        tfEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbEmpresa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(lbNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(lbCnpj)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ftfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(btCancelar)
                        .addGap(27, 27, 27)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbSenha)
                            .addComponent(lbEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbEmpresa)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCnpj)
                    .addComponent(ftfCnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSenha)
                    .addComponent(pfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btSalvar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed

        String cnpj = ftfCnpj.getText();
        String nome = tfNome.getText();
        String email = tfEmail.getText();
        String password = String.valueOf(pfSenha.getPassword());

        EmpresaBEAN empresa = new EmpresaBEAN(cnpj, nome, email, password);
        EmpresaDAO.save(empresa);

        JOptionPane.showMessageDialog(null, "Empresa cadastrada com sucesso!", "Realização de cadastro", JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);

        GuiLogin login = new GuiLogin();
        login.setVisible(true);
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.setVisible(false);
        System.exit(0);
    }//GEN-LAST:event_btCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JFormattedTextField ftfCnpj;
    private javax.swing.JLabel lbCnpj;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbEmpresa;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}
