package com.bernardolobato.poc.pocservicos.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pessoa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String nome;
    String cpf;
    Date dataNascimento;
    String sexo;
    String telefone;
    String email;



    public Pessoa(String nome, String cpf, Date dataNascimento, String sexo, String telefone,
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

}
