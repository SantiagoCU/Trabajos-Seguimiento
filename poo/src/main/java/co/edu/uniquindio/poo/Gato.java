package co.edu.uniquindio.poo;

public class Gato {

     private String nombre;
     private String raza;
     private String color;
     private String genero;


public Gato(String nombre, String raza, String color, String genero){

    this.nombre = nombre;
    this.raza = raza;
    this.color = color;
    this.genero = genero;

}

public String getNombre(){
    return nombre;
}

public String getRaza(){
    return raza;
}

public String getColor(){
    return color;
}

public String getGenero(){
    return genero;
}



public void setNombre(String nombre){
    this.nombre = nombre;
}

public void setRaza(String raza){
        this.raza = raza;
}

public void setColor(String color){
        this.color = color;
}

public void setGenero(String genero){
        this.genero = genero;
}




}
