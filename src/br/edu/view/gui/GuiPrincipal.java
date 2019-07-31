package br.edu.view.gui;

import br.edu.model.bean.ClienteBEAN;
import br.edu.model.bean.ServicoBEAN;
import br.edu.model.dao.ClienteDAO;
import br.edu.model.dao.ServicoDAO;
import br.edu.model.util.GerarRelatorio;
import br.edu.view.gui.cliente.GuiAlterarCliente;
import br.edu.view.gui.cliente.GuiBuscarCliente;
import br.edu.view.gui.cliente.GuiCadastrarCliente;
import br.edu.view.gui.cliente.GuiExcluirCliente;
import br.edu.view.gui.cliente.GuiListarCliente;
import br.edu.view.gui.servicos.GuiAlterarServico;
import br.edu.view.gui.servicos.GuiBuscarServico;
import br.edu.view.gui.servicos.GuiCadastroServico;
import br.edu.view.gui.servicos.GuiListarServicos;
import br.edu.view.gui.servicos.GuiExcluirServico;
import br.edu.view.gui.servicos.GuiPagamento;
import javax.swing.JOptionPane;

public class GuiPrincipal extends javax.swing.JFrame {

    public GuiPrincipal() {
        initComponents();
        
        /** Deixa em tela cheia **/
        this.setExtendedState(MAXIMIZED_BOTH);      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpPrincipal = new javax.swing.JDesktopPane();
        lbCadastros = new javax.swing.JLabel();
        lbNovoUsuario = new javax.swing.JLabel();
        lbNovoClienteDef = new javax.swing.JLabel();
        lbNovoServico = new javax.swing.JLabel();
        lbNovoServicoDef = new javax.swing.JLabel();
        lbOperacional = new javax.swing.JLabel();
        lbConsultarServicos = new javax.swing.JLabel();
        lbBuscarClienteDef = new javax.swing.JLabel();
        lbBuscarCliente = new javax.swing.JLabel();
        lbConsultarServicosDef = new javax.swing.JLabel();
        lbListarClientes = new javax.swing.JLabel();
        lbListarClientesDef = new javax.swing.JLabel();
        lbListarServicos = new javax.swing.JLabel();
        lbListarServicosDef = new javax.swing.JLabel();
        mbBarraMenu = new javax.swing.JMenuBar();
        mnClientes = new javax.swing.JMenu();
        miCadastrarCliente = new javax.swing.JMenuItem();
        miAlterarCliente = new javax.swing.JMenuItem();
        miListarCliente = new javax.swing.JMenuItem();
        miBuscar = new javax.swing.JMenuItem();
        miExcluirCliente = new javax.swing.JMenuItem();
        mnServicos = new javax.swing.JMenu();
        miAdicionarServico = new javax.swing.JMenuItem();
        miAlterarServico = new javax.swing.JMenuItem();
        miBuscarServico = new javax.swing.JMenuItem();
        miListar = new javax.swing.JMenuItem();
        miRemoverServico = new javax.swing.JMenuItem();
        miGerarPagamento = new javax.swing.JMenuItem();
        mnRelatorios = new javax.swing.JMenu();
        miGerarRelatorio = new javax.swing.JMenuItem();
        mnSobre = new javax.swing.JMenu();
        miSobre = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA EANR");
        getContentPane().setLayout(null);

        dpPrincipal.setBackground(new java.awt.Color(240, 240, 240));

        lbCadastros.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbCadastros.setText("CADASTROS");

        lbNovoUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNovoUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNovoUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/view/gui/Novo_usuario.png"))); // NOI18N
        lbNovoUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lbNovoUsuario.setPreferredSize(new java.awt.Dimension(100, 100));
        lbNovoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNovoUsuarioMouseClicked(evt);
            }
        });

        lbNovoClienteDef.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNovoClienteDef.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNovoClienteDef.setLabelFor(lbNovoUsuario);
        lbNovoClienteDef.setText("Novo cliente");

        lbNovoServico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNovoServico.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNovoServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/view/gui/Servico.png"))); // NOI18N
        lbNovoServico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lbNovoServico.setPreferredSize(new java.awt.Dimension(100, 100));
        lbNovoServico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbNovoServicoMouseClicked(evt);
            }
        });

        lbNovoServicoDef.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNovoServicoDef.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNovoServicoDef.setLabelFor(lbNovoServico);
        lbNovoServicoDef.setText("Novo serviço");

        lbOperacional.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbOperacional.setText("OPERACIONAL");

        lbConsultarServicos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbConsultarServicos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbConsultarServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/view/gui/Consulta.png"))); // NOI18N
        lbConsultarServicos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lbConsultarServicos.setPreferredSize(new java.awt.Dimension(100, 100));
        lbConsultarServicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbConsultarServicosMouseClicked(evt);
            }
        });

        lbBuscarClienteDef.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbBuscarClienteDef.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBuscarClienteDef.setLabelFor(lbNovoUsuario);
        lbBuscarClienteDef.setText("Buscar cliente");

        lbBuscarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbBuscarCliente.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/view/gui/Lupa.png"))); // NOI18N
        lbBuscarCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lbBuscarCliente.setPreferredSize(new java.awt.Dimension(100, 100));
        lbBuscarCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbBuscarClienteMouseClicked(evt);
            }
        });

        lbConsultarServicosDef.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbConsultarServicosDef.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbConsultarServicosDef.setLabelFor(lbNovoUsuario);
        lbConsultarServicosDef.setText("Consultar serviço");

        lbListarClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbListarClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbListarClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/view/gui/Lista.png"))); // NOI18N
        lbListarClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lbListarClientes.setPreferredSize(new java.awt.Dimension(100, 100));
        lbListarClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbListarClientesMouseClicked(evt);
            }
        });

        lbListarClientesDef.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbListarClientesDef.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbListarClientesDef.setLabelFor(lbNovoUsuario);
        lbListarClientesDef.setText("Listar clientes");

        lbListarServicos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbListarServicos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbListarServicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/edu/view/gui/Lista.png"))); // NOI18N
        lbListarServicos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        lbListarServicos.setPreferredSize(new java.awt.Dimension(100, 100));
        lbListarServicos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbListarServicosMouseClicked(evt);
            }
        });

        lbListarServicosDef.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbListarServicosDef.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbListarServicosDef.setLabelFor(lbNovoUsuario);
        lbListarServicosDef.setText("Listar serviços");

        dpPrincipal.setLayer(lbCadastros, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpPrincipal.setLayer(lbNovoUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpPrincipal.setLayer(lbNovoClienteDef, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpPrincipal.setLayer(lbNovoServico, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpPrincipal.setLayer(lbNovoServicoDef, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpPrincipal.setLayer(lbOperacional, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpPrincipal.setLayer(lbConsultarServicos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpPrincipal.setLayer(lbBuscarClienteDef, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpPrincipal.setLayer(lbBuscarCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpPrincipal.setLayer(lbConsultarServicosDef, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpPrincipal.setLayer(lbListarClientes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpPrincipal.setLayer(lbListarClientesDef, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpPrincipal.setLayer(lbListarServicos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dpPrincipal.setLayer(lbListarServicosDef, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dpPrincipalLayout = new javax.swing.GroupLayout(dpPrincipal);
        dpPrincipal.setLayout(dpPrincipalLayout);
        dpPrincipalLayout.setHorizontalGroup(
            dpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpPrincipalLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(dpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbOperacional)
                    .addGroup(dpPrincipalLayout.createSequentialGroup()
                        .addGroup(dpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbBuscarClienteDef, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbBuscarCliente, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(dpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbConsultarServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbConsultarServicosDef))
                        .addGap(41, 41, 41)
                        .addGroup(dpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbListarClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbListarClientesDef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(dpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbListarServicos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbListarServicosDef, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lbCadastros)
                    .addGroup(dpPrincipalLayout.createSequentialGroup()
                        .addGroup(dpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbNovoClienteDef, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbNovoUsuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addGroup(dpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbNovoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNovoServicoDef, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(567, Short.MAX_VALUE))
        );
        dpPrincipalLayout.setVerticalGroup(
            dpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dpPrincipalLayout.createSequentialGroup()
                .addGap(270, 270, 270)
                .addComponent(lbCadastros)
                .addGap(20, 20, 20)
                .addGroup(dpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNovoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNovoServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNovoClienteDef)
                    .addComponent(lbNovoServicoDef))
                .addGap(26, 26, 26)
                .addComponent(lbOperacional)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dpPrincipalLayout.createSequentialGroup()
                        .addGroup(dpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbConsultarServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbListarServicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(dpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbListarClientesDef)
                            .addComponent(lbListarServicosDef)
                            .addGroup(dpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbBuscarClienteDef)
                                .addComponent(lbConsultarServicosDef))))
                    .addComponent(lbListarClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        getContentPane().add(dpPrincipal);
        dpPrincipal.setBounds(0, 0, 1150, 720);

        mbBarraMenu.setPreferredSize(new java.awt.Dimension(260, 30));

        mnClientes.setText("Clientes");
        mnClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mnClientes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mnClientes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        mnClientes.setPreferredSize(new java.awt.Dimension(65, 20));

        miCadastrarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miCadastrarCliente.setText("Cadastrar");
        miCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadastrarClienteActionPerformed(evt);
            }
        });
        mnClientes.add(miCadastrarCliente);

        miAlterarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miAlterarCliente.setText("Alterar");
        miAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAlterarClienteActionPerformed(evt);
            }
        });
        mnClientes.add(miAlterarCliente);

        miListarCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miListarCliente.setText("Listar");
        miListarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarClienteActionPerformed(evt);
            }
        });
        mnClientes.add(miListarCliente);

        miBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miBuscar.setText("Buscar");
        miBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBuscarActionPerformed(evt);
            }
        });
        mnClientes.add(miBuscar);

        miExcluirCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miExcluirCliente.setText("Remover");
        miExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miExcluirClienteActionPerformed(evt);
            }
        });
        mnClientes.add(miExcluirCliente);

        mbBarraMenu.add(mnClientes);

        mnServicos.setText("Serviços");
        mnServicos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mnServicos.setPreferredSize(new java.awt.Dimension(65, 20));

        miAdicionarServico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miAdicionarServico.setText("Adicionar");
        miAdicionarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAdicionarServicoActionPerformed(evt);
            }
        });
        mnServicos.add(miAdicionarServico);

        miAlterarServico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miAlterarServico.setText("Alterar");
        miAlterarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAlterarServicoActionPerformed(evt);
            }
        });
        mnServicos.add(miAlterarServico);

        miBuscarServico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miBuscarServico.setText("Buscar");
        miBuscarServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBuscarServicoActionPerformed(evt);
            }
        });
        mnServicos.add(miBuscarServico);

        miListar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miListar.setText("Listar");
        miListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miListarActionPerformed(evt);
            }
        });
        mnServicos.add(miListar);

        miRemoverServico.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miRemoverServico.setText("Remover");
        miRemoverServico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRemoverServicoActionPerformed(evt);
            }
        });
        mnServicos.add(miRemoverServico);

        miGerarPagamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miGerarPagamento.setText("Pagamento");
        miGerarPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGerarPagamentoActionPerformed(evt);
            }
        });
        mnServicos.add(miGerarPagamento);

        mbBarraMenu.add(mnServicos);

        mnRelatorios.setText("Relatórios");
        mnRelatorios.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mnRelatorios.setPreferredSize(new java.awt.Dimension(75, 20));

        miGerarRelatorio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        miGerarRelatorio.setText("Gerar relatório");
        miGerarRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miGerarRelatorioActionPerformed(evt);
            }
        });
        mnRelatorios.add(miGerarRelatorio);

        mbBarraMenu.add(mnRelatorios);

        mnSobre.setText("Sobre");
        mnSobre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mnSobre.setPreferredSize(new java.awt.Dimension(55, 20));

        miSobre.setText("Sobre");
        miSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSobreActionPerformed(evt);
            }
        });
        mnSobre.add(miSobre);

        mbBarraMenu.add(mnSobre);

        setJMenuBar(mbBarraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miAdicionarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAdicionarServicoActionPerformed
        GuiCadastroServico gui = new GuiCadastroServico();
        dpPrincipal.add(gui);
        gui.setVisible(true);
        
    }//GEN-LAST:event_miAdicionarServicoActionPerformed

    private void miGerarRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGerarRelatorioActionPerformed
        GerarRelatorio.getRelatorioDeServico();
    }//GEN-LAST:event_miGerarRelatorioActionPerformed

    private void miSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSobreActionPerformed
        JOptionPane.showMessageDialog(null, "Software desenvolvido por:\n"
                + "HEMENSON DAVID SILVA;\nISADORA AZEVEDO MEDEIROS DO NASCIMENTO;"
                + "\nQUEZIA ASSIS DE SOUSA.", "Sobre", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_miSobreActionPerformed

    private void miCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadastrarClienteActionPerformed

        GuiCadastrarCliente gui = new GuiCadastrarCliente();
        dpPrincipal.add(gui);
        gui.setVisible(true);
        
    }//GEN-LAST:event_miCadastrarClienteActionPerformed

    private void miAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAlterarClienteActionPerformed
        String cpf = JOptionPane.showInputDialog(null, "Informe o cpf do cliente");
        
        ClienteBEAN c = ClienteDAO.getClienteByCPF(cpf);
        
        if(cpf != null && c == null){
            JOptionPane.showMessageDialog(null, "Cpf Invalido");
        }else if(cpf != null){
            GuiAlterarCliente gui = new GuiAlterarCliente(c);
            dpPrincipal.add(gui);
            gui.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Operação cancelada");
        }
    }//GEN-LAST:event_miAlterarClienteActionPerformed

    private void miListarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarClienteActionPerformed
        
        GuiListarCliente gui = new GuiListarCliente();
        dpPrincipal.add(gui);
        gui.setVisible(true);
    }//GEN-LAST:event_miListarClienteActionPerformed

    private void miBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBuscarActionPerformed
        GuiBuscarCliente gui = new GuiBuscarCliente();
        dpPrincipal.add(gui);
        gui.setVisible(true);
    }//GEN-LAST:event_miBuscarActionPerformed

    private void miAlterarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAlterarServicoActionPerformed
        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o número do servico"));
        
        if(ServicoDAO.getServicoByNumber(numero) == null){
            JOptionPane.showMessageDialog(null, "O serviço não existe");
        }else{
            GuiAlterarServico gui = new GuiAlterarServico(ServicoDAO.getServicoByNumber(numero));
            dpPrincipal.add(gui);
            gui.setVisible(true);
        }
    }//GEN-LAST:event_miAlterarServicoActionPerformed

    private void miListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miListarActionPerformed
        GuiListarServicos gui = new GuiListarServicos();
        dpPrincipal.add(gui);
        gui.setVisible(true);
    }//GEN-LAST:event_miListarActionPerformed

    private void lbNovoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNovoUsuarioMouseClicked
        GuiCadastrarCliente gui = new GuiCadastrarCliente();
        dpPrincipal.add(gui);
        gui.setVisible(true);
    }//GEN-LAST:event_lbNovoUsuarioMouseClicked

    private void lbNovoServicoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNovoServicoMouseClicked
        GuiCadastroServico gui = new GuiCadastroServico();
        dpPrincipal.add(gui);
        gui.setVisible(true);
    }//GEN-LAST:event_lbNovoServicoMouseClicked

    private void lbListarClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbListarClientesMouseClicked
        GuiListarCliente gui = new GuiListarCliente();
        dpPrincipal.add(gui);
        gui.setVisible(true);
    }//GEN-LAST:event_lbListarClientesMouseClicked

    private void lbListarServicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbListarServicosMouseClicked
        GuiListarServicos gui = new GuiListarServicos();
        dpPrincipal.add(gui);
        gui.setVisible(true);
    }//GEN-LAST:event_lbListarServicosMouseClicked

    private void lbBuscarClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbBuscarClienteMouseClicked
        GuiBuscarCliente gui = new GuiBuscarCliente();
        dpPrincipal.add(gui);
        gui.setVisible(true);
    }//GEN-LAST:event_lbBuscarClienteMouseClicked

    private void lbConsultarServicosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbConsultarServicosMouseClicked
        GuiListarServicos gui = new GuiListarServicos();
        dpPrincipal.add(gui);
        gui.setVisible(true);
    }//GEN-LAST:event_lbConsultarServicosMouseClicked

    private void miGerarPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miGerarPagamentoActionPerformed
        int id =  Integer.parseInt(JOptionPane.showInputDialog(null, "informe o id do servico"));
        ServicoBEAN s = ServicoDAO.getServicoByNumber(id);
        if(s != null){
            GuiPagamento gui = new GuiPagamento(s.getId());
            dpPrincipal.add(gui);
            gui.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Serviço não encontrado");
        }
        
    }//GEN-LAST:event_miGerarPagamentoActionPerformed

    private void miRemoverServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRemoverServicoActionPerformed
        GuiExcluirServico gui = new GuiExcluirServico();
        dpPrincipal.add(gui);
        gui.setVisible(true);
    }//GEN-LAST:event_miRemoverServicoActionPerformed

    private void miBuscarServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBuscarServicoActionPerformed
        GuiBuscarServico gui = new GuiBuscarServico();
        dpPrincipal.add(gui);
        gui.setVisible(true);
    }//GEN-LAST:event_miBuscarServicoActionPerformed

    private void miExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miExcluirClienteActionPerformed
        GuiExcluirCliente gui = new GuiExcluirCliente();
        dpPrincipal.add(gui);
        gui.setVisible(true);
    }//GEN-LAST:event_miExcluirClienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpPrincipal;
    private javax.swing.JLabel lbBuscarCliente;
    private javax.swing.JLabel lbBuscarClienteDef;
    private javax.swing.JLabel lbCadastros;
    private javax.swing.JLabel lbConsultarServicos;
    private javax.swing.JLabel lbConsultarServicosDef;
    private javax.swing.JLabel lbListarClientes;
    private javax.swing.JLabel lbListarClientesDef;
    private javax.swing.JLabel lbListarServicos;
    private javax.swing.JLabel lbListarServicosDef;
    private javax.swing.JLabel lbNovoClienteDef;
    private javax.swing.JLabel lbNovoServico;
    private javax.swing.JLabel lbNovoServicoDef;
    private javax.swing.JLabel lbNovoUsuario;
    private javax.swing.JLabel lbOperacional;
    private javax.swing.JMenuBar mbBarraMenu;
    private javax.swing.JMenuItem miAdicionarServico;
    private javax.swing.JMenuItem miAlterarCliente;
    private javax.swing.JMenuItem miAlterarServico;
    private javax.swing.JMenuItem miBuscar;
    private javax.swing.JMenuItem miBuscarServico;
    private javax.swing.JMenuItem miCadastrarCliente;
    private javax.swing.JMenuItem miExcluirCliente;
    private javax.swing.JMenuItem miGerarPagamento;
    private javax.swing.JMenuItem miGerarRelatorio;
    private javax.swing.JMenuItem miListar;
    private javax.swing.JMenuItem miListarCliente;
    private javax.swing.JMenuItem miRemoverServico;
    private javax.swing.JMenuItem miSobre;
    private javax.swing.JMenu mnClientes;
    private javax.swing.JMenu mnRelatorios;
    private javax.swing.JMenu mnServicos;
    private javax.swing.JMenu mnSobre;
    // End of variables declaration//GEN-END:variables
}
