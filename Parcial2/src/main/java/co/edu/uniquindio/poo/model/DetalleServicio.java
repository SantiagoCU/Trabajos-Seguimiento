package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class DetalleServicio extends Servicio{

    private TipoEquipo equipo;
    private String servicio;
    private byte horasTrabajo;
    private String estado;

    private List<Tecnico> listaTecnicos = new ArrayList<>();
    private List<Repuesto> listaRepuestos = new ArrayList<>();

    public DetalleServicio (String codigo, String nombre, String descripcion, float tarifa, TipoServicio tipoServicio,TipoEquipo equipo, String servicio,  byte horasTrabajo, String estado){

        super(codigo, nombre, descripcion, tarifa, tipoServicio);

        this.equipo = equipo;
        this.servicio = servicio;
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

    public void asignarTecnico(Tecnico tecnico){
        if(tecnico != null &&  tecnico.getEstadoLaboral() == EstadoLaboral.ACTIVO){

            this.listaTecnicos.add(tecnico);
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
                for (Repuesto repuesto : this.listaRepuestos) {
                    total += repuesto.getPrecioUnitario();
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
