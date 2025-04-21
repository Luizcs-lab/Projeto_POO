package br.com.Padaria.model;

import java.util.Date;

public class Cliente {
    String nome;
    Date dtNascimento;
    String telefone;
    String endereco;
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getDtNascimento() {
        return dtNascimento;
    }
    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public Cliente(String nome, Date dtNascimento, String telefone, String endereco) {
        this.nome = nome;
        this.dtNascimento = dtNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
    }
}
