/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ecosolucoes.ecotroca.models.dao;

import br.com.ecosolucoes.ecotroca.models.Pessoa;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author fanna
 */
public class PessoaDAO {   
    static ConnectionFactory factory = new ConnectionFactory(); // criando uma factory de conexão com o banco
    
    // Métodos de CRUD:
    
    // Método para inserir nova pessoa no banco
    public static void createPessoa(Pessoa pessoa) {
        String sql = "insert into pessoa(nome,sobrenome,email,data_nascimento,endereco,telefone,cpf) values(?,?,?,?,?,?,?)"; //criando uma string de base com o comando sql e variáveis nos valores
        
        //Tentar a inserção, passando a conexão com o banco como parâmetro
        try (Connection conn = factory.obterConexao()) {
            PreparedStatement ps = conn.prepareStatement(sql); // Criando um PreparedStatement passando aquela string com o comando sql, para deixar o comando pronto para ser executado assim que a gente mandar ele executar
            
            // Alterando os valores do comando SQL, o número indica o índice, ou seja, a posição do '?' no comando SQL, e o segundo parâmetro é o valor que você vai colocar no lugar desse '?'
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getSobrenome());
            ps.setString(3, pessoa.getEmail());
            ps.setDate(4, pessoa.getDataNascimento());
            ps.setString(5, pessoa.getEndereco());
            ps.setString(6, pessoa.getTelefone());
            ps.setString(7, pessoa.getCpf());
            ps.execute(); // Executar o comando SQL, já com os valores dos atributos definidos
            JOptionPane.showMessageDialog(null,"Dados pessoais registrados com sucesso!");
        }
        
        // Caso dê algum erro:
        catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ocorreu um erro interno! Tente novamente mais tarde.");
            e.printStackTrace(); // esse catch vai pegar o erro, que chamamos de exception, e faz o print dele para o usuário saber o que houve
        }
    }
    
    public static Pessoa readPessoa(int id) {
        String sql = "select * from pessoa where id = ?";
        try (Connection conn = factory.obterConexao()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String nome = rs.getString("nome");
                String sobrenome = rs.getString("sobrenome");
                String email = rs.getString("email");
                Date dataNascimento = rs.getDate("data_nascimento");
                String endereco = rs.getString("endereco");
                String telefone = rs.getString("telefone");
                String cpf = rs.getString("cpf");
                Pessoa pessoa = new Pessoa(nome,sobrenome,email,dataNascimento,endereco,telefone,cpf);
                pessoa.setId(id);
                return pessoa;
            }
            else {
                JOptionPane.showMessageDialog(null, "Pessoa não encontrada!");
            }

        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro interno! Tente novamente mais tarde.");
            e.printStackTrace();
        }
        return null;
    }
    
    public static void updatePessoa(Pessoa pessoa) {
        String sql = "update pessoa set nome = ?, sobrenome = ?, email = ?, data_nascimento = ?, endereco = ?, telefone = ?, cpf = ? where id = ?";
        try (Connection conn = factory.obterConexao()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getSobrenome());
            ps.setString(3, pessoa.getEmail());
            ps.setDate(4, pessoa.getDataNascimento());
            ps.setString(5, pessoa.getEndereco());
            ps.setString(6, pessoa.getTelefone());
            ps.setString(7, pessoa.getCpf());            
            ps.execute();
            JOptionPane.showMessageDialog(null,"Pessoa atualizada com sucesso!");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro interno! Tente novamente mais tarde.");
            e.printStackTrace();
        }
    }
    
    public static void deletePessoa(int id) {
        String sql = "delete from pessoa where id = ?";
        try (Connection conn = factory.obterConexao()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            JOptionPane.showMessageDialog(null,"Pessoa excluído com sucesso!");
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro interno! Tente novamente mais tarde.");
            e.printStackTrace();
        }
    }
    
    public static Pessoa procurarPessoaPeloEmail(String email) {
        String sql = "select * from pessoa where email = ?";
        try (Connection conn = factory.obterConexao()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String sobrenome = rs.getString("sobrenome");
                Date dataNascimento = rs.getDate("data_nascimento");
                String endereco = rs.getString("endereco");
                String telefone = rs.getString("telefone");
                String cpf = rs.getString("cpf");
                Pessoa pessoa = new Pessoa(nome,sobrenome,email,dataNascimento,endereco,telefone,cpf);
                pessoa.setId(id);
                return pessoa;
            }
            else {
                JOptionPane.showMessageDialog(null, "Pessoa não encontrada!");
            }

        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro interno! Tente novamente mais tarde.");
            e.printStackTrace();
        }
        return null;
    }

    public static boolean checarDadosUnicosNaoRepetem(String email, String cpf) {
        String sqlEmail = "select * from pessoa where email = ?";
        String sqlCpf = "select * from pessoa where cpf = ?";
        try (Connection conn = factory.obterConexao()) {
            PreparedStatement psEmail = conn.prepareStatement(sqlEmail);
            psEmail.setString(1, email);
            ResultSet rsEmail = psEmail.executeQuery();
            if (rsEmail.next()) {
                JOptionPane.showMessageDialog(null, "Esse e-mail já está cadastrado!");
                return false;
            }
            PreparedStatement psCpf = conn.prepareStatement(sqlCpf);
            psCpf.setString(1, cpf);
            ResultSet rsCpf = psCpf.executeQuery();
            if (rsCpf.next()) {
                JOptionPane.showMessageDialog(null, "Esse CPF já está cadastrado!");
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
}
