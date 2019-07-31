package br.edu.view.gui;

import br.edu.model.bean.EmpresaBEAN;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import br.edu.model.bean.UserBEAN;
import br.edu.model.dao.EmpresaDAO;
import br.edu.model.dao.UserDAO;
import br.edu.model.util.Email;
import br.edu.model.util.GerarPalavraChave;
import br.edu.view.Style;

public class GuiLogin extends javax.swing.JFrame {

    public GuiLogin() {
        initComponents();
    }

    @SuppressWarnings("checked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnPrincipal = new javax.swing.JPanel();
        lbLogin = new javax.swing.JLabel();
        lbSenha = new javax.swing.JLabel();
        tfLogin = new javax.swing.JTextField();
        btEntrar = new javax.swing.JButton();
        tfpSenha = new javax.swing.JPasswordField();
        lbEsquecerSenha = new javax.swing.JLabel();
        lbImagemUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setMaximumSize(new java.awt.Dimension(0, 0));
        setMinimumSize(new java.awt.Dimension(351, 448));
        setName("framePrincipal"); // NOI18N
        setPreferredSize(new java.awt.Dimension(351, 448));
        setResizable(false);
        setSize(getPreferredSize());

        pnPrincipal.setMinimumSize(getPreferredSize());

        lbLogin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbLogin.setText("LOGIN:");

        lbSenha.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbSenha.setText("SENHA:");

        btEntrar.setText("ENTRAR");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });

        lbEsquecerSenha.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        lbEsquecerSenha.setText("Esqueceu sua senha ?");
        lbEsquecerSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbEsquecerSenhaMouseClicked(evt);
            }
        });

        lbImagemUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/view/gui/user.png"))); // NOI18N

        javax.swing.GroupLayout pnPrincipalLayout = new javax.swing.GroupLayout(pnPrincipal);
        pnPrincipal.setLayout(pnPrincipalLayout);
        pnPrincipalLayout.setHorizontalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnPrincipalLayout.createSequentialGroup()
                        .addComponent(lbEsquecerSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnPrincipalLayout.createSequentialGroup()
                        .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfpSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(78, 78, 78))
            .addGroup(pnPrincipalLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(lbImagemUser, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );
        pnPrincipalLayout.setVerticalGroup(
            pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnPrincipalLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(lbImagemUser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfpSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEsquecerSenha))
                .addGap(107, 107, 107))
        );

        lbSenha.getAccessibleContext().setAccessibleName("lbSenha");
        tfLogin.getAccessibleContext().setAccessibleName("lbLogin");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnPrincipal.getAccessibleContext().setAccessibleName("pnPrincipal");

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        UserBEAN user = new UserBEAN(this.tfLogin.getText(),
                String.valueOf(this.tfpSenha.getPassword()));

        boolean autenticar = UserDAO.authentication(user);

        if (autenticar) {
            setVisible(false);

            GuiPrincipal telaPrincipal = new GuiPrincipal();
            telaPrincipal.setVisible(true);
        } else if (!autenticar) {
            JOptionPane.showMessageDialog(null, "Login/Senha: invalido!",
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btEntrarActionPerformed

    private void lbEsquecerSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbEsquecerSenhaMouseClicked
        String email = JOptionPane.showInputDialog(null, "Infome seu email", "Email",
                JOptionPane.INFORMATION_MESSAGE);

        //ele so entra aqui se não cancelar ou sair
        if (email != null) {
            //verifica se o email existe
            boolean verificarEmail = UserDAO.isExist(email);

            if (verificarEmail) {
                //gerando a palavra chave
                String palavraChave = GerarPalavraChave.getFrase();
                
                //thread para não travar o sistema
                new Thread(){
                    @Override
                    public void run(){
                        //Crio uma nova instancia de email passando a palavra chave gerada 
                        EmpresaBEAN e = EmpresaDAO.getEmpresa();
                        Email enviarEmail = new Email(e.getEmail(), e.getEmpresa_password(), email,
                                "Recuperação de senha - EANR", Style.RECUPERACAO + palavraChave);

                        //envio o email
                        enviarEmail.send();
                        
                        //mostro no sistema
                        //System.out.println(palavraChave);
                    }
                }.start();

                //palavra chave informada pelo usuario
                String palavraChaveInformada = JOptionPane.showInputDialog(null,
                        "Informe a palavra-chave", "Confimação da palavra-chave",
                        JOptionPane.INFORMATION_MESSAGE);

                //testo se ele desistiu de mudar a senha
                if (palavraChaveInformada != null) {
                    //caso ele digite a palavra chave errada
                    while (!palavraChave.equalsIgnoreCase(palavraChaveInformada)
                            && palavraChaveInformada != null) {
                        palavraChaveInformada = JOptionPane.showInputDialog(null,
                                "Informe a palavra-chave correta", "Erro: Palavra-chave invalida",
                                JOptionPane.ERROR_MESSAGE);
                    }
                    if (palavraChaveInformada != null) {
                        String novoPassword;
                        String confirmarNovoPassword;

                        //digita as novas senhas
                        novoPassword = JOptionPane.showInputDialog(null,
                                "Digite sua nova senha", "Nova senha",
                                JOptionPane.INFORMATION_MESSAGE);
                        confirmarNovoPassword = JOptionPane.showInputDialog(null,
                                "Confirme sua nova senha", "Confirmar senha",
                                JOptionPane.INFORMATION_MESSAGE);

                        //caso ele tenha digitado senhas diferentes não deixe passar
                        while (!novoPassword.equals(confirmarNovoPassword)) {
                            novoPassword = JOptionPane.showInputDialog(null,
                                    "Erro: Digite senhas identicas\n Digite sua nova senha",
                                    "Erro - Nova senha", JOptionPane.ERROR_MESSAGE);
                            confirmarNovoPassword = JOptionPane.showInputDialog(null,
                                    "Erro: Digite senhas identicas\n Confirme sua nova senha",
                                    "Erro - Confirmar senha", JOptionPane.ERROR_MESSAGE);
                        }

                        //cria uma instancia do usuario
                        UserBEAN newUser = new UserBEAN();
                        newUser.setEmail(email);
                        newUser.setHashPassword(novoPassword);

                        //modifica no banco a senha
                        UserDAO.updatePassword(newUser);

                        JOptionPane.showMessageDialog(null, "Senha Alterada",
                                "Senha", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Operação cancelada",
                                "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Operação cancelada",
                            "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Email não cadastrado!",
                        "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }

    }//GEN-LAST:event_lbEsquecerSenhaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEntrar;
    private javax.swing.JLabel lbEsquecerSenha;
    private javax.swing.JLabel lbImagemUser;
    private javax.swing.JLabel lbLogin;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JPanel pnPrincipal;
    private javax.swing.JTextField tfLogin;
    private javax.swing.JPasswordField tfpSenha;
    // End of variables declaration//GEN-END:variables
}
