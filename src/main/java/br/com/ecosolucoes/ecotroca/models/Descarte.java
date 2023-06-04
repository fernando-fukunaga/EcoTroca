package br.com.ecosolucoes.ecotroca.models;
import java.sql.Date;
import java.time.LocalDate;


public class Descarte {
    
    private int id;
    private int idCidadao;
    private int idUsuario;
    private LocalDate dataHoraDescarte;
    private double pesoTotalDescarte;
    private double totalPontosGerados;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCidadao() {
        return idCidadao;
    }

    public void setIdCidadao(int idCidadao) {
        this.idCidadao = idCidadao;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public LocalDate getDataHoraDescarte() {
        return dataHoraDescarte;
    }

    public void setDataHoraDescarte(LocalDate dataHoraDescarte) {
        this.dataHoraDescarte = dataHoraDescarte;
    }

    public double getPesoTotalDescarte() {
        return pesoTotalDescarte;
    }

    public void setPesoTotalDescarte(double pesoTotalDescarte) {
        this.pesoTotalDescarte = pesoTotalDescarte;
    }

    public double getTotalPontosGerados() {
        return totalPontosGerados;
    }

    public void setTotalPontosGerados(double totalPontosGerados) {
        this.totalPontosGerados = totalPontosGerados;
    }

    public void setDataHoraDescarte(Date dataHoraDescarte) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
    
}
