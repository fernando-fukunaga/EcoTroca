package br.com.ecosolucoes.ecotroca.models;

public class MaterialDescarte {
   private int id;
   private int idDescarte;
   private int idMaterial;
   private double pesoDescartado;
   private double pontosGerados;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdDescarte() {
        return idDescarte;
    }

    public void setIdDescarte(int idDescarte) {
        this.idDescarte = idDescarte;
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

    public double getPontosGerados() {
        return pontosGerados;
    }

    public void setPontosGerados(double pontosGerados) {
        this.pontosGerados = pontosGerados;
    }
   
   
}
