package br.edu.model.tableModel;

import br.edu.model.bean.ClienteBEAN;
import br.edu.model.dao.ClienteDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Hemenson
 */
public class ClienteTableModel extends AbstractTableModel {
    
    private List<ClienteBEAN> dados;
    private String[] colunas;
    
    private static final int NOME_COMPLETO = 0;
    private static final int TELEFONE = 1;
    private static final int EMAIL = 2;
    
    public ClienteTableModel(){
        atualizarDados();
        
        this.colunas = new String[]{"Nome completo","Telefone","Email"};
    }
    
    @Override
    public int getRowCount() {
        return this.dados.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch(columnIndex){
            case NOME_COMPLETO:
                this.dados.get(rowIndex).setNomeCompleto((String) aValue);
            case TELEFONE:
                this.dados.get(rowIndex).setTelefone((String) aValue);
            case EMAIL:
                this.dados.get(rowIndex).setEmail((String) aValue);
            default:
                throw new IndexOutOfBoundsException("Index invalido!");
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ClienteBEAN c = this.dados.get(rowIndex);
        
        switch(columnIndex){
            case NOME_COMPLETO:
                return c.getNomeCompleto();
            case TELEFONE:
                return c.getTelefone();
            case EMAIL:
                return c.getEmail();
            default:
                throw new IndexOutOfBoundsException("Index invalido!");
        }
    }

    @Override
    public String getColumnName(int column) {
        return this.colunas[column];
    }
    
    /**
     * Remove uma linha na tabela
     *
     * @param rowIndex
     */
    public void removeRow(int rowIndex){
        //remove do banco
        ClienteDAO.delete(this.dados.get(rowIndex).getCpf());
        
        //remove do array
        this.dados.remove(rowIndex);
        
        //remove da tabela
        fireTableRowsDeleted(rowIndex, rowIndex);
    }
    
    /**
     * Adiciona uma linha na tabela
     * 
     * @param c
    */
    public void addRow(ClienteBEAN c){
        //adiciona no banco
        ClienteDAO.add(c);
        
        atualizarTabela();
    }
    
    /**
     * Atualiza uma linha na tabela
     * 
     * @param c
     */
    public void update(ClienteBEAN c){
        ClienteDAO.update(c);
        
        atualizarTabela();
    }
    
    /**
     * Metodo responsavel por atualizar o array de acordo com as 
     * informações do banco de dados
     * 
     */
    private void atualizarDados(){
        this.dados = new ArrayList<>(ClienteDAO.findALL());
    }
    
    /**
     * Atualiza todas as celulas da tabela
     */
    private void atualizarTabela(){
        atualizarDados();
        fireTableDataChanged();
    }

    public List<ClienteBEAN> getDados() {
        return dados;
    }

    public void setDados(List<ClienteBEAN> dados) {
        this.dados = dados;
        fireTableDataChanged();
    }
}
