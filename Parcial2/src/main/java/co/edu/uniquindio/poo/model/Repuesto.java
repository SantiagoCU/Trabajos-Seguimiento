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
}
