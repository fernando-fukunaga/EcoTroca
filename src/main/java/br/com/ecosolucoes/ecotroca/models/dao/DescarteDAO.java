package br.com.ecosolucoes.ecotroca.models.dao;

import br.com.ecosolucoes.ecotroca.models.Descarte;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class DescarteDAO {
    static ConnectionFactory factory = new ConnectionFactory();    
    
    public static void createDescarte(Descarte descarte) {
        String sql = "insert into descarte (id_cidadao; id_usuario; peso_total_descarte; total_pontos_gerados)"
                + "valeus (?,?,?,?,)";
        try (Connection conn = factory.obterConexao()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1,descarte.getIdCidadao());
            ps.setInt(2,descarte.getIdUsuario());
            ps.setDouble(3,descarte.getPesoTotalDescarte());
            ps.setDouble(4,descarte.getTotalPontosGerados());
            ps.execute();
            JOptionPane.showMessageDialog(null,"Dados inserido com sucesso");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro de conexão"); 
            e.printStackTrace();
            
                   
                    }
            
                      
        }

    public Descarte readDescarte(int id){
        String sql = "select * from descarte where id = ?";
        try(Connection conn = factory.obterConexao()){
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()){
            int idCidadao = rs.getInt("id_cidadao");
            int idUsuario = rs.getInt("id_usuario");
            double pesoTotalDescarte = rs.getDouble("peso_total_descarte");
            double totalPontosGerados = rs.getDouble("total_pontos_gerados");
            Descarte descarte = new Descarte();
            descarte.setId(id);descarte.setIdCidadao(idCidadao);descarte.setIdUsuario(idUsuario);
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
    
}

            





        
    
    
   
                
    

