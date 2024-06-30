package trabajos;
import java.util.Scanner;
// Obligatorio.  dados 3 numeros digitables decir cual es el mayor.
//TRABAJO 3
public class NumeroMayor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el primer número:");
        int numero1 = scanner.nextInt();
        System.out.println("Introduce el segundo número:");
        int numero2 = scanner.nextInt();
        System.out.println("Introduce el tercer número:");
        int numero3 = scanner.nextInt();
        int mayor = numero1;
        if (numero2 > mayor) {
            mayor = numero2;
        }
        if (numero3 > mayor) {
            mayor = numero3;
        }
        System.out.println("El mayor de los tres números es: " + mayor);
        scanner.close();
    }
}