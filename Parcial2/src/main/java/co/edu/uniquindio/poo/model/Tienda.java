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

    public void agregarDetalle(String codigoOrden, DetalleServicio nuevoDetalle){
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

    public void asignarTecnico(String codigoOrden, String codigoDetalle, String codigoTecnico) {
        if (codigoOrden != null && codigoDetalle != null && codigoTecnico != null) {
            OrdenServicio orden = null;
            for (OrdenServicio o : this.listaOrdenes) {
                if (o.getCodigo().equals(codigoOrden)) {
                    orden = o;
                }
            }
            Tecnico tecnico = null;
            for (Tecnico t : this.listaTecnicos) {
                if (t.getCodigo().equals(codigoTecnico)) {
                    tecnico = t;
                }
            }
            if (orden != null && tecnico != null) {
                if (tecnico.estadoActivo()) {
                    DetalleServicio detalle = orden.buscarDetalle(codigoDetalle);
                    if (detalle != null) {
                        detalle.asignarTecnico(tecnico);
                    }
                }
            }
        }
    }

    public void registrarRepuestosUtilizados(String codigoOrden, String codigoDetalle, String codigoRepuesto, byte cantidadAUsar) {
        if (codigoOrden != null && codigoDetalle != null && codigoRepuesto != null && cantidadAUsar > 0) {
            OrdenServicio orden = null;
            for (OrdenServicio o : this.listaOrdenes) {
                if (o.getCodigo().equals(codigoOrden)) {
                    orden = o;
                }
            }
            Repuesto repuesto = null;
            for (Repuesto r : this.listaRepuestos) {
                if (r.getCodigo().equals(codigoRepuesto)) {
                    repuesto = r;
                }
            }
            if (orden != null && repuesto != null) {
                DetalleServicio detalle = orden.buscarDetalle(codigoDetalle);
                if (detalle != null) {
                    if (repuesto.getCantidadDisponible() >= cantidadAUsar) {
                        repuesto.descontar(cantidadAUsar);
                        RepuestoUsado nuevoRU = new RepuestoUsado(repuesto, cantidadAUsar);
                        detalle.agregarRepuesto(nuevoRU);
                    }
                }
            }
        }
    }

    public void actualizarEstadoDetalle(String codigoOrden, String codigoDetalle, String nuevoEstado) {
        if (codigoOrden != null && codigoDetalle != null && nuevoEstado != null) {
            OrdenServicio orden = null;
            for (OrdenServicio o : this.listaOrdenes) {
                if (o.getCodigo().equals(codigoOrden)) {
                    orden = o;
                }
            }
            if (orden != null) {
                DetalleServicio detalle = orden.buscarDetalle(codigoDetalle);
                if (detalle != null) {
                    detalle.actualizarEstado(nuevoEstado);
                }
            }
        }
    }

    public Cliente buscarCliente(String documento) {
        for (Cliente c : this.listaClientes) {
            if (c.getDocumento().equals(documento)) {
                return c;
            }
        }
        return null;
    }

    public Tecnico buscarTecnico(String codigo) {
        for (Tecnico t : this.listaTecnicos) {
            if (t.getCodigo().equals(codigo)) {
                return t;
            }
        }
        return null;
    }

    public Repuesto buscarRepuesto(String codigo) {
        for (Repuesto r : this.listaRepuestos) {
            if (r.getCodigo().equals(codigo)) {
                return r;
            }
        }
        return null;
    }

    public OrdenServicio buscarOrden(String codigo) {
        for (OrdenServicio o : this.listaOrdenes) {
            if (o.getCodigo().equals(codigo)) {
                return o;
            }
        }
        return null;
    }

    

}
