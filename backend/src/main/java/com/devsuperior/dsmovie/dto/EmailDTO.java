package com.devsuperior.dsmovie.dto;

import java.io.Serializable;

public class EmailDTO implements Serializable {

    private String assunto;
    private String conteudo;
    private String destinatario;

    public EmailDTO() {
    }

    public EmailDTO(String assunto, String conteudo, String destinatario) {
        this.assunto = assunto;
        this.conteudo = conteudo;
        this.destinatario = destinatario;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
}