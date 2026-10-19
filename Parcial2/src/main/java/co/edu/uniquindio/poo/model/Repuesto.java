package co.edu.uniquindio.poo.model;

public class Repuesto {

    private String codigo;
    private String nombre;
    private String descripcion;
    private float precioUnitario;
    private int cantidadDisponible;
    private TipoEquipo categoriaCompatible;

    public Repuesto (String codigo, String nombre, String descripcion, float precioUnitario, int cantidadDisponible ,TipoEquipo categoriaCompatible){

        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.categoriaCompatible = categoriaCompatible;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getCodigo(){
        return codigo;
    }

    public void setCodigo(String repuesto){
        this.codigo = repuesto;
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

    public int getCantidadDisponible(){
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible){
        this.cantidadDisponible = cantidadDisponible;
    }

    public boolean disponibilidadCritica(){
        return this.cantidadDisponible < 5;
    }

    public void descontar(int cantidad){
        if(this.cantidadDisponible >= cantidad){
            this.cantidadDisponible = this.cantidadDisponible - cantidad;
        }
    }
}
