package br.com.ecosolucoes.ecotroca.models.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String user = "postgres";
    private static final String senha = "senha";
    private static final String host = "localhost";
    private static final String porta = "5432";
    private static final String banco = "ecotroca";
    private static final String timezone = "&useTimezone=true&serverTimezone=America/Sao_Paulo";
    
    public Connection obterConexao() {
        try {
        Connection c = DriverManager.getConnection("jdbc:postgresql://"+host+":"+porta+"/"+banco+"?user="+user+"&password="+senha+timezone);
        return c;
        }
        
        catch (SQLException e) {
        return null;
        }
    }
}
