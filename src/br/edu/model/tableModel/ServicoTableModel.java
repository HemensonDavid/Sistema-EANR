package br.edu.model.tableModel;

import br.edu.model.bean.ServicoBEAN;
import br.edu.model.dao.ServicoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Hemenson
 */
public class ServicoTableModel extends AbstractTableModel{
    
    private List<ServicoBEAN> dados;
    private String[] colunas;
    
    private static final int ID = 0;
    private static final int EQUIPAMENTO = 1;
    private static final int TIPO_DE_SERVICO = 2;
    private static final int STATUS = 3;
    private static final int VALOR = 4;
    
    public ServicoTableModel(){
        atualizarDados();
        
        this.colunas = new String[]{"ID","Equipamento","Tipo de serviço",
            "Status","Valor"};
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
            case ID:
                this.dados.get(rowIndex).setId(Integer.parseInt((String) aValue));
            case EQUIPAMENTO:
                this.dados.get(rowIndex).setEquipamento((String) aValue);
            case TIPO_DE_SERVICO:
                this.dados.get(rowIndex).setTipoDeServico((String) aValue);
            case STATUS:
                this.dados.get(rowIndex).setStatusServico((String) aValue);
            case VALOR:
                this.dados.get(rowIndex).setValorServico(Integer.parseInt((String) aValue));
            default:
                throw new IndexOutOfBoundsException("Index invalido!");
        }
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ServicoBEAN s = this.dados.get(rowIndex);
        
        switch(columnIndex){
            case ID:
                return s.getId();
            case EQUIPAMENTO:
                return s.getEquipamento();
            case TIPO_DE_SERVICO:
                return s.getTipoDeServico();
            case STATUS:
                return s.getStatusServico();
            case VALOR:
                return s.getValorServico();
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
        ServicoDAO.remove(this.dados.get(rowIndex).getId());
        
        //remove do array
        this.dados.remove(rowIndex);
        
        //remove da tabela
        fireTableRowsDeleted(rowIndex, rowIndex);
    }
    
    /**
     * Adiciona uma linha na tabela
     * 
     * @param s
    */
    public void addRow(ServicoBEAN s){
        //adiciona no banco
        ServicoDAO.add(s);
        
        atualizarTabela();
    }
    
    /**
     * Atualiza uma linha na tabela
     * 
     * @param s
     */
    public void update(ServicoBEAN s){
        ServicoDAO.update(s);
        
        atualizarTabela();
    }
    
    /**
     * Metodo responsavel por atualizar o array de acordo com as 
     * informações do banco de dados
     * 
     */
    private void atualizarDados(){
        this.dados = new ArrayList<>(ServicoDAO.findAll());
    }
    
    /**
     * Atualiza todas as celulas da tabela
     */
    private void atualizarTabela(){
        atualizarDados();
        fireTableDataChanged();
    }
}
