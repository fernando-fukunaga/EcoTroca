package br.com.ecosolucoes.ecotroca.models;

public class Usuario {
    public enum Perfil {
        admin,
        funcionario
    }
    
    private int id;
    private int idPessoa;
    private String login;
    private String senha;
    private Perfil perfilAcesso;
    private boolean usuarioAtivo;

    public Usuario(int idPessoa, String login, String senha, Perfil perfilAcesso, boolean usuarioAtivo) {
        this.idPessoa = idPessoa;
        this.login = login;
        this.senha = senha;
        this.perfilAcesso = perfilAcesso;
        this.usuarioAtivo = usuarioAtivo;
    }

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

    public boolean isUsuarioAtivo() {
        return usuarioAtivo;
    }

    public void setUsuarioAtivo(boolean usuarioAtivo) {
        this.usuarioAtivo = usuarioAtivo;
    }
    
    
    
    
}
