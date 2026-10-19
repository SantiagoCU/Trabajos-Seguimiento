package co.edu.uniquindio.poo.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrdenServicio extends Servicio {

    private LocalDate fechaCreacion;
    private String observaciones;
    private EstadoOrden estado;
    private Cliente cliente;


    private List<DetalleServicio> listaDetalles = new ArrayList<>();


    public OrdenServicio (String codigo, String nombre, String descripcion, float tarifa, TipoServicio tipoServicio, LocalDate fechaCreacion, String observaciones, EstadoOrden estado, Cliente cliente){

        super(codigo, nombre, descripcion, tarifa, tipoServicio);

        this.fechaCreacion = fechaCreacion;
        this.observaciones = observaciones;
        this.estado = estado;
        this.cliente = cliente;

        this.listaDetalles = new ArrayList<>();



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

    public Cliente getCliente(){
        return cliente;
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public List<DetalleServicio> getListaDetalles() {
        return listaDetalles;
    }



    public void agregarDetalle(DetalleServicio detalle){
        if(detalle != null){
            this.listaDetalles.add(detalle);
        }
    }

    public DetalleServicio buscarDetalle(String codigoDetalle){
        for(DetalleServicio detalle : listaDetalles){
            if(detalle.getCodigo().equals(codigoDetalle)){
                return detalle;
            }
        }
        return null;
    }

    public void cambiarEstado(EstadoOrden nuevoEstado){
        if(nuevoEstado != null){
            this.estado = nuevoEstado;
        }
    }

    @Override
    public double calcularCosto(){
        double total = 0;
        for(DetalleServicio detalle : listaDetalles){
            total += detalle.calcularCosto();
        }

        return total;
    }
}
