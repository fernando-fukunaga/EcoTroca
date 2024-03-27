/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ecosolucoes.ecotroca.models.dao;

import br.com.ecosolucoes.ecotroca.models.Cidadao;
import br.com.ecosolucoes.ecotroca.models.Material;
import static br.com.ecosolucoes.ecotroca.models.dao.CidadaoDAO.factory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ferna
 */
public class MaterialDAO {
    
    public static void createMaterial(Material material) {
        String sql = "insert into material(tipo_material,descricao_material,pontuacao_material_a_cada_cem_gramas) values(?,?,?)";
        try(Connection conn = factory.obterConexao()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,material.getTipoMaterial());
            ps.setString(2,material.getDescricaoMaterial());
            ps.setDouble(3,material.getPontuacaoMaterial());
            ps.execute();
            JOptionPane.showMessageDialog(null,"Material registrado com sucesso!");
        }
        catch (Exception e){
           JOptionPane.showMessageDialog(null, "Ocorreu um erro de conexão"); 
           e.printStackTrace();
        }    
    }
    
    public static void updateMaterial (Material material) {
        String sql = "UPDATE material SET tipo_material = ?, descricao_material = ?, pontuacao_material_a_cada_cem_gramas = ? WHERE id = ?";
        try(Connection conn = factory.obterConexao()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,material.getTipoMaterial());
            ps.setString(2,material.getDescricaoMaterial());
            ps.setDouble(3,material.getPontuacaoMaterial());
            ps.setInt(4, material.getId());
            ps.execute();
            JOptionPane.showMessageDialog(null,"Material atualizado com sucesso!");
        }
        catch (Exception e){
           JOptionPane.showMessageDialog(null, "Ocorreu um erro de conexão"); 
           e.printStackTrace();
        }    
    }
    
    public static void deleteMaterial (int id) {
        String sql = "delete from material where id = ?";
        try(Connection conn = factory.obterConexao()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
            JOptionPane.showMessageDialog(null,"Material excluído com sucesso!");
        }
        catch (Exception e){
           JOptionPane.showMessageDialog(null, "Ocorreu um erro de conexão"); 
           e.printStackTrace();
        }    
    }    
    
    public static Material readMaterial(int id){
       String sql = "select * from material where id = ?";
        try(Connection conn = factory.obterConexao()){
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()){
            String tipoMaterial = rs.getString("tipo_material");
            String descricaoMaterial = rs.getString("descricao_material");
            double pontuacaoMaterial = rs.getDouble("pontuacao_material_a_cada_cem_gramas");
            Material material = new Material();
            material.setId(id); material.setTipoMaterial(tipoMaterial); material.setDescricaoMaterial(descricaoMaterial);
            material.setPontuacaoMaterial(pontuacaoMaterial);
            return material;
            
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

   public static ArrayList listarMateriaisParaTabela(){
       String sql = "select * from material";
        try(Connection conn = factory.obterConexao()){
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ArrayList<Object[]> materiais = new ArrayList<>();
            while (rs.next()){
                int id = rs.getInt("id");
                String tipoMaterial = rs.getString("tipo_material");
                String descricaoMaterial = rs.getString("descricao_material");
                double pontuacaoMaterial = rs.getDouble("pontuacao_material_a_cada_cem_gramas");
                Object[] newRowData = {id,tipoMaterial,descricaoMaterial,pontuacaoMaterial};
                materiais.add(newRowData);               
            }
            return materiais;
        }
        
        

        catch (Exception e){
           JOptionPane.showMessageDialog(null, "Ocorreu um erro de conexão"); 
           e.printStackTrace();
        }
        return null;
        
        
        }   
    
}
