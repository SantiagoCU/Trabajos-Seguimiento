package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Escritorio extends EquipoTecnologico {

    private String sistemaOperativo;
    private String bateria;
    private String capacidadAlmacenamiento;
    private boolean compatible;

    public Escritorio (String codigo, String numSerie, String marca, String modelo, LocalDate añoFabricacion, String estado, TipoEquipo tipoEquipo, String sistemaOperativo, String bateria, String capacidadAlmacenamiento, boolean compatible){

        super(codigo,numSerie, marca, modelo, añoFabricacion, estado, tipoEquipo);

        this.sistemaOperativo = sistemaOperativo;
        this.bateria = bateria;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.compatible = compatible;
    }

    public String getSistemaOperativo(){
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo){
        this.sistemaOperativo = sistemaOperativo;
    }

    public String getBateria(){
        return bateria;
    }

    public void setBateria(String bateria){
        this.bateria = bateria;
    }

    public String getCapacidadAlmacenamiento(){
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(String capacidadAlmacenamiento){
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public boolean getCompatible(){
        return compatible;
    }

    public void setCompatible(boolean compatible){
        this.compatible = compatible;
    }



}
