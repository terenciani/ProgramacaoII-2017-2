package br.estacio.programacao.dojo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcelo
 */
public class Cliente {

    private String nome;
    private String email;
    private String senha;
    private char sexo;
    private String estiloDeLeitura;
    private String timeDeFutebol;

    public Cliente(String nome, String email, String senha, char sexo, String estiloDeLeitura, String timeDeFutebol) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.sexo = sexo;
        this.estiloDeLeitura = estiloDeLeitura;
        this.timeDeFutebol = timeDeFutebol;
    }
    
    public Cliente() {
        //Não faz nada
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEstiloDeLeitura() {
        return estiloDeLeitura;
    }

    public void setEstiloDeLeitura(String estiloDeLeitura) {
        this.estiloDeLeitura = estiloDeLeitura;
    }

    public String getTimeDeFutebol() {
        return timeDeFutebol;
    }

    public void setTimeDeFutebol(String timeDeFutebol) {
        this.timeDeFutebol = timeDeFutebol;
    }

}
