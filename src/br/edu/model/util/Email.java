package br.edu.model.util;

import javax.swing.JOptionPane;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 * Classe ultilizada para enviar emails
 *
 * @author Hemenson
 */
public class Email {

    protected final String HOSTNAME = "smtp.gmail.com";
    protected final int PORT = 587;

    protected String emailRemetente;
    protected String senhaRemetente;
    protected String emailDestinatario;
    protected String assunto;
    protected String mensagem;

    /**
     * Construtor da classe
     *
     * @param emailRemetente
     * @param senhaRemetente
     * @param emailDestinatario
     * @param assunto
     * @param mensagem
     */
    public Email(String emailRemetente, String senhaRemetente, String emailDestinatario, String assunto, String mensagem) {
        this.emailRemetente = emailRemetente;
        this.senhaRemetente = senhaRemetente;
        this.emailDestinatario = emailDestinatario;
        this.assunto = assunto;
        this.mensagem = mensagem;
    }

    public void send() {
        SimpleEmail simplesEmail = new SimpleEmail();

        try {
            /**
             * Tipo de servico *
             */
            simplesEmail.setHostName(this.HOSTNAME);

            /**
             * Porta do servico *
             */
            simplesEmail.setSmtpPort(this.PORT);

            /**
             * Autenticação de usuario*
             */
            simplesEmail.setAuthenticator(new DefaultAuthenticator(
                    this.emailRemetente, this.senhaRemetente));

            /**
             * Prorocolo de envio *
             */
            simplesEmail.setSSLOnConnect(true);

            /**
             * Email do remetente *
             */
            simplesEmail.setFrom(this.emailRemetente);

            /**
             * Assunto do email *
             */
            simplesEmail.setSubject(this.assunto);

            /**
             * Mensagem do email *
             */
            simplesEmail.setMsg(this.mensagem);

            /**
             * Remetente do email *
             */
            simplesEmail.addTo(this.emailDestinatario);

            /**
             * Metodo de envio *
             */
            simplesEmail.send();
            
        } catch (EmailException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao enviar o email: " + ex.toString(),
                    "Erro ao enviar email", JOptionPane.ERROR_MESSAGE);
        }
    }
}
