package com.bernardolobato.poc.pocservicos.controller.form;

import java.util.Date;
import com.bernardolobato.poc.pocservicos.model.Pessoa;

public class PessoaForm {
    String nome;
    String cpf;
    Date dataNascimento;
    String sexo;
    String telefone;
    String email;


    public PessoaForm() {

    }

    public PessoaForm(String nome, String cpf, Date dataNascimento, String sexo, String telefone,
            String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public Date getDataNascimento() {
        return this.dataNascimento;
    }

    public String getSexo() {
        return this.sexo;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public String getEmail() {
        return this.email;
    }

    public Pessoa converter() {
        return new Pessoa(this.nome, this.cpf, this.dataNascimento, this.sexo, this.telefone,
                this.email);
    }

}
