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

    public String getDocumento(){
        return documento;
    }

    public void setDocumento(String documento){
        this.documento = documento;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getCorreo(){
        return correo;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public List<EquipoTecnologico> getListaEquipos(){
        return listaEquipos;
    }

}
