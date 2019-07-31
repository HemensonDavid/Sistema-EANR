package br.edu.model.dao;

import br.edu.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.edu.model.bean.ServicoBEAN;
import java.text.ParseException;
import javax.swing.JOptionPane;

/**
 * A classe representa a tabela pagamento do banco de dados
 *
 */
public abstract class ServicoDAO {

    /**
     * Pega todos os servicos registrados no banco de dados
     *
     * @return uma lista com todos os servicos
     */
    public static List<ServicoBEAN> findAll() {
        String sql = "SELECT * FROM servico;";

        PreparedStatement stmt = null;
        ResultSet rs = null;
        ServicoBEAN servico = null;
        List<ServicoBEAN> servicos = new ArrayList<>();

        try (Connection con = ConnectionFactory.getConnection()) {
            stmt = con.prepareStatement(sql);

            rs = stmt.executeQuery();
            while (rs.next()) {
                servico = new ServicoBEAN(rs.getInt("id"), rs.getString("cpf_cliente_interessado"),
                        rs.getString("equipamento"), rs.getString("tipo_de_servico"),
                        rs.getDate("data_de_agendamento"), rs.getDate("data_prevista_para_termino"),
                        rs.getString("status_servico"), rs.getDouble("valor_do_servico"),
                        rs.getString("observacao"), rs.getString("especificacao"));

                servicos.add(servico);
            }

            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO INESPERADO: " + ex.toString(),
                    "ERRO!", JOptionPane.ERROR_MESSAGE);
        }

        return servicos;
    }

    /**
     * Pega os serviços registrados de um cpf
     *
     * @param cpf
     * @return uma lista de serviços
     * @throws java.text.ParseException
     */
    public static List<ServicoBEAN> getServicoByCpf(String cpf) throws ParseException {
        String sql = "SELECT * FROM servico WHERE cpf_cliente_interessado = ?;";

        PreparedStatement stmt = null;
        ResultSet rs = null;
        ServicoBEAN servico = null;
        List<ServicoBEAN> servicos = new ArrayList<>();

        try (Connection con = ConnectionFactory.getConnection()) {
            stmt = con.prepareStatement(sql);

            stmt.setString(1, cpf);

            rs = stmt.executeQuery();
            while (rs.next()) {
                servico = new ServicoBEAN(rs.getInt("id"), rs.getString("cpf_cliente_interessado"),
                        rs.getString("equipamento"), rs.getString("tipo_de_servico"),
                        rs.getDate("data_de_agendamento"), rs.getDate("data_prevista_para_termino"),
                        rs.getString("status_servico"), rs.getDouble("valor_do_servico"),
                        rs.getString("observacao"), rs.getString("especificacao"));

                servicos.add(servico);
            }

            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO INESPERADO: " + ex.toString(),
                    "ERRO!", JOptionPane.ERROR_MESSAGE);
        }

        return servicos;
    }

    /**
     * Retorna null caso não exista
     *
     * @param numero
     * @return
     */
    public static ServicoBEAN getServicoByNumber(int numero) {
        String sql = "SELECT * FROM servico WHERE id = ?;";

        PreparedStatement stmt = null;
        ResultSet rs = null;
        ServicoBEAN servico = null;

        try (Connection con = ConnectionFactory.getConnection()) {
            stmt = con.prepareStatement(sql);

            stmt.setInt(1, numero);

            rs = stmt.executeQuery();
            while (rs.next()) {
                servico = new ServicoBEAN(rs.getInt("id"), rs.getString("cpf_cliente_interessado"),
                        rs.getString("equipamento"), rs.getString("tipo_de_servico"),
                        rs.getDate("data_de_agendamento"), rs.getDate("data_prevista_para_termino"),
                        rs.getString("status_servico"), rs.getDouble("valor_do_servico"),
                        rs.getString("observacao"), rs.getString("especificacao"));
            }

            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO INESPERADO: " + ex.toString(),
                    "ERRO!", JOptionPane.ERROR_MESSAGE);
        }

        return servico;
    }

    /**
     * Adiciona um serviço no banco de dados
     *
     * @param s
     * @return
     */
    public static boolean add(ServicoBEAN s) {
        String sql = "INSERT INTO servico(cpf_cliente_interessado, equipamento,"
                + " data_de_agendamento, data_prevista_para_termino,"
                + " valor_do_servico, observacao, especificacao, tipo_de_servico) "
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?);";

        int linhasAft = 0;
        PreparedStatement stmt = null;

        try (Connection con = ConnectionFactory.getConnection()) {
            stmt = con.prepareStatement(sql);

            stmt.setString(1, s.getCpfDoClienteInteressado());
            stmt.setString(2, s.getEquipamento());
            stmt.setDate(3, s.getDataAgendamento());
            stmt.setDate(4, s.getDataTermino());
            stmt.setDouble(5, s.getValorServico());
            stmt.setString(6, s.getObservacao());
            stmt.setString(7, s.getEspecificacoes());
            stmt.setString(8, s.getTipoDeServico());

            linhasAft = stmt.executeUpdate();

            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro: "+ex, "Erro", JOptionPane.ERROR_MESSAGE);
        }

        return linhasAft > 0;
    }

    /**
     * Atualiza os dados da tabela servico pelo ip do servico
     *
     * @param s
     * @return
     */
    public static boolean update(ServicoBEAN s) {
        String sql = "UPDATE servico SET equipamento = ?"
                + ", data_de_agendamento = ?, data_prevista_para_termino = ?, status_servico = ?"
                + ", valor_do_servico = ?, observacao = ?, especificacao = ?, tipo_de_servico = ? WHERE id = ?;";

        int linhasAft = 0;
        PreparedStatement stmt = null;

        try (Connection con = ConnectionFactory.getConnection()) {
            stmt = con.prepareStatement(sql);

            stmt.setInt(9, s.getId());
            stmt.setString(1, s.getEquipamento());
            stmt.setDate(2, s.getDataAgendamento());
            stmt.setDate(3, s.getDataTermino());
            stmt.setString(4, s.getStatusServico());
            stmt.setDouble(5, s.getValorServico());
            stmt.setString(6, s.getObservacao());
            stmt.setString(7, s.getEspecificacoes());
            stmt.setString(8, s.getTipoDeServico());

            linhasAft = stmt.executeUpdate();

            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO INESPERADO: " + ex.toString(),
                    "ERRO!", JOptionPane.ERROR_MESSAGE);
        }

        return linhasAft > 0;
    }

    /**
     * Remove um servico pelo id
     *
     * @param id
     * @return
     */
    public static boolean remove(int id) {
        String sql = "DELETE FROM servico WHERE id = ?;";

        int linhasAft = 0;
        PreparedStatement stmt = null;

        try (Connection con = ConnectionFactory.getConnection()) {
            stmt = con.prepareStatement(sql);

            stmt.setInt(1, id);

            linhasAft = stmt.executeUpdate();

            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO INESPERADO: " + ex.toString(),
                    "ERRO!", JOptionPane.ERROR_MESSAGE);
        }

        return linhasAft > 0;
    }
}
