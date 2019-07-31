package br.edu.model.bean;

import java.sql.Timestamp;
import br.edu.model.util.Password;

/**
 * A classe representa a tabela user do banco de dados
 */
public class UserBEAN {

    private int id;
    private String username;
    private String email;
    private Password password;
    private Timestamp create_time;

    /**
     * Construtor default da classe
     */
    public UserBEAN() {
        this.password = new Password("");
    }

    /**
     * Construtor utilizado para efeituar a autenticação de login e senha
     *
     * @param username
     * @param password
     */
    public UserBEAN(String username, String password) {
        this.username = username;
        this.password = new Password(password);
    }

    /**
     * Constutor com nome, email e password
     *
     * @param username
     * @param email
     * @param password
     */
    public UserBEAN(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = new Password(password);
    }

    /**
     * Construtor principal da classe
     *
     * @param id
     * @param username
     * @param email
     * @param password
     */
    public UserBEAN(int id, String username, String email, String password) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = new Password(password);
    }

    /* GETs e SETs */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Timestamp create_time) {
        this.create_time = create_time;
    }

    /**
     * Gera um hash da senha passada alterando a mesma
     *
     * @param newPassword
     */
    public void setHashPassword(String newPassword) {
        this.password = new Password(newPassword);
    }

    /**
     * adiciona em texto não modificado um password
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password.setPassword(password);
    }

    /**
     * pega o password atribuido
     *
     * @return
     */
    public String getPassword() {
        return this.password.getPassword();
    }

    /**
     * toString da classe
     *
     * @return
     */
    @Override
    public String toString() {
        return "Login{" + "id=" + id + ", username=" + username + ", email=" + email
                + ", password=" + password.getPassword() + ", create_time=" + create_time + '}';
    }
}
