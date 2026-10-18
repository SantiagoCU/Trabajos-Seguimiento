package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class DetalleServicio extends Servicio{

    private TipoEquipo equipo;
    private String servicio;
    private String descripcionFalla;
    private byte horasTrabajo;
    private String estado;

    private List<Tecnico> listaTecnicos = new ArrayList<>();

    public DetalleServicio (String codigo, String nombre, String descripcion, float tarifa, TipoServicio tipoServicio,TipoEquipo equipo, String servicio, String descripcionFalla, byte horasTrabajo, String estado){

        super(codigo, nombre, descripcion, tarifa, tipoServicio);

        this.equipo = equipo;
        this.servicio = servicio;
        this.descripcionFalla = descripcionFalla;
        this.horasTrabajo = horasTrabajo;
        this.estado = estado;

        this.listaTecnicos = new ArrayList<>();
    }

}
