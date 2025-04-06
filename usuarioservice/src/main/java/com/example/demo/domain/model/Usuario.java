package com.example.demo.domain.model;


import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.time.LocalDate;
import java.util.regex.Pattern;

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String senha;
    private String telefone;
    private String rua;
    private String numero;
    private String cidade;
    private String cep;
    private String cpf;
    private LocalDate dataNascimento;
    private LocalDate dataCadastro;

    public void setNome(String nome) {
        if (nome == null || nome.trim().length() < 3) {
            throw new IllegalArgumentException("O nome deve ter pelo menos 3 caracteres.");
        }
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        if (!isValidCpf(cpf)) {
            throw new IllegalArgumentException("CPF inválido.");
        }
        this.cpf = cpf;
    }

    private boolean isValidCpf(String cpf) {
        String regex = "\\d{11}";
        return Pattern.matches(regex, cpf);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

}
