package br.edu.model.util;

import br.edu.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public abstract class GerarRelatorio {

    public static void getRelatorioDeServico() {
        new Thread() {
            @Override
            public void run() {
                try (Connection con = ConnectionFactory.getConnection()) {

                    String src = "relatorios/relatorioServico.jasper";

                    JasperPrint jasperPrint = JasperFillManager.fillReport(src, null, con);

                    JasperViewer view = new JasperViewer(jasperPrint, false);

                    view.setVisible(true);
                } catch (SQLException | JRException ex) {
                    JOptionPane.showMessageDialog(null, "Erro: "+ex.toString(),
                            "Erro", JOptionPane.ERROR_MESSAGE);
                }
            }
        }.start();
    }
}
