package br.com.ecosolucoes.ecotroca.models.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    private String user = "root";
<<<<<<< HEAD
    private String senha = "1234";
=======
    private String senha = "";
>>>>>>> d594b2f69b1cf9c77dc546b81ed2e0200daff151
    private String host = "localhost";
    private String porta = "3306";
    private String banco = "ecotroca";
    private String timezone = "&useTimezone=true&serverTimezone=America/Sao_Paulo";
    
    public Connection obterConexao() {
        try {
        Connection c = DriverManager.getConnection("jdbc:mysql://"+host+":"+porta+"/"+banco+"?user="+user+"&password="+senha+timezone);
        return c;
        }
        
        catch (Exception e) {
        e.printStackTrace();
        return null;
        }
    }
}
