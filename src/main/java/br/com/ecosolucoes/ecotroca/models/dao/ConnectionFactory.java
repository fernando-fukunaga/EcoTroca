package br.com.ecosolucoes.ecotroca.models.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
<<<<<<< HEAD
    private final String usuario = "root";
    private final String senha = "1234";
    private final String host = "localhost";
    private final String porta = "3306";
    private final String banco = "ecotroca";
    private final String timezone = "&useTimezone=true&serverTimezone=America/Sao_Paulo";
=======
    private String user = "root";
    private String senha = "senha";
    private String host = "localhost";
    private String porta = "3306";
    private String banco = "ecotroca";
    private String timezone = "&useTimezone=true&serverTimezone=America/Sao_Paulo";
>>>>>>> 6306ed9197d0cc5dc3cde3f0c9adf8cbc5ef4ac3
    
    public Connection obterConexao() {
        try {
        Connection c = DriverManager.getConnection("jdbc:mysql://"+host+":"+porta+"/"+banco+"?user="+usuario+"&password="+senha+timezone);
        return c;
        }
        
        catch (SQLException e) {
        return null;
        }
    }
}
