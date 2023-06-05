
package br.com.ecosolucoes.ecotroca.models.dao;
import br.com.ecosolucoes.ecotroca.models.Cidadao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class CidadaoDAO {
   static ConnectionFactory factory = new ConnectionFactory();
     
   public static void createCidadao(Cidadao cidadao){
       String sql = "insert into cidadao(id_pessoa, saldo_pontuacao) valeus (?,?)";
       try(Connection conn = factory.obterConexao()){
           PreparedStatement ps = conn.prepareStatement(sql);
           ps.setInt(1,cidadao.getIdPessoa());
           ps.setDouble(2,cidadao.getSaldoPontuacao());
           ps.execute();
           JOptionPane.showMessageDialog(null,"Dados inserido com sucesso");
          
           
       }
           
         catch(Exception e){
                   e.printStackTrace();
                   JOptionPane.showMessageDialog(null, "Ocorreu um erro de conexão");             
                   }
                   
   }   
               
    
   public Cidadao readCidadao(int id){
       String sql = "select * from cidadao where id = ?";
        try(Connection conn = factory.obterConexao()){
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()){
            int idPessoa = rs.getInt("id_pessoa");
            double saldoPontuacao = rs.getDouble("saldo_pontuacao");
            Cidadao cidadao = new Cidadao();
            cidadao.setId(id);cidadao.setIdPessoa(idPessoa);cidadao.setSaldoPontuacao(saldoPontuacao);
            return cidadao;
            
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
   
       public static void updateCidadao(Cidadao cidadao){
       String sql = "update cidadao set id_pessoa = ?, saldo_pontuacao = ?, where id = ?";
       try (Connection conn = factory.obterConexao()){
               PreparedStatement ps = conn.prepareStatement(sql);
               ps.setInt(1,cidadao.getIdPessoa());
               ps.setDouble(2,cidadao.getSaldoPontuacao());
               ps.execute();
               JOptionPane.showMessageDialog(null,"Dados atualizado com sucesso");
               
           
       }
     
           catch (Exception e){
             JOptionPane.showMessageDialog(null, "Ocorreu um erro de conexão"); 
             e.printStackTrace();
          
           }
   }
           
    public static void deleteCidadao(int id){        
        String sql = "delete* from cidadao where id = ?";
        try(Connection conn = factory.obterConexao()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,id);
            ps.execute();
               JOptionPane.showMessageDialog(null,"Dados deletado com sucesso");
             
    }
    catch (Exception e){
    e.printStackTrace();
    JOptionPane.showMessageDialog(null,"Ocorreu um erro de conexão");
    
    }
    }     
        
        
}



     
    
        
        
        
   
   
    
   


