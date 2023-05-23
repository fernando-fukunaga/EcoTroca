package br.com.ecosolucoes.ecotroca;

import br.com.ecosolucoes.ecotroca.models.Pessoa;
import java.sql.Date;
import javax.swing.JOptionPane;

public class TestePessoa {

    public static void main(String[] args) {
        String menu = "1-Cadastrar\n2-Atualizar\n3-Apagar\n4-Listar\n0-Sair";
        int op;
        
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(op) {
                case 1:
                    String nome = JOptionPane.showInputDialog("Insira o nome");
                    String sobrenome = JOptionPane.showInputDialog("Insira o sobrenome");
                    String email = JOptionPane.showInputDialog("Insira o email");          
                    Date dataNascimento = Date.valueOf(JOptionPane.showInputDialog("Insira a data de nascimento no formato AAAA-MM-DD"));
                    String endereco = JOptionPane.showInputDialog("Insira o endereco");
                    String telefone = JOptionPane.showInputDialog("Insira o telefone");
                    String cpf = JOptionPane.showInputDialog("Insira o cpf");
                    Pessoa p = new Pessoa();
                    p.setNome(nome); p.setSobrenome(sobrenome); p.setEmail(email); p.setDataNascimento(dataNascimento); p.setEndereco(endereco); p.setTelefone(telefone); p.setCpf(cpf);
                    p.inserir();
                break;
                
                case 2:
                    int id2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o id da pessoa que quer editar"));    
                    String nome2 = JOptionPane.showInputDialog("Insira o novo nome");
                    String sobrenome2 = JOptionPane.showInputDialog("Insira o novo sobrenome");
                    String email2 = JOptionPane.showInputDialog("Insira o novo email");
                    Date dataNascimento2 = Date.valueOf(JOptionPane.showInputDialog("Insira a nova data de nascimento no formato AAAA-MM-DD"));
                    String endereco2 = JOptionPane.showInputDialog("Insira o novo endereco");
                    String telefone2 = JOptionPane.showInputDialog("Insira o novo telefone");
                    String cpf2 = JOptionPane.showInputDialog("Insira o novo cpf");
                    Pessoa p2 = new Pessoa();
                    p2.setId(id2); p2.setNome(nome2); p2.setSobrenome(sobrenome2); p2.setEmail(email2); p2.setDataNascimento(dataNascimento2); p2.setEndereco(endereco2); p2.setTelefone(telefone2); p2.setCpf(cpf2);
                    p2.editar();               
                break;
                
                case 3:
                    int id3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o id da pessoa que quer excluir"));
                    Pessoa p3 = new Pessoa();
                    p3.setId(id3);
                    p3.excluir();
                break;
                
                case 4:
                    Pessoa p4 = new Pessoa();
                    p4.listar();
                break;
                
                case 0:
                break;
                
                default:
                JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        }
        while (op != 0);
    }
}
