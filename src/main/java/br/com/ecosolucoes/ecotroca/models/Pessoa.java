package br.com.ecosolucoes.ecotroca.models;

import br.com.ecosolucoes.ecotroca.controllers.ConnectionFactory; //importando classe se conexão com o banco
import java.sql.Date; // essa importação é para usarmos o tipo de variável DATA
import java.sql.Connection; // modulo do sql para fazer uma conexão com o banco
import java.sql.PreparedStatement; // módulo que prepara um comando SQL para ser executado quando você mandar
import java.sql.ResultSet; // módulo que é usado para trabalhar com resultados de pesquisas no banco usando o SELECT
import javax.swing.JOptionPane; // JOptionPane para imprimir o SELECT

public class Pessoa {
    /* Definindo os atributos da classe, a classe não terá método construtor pois ele irá atrapalhar na hora de fazer as operações CRUD,
    quando a classe tem um contrutor, somos obrigados a dizer o valor de TODOS os atributos para instanciar um objeto e utilizá-lo com o
    mySQL, isso não é interessante quando vamos fazer uma operação do tipo DELETE, por exemplo, pois no DELETE a gente só precisa do ID da pessoa.*/
    private int id;
    private String nome;
    private String sobrenome;
    private String email;
    private Date dataNascimento;
    private String endereco;
    private String telefone;
    private String cpf;
    
    // Getters e Setters (o NetBeans os gera automaticamente!)

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    // Métodos de CRUD:
    
    // Método para inserir nova pessoa no banco
    public void inserir() {
        String sql = "insert into pessoa(nome,sobrenome,email,data_nascimento,endereco,telefone,cpf) values(?,?,?,?,?,?,?)"; //criando uma string de base com o comando sql e variáveis nos valores
        ConnectionFactory factory = new ConnectionFactory(); // criando uma factory de conexão com o banco
        
        //Tentar a inserção, passando a conexão com o banco como parâmetro
        try (Connection c = factory.obterConexao()) {
            PreparedStatement ps = c.prepareStatement(sql); // Criando um PreparedStatement passando aquela string com o comando sql, para deixar o comando pronto para ser executado assim que a gente mandar ele executar
            
            // Alterando os valores do comando SQL, o número indica o índice, ou seja, a posição do '?' no comando SQL, e o segundo parâmetro é o valor que você vai colocar no lugar desse '?'
            ps.setString(1, nome);
            ps.setString(2, sobrenome);
            ps.setString(3, email);
            ps.setDate(4, dataNascimento);
            ps.setString(5, endereco);
            ps.setString(6, telefone);
            ps.setString(7, cpf);
            ps.execute(); // Executar o comando SQL, já com os valores dos atributos definidos
        }
        
        // Caso dê algum erro:
        catch (Exception e) {
            e.printStackTrace(); // esse catch vai pegar o erro, que chamamos de exception, e faz o print dele para o usuário saber o que houve
        }
    }
    
    /* Método para editar os dados de uma pessoa que já está registrada no banco.
    A grande diferença desse pro inserir() é que também devemos informar o id, para o programa saber qual pessoa estamos editando*/
    public void editar() {
        String sql = "update pessoa set nome=?,sobrenome=?,email=?,data_nascimento=?,endereco=?,telefone=?,cpf=? where id=?";
        ConnectionFactory factory = new ConnectionFactory();
        
        try (Connection c = factory.obterConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1,nome);
            ps.setString(2, sobrenome);
            ps.setString(3, email);
            ps.setDate(4, dataNascimento);
            ps.setString(5, endereco);
            ps.setString(6, telefone);
            ps.setString(7, cpf);
            ps.setInt(8, id); 
            ps.execute();            
        }
        
        catch (Exception e) {
            e.printStackTrace();
        }        
    }
    
    /* Método para excluir o registro de uma pessoa do banco.
    Esse aqui é até mais fácil, só precisamos do id da pessoa que queremos excluir*/
    public void excluir() {
        String sql = "delete from pessoa where id=?";
        ConnectionFactory factory = new ConnectionFactory();
        
        try (Connection c = factory.obterConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
        }
        
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    // Método para imprimir todos os registros existentes na tabela 'pessoa' do banco de dados
    public void listar() {
        String sql = "select * from pessoa";
        ConnectionFactory factory = new ConnectionFactory();
        
        try (Connection c = factory.obterConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            /*A grande diferença desse método, é o uso do ResultSet, pois precisamos manipular o RESULTADO desse comando.
            Vamos precisar criar um while que irá imprimir todos os dados de todos os registros da tabela até não haver
            mais nenhum registro, é só seguir o modelo. No final de cada repetição, ele usa o JOptionPane para imprimir na
            tela o registro.*/
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String nome = rs.getString("nome");
                String sobrenome = rs.getString("sobrenome");
                String email = rs.getString("email");
                Date dataNascimento = rs.getDate("data_nascimento");
                String endereco = rs.getString("endereco");
                String telefone = rs.getString("telefone");
                String cpf = rs.getString("cpf");
                String aux = String.format(
                    "Código: %d, Nome: %s, Sobrenome: %s, E-mail: %s, Data de Nascimento: %s, Endereço: %s, Telefone: %s, CPF: %s,",
                    id,
                    nome,
                    sobrenome,
                    email,
                    dataNascimento,
                    endereco,
                    telefone,
                    cpf
                );
                JOptionPane.showMessageDialog(null, aux);
            }
        }
        
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
