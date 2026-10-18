package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private String nombre;

    private List<Tecnico> listaTecnicos = new ArrayList<>();
    private List<Cliente> listaClientes = new ArrayList<>();
    private List<Repuesto> listaRepuestos = new ArrayList<>();
    private List<OrdenServicio> listaOrdenes = new ArrayList<>();

    public Tienda (String nombre){

        this.nombre = nombre;

        this.listaTecnicos = new ArrayList<>();
        this.listaClientes = new ArrayList<>();
        this.listaRepuestos = new ArrayList<>();
        this.listaOrdenes = new ArrayList<>();

    }

}
