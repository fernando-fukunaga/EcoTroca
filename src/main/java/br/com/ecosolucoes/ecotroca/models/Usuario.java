// ESTÁ INCOMPLETO AINDA!!!!!!!!!!!!!!!!!!
package br.com.ecosolucoes.ecotroca.models;

import br.com.ecosolucoes.ecotroca.controllers.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Usuario {
    private int id;
    private int idPessoa;
    private String login;
    private String senha;
    private Perfil perfilAcesso;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Perfil getPerfilAcesso() {
        return perfilAcesso;
    }

    public void setPerfilAcesso(Perfil perfilAcesso) {
        this.perfilAcesso = perfilAcesso;
    }
    
    public void inserir() {
        String sql = "insert into usuario(id_pessoa,login,senha,perfil_acesso) values(?,?,?,?)";
        ConnectionFactory factory = new ConnectionFactory();
        
        try (Connection c = factory.obterConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, idPessoa);
            ps.setString(2, login);
            ps.setString(3, senha);
            ps.setString(4, perfilAcesso.name());
            ps.execute();
        }
        
        catch (Exception e) {
            e.printStackTrace();
        }        
    }
}
