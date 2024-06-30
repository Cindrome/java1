package trabajos;

import java.util.Scanner;

//Ejercicio 3: Conversor de Temperatura
//Escribe un programa que convierta la temperatura de grados Celsius a Fahrenheit y viceversa.
// Pide al usuario que ingrese la temperatura y la unidad (Celsius o Fahrenheit).
public class temperatura {
    private static double Fra , Celsuis;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la temperatura en Grados Celsius");

        double temperatura= scanner.nextDouble();

        Fra = (temperatura * 9/5) + 32 ;

        System.out.println( "La temperatra es: " + Fra + " en Grados Fahrenheit " ) ;
        Celsuis = (Fra - 32) * 5/9;
        System.out.println( "La temperatra es: " + Celsuis + " en Grados Celsius " ) ;

    }
}