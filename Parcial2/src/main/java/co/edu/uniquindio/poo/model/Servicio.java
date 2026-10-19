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

    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public float getTarifa(){
        return tarifa;
    }

    public void setTarifa(float tarifa){
        this.tarifa = tarifa;
    }

    public TipoServicio getTipoServicio(){
        return tipoServicio;
    }

    public void setTipoServicio(TipoServicio tipoServicio){
        this.tipoServicio = tipoServicio;
    }

}
