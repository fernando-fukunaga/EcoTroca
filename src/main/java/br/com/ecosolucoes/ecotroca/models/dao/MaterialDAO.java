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
import javax.swing.JOptionPane;

/**
 *
 * @author ferna
 */
public class MaterialDAO {
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
    
}
