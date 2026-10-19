package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Escritorio extends EquipoTecnologico {

    private String procesador;
    private String memoriaRam;
    private String capacidadAlmacenamiento;
    private boolean graficaDedicada;

    public Escritorio (String codigo, String numSerie, String marca, String modelo, LocalDate añoFabricacion, String estado, TipoEquipo tipoEquipo, String procesador, String memoriaRam, String capacidadAlmacenamiento, boolean graficaDedicada){

        super(codigo,numSerie, marca, modelo, añoFabricacion, estado, tipoEquipo);

        this.procesador = procesador;
        this.memoriaRam = memoriaRam;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.graficaDedicada = graficaDedicada;
    }

    public String getProcesador(){
        return procesador;
    }

    public void setProcesador(String procesador){
        this.procesador = procesador;
    }

    public String getMemoriaRam(){
        return memoriaRam;
    }

    public void setMemoriaRam(String memoriaRam){
        this.memoriaRam = memoriaRam;
    }

    public String getCapacidadAlmacenamiento(){
        return capacidadAlmacenamiento;
    }

    public void setCapacidadAlmacenamiento(String capacidadAlmacenamiento){
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
    }

    public boolean getGraficaDedicada(){
        return graficaDedicada;
    }

    public void setGraficaDedicada(boolean graficaDedicada){
        this.graficaDedicada = graficaDedicada;
    }




}
