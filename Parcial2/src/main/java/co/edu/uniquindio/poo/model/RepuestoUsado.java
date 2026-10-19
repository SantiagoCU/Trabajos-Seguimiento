package co.edu.uniquindio.poo.model;

public class RepuestoUsado {

    private Repuesto repuesto;
    private byte cantidadUsada;

    public RepuestoUsado (Repuesto repuesto, byte cantidadUsada){

        this.repuesto = repuesto;
        this.cantidadUsada = cantidadUsada;
    }

    public Repuesto getRepuesto(){
        return repuesto;
    }

    public void setRepuesto(Repuesto repuesto){
        this.repuesto = repuesto;
    }

    public byte getCantidadUsada(){
        return cantidadUsada;
    }

    public void setCantidadUsada(byte cantidadUsada){
        this.cantidadUsada = cantidadUsada;
    }

    public float calcularSubTotal(){
        return this.cantidadUsada * this.repuesto.getPrecioUnitario();
    }
}
