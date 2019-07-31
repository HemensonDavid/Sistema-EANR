package br.edu.view;

import br.edu.model.dao.EmpresaDAO;
import br.edu.view.gui.GuiAbertura;
import br.edu.view.gui.GuiLogin;
import br.edu.view.gui.empresa.CadastrarEmpresa;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : 
                    javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | 
                javax.swing.UnsupportedLookAndFeelException ex) {
            JOptionPane.showMessageDialog(null, "Erro com o LookAndFeel!",
                    "Erro",JOptionPane.ERROR_MESSAGE);
        }
        
        GuiAbertura abertura = new GuiAbertura();
        abertura.setVisible(true);
        
        Thread.sleep(1500);
        abertura.setVisible(false);
        
        if(EmpresaDAO.getEmpresa()== null){
            CadastrarEmpresa cadastrarEmpresa = new CadastrarEmpresa();
            cadastrarEmpresa.setVisible(true);
        }else{
            GuiLogin gl = new GuiLogin();
            gl.setVisible(true);
        }
    }
}
