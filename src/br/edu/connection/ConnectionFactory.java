package br.edu.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConnectionFactory {

    /**
     * Classe responsavel por criar uma conexão com banco de dados
     */
    private static final String DBNAME = "sistemaeanr"; //nome do banco
    private static final String URL = "jdbc:mysql://localhost:3306/" + DBNAME; //Definindo o caminho do banco
    private static final String USER = "root"; //usuario
    private static final String PASS = ""; //senha

    /**
     * metodo que faz a conexão
     *
     * @return a conexão
     */
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO ABRIR CONEXÃO: " + ex.toString(),
                    "ERRO!", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
}
