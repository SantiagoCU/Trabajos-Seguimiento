package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrdenServicio extends Servicio {

    private LocalDate fechaCreacion;
    private String observaciones;
    private EstadoOrden estado;

    private List<Cliente> listaClientes = new ArrayList<>();

    public OrdenServicio (String codigo, String nombre, String descripcion, float tarifa, TipoServicio tipoServicio, LocalDate fechaCreacion, String observaciones, EstadoOrden estado){

        super(codigo, nombre, descripcion, tarifa, tipoServicio);

        this.fechaCreacion = fechaCreacion;
        this.observaciones = observaciones;
        this.estado = estado;

        this.listaClientes = new ArrayList<>();
    }

    public LocalDate getFechaCreacion(){
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion){
        this.fechaCreacion = fechaCreacion;
    }

    public String getObservaciones(){
        return observaciones;
    }

    public void setObservaciones(String observaciones){
        this.observaciones = observaciones;
    }

    public EstadoOrden getEstado(){
        return estado;
    }

    public void setEstado(EstadoOrden estado){
        this.estado = estado;
    }

    public List<Cliente> getListaClientes(){
        return listaClientes;
    }
}
