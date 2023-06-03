package br.com.ecosolucoes.ecotroca.models.dao;

import br.com.ecosolucoes.ecotroca.models.Usuario;
import br.com.ecosolucoes.ecotroca.models.Usuario.Perfil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    static ConnectionFactory factory = new ConnectionFactory();
    
    public static void createUsuario(Usuario usuario) {
        String sql = "insert into usuario (id_pessoa,login,senha,perfil_acesso,usuario_ativo) values (?,?,?,?,?)";
        try (Connection conn = factory.obterConexao()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,usuario.getIdPessoa());
            ps.setString(2, usuario.getLogin());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getPerfilAcesso().name());
            ps.setBoolean(5, usuario.isUsuarioAtivo());
            ps.execute();
            JOptionPane.showMessageDialog(null,"Usuário criado com sucesso! ID do usuário: "+usuario.getId());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro interno! Tente novamente mais tarde.");
            e.printStackTrace();
        }
    }
    
    public static Usuario readUsuario(int id) {
        String sql = "select * from usuario where id = ?";
        try (Connection conn = factory.obterConexao()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int idPessoa = rs.getInt("id_pessoa");
                String login = rs.getString("login");
                String senha = rs.getString("senha");
                String strPerfilAcesso = rs.getString("perfil_acesso");
                Perfil perfilAcesso = Perfil.valueOf(strPerfilAcesso);
                boolean usuarioAtivo = rs.getBoolean("usuario_ativo");
                Usuario usuario = new Usuario();
                usuario.setId(id); usuario.setIdPessoa(idPessoa); usuario.setLogin(login); usuario.setSenha(senha);
                usuario.setPerfilAcesso(perfilAcesso); usuario.setUsuarioAtivo(usuarioAtivo);
                return usuario;
            }
            else {
                JOptionPane.showMessageDialog(null, "Usuário não encontrado!");
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro interno! Tente novamente mais tarde.");
            e.printStackTrace();
        }
        return null;
    }
    
    public static void updateUsuario(Usuario usuario) {
        String sql = "update usuario set login = ?, senha = ?, perfil_acesso = ?, usuario_ativo = ? where id = ?";
        try (Connection conn = factory.obterConexao()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, usuario.getLogin());
            ps.setString(2, usuario.getSenha());
            ps.setString(3, usuario.getPerfilAcesso().name());
            ps.setBoolean(4,usuario.isUsuarioAtivo());
            ps.setInt(5, usuario.getId());
            ps.execute();
            JOptionPane.showMessageDialog(null,"Usuário atualizado com sucesso!");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro interno! Tente novamente mais tarde.");
            e.printStackTrace();
        }
    }
    
    public static void deleteUsuario(int id) {
        String sql = "delete from usuario where id = ?";
        try (Connection conn = factory.obterConexao()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            JOptionPane.showMessageDialog(null,"Usuário excluído com sucesso!");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro interno! Tente novamente mais tarde.");
            e.printStackTrace();
        }
    }
    
    public static boolean tentarLogin(String login, String senha) {
        String sql = "select * from usuario where login = ? and senha = ?";
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection conn = factory.obterConexao()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, senha);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Bem vindo!");
                return true;
            }
            else {
                JOptionPane.showMessageDialog(null, "Login inválido");
                return false;
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro interno! Tente novamente mais tarde.");
            e.printStackTrace();
        }
        return false;
    }    
}
