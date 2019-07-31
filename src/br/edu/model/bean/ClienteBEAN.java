package br.edu.model.bean;

/**
 * A classe representa a tabela Cliente do banco de dados
 *
 */
public class ClienteBEAN {

    private String nomeCompleto;
    private String sexo;
    private String cpf;
    private String email;
    private String telefone;
    private String cidade;
    private String rua;
    private String bairro;
    private int numeroDaCasa;
    private String complemento;

    /**
     * construtor principal da classe
     *
     * @param nomeCompleto
     * @param sexo
     * @param cpf
     * @param email
     * @param telefone
     * @param cidade
     * @param rua
     * @param bairro
     * @param numeroDaCasa
     * @param complemento
     */
    public ClienteBEAN(String nomeCompleto, String sexo, String cpf, String email, String telefone,
            String cidade, String rua, String bairro, int numeroDaCasa, String complemento) {
        this.nomeCompleto = nomeCompleto;
        this.sexo = sexo;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.cidade = cidade;
        this.rua = rua;
        this.bairro = bairro;
        this.numeroDaCasa = numeroDaCasa;
        this.complemento = complemento;
    }

    /**
     * Construtor sobrescrevido com atributos obrigatorios da tabela
     *
     * @param nomeCompleto
     * @param cpf
     * @param cidade
     * @param bairro
     */
    public ClienteBEAN(String nomeCompleto, String cpf, String cidade,
            String bairro) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.cidade = cidade;
        this.bairro = bairro;
    }

    /**
     * Construtor default
     */
    public ClienteBEAN() {
    }

    /*
        GETs e SETs
     */
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumeroDaCasa() {
        return numeroDaCasa;
    }

    public void setNumeroDaCasa(int numeroDaCasa) {
        this.numeroDaCasa = numeroDaCasa;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * toString da classe
     *
     * @return
     */
    @Override
    public String toString() {
        return "INFORMAÇÕES PESSOAIS" + "\n" + "Nome: " + nomeCompleto + "\n" + "Sexo: " + sexo + "\n" + "CPF: " + cpf
                + "\n" + "Email: " + email + "\n" + "Telefone:" + telefone + "\n" + "\n" + "ENDEREÇO" + "\n"+ "Cidade: " + cidade
                + "\n" + "Bairro: " + bairro + "\n" + "Rua: " + rua + "\n"+ "Número: " + numeroDaCasa +
                "\n" + "Complemento: " + complemento + "\n";
    }

}
