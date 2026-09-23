package co.edu.uniquindio.poo;

public class Estudiante {

    String nombre;
    String apellidos;
    String id;
    String correo_electronico;
    String telefono;
    byte edad;

public Estudiante (String nombre, String apellidos, String id, String correo_electronico, String telefono, byte edad){

    this.nombre = nombre;
    this.apellidos = apellidos;
    this.id = id;
    this.correo_electronico = correo_electronico;
    this.telefono = telefono;
    this.edad = edad;

}

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getCorreo_electronico(){
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico){
        this.correo_electronico = correo_electronico;
    }

    public String getTelefono(){
        return telefono;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public byte getEdad(){
        return edad;
    }

    public void setEdad(byte edad){
        this.edad = edad;
    }




}



