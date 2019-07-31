package br.edu.model.dao;

import br.edu.connection.ConnectionFactory;
import br.edu.model.bean.EmpresaBEAN;
import br.edu.model.bean.UserBEAN;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public abstract class EmpresaDAO {
    
    /**
     * Salva uma empresa
     * 
     * @param empresa 
     */
    public static void save(EmpresaBEAN empresa){
        String sql = "INSERT INTO empresa VALUES (?, ?, ?, ?);";
        
        PreparedStatement stmt =  null;
        
        try (Connection con = ConnectionFactory.getConnection()){
            
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, empresa.getCnpj());
            stmt.setString(2, empresa.getNome());
            stmt.setString(3, empresa.getEmail());
            stmt.setString(4, empresa.getEmpresa_password());
            
            UserDAO.save(new UserBEAN(empresa.getNome(), 
                    empresa.getEmail(), empresa.getEmpresa_password()));
            
            stmt.executeUpdate();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro inesperado: "+ex.toString()
                    , "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Pega so a primeira empresa cadastrada
     * afinal, so tem 1 empresa cadastrada mesmo
     * 
     * @return 
     */
    public static EmpresaBEAN getEmpresa(){
        String sql = "SELECT * FROM empresa;";
        
        PreparedStatement stmt = null;
        ResultSet rs = null;
        EmpresaBEAN empresa = null;
        
        try (Connection con = ConnectionFactory.getConnection()){
            stmt = con.prepareStatement(sql);
            
            rs = stmt.executeQuery();
            
            while(rs.next()){
                empresa = new EmpresaBEAN(rs.getString("cnpj"), rs.getString("nome"),
                        rs.getString("email"), rs.getString("empresa_password"));
                
                break;
            }
            
            rs.close();
            stmt.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro inesperado: "+ex.toString(),
                    "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        return empresa;
    }
}
