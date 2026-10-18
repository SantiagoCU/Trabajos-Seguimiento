package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private String documento;
    private String nombre;
    private String telefono;
    private String correo;

    private List<EquipoTecnologico> listaEquipos = new ArrayList<>();

    public Cliente(String documento, String nombre, String telefono, String correo){

        this.documento = documento;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;

        this.listaEquipos = new ArrayList<>();
    }

}
