package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public abstract class EquipoTecnologico {

    private String codigo;
    private String numSerie;
    private String marca;
    private String modelo;
    private LocalDate añoFabricacion;
    private String estado;
    private TipoEquipo tipoEquipo;

    public EquipoTecnologico (String codigo, String numSerie, String marca, String modelo, LocalDate añoFabricacion, String estado, TipoEquipo tipoEquipo){

        this.codigo = codigo;
        this.numSerie = numSerie;
        this.marca = marca;
        this.modelo = modelo;
        this.añoFabricacion = añoFabricacion;
        this.estado = estado;
        this. tipoEquipo = tipoEquipo;
    }

    public String getCodigo(){
        return codigo;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String getNumSerie(){
        return numSerie;
    }

    public void setNumSerie(String numSerie){
        this.numSerie = numSerie;
    }

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public LocalDate getAñoFabricacion(){
        return añoFabricacion;
    }

    public void setAñoFabricacion(LocalDate añoFabricacion){
        this.añoFabricacion = añoFabricacion;
    }

    public String getEstado(){
        return estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public TipoEquipo getTipoEquipo(){
        return tipoEquipo;
    }

    public void setTipoEquipo(TipoEquipo tipoEquipo){
        this.tipoEquipo = tipoEquipo;
    }

}
