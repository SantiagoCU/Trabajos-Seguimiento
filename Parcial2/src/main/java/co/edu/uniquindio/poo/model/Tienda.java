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



    public void registrarCliente(Cliente cliente){
        if(cliente != null){

            boolean encontrado = false;

            for(Cliente c : this.listaClientes){
                if(c.getDocumento().equals(cliente.getDocumento())){
                    encontrado = true;
                }
            }

            if(encontrado == false){
                this.listaClientes.add(cliente);
            }
        }
    }

    public void registrarEquipo(String documentoCliente, EquipoTecnologico nuevoEquipo) {
        if (nuevoEquipo != null && documentoCliente != null) {

            Cliente clienteDestino = null;
            for (Cliente c : this.listaClientes) {
                if (c.getDocumento().equals(documentoCliente)) {
                    clienteDestino = c;
                }
            }

            if (clienteDestino != null) {
                boolean equipoExiste = false;

                for (EquipoTecnologico e : clienteDestino.getListaEquipos()) {
                    if (e.getCodigo().equals(nuevoEquipo.getCodigo())) {
                        equipoExiste = true;
                    }
                }

                if (equipoExiste == false) {
                    clienteDestino.agregarEquipo(nuevoEquipo);
                }
            }
        }
    }

    public void registrarTecnico(Tecnico nuevoTecnico) {
        if (nuevoTecnico != null) {
            boolean tecnicoExiste = false;

            for (Tecnico t : this.listaTecnicos) {
                if (t.getCodigo().equals(nuevoTecnico.getCodigo())) {
                    tecnicoExiste = true;
                }
            }

            if (tecnicoExiste == false) {
                this.listaTecnicos.add(nuevoTecnico);
            }
        }
    }

    public void registrarRepuesto(Repuesto nuevoRepuesto) {
        if (nuevoRepuesto != null) {
            boolean repuestoExiste = false;

            for (Repuesto r : this.listaRepuestos) {
                if (r.getCodigo().equals(nuevoRepuesto.getCodigo())) {
                    repuestoExiste = true;
                }
            }

            if (repuestoExiste == false) {
                this.listaRepuestos.add(nuevoRepuesto);
            }
        }
    }

    public void crearOrden(String documentoCliente, OrdenServicio nuevaOrden) {
        if (nuevaOrden != null && documentoCliente != null) {

            Cliente clienteExiste = null;
            for (Cliente c : this.listaClientes) {
                if (c.getDocumento().equals(documentoCliente)) {
                    clienteExiste = c;
                }
            }

            if (clienteExiste != null) {
                boolean ordenExiste = false;
                for (OrdenServicio o : this.listaOrdenes) {
                    if (o.getCodigo().equals(nuevaOrden.getCodigo())) {
                        ordenExiste = true; // Ya hay una orden con ese código
                    }
                }

                if (ordenExiste == false) {
                    this.listaOrdenes.add(nuevaOrden);
                }
            }
        }
    }

    public void agregarDetalleA (String codigoOrden, DetalleServicio nuevoDetalle){
        if (codigoOrden != null && nuevoDetalle != null) {

            OrdenServicio ordenDestino = null;
            for (OrdenServicio o : this.listaOrdenes) {
                if (o.getCodigo().equals(codigoOrden)) {
                    ordenDestino = o;
                }
            }

            if (ordenDestino != null) {
                ordenDestino.agregarDetalle(nuevoDetalle);
            }
        }
    }








}
