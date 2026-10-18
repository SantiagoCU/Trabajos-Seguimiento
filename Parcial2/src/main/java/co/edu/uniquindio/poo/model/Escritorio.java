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
}
