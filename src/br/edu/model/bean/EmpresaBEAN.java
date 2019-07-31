package br.edu.model.bean;

public class EmpresaBEAN {

    private String cnpj;
    private String nome;
    private String email;
    private String empresa_password;

    public EmpresaBEAN(String cnpj, String nome, String email, String empresa_password) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.email = email;
        this.empresa_password = empresa_password;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpresa_password() {
        return empresa_password;
    }

    public void setEmpresa_password(String empresa_password) {
        this.empresa_password = empresa_password;
    }
    
    @Override
    public String toString() {
        return "EmpresaBEAN{" + "cnpj=" + cnpj + ", nome=" + nome + ", email=" + email + ", empresa_password=" + empresa_password + '}';
    }
}
