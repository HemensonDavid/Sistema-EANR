package br.edu.model.bean;

/**
 * Classe representa a tabela pagamento do banco de dados
 *
 */
public class PagamentoBEAN {

    private int id;
    private String cpfCliente;
    private double custoTotal;
    private double valorRecebido;
    private double valorRestante;
    private String statusPagamento;
    private String tipoDePagamento;
    private int numeroServico;
    private double troco;

    /**
     * Construtor principal da classe
     *
     * @param id
     * @param cpfCliente
     * @param custoTotal
     * @param valorRecebido
     * @param valorRestante
     * @param statusPagamento
     * @param tipoDePagamento
     * @param numeroServico
     * @param troco
     */
    public PagamentoBEAN(int id, String cpfCliente, double custoTotal, double valorRecebido, double valorRestante, String statusPagamento, String tipoDePagamento, int numeroServico, double troco) {
        this.id = id;
        this.cpfCliente = cpfCliente;
        this.custoTotal = custoTotal;
        this.valorRecebido = valorRecebido;
        this.valorRestante = valorRestante;
        this.statusPagamento = statusPagamento;
        this.tipoDePagamento = tipoDePagamento;
        this.numeroServico = numeroServico;
        this.troco = troco;
    }
    
    /**
     * Construtor com atributos necessários
     * 
     * @param cpfCliente
     * @param custoTotal
     * @param numeroServico 
     */
    public PagamentoBEAN(String cpfCliente, double custoTotal, int numeroServico) {
        this.cpfCliente = cpfCliente;
        this.custoTotal = custoTotal;
        this.numeroServico = numeroServico;
    }
    
    /**
     * construtor default
     */
    public PagamentoBEAN() {
    }

    /* GETs e SETs */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public double getCustoTotal() {
        return custoTotal;
    }

    public void setCustoTotal(double custoTotal) {
        this.custoTotal = custoTotal;
    }

    public double getValorRecebido() {
        return valorRecebido;
    }

    public void setValorRecebido(double valorRecebido) {
        this.valorRecebido = valorRecebido;
    }

    public double getValorRestante() {
        return valorRestante;
    }

    public void setValorRestante(double valorRestante) {
        this.valorRestante = valorRestante;
    }

    public String getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(String statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public String getTipoDePagamento() {
        return tipoDePagamento;
    }

    public void setTipoDePagamento(String tipoDePagamento) {
        this.tipoDePagamento = tipoDePagamento;
    }

    public int getNumeroServico() {
        return numeroServico;
    }

    public void setNumeroServico(int numeroServico) {
        this.numeroServico = numeroServico;
    }

    public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }

    /**
     * toString da classe
     *
     * @return
     */
    @Override
    public String toString() {
        return "id:" + id + "\ncpfCliente: " + cpfCliente + "\ncustoTotal: " + custoTotal
                + "\nvalorRecebido: " + valorRecebido + "\nvalorRestante: " + valorRestante
                + "\nstatusPagamento: " + statusPagamento + "\ntipoDePagamento: " + tipoDePagamento
                + "\nnumeroServico: " + numeroServico + "\ntroco: " + troco;
    }

}
