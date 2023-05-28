package br.com.ecosolucoes.ecotroca.models.dao;

import br.com.ecosolucoes.ecotroca.models.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class UsuarioDAO {
    ConnectionFactory factory = new ConnectionFactory();
    
    public void createUsuario(Usuario usuario) {
        String sql = "insert into usuario (id,id_pessoa,login,senha,perfil_acesso) values (?,?,?,?,?)";
        try (Connection conn = factory.obterConexao()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,usuario.getId());
            ps.setInt(2,usuario.getIdPessoa());
            ps.setString(3, usuario.getLogin());
            ps.setString(4, usuario.getSenha());
            ps.setString(5, usuario.getPerfilAcesso().name());
            ps.execute();
            JOptionPane.showMessageDialog(null,"Usuário criado com sucesso! ID do usuário: "+usuario.getId());
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro interno! Tente novamente mais tarde.");
            e.printStackTrace();
        }
    }
    
    public void readUsuario(int id) {
        String sql = "select * from usuario where id = ?";
        try (Connection conn = factory.obterConexao()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            JOptionPane.showMessageDialog(null,
                    "Dados do Usuario:\n"
                    + "Nome Completo: "+rs.getString("nome")+" "+rs.getString("sobrenome")+"\n"
                    + "E-mail: "+rs.getString("email")+"\n"
                    + "Login: "+rs.getString("login")+"\n"
                    + "Perfil: "+rs.getString("perfil_acesso"));
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro interno! Tente novamente mais tarde.");
            e.printStackTrace();
        }
    }
    
    public void updateUsuario(Usuario usuario) {
        String sql = "update usuario set login = ?, senha = ?, perfil_acesso = ? where id = ?";
        try (Connection conn = factory.obterConexao()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, usuario.getLogin());
            ps.setString(2, usuario.getSenha());
            ps.setString(3, usuario.getPerfilAcesso().name());
            ps.setInt(4, usuario.getId());
            ps.execute();
            JOptionPane.showMessageDialog(null,"Usuário atualizado com sucesso!");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro interno! Tente novamente mais tarde.");
            e.printStackTrace();
        }
    }
    
    public void deleteUsuario(int id) {
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
}
