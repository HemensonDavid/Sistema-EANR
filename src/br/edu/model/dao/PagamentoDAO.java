package br.edu.model.dao;

import br.edu.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import br.edu.model.bean.PagamentoBEAN;
import javax.swing.JOptionPane;

/**
 * A classe representa a tabela pagamento do banco de dados
 *
 * NOTAS: quando criar um servico o sistema ja automaticamente cria uma "row" na
 * tabela referenciando aquele serviço.
 *
 * @author Hemenson
 */
public abstract class PagamentoDAO {

    /**
     * Método para atualizar um pagamento
     *
     * @param p
     * @return
     */
    public static boolean update(PagamentoBEAN p) {
        String sql = "UPDATE pagamento SET custo_total = ?,"
                + "valor_recebido = ?, valor_restante = ?,"
                + "status_pagamento = ?, tipo_de_pagamento = ?,"
                + "numero_servico = ?, troco = ? WHERE cpf_cliente = ?;";

        int linhasAft = 0;
        PreparedStatement stmt = null;

        try (Connection con = ConnectionFactory.getConnection()) {
            stmt = con.prepareCall(sql);

            stmt.setDouble(1, p.getCustoTotal());
            stmt.setDouble(2, p.getValorRecebido());
            stmt.setDouble(3, p.getValorRestante());
            stmt.setString(4, p.getStatusPagamento());
            stmt.setString(5, p.getTipoDePagamento());
            stmt.setInt(6, p.getNumeroServico());
            stmt.setDouble(7, p.getTroco());
            stmt.setString(8, p.getCpfCliente());

            linhasAft = stmt.executeUpdate();

            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO INESPERADO: " + ex.toString(),
                    "ERRO!", JOptionPane.ERROR_MESSAGE);
        }

        return linhasAft > 0;
    }

    /**
     * Busca o pagamento pelo ID
     *
     * @param cpf
     * @return
     */
    public static List<PagamentoBEAN> getPagamentoByCpf(String cpf) {
        String sql = "SELECT * FROM pagamento WHERE cpf_cliente = ?;";

        PreparedStatement stmt = null;
        ResultSet rs = null;
        PagamentoBEAN pagamento = null;
        List<PagamentoBEAN> pagamentos = new ArrayList<>();

        try (Connection con = ConnectionFactory.getConnection()) {
            stmt = con.prepareStatement(sql);

            stmt.setString(1, cpf);

            rs = stmt.executeQuery();

            while (rs.next()) {
                pagamento = new PagamentoBEAN(rs.getInt("id"), rs.getString("cpf_cliente"),
                        rs.getDouble("custo_total"), rs.getDouble("valor_recebido"),
                        rs.getDouble("valor_restante"), rs.getString("status_pagamento"),
                        rs.getString("tipo_de_pagamento"), rs.getInt("numero_servico"),
                        rs.getDouble("troco"));

                pagamentos.add(pagamento);
            }

            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO INESPERADO: " + ex.toString(),
                    "ERRO!", JOptionPane.ERROR_MESSAGE);
        }

        return pagamentos;
    }

    /**
     * Busca o pagamento pelo id
     *
     * @param numeroServico
     * @return
     */
    public static PagamentoBEAN getPagamentoByNumeroServico(int numeroServico) {
        String sql = "SELECT * FROM pagamento WHERE numero_servico = ?;";

        PreparedStatement stmt = null;
        ResultSet rs = null;
        PagamentoBEAN pagamento = null;

        try (Connection con = ConnectionFactory.getConnection()) {
            stmt = con.prepareStatement(sql);

            stmt.setInt(1, numeroServico);

            rs = stmt.executeQuery();

            while (rs.next()) {
                pagamento = new PagamentoBEAN(rs.getInt("id"), rs.getString("cpf_cliente"),
                        rs.getDouble("custo_total"), rs.getDouble("valor_recebido"),
                        rs.getDouble("valor_restante"), rs.getString("status_pagamento"),
                        rs.getString("tipo_de_pagamento"), rs.getInt("numero_servico"),
                        rs.getDouble("troco"));
            }

            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO INESPERADO: " + ex.toString(),
                    "ERRO!", JOptionPane.ERROR_MESSAGE);
        }

        return pagamento;
    }

    /**
     * Busca todos os pagamentos
     *
     * @return uma lista de todos os pagamentos
     */
    public static List<PagamentoBEAN> findAll() {
        String sql = "SELECT * FROM pagamento;";

        PreparedStatement stmt = null;
        ResultSet rs = null;
        PagamentoBEAN pagamento = null;
        List<PagamentoBEAN> pagamentos = new ArrayList<>();

        try (Connection con = ConnectionFactory.getConnection()) {
            stmt = con.prepareStatement(sql);

            rs = stmt.executeQuery();

            while (rs.next()) {
                pagamento = new PagamentoBEAN(rs.getInt("id"), rs.getString("cpf_cliente"),
                        rs.getDouble("custo_total"), rs.getDouble("valor_recebido"),
                        rs.getDouble("valor_restante"), rs.getString("status_pagamento"),
                        rs.getString("tipo_de_pagamento"), rs.getInt("numero_servico"),
                        rs.getDouble("troco"));

                pagamentos.add(pagamento);
            }

            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO INESPERADO: " + ex.toString(),
                    "ERRO!", JOptionPane.ERROR_MESSAGE);
        }

        return pagamentos;
    }
}
