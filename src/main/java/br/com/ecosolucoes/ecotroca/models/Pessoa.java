package br.com.ecosolucoes.ecotroca.models;

import java.sql.Date; // essa importação é para usarmos o tipo de variável DATA

public class Pessoa {
    /* Definindo os atributos da classe, a classe não terá método construtor pois ele irá atrapalhar na hora de fazer as operações CRUD,
    quando a classe tem um contrutor, somos obrigados a dizer o valor de TODOS os atributos para instanciar um objeto e utilizá-lo com o
    mySQL, isso não é interessante quando vamos fazer uma operação do tipo DELETE, por exemplo, pois no DELETE a gente só precisa do ID da pessoa.*/
    private int id;
    private String nome;
    private String sobrenome;
    private String email;
    private Date dataNascimento;
    private String endereco;
    private String telefone;
    private String cpf;
    
    // Getters e Setters (o NetBeans os gera automaticamente!)

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
