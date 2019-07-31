package br.edu.model.bean;

import java.sql.Date;

/**
 * A classe representa a tabela Servico do banco de dados
 *
 */
public class ServicoBEAN {

    private int id;
    private String cpfDoClienteInteressado;
    private String equipamento;
    private String tipoDeServico;
    private Date dataAgendamento;
    private Date dataTermino;
    private String statusServico;
    private double valorServico;
    private String observacao;
    private String especificacoes;

    /**
     * Construtor default
     */
    public ServicoBEAN() {
    }

    public ServicoBEAN(int id, String cpfDoClienteInteressado, String equipamento, 
            String tipoDeServico, Date dataAgendamento, Date dataTermino, 
            String statusServico, double valorServico, String observacao, String especificacoes) {
        this.id = id;
        this.cpfDoClienteInteressado = cpfDoClienteInteressado;
        this.equipamento = equipamento;
        this.tipoDeServico = tipoDeServico;
        this.dataAgendamento = dataAgendamento;
        this.dataTermino = dataTermino;
        this.statusServico = statusServico;
        this.valorServico = valorServico;
        this.observacao = observacao;
        this.especificacoes = especificacoes;
    }

    /*
        GETs e SETs
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpfDoClienteInteressado() {
        return cpfDoClienteInteressado;
    }

    public void setCpfDoClienteInteressado(String cpfDoClienteInteressado) {
        this.cpfDoClienteInteressado = cpfDoClienteInteressado;
    }

    public String getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(String equipamento) {
        this.equipamento = equipamento;
    }

    public Date getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(Date dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public String getStatusServico() {
        return statusServico;
    }

    public void setStatusServico(String statusServico) {
        this.statusServico = statusServico;
    }

    public double getValorServico() {
        return valorServico;
    }

    public void setValorServico(double valorServico) {
        this.valorServico = valorServico;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getEspecificacoes() {
        return especificacoes;
    }

    public void setEspecificacoes(String especificacoes) {
        this.especificacoes = especificacoes;
    }

    public String getTipoDeServico() {
        return tipoDeServico;
    }

    public void setTipoDeServico(String tipoDeServico) {
        this.tipoDeServico = tipoDeServico;
    }

    /**
     * ToString da classe
     *
     * @return
     */
    @Override
    public String toString() {
        return "id: " + id + "\nCPF Do Cliente: " + cpfDoClienteInteressado + "\nequipamento: "
                + equipamento + "\nData de Agendamento: " + dataAgendamento + "\nData de termino: " + dataTermino + "\nStatus do Servico: "
                + statusServico + "\nValorServico: " + valorServico + "\nObservacao: " + observacao + "\nEspecificacoes: "
                + especificacoes;
    }

}
