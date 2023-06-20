package br.com.ecosolucoes.ecotroca.models.dao;

import br.com.ecosolucoes.ecotroca.models.Cidadao;
import br.com.ecosolucoes.ecotroca.models.Descarte;
import br.com.ecosolucoes.ecotroca.models.Pessoa;
import br.com.ecosolucoes.ecotroca.models.Usuario;
import static br.com.ecosolucoes.ecotroca.models.dao.UsuarioDAO.factory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DescarteDAO {
    static ConnectionFactory factory = new ConnectionFactory();    
    
    public static int createDescarte(Descarte descarte) {
        String sql = "insert into descarte (id_cidadao, id_usuario)"
                + "values (?,?)";
        try (Connection conn = factory.obterConexao()){
            PreparedStatement ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1,descarte.getIdCidadao());
            ps.setInt(2,descarte.getIdUsuario());
            int affectedRows = ps.executeUpdate();
            if (affectedRows > 0) {
                ResultSet generatedKeys = ps.getGeneratedKeys();
                if (generatedKeys.next()) {
                    int primaryKey = generatedKeys.getInt(1);
                    return primaryKey;
                }
                generatedKeys.close();
            }            
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro de conexão"); 
            e.printStackTrace();
            
                   
                    }
            return 0;
                      
        }

    public static Descarte readDescarte(int id){
        String sql = "select * from descarte where id = ?";
        try(Connection conn = factory.obterConexao()){
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()){
            int idCidadao = rs.getInt("id_cidadao");
            int idUsuario = rs.getInt("id_usuario");
            Timestamp dataHoraDescarte = rs.getTimestamp("data_hora_descarte");
            double pesoTotalDescarte = rs.getDouble("peso_total_descarte");
            double totalPontosGerados = rs.getDouble("total_pontos_gerados");
            Descarte descarte = new Descarte();
            descarte.setId(id);descarte.setIdCidadao(idCidadao);descarte.setIdUsuario(idUsuario);descarte.setDataHoraDescarte(dataHoraDescarte);
            descarte.setPesoTotalDescarte(pesoTotalDescarte);descarte.setTotalPontosGerados(totalPontosGerados);
            return descarte;
        
        }
        else{
            JOptionPane.showMessageDialog(null,"Dados não encontrados");
            
        }
        }
        
        

        catch (Exception e){
           JOptionPane.showMessageDialog(null, "Ocorreu um erro de conexão"); 
           e.printStackTrace();
        }
        return null;
        
        }
        
    public static void updateDescarte(Descarte descarte) {
        String sql = "update descarte set id_cidadao = ?, id_usuario = ?, peso_total_descarte = ?, total_pontos_gerados = ?"
+ "where id = ?";
        try(Connection conn = factory.obterConexao()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,descarte.getIdCidadao());
            ps.setInt(2,descarte.getIdUsuario());
            ps.setDouble(4,descarte.getPesoTotalDescarte());
            ps.setDouble(5,descarte.getTotalPontosGerados());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Dados atualizado com sucesso");
            
        }     
        catch (Exception e){
             JOptionPane.showMessageDialog(null, "Ocorreu um erro de conexão"); 
             e.printStackTrace();
}
    }

       public static void deleteDescarte(int id){
            String sql = "delete froom descarte where id = ?";
        try(Connection conn = factory.obterConexao()){
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        ps.execute();
        JOptionPane.showMessageDialog(null, "Dados deletado com sucesso");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro de conexão"); 
            e.printStackTrace();
        
            
            
        }
            
       
        
        
}
       
           public static void atualizarPesoEPontosDescarte(int id) {
        String sql = "update descarte set peso_total_descarte = ?, total_pontos_gerados = ?"
+ "where id = ?";
        try(Connection conn = factory.obterConexao()){
            PreparedStatement ps = conn.prepareStatement(sql);
            double pontos = MaterialDescarteDAO.calculaTotalPontosDescarte(id);
            double peso = MaterialDescarteDAO.calculaPesoTotalDescarte(id);
            ps.setDouble(1,peso);
            ps.setDouble(2,pontos);
            ps.setInt(3,id);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Descarte registrado com sucesso!");
            
        }     
        catch (Exception e){
             JOptionPane.showMessageDialog(null, "Ocorreu um erro de conexão"); 
             e.printStackTrace();
}
    }
           
    public static ArrayList listarDescartesParaTabela(){
        String sql = "select * from descarte";
        try(Connection conn = factory.obterConexao()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ArrayList<Object[]> objetos = new ArrayList<>();
            while (rs.next()){
                int idDescarte = rs.getInt("id");
                int idCidadao = rs.getInt("id_cidadao");
                Cidadao cidadao = CidadaoDAO.readCidadao(idCidadao);
                int idPessoa = cidadao.getIdPessoa();
                Pessoa pessoa = PessoaDAO.readPessoa(idPessoa);
                String nomeCidadao = pessoa.getNome()+" "+pessoa.getSobrenome();
                int idUsuario = rs.getInt("id_usuario");
                Usuario usuario = UsuarioDAO.readUsuario(idUsuario);
                String loginFuncionario = usuario.getLogin();
                Timestamp dataHoraDescarte = rs.getTimestamp("data_hora_descarte");
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                String strDataHoraDescarte = dateFormat.format(dataHoraDescarte);
                Double pesoTotalDescarte = rs.getDouble("peso_total_descarte");
                Object[] newRowData = {idDescarte,idCidadao,nomeCidadao,loginFuncionario,strDataHoraDescarte,pesoTotalDescarte};
                objetos.add(newRowData);
            }
            return objetos;
        }
        catch (Exception e){
           JOptionPane.showMessageDialog(null, "Ocorreu um erro de conexão"); 
           e.printStackTrace();
        }
        return null;  
    }
    
    public static int extrairNumeroDescartes() {
        String sql = "select * from descarte;";
        try (Connection conn = factory.obterConexao()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            int tamanho = 0;
            while (rs.next()){
                tamanho++;
            }
            return tamanho;
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro interno! Tente novamente mais tarde.");
            e.printStackTrace();
        }
        return 0;
    }

    public static String extrairPesoTotalRecebido() {
        String sql = "select * from descarte;";
        try (Connection conn = factory.obterConexao()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            double peso = 0;
            while (rs.next()){
                double p = rs.getDouble("peso_total_descarte");
                peso += p;               
            }
            DecimalFormat df = new DecimalFormat("#.000");
            return df.format(peso);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro interno! Tente novamente mais tarde.");
            e.printStackTrace();
        }
        return null;
    }    
    
    public static String extrairTotalPontosGerados() {
        String sql = "select * from descarte;";
        try (Connection conn = factory.obterConexao()) {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            double pontos = 0;
            while (rs.next()){
                double p = rs.getDouble("total_pontos_gerados");
                pontos += p;
            }
            DecimalFormat df = new DecimalFormat("#.00");
            return df.format(pontos);
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro interno! Tente novamente mais tarde.");
            e.printStackTrace();
        }
        return null;
    }    
    
}

            





        
    
    
   
                
    

