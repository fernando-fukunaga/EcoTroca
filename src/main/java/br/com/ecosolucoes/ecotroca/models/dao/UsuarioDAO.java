package br.com.ecosolucoes.ecotroca.models.dao;

import br.com.ecosolucoes.ecotroca.models.Pessoa;
import br.com.ecosolucoes.ecotroca.models.Usuario;
import br.com.ecosolucoes.ecotroca.models.Usuario.Perfil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class UsuarioDAO {
    static ConnectionFactory factory = new ConnectionFactory();
    
    public static void createUsuario(Usuario usuario) {
<<<<<<< HEAD
        String sql = "insert into usuario (id,id_pessoa,login,senha,perfil_acesso) values (?,?,?,?,?)";
=======
        String sql = "insert into usuario (id_pessoa,login,senha,perfil_acesso,usuario_ativo) values (?,?,?,?,?)";
>>>>>>> d594b2f69b1cf9c77dc546b81ed2e0200daff151
        try (Connection conn = factory.obterConexao()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,usuario.getIdPessoa());
            ps.setString(2, usuario.getLogin());
            ps.setString(3, usuario.getSenha());
            ps.setString(4, usuario.getPerfilAcesso().name());
            ps.setBoolean(5, usuario.isUsuarioAtivo());
            ps.execute();
            JOptionPane.showMessageDialog(null,"Usuário solicitado com sucesso! Aguarde a aprovação de um administrador para acessar o sistema.");
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
                Usuario usuario = new Usuario(idPessoa,login,senha,perfilAcesso,usuarioAtivo);
                usuario.setId(id);
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
        String sql = "select * from usuario where login = ? and senha = ? and usuario_ativo = true";
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
                JOptionPane.showMessageDialog(null, "Dados de login incorretos ou usuário inativo!");
                return false;
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro interno! Tente novamente mais tarde.");
            e.printStackTrace();
        }
        return false;
    }

    public static boolean checarDadosUnicosNaoRepetem(String login) {
        String sql = "select * from usuario where login = ?";
        try (Connection conn = factory.obterConexao()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, login);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Já existe um usuário com este login cadastrado!");
                return false;
            }
            return true;

        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro interno! Tente novamente mais tarde.");
            e.printStackTrace();
        }
        return false;
    }
    
    public static ArrayList listarUsuariosParaTabela() {
        String sql = "select * from usuario";
        try (Connection conn = factory.obterConexao()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ArrayList<Object[]> objetos = new ArrayList<>();
            while (rs.next()) {
                int idPessoa = rs.getInt("id_pessoa");
                Pessoa pessoa = PessoaDAO.readPessoa(idPessoa);
                String login = rs.getString("login");
                String nomeCompleto = pessoa.getNome() + " " + pessoa.getSobrenome();
                String email = pessoa.getEmail();
                String perfilAcesso = rs.getString("perfil_acesso");
                int idUsuario = rs.getInt("id");  
                boolean usuarioAtivo = rs.getBoolean("usuario_ativo");
                String strUsuarioAtivo;
                if (usuarioAtivo == true) {
                    strUsuarioAtivo = "Sim";
                }
                else {
                    strUsuarioAtivo = "Não";
                }
                Object[] newRowData = {login, nomeCompleto, email, perfilAcesso, idUsuario, strUsuarioAtivo};
                objetos.add(newRowData);                
            }
            return objetos;
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro interno! Tente novamente mais tarde.");
            e.printStackTrace();
        }
        return null;
    }
}
