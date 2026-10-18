package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Portatil extends EquipoTecnologico {

    private String tamañoPantalla;
    private String memoriaRam;
    private String capacidadAlmacenamiento;
    private boolean bateriaExtraible;

    public Portatil (String codigo, String numSerie, String marca, String modelo, LocalDate añoFabricacion, String estado, TipoEquipo tipoEquipo, String tamañoPantalla, String memoriaRam, String capacidadAlmacenamiento, boolean bateriaExtraible){

        super(codigo,numSerie, marca, modelo, añoFabricacion, estado, tipoEquipo);

        this.tamañoPantalla = tamañoPantalla;
        this.memoriaRam = memoriaRam;
        this.capacidadAlmacenamiento = capacidadAlmacenamiento;
        this.bateriaExtraible = bateriaExtraible;
    }
}
