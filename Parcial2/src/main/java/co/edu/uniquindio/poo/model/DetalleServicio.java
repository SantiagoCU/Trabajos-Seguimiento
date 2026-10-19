package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class DetalleServicio extends Servicio{

    private TipoEquipo equipo;
    private String servicio;
    private byte horasTrabajo;
    private String estado;
    private Tecnico tecnico;

    private List<RepuestoUsado> listaRepuestos = new ArrayList<>();

    public DetalleServicio (String codigo, String nombre, String descripcion, float tarifa, TipoServicio tipoServicio,TipoEquipo equipo, String servicio,  byte horasTrabajo, String estado, Tecnico tecnico){

        super(codigo, nombre, descripcion, tarifa, tipoServicio);

        this.equipo = equipo;
        this.servicio = servicio;
        this.horasTrabajo = horasTrabajo;
        this.estado = estado;
        this.tecnico = tecnico;


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

    public Tecnico getTecnico(){
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico){
        this.tecnico = tecnico;
    }

    public List<RepuestoUsado> getListaRepuestos(){
        return listaRepuestos;
    }


    public void agregarRepuesto(RepuestoUsado repuesto){
        if(repuesto != null){
            this.listaRepuestos.add(repuesto);
        }
    }

    public void asignarTecnico(Tecnico tecnico){
        if(tecnico != null &&  tecnico.getEstadoLaboral() == EstadoLaboral.ACTIVO){

            this.setTecnico(tecnico);
        }
    }

    @Override
    public double calcularCosto(){
        double total= 0;

        if(this.getTipoServicio() == TipoServicio.DIAGNOSTICO){
            return 35000;
        }

        if(this.getTipoServicio() == TipoServicio.MANTENIMIENTO_PREVENTIVO){
           if(this.equipo == TipoEquipo.PORTATIL){
               return 60000;
           } else  if (this.equipo == TipoEquipo.COMPUTADOR_ESCRITORIO){
               return 70000;
           } else if  (this.equipo == TipoEquipo.TELEFONO){
               return 40000;
           }
        }

        if(this.getTipoServicio() == TipoServicio.REPARACION_CORRECTIVA) {
            total += this.horasTrabajo * 45000;


            if (this.listaRepuestos != null) {
                for (RepuestoUsado repuesto : this.listaRepuestos) {
                    total += repuesto.calcularSubTotal();
                }
            }
            return total;
        }

        return total;
    }

    public void actualizarEstado(String estado){
        if(estado != null){
            this.estado = estado;

        }
    }

}
