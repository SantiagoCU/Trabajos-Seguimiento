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
    private List<Repuesto> listaRepuestos = new ArrayList<>();

    public DetalleServicio (String codigo, String nombre, String descripcion, float tarifa, TipoServicio tipoServicio,TipoEquipo equipo, String servicio, String descripcionFalla, byte horasTrabajo, String estado){

        super(codigo, nombre, descripcion, tarifa, tipoServicio);

        this.equipo = equipo;
        this.servicio = servicio;
        this.descripcionFalla = descripcionFalla;
        this.horasTrabajo = horasTrabajo;
        this.estado = estado;

        this.listaTecnicos = new ArrayList<>();
        this.listaRepuestos = new ArrayList<>();
    }

    public TipoEquipo getEquipo(){
        return equipo;
    }

    public void setEquipo(TipoEquipo equipo){
        this.equipo = equipo;
    }

    public String getServicio(){
        return servicio;
    }

    public void setServicio(String servicio){
        this.servicio = servicio;
    }

    public String getDescripcionFalla(){
        return descripcionFalla;
    }

    public void setDescripcionFalla(String descripcionFalla){
        this.descripcionFalla = descripcionFalla;
    }

    public byte getHorasTrabajo(){
        return horasTrabajo;
    }

    public void setHorasTrabajo(byte horasTrabajo){
        this.horasTrabajo = horasTrabajo;
    }

    public String getEstado(){
        return estado;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public List<Tecnico> getListaTecnicos(){
        return listaTecnicos;
    }

    public List<Repuesto> getListaRepuestos(){
        return listaRepuestos;
    }


    public void agregarRepuesto(Repuesto repuesto){
        if(repuesto != null){
            this.listaRepuestos.add(repuesto);
        }
    }

}
