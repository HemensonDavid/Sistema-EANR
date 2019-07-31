package br.edu.model.dao;

import br.edu.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.edu.model.bean.ClienteBEAN;
import javax.swing.JOptionPane;

/**
 * Classe responsavel pelo crud da tabela cliente
 *
 * CRUD: Create Read Update Delete
 *
 */
public abstract class ClienteDAO {

    /**
     * Metodo responsavel por pegar todos os clientes do banco de dados
     *
     * @return
     */
    public static List<ClienteBEAN> findALL() {
        String sql = "SELECT * FROM cliente;";

        List<ClienteBEAN> clientes = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ClienteBEAN c = new ClienteBEAN();

        try (Connection con = ConnectionFactory.getConnection()) {
            stmt = con.prepareStatement(sql);

            rs = stmt.executeQuery();

            while (rs.next()) {
                c.setNomeCompleto(rs.getString("nome_completo"));
                c.setSexo(rs.getString("sexo"));
                c.setCpf(rs.getString("cpf"));
                c.setEmail(rs.getString("email"));
                c.setTelefone(rs.getString("telefone"));
                c.setCidade(rs.getString("cidade"));
                c.setRua(rs.getString("rua"));
                c.setNumeroDaCasa(rs.getInt("numero_casa"));
                c.setBairro(rs.getString("bairro"));
                c.setComplemento(rs.getString("complemento"));

                clientes.add(c);
                c = new ClienteBEAN();
            }

            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO AO PEGAR TODOS OS CLIENTES: " + ex.toString(),
                    "ERRO!", JOptionPane.ERROR_MESSAGE);
        }

        return clientes;
    }

    /**
     * Metodo responsavel por pegar um cliente pelo cpf do banco de dados
     *
     *
     * @param cpf
     * @return
     */
    public static ClienteBEAN getClienteByCPF(String cpf) {
        String sql = "SELECT * FROM cliente WHERE cpf = ?;";

        ClienteBEAN c = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try (Connection con = ConnectionFactory.getConnection()) {
            stmt = con.prepareStatement(sql);

            stmt.setString(1, cpf);

            rs = stmt.executeQuery();

            while (rs.next()) {
                c= new ClienteBEAN();
                c.setNomeCompleto(rs.getString("nome_completo"));
                c.setSexo(rs.getString("sexo"));
                c.setCpf(rs.getString("cpf"));
                c.setEmail(rs.getString("email"));
                c.setTelefone(rs.getString("telefone"));
                c.setCidade(rs.getString("cidade"));
                c.setRua(rs.getString("rua"));
                c.setNumeroDaCasa(rs.getInt("numero_casa"));
                c.setBairro(rs.getString("bairro"));
                c.setComplemento(rs.getString("complemento"));
            }

            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO INESPERADO: " + ex.toString(),
                    "ERRO!", JOptionPane.ERROR_MESSAGE);
        }

        return c;
    }

    /**
     * Metodo responsavel por pegar um ou varios clientes pelo nome no banco de
     * dados
     *
     * @Waring metodo com problemas de segurança
     * @param nome
     * @return
     */
    public static List<ClienteBEAN> getClienteByName(String nome) {
        String sql = "SELECT * FROM cliente WHERE nome_completo LIKE '%" + nome + "%' ;";

        List<ClienteBEAN> clientes = new ArrayList<>();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        ClienteBEAN c = new ClienteBEAN();

        try (Connection con = ConnectionFactory.getConnection()) {
            stmt = con.prepareStatement(sql);

            rs = stmt.executeQuery();

            while (rs.next()) {
                c.setNomeCompleto(rs.getString("nome_completo"));
                c.setSexo(rs.getString("sexo"));
                c.setCpf(rs.getString("cpf"));
                c.setEmail(rs.getString("email"));
                c.setTelefone(rs.getString("telefone"));
                c.setCidade(rs.getString("cidade"));
                c.setRua(rs.getString("rua"));
                c.setNumeroDaCasa(rs.getInt("numero_casa"));
                c.setBairro(rs.getString("bairro"));
                c.setComplemento(rs.getString("complemento"));

                clientes.add(c);
                c = new ClienteBEAN();
            }

            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO INESPERADO: " + ex.toString(),
                    "ERRO!", JOptionPane.ERROR_MESSAGE);
        }

        return clientes;
    }

    /**
     * Metodo de atualizar cliente pelo cpf
     *
     * @param c
     * @return
     */
    public static boolean update(ClienteBEAN c) {
        String sql = "UPDATE cliente SET nome_completo= ?,sexo=?,email=?,telefone=?,cidade=?,"
                + "rua=?, numero_casa=?,bairro=?,complemento=? WHERE cpf= ?;";

        PreparedStatement stmt = null;
        int linhasAft = 0;

        try (Connection con = ConnectionFactory.getConnection()) {
            stmt = con.prepareStatement(sql);

            stmt.setString(1, c.getNomeCompleto());
            stmt.setString(2, c.getSexo());
            stmt.setString(3, c.getEmail());
            stmt.setString(4, c.getTelefone());
            stmt.setString(5, c.getCidade());
            stmt.setString(6, c.getRua());
            stmt.setInt(7, c.getNumeroDaCasa());
            stmt.setString(8, c.getBairro());
            stmt.setString(9, c.getComplemento());
            stmt.setString(10, c.getCpf());

            linhasAft = stmt.executeUpdate();

            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO INESPERADO: " + ex.toString(),
                    "ERRO!", JOptionPane.ERROR_MESSAGE);
        }

        return linhasAft > 0;
    }

    /**
     * Metodo utilizado para excluir funcionario
     *
     * @param cpf
     * @return
     */
    public static boolean delete(String cpf) {
        String sql = "DELETE FROM cliente WHERE cpf= ?;";

        PreparedStatement stmt = null;
        int linhasAft = 0;

        try (Connection con = ConnectionFactory.getConnection()) {
            stmt = con.prepareStatement(sql);

            stmt.setString(1, cpf);

            linhasAft = stmt.executeUpdate();

            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO INESPERADO: " + ex.toString(),
                    "ERRO!", JOptionPane.ERROR_MESSAGE);
        }

        return linhasAft > 0;
    }

    /**
     * Metodo utilizado para adicionar um cliente no banco de dados
     *
     * @param c
     * @return
     */
    public static boolean add(ClienteBEAN c) {
        String sql = "INSERT INTO cliente VALUES (?,?,?,?,?,?,?,?,?,?);";

        PreparedStatement stmt = null;
        int linhasAft = 0;

        try (Connection con = ConnectionFactory.getConnection()) {
            stmt = con.prepareStatement(sql);

            stmt.setString(1, c.getNomeCompleto());
            stmt.setString(2, c.getSexo());
            stmt.setString(3, c.getCpf());
            stmt.setString(4, c.getEmail());
            stmt.setString(5, c.getTelefone());
            stmt.setString(6, c.getCidade());
            stmt.setString(7, c.getRua());
            stmt.setInt(8, c.getNumeroDaCasa());
            stmt.setString(9, c.getBairro());
            stmt.setString(10, c.getComplemento());

            linhasAft = stmt.executeUpdate();

            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO INESPERADO: " + ex.toString(),
                    "ERRO!", JOptionPane.ERROR_MESSAGE);
        }

        return linhasAft > 0;
    }
}
