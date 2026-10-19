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

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public List<OrdenServicio> getListaOrdenes() {
        return listaOrdenes;
    }

    public List<Tecnico> getListaTecnicos() {
        return listaTecnicos;
    }

    public List<Repuesto> getListaRepuestos() {
        return listaRepuestos;
    }
}
