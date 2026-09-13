package co.edu.uniquindio.poo;



public class Main {
    static void main() {


        Gato g1 = new Gato("Isis", "Criollo", "Gris", "Hembra");
        Gato g2 = new Gato("Niña", "Criollo", "Blanco y Negro", "Hembra");
        Gato g3 = new Gato("Luther", "Siamés", "Crema", "Macho");

        System.out.println("Gato 1: " +  "Nombre: " + g1.getNombre() + ", Raza: " + g1.getRaza() + ", Color: " + g1.getColor() + ", Género: " + g1.getGenero());
        System.out.println("Gato 2: " +  "Nombre: " + g2.getNombre() + ", Raza: " + g2.getRaza() + ", Color: " + g2.getColor() + ", Género: " + g2.getGenero());
        System.out.println("Gato 3: " +  "Nombre: " + g3.getNombre() + ", Raza: " + g3.getRaza() + ", Color: " + g3.getColor() + ", Género: " + g3.getGenero());

    }
}
