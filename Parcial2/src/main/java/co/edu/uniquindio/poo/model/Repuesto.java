package co.edu.uniquindio.poo.model;

public class Repuesto {

    private String repuesto;
    private String nombre;
    private String descripcion;
    private float precioUnitario;

    private TipoEquipo categoriaCompatible;

    public Repuesto (String repuesto, String nombre, String descripcion, float precioUnitario, TipoEquipo categoriaCompatible){

        this.repuesto = repuesto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.categoriaCompatible = categoriaCompatible;
    }

    public String getRepuesto(){
        return repuesto;
    }

    public void setRepuesto(String repuesto){
        this.repuesto = repuesto;
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

    public float getPrecioUnitario(){
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario){
        this.precioUnitario = precioUnitario;
    }

    public TipoEquipo getCategoriaCompatible(){
        return categoriaCompatible;
    }

    public void setCategoriaCompatible(TipoEquipo categoriaCompatible){
        this.categoriaCompatible = categoriaCompatible;
    }
}
