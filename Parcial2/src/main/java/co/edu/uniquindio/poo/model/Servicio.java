package co.edu.uniquindio.poo.model;

public abstract class Servicio {

    private String codigo;
    private String nombre;
    private String descripcion;
    private float tarifa;
    private TipoServicio tipoServicio;

    public Servicio (String codigo, String nombre, String descripcion, float tarifa, TipoServicio tipoServicio){

        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tarifa = tarifa;
        this.tipoServicio = tipoServicio;
    }

}
