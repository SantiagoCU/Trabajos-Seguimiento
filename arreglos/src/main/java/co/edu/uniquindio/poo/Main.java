package co.edu.uniquindio.poo;

public class Main {
    static void main() {

        //1. crear un arreglo y inicializarlo
        //2. realizar un método que sume todos los numero del arreglo y retornar la suma

        //3. realizar un método que diga si existe un número dado en el arreglo

        int[] arr = new int[]{6, 2, 1, 6, 8, 9, 12, 45, 7, 4};
        int [][] matriz =  {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

         imprimirMatriz(matriz);

         int met1 = sumarNumerosMatriz(matriz);
         int met2 = sumarDiagonal(matriz);
        System.out.println("\nLa suma de todos los elementos de la matriz es: " + met1);
        System.out.println("\nLa suma de todos los elementos de la diagonal es: " + met2);
        System.out.println("\n");

        dibujarX(matriz);







         /*int num = 7;
        boolean met2 = verificarNumero(arr, num);
        int met = sumarNumeros(arr);
        boolean met3 = verificarNumeroRepetido(arr);
        System.out.println("La suma de todos los números del arreglo es: " + met);
        System.out.println("El estado del numero si esta o no en el arreglo es: " + met2);
        System.out.println("El estado del número repetido es: " + met3);*/



    }

    public static void imprimirMatriz (int [][] matriz){

        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++ ){

                 System.out.print(matriz[i][j] + "");

            }
            System.out.println();

        }
    }

    public static int sumarNumerosMatriz (int[][] matriz){
        int sum = 0;

        for(int i=0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++ ){

                 sum = sum + matriz[i][j];

            }

        }
        return sum;
    }

    public static int sumarDiagonal(int[][] matriz) {
        int sum = 0;

        for (int i = 0; i < matriz.length; i++) {


                if (i < matriz[i].length) {
                    sum = sum + matriz[i][i];
                }

        }
        return sum;
    }

    public static void dibujarX(int [][] matriz) {



        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                if (i == j || j == matriz.length - 1 - i) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }

                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }

    /* public static int sumarNumeros (int[] arr){
        int sum = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] >= 0){

                sum = sum + arr[i];
            }
        }
        return sum;
    }

    public static boolean verificarNumero (int []arr, int num){

        boolean bandera = false;


        for(int i = 0; i<arr.length;i++){
            if(arr[i] == num){
                bandera = true;
            }
        }
        return bandera;
    }



    public static boolean verificarNumeroRepetido(int [] arr){
        boolean repetir = false;

    for(int i = 0; i<arr.length; i++ ){
        int numero1 = arr[i];
        for(int j = i + 1; j<arr.length; j++){
            int numero2 = arr[j];
             if(numero1 == numero2){
                repetir = true;

            }
        }
    }

        return repetir;
    }*/



}
