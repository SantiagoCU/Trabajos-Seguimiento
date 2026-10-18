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
}
