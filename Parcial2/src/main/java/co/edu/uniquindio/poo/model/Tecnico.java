package co.edu.uniquindio.poo.model;

public class Tecnico {

    private String codigo;
    private String nombre;
    private String documento;
    private Especialidad especialidad;
    private EstadoLaboral estadoLaboral;

    public Tecnico (String codigo, String nombre, String documento, Especialidad especialidad, EstadoLaboral estadoLaboral){

        this.codigo = codigo;
        this.nombre = nombre;
        this.documento = documento;

        this.especialidad = especialidad;
        this.estadoLaboral = estadoLaboral;
    }

    public String getCodigo(){
        return codigo;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getDocumento(){
        return documento;
    }

    public void setDocumento(String documento){
        this.documento = documento;
    }

    public Especialidad getEspecialidad(){
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad){
        this.especialidad = especialidad;
    }

    public EstadoLaboral getEstadoLaboral(){
        return estadoLaboral;
    }

    public void setEstadoLaboral(EstadoLaboral estadoLaboral){
        this.estadoLaboral = estadoLaboral;
    }

    public boolean estadoActivo(){
        return this.estadoLaboral == EstadoLaboral.ACTIVO;
    }
}
