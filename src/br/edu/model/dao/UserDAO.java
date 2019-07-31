package br.edu.model.dao;

import br.edu.connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.edu.model.bean.UserBEAN;
import javax.swing.JOptionPane;

/**
 * Classe que responsavel por controlar o login
 *
 */
public abstract class UserDAO {

    /**
     * Salva um usuario
     *
     * @param user
     * @return true caso adicionado com sucesso
     */
    public static boolean save(UserBEAN user) {
        String sql = "INSERT INTO user(username, email, "
                + "user_password) VALUES (?, ?, ?);";

        PreparedStatement stmt = null;

        try (Connection con = ConnectionFactory.getConnection()) {
            stmt = con.prepareStatement(sql);

            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());

            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO INESPERADO: " + ex.toString(),
                    "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
        return true;
    }

    /**
     * Metodo para alterar usuario
     *
     * @param user
     * @return
     */
    public static boolean update(UserBEAN user) {
        String sql = "UPDATE user SET username= ?, user_password= ? WHERE email= ?;";

        PreparedStatement stmt = null;
        int linhasAfetadas;

        try (Connection con = ConnectionFactory.getConnection()) {
            stmt = con.prepareStatement(sql);

            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getEmail());

            linhasAfetadas = stmt.executeUpdate();

            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO INESPERADO: " + ex.toString(),
                    "ERRO!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return linhasAfetadas > 0;
    }

    /**
     * Metodo para excluir usuario
     *
     * @param email
     * @return
     */
    public static boolean delete(String email) {
        String sql = "DELETE FROM user WHERE email= ?;";

        PreparedStatement stmt = null;
        int linhasAft;

        try (Connection con = ConnectionFactory.getConnection()) {
            stmt = con.prepareStatement(sql);

            stmt.setString(1, email);

            linhasAft = stmt.executeUpdate();

            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO INESPERADO: " + ex.toString(),
                    "ERRO!", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return linhasAft > 0;
    }

    /**
     * Método para autenticar usuario e senha
     *
     * @param user
     * @return true caso o login exista e false caso login não exista
     */
    public static boolean authentication(UserBEAN user) {
        String sql = "SELECT * FROM user WHERE "
                + "username = ? AND user_password = ?;";

        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean aut = false;

        try (Connection con = ConnectionFactory.getConnection()) {
            stmt = con.prepareStatement(sql);

            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());

            rs = stmt.executeQuery();

            while (rs.next()) {
                aut = true;
                break;
            }

            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO INESPERADO: " + ex.toString(),
                    "ERRO!", JOptionPane.ERROR_MESSAGE);
        }

        return aut;
    }
    
    /**
     * Retorna se existe um usuario com o email
     * 
     * @param email
     * @return 
     */
    public static boolean isExist(String email){
        String sql = "SELECT * FROM user WHERE email = ?;";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        int qtdLinhas = 0;
        
        try(Connection con = ConnectionFactory.getConnection()){
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, email);
            
            rs = stmt.executeQuery();
            
            while (rs.next()){
                qtdLinhas ++;
                break;
            }
            
            rs.close();
            stmt.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Erro inesperado: "+ex.toString()
                    , "ERRO", JOptionPane.ERROR_MESSAGE);
        }
        
        return qtdLinhas > 0;
    }
    
    /**
     * Método usado para alterar o password
     * 
     * @param user 
     */
    public static void updatePassword(UserBEAN user) {
        String sql = "UPDATE user SET user_password= ? WHERE email= ?;";

        PreparedStatement stmt = null;

        try (Connection con = ConnectionFactory.getConnection()) {
            stmt = con.prepareStatement(sql);

            stmt.setString(1, user.getPassword());
            stmt.setString(2, user.getEmail());

            stmt.executeUpdate();

            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "ERRO INESPERADO: " + ex.toString(),
                    "ERRO!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
