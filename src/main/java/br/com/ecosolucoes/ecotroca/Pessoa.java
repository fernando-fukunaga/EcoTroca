package br.com.ecosolucoes.ecotroca;

import java.sql.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Pessoa {
    private int id;
    private String nome;
    private String sobrenome;
    private String email;
    private Date dataNascimento;
    private String endereco;
    private String telefone;
    private String cpf;

    public Pessoa(String nome, String sobrenome, String email, Date dataNascimento, String endereco, String telefone, String cpf) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
    }

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
    
    public void inserir() {
        String sql = "insert into pessoa(nome,sobrenome,email,data_nascimento,endereco,telefone,cpf) values(?,?,?,?,?,?,?)";
        ConnectionFactory factory = new ConnectionFactory();
        
        try (Connection c = factory.obterConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, sobrenome);
            ps.setString(3, email);
            ps.setDate(4, dataNascimento);
            ps.setString(5, endereco);
            ps.setString(6, telefone);
            ps.setString(7, cpf);
            ps.execute();
        }
        
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
