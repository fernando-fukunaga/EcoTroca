/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ecosolucoes.ecotroca.models.dao;

import br.com.ecosolucoes.ecotroca.models.Cidadao;
import br.com.ecosolucoes.ecotroca.models.Material;
import br.com.ecosolucoes.ecotroca.models.MaterialDescarte;
import static br.com.ecosolucoes.ecotroca.models.dao.CidadaoDAO.factory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author ferna
 */
public class MaterialDescarteDAO {
       public static void createMaterialDescarte(MaterialDescarte materialDescarte){
       String sql = "insert into material_descarte(id_descarte,id_material,peso_descartado,pontos_gerados) values" +
"(?,?,?,?);";
       try(Connection conn = factory.obterConexao()){
           PreparedStatement ps = conn.prepareStatement(sql);
           ps.setInt(1,materialDescarte.getIdDescarte());
           ps.setInt(2,materialDescarte.getIdMaterial());
           ps.setDouble(3,materialDescarte.getPesoDescartado());
           Material material = MaterialDAO.readMaterial(materialDescarte.getIdMaterial());
           double pontosGerados = materialDescarte.getPesoDescartado() / 0.100 * material.getPontuacaoMaterial();
           ps.setDouble(4,pontosGerados);
           ps.execute();
           JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso");
          
           
       }
           
         catch(Exception e){
                   e.printStackTrace();
                   JOptionPane.showMessageDialog(null, "Ocorreu um erro de conexão");             
                   }
                   
   }
       
       public static double calculaPesoTotalDescarte(int id){
       String sql = "select peso_descartado from material_descarte where id_descarte = ?";
       try(Connection conn = factory.obterConexao()){
           PreparedStatement ps = conn.prepareStatement(sql);
           ps.setInt(1,id);
           double pesoTotal = 0;
           ResultSet rs = ps.executeQuery();
           while (rs.next())  {
               double peso = rs.getDouble("peso_descartado");
               pesoTotal += peso;
           }
           return pesoTotal;
          
           
       }
           
         catch(Exception e){
                   e.printStackTrace();
                   JOptionPane.showMessageDialog(null, "Ocorreu um erro de conexão");             
                   }
          return 0;         
   }

       public static double calculaTotalPontosDescarte(int id){
       String sql = "select pontos_gerados from material_descarte where id_descarte = ?";
       try(Connection conn = factory.obterConexao()){
           PreparedStatement ps = conn.prepareStatement(sql);
           ps.setInt(1,id);
           double totalPontos = 0;
           ResultSet rs = ps.executeQuery();
           while (rs.next())  {
               double pontos = rs.getDouble("pontos_gerados");
               totalPontos += pontos;
           }
           return totalPontos;
          
           
       }
           
         catch(Exception e){
                   e.printStackTrace();
                   JOptionPane.showMessageDialog(null, "Ocorreu um erro de conexão");             
                   }
          return 0;         
   }        
}
