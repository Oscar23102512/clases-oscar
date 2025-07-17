import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Tema #1 varibles, tipos de datos,
        // Tema #2 datos de entrada y salida
        // Tema #3 artimetica,
        // Tema #4 simbolos condicionales,
        // Tema #5 condicionles(IF),
        // Tema #6 bucles (While, Do while, For, For Each),
        // Tema #7 vectores y matrices
        // Tema #8 menus (swhich)
        // Tema #9 funciones
        // Tema #10 clases

        //--------------Variables--------------------
        //----------Tipos de Datos------------------
        //---------Numeros enteros con Int----------
        int numeros = 15;
        int edad = 25;
        int peso = 85;

        //---------Texto con String-------------
        String nombre = "Mario Bros";
        String direccion = "av los aviones, calle los piratas";

        // --------Boolean-----------------
        boolean foco = true;//encendido
        foco = false; // apagado

        //---------decimales---------
        float precio = 21.50f;
        double altura = 183.23;

        // --------datos de entrada y salida------------
        System.out.println("Datos de entrada: "+numeros);
        Scanner leer = new Scanner(System.in);
        int dato;
        dato = leer.nextInt();
        System.out.println(dato);
        

        // datos de entrada 2 tipo int, string, 1 decimal, 1 boolean

        System.out.println("Oscar");
        System.out.println("Pablo");
    }
}