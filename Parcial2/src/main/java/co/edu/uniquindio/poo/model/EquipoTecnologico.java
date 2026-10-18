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

}
