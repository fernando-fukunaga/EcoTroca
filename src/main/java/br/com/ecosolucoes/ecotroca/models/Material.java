package br.com.ecosolucoes.ecotroca.models;

public class Material {
    private int id;
    private String tipoMaterial;
    private double pontuacaoMaterial;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public double getPontuacaoMaterial() {
        return pontuacaoMaterial;
    }

    public void setPontuacaoMaterial(double pontuacaoMaterial) {
        this.pontuacaoMaterial = pontuacaoMaterial;
    }
    
}
