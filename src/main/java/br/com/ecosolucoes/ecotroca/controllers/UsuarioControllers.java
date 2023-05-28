/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ecosolucoes.ecotroca.controllers;

import br.com.ecosolucoes.ecotroca.models.dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author fanna
 */
public class UsuarioControllers {
    public static void tentarLogin(String login, String senha) {
        String sql = "select * from usuario where login = ? and senha = ?";
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection conn = factory.obterConexao()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, senha);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Bem vindo!");
            }
            else {
                JOptionPane.showMessageDialog(null, "Login inválido");
            }
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro interno! Tente novamente mais tarde.");
            e.printStackTrace();
        }        
    }
}
