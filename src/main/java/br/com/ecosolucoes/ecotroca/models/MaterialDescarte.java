package br.com.ecosolucoes.ecotroca.models;

public class MaterialDescarte {
   private int id;
   private int idMaterial;
   private double pesoDescartado;
   private int pontosGerados;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        this.idMaterial = idMaterial;
    }

    public double getPesoDescartado() {
        return pesoDescartado;
    }

    public void setPesoDescartado(double pesoDescartado) {
        this.pesoDescartado = pesoDescartado;
    }

    public int getPontosGerados() {
        return pontosGerados;
    }

    public void setPontosGerados(int pontosGerados) {
        this.pontosGerados = pontosGerados;
    }
   
   
}
