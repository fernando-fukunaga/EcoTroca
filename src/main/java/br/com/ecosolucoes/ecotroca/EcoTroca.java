package br.com.ecosolucoes.ecotroca;

import java.sql.Date;

public class EcoTroca {

    public static void main(String[] args) {
        String nome = "John";
        String sobrenome = "Doe";
        String email = "johndoe@email.com";
        String strDataNascimento = "1990-01-01";
        Date dataNascimento = Date.valueOf(strDataNascimento);
        String endereco = "Rua Taquari, 529";
        String telefone = "(11) 91111-1111";
        String cpf = "123.123.123-12";
        
        Pessoa teste = new Pessoa(nome, sobrenome, email, dataNascimento, endereco, telefone, cpf);
        teste.inserir();
        System.out.println("operacao finalizada");
    }
}
