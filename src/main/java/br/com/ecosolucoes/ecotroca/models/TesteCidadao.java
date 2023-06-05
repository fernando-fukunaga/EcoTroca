package br.com.ecosolucoes.ecotroca.models;

import br.com.ecosolucoes.ecotroca.models.dao.CidadaoDAO;


public class TesteCidadao {
    public static void main (String[] args){
        Cidadao cidadao = new Cidadao();
        cidadao.setIdPessoa(2);
        cidadao.setSaldoPontuacao(25.00);
        CidadaoDAO.createCidadao(cidadao);
        
    }
    
}
