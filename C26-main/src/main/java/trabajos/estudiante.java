package trabajos;
import java.util.Scanner;
//Crea una clase Estudiante con propiedades como nombre, edad, y calificaciones.
// Implementa métodos para calcular el promedio de calificaciones y mostrar la información
// del estudiante.

//TRABAJO 4
public class estudiante {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese su nombre");
            String nombre= scanner.next();
            System.out.println("Digite su edad");
            int edad = scanner.nextInt();
            System.out.println("Digite la primera nota");
            double nota1 = scanner.nextDouble();
            System.out.println("Digite la primera nota");
            double nota2 = scanner.nextDouble();
            System.out.println("Digite la primera nota");
            double nota3 = scanner.nextDouble();
            double promedio = (double) (nota1 + nota2 + nota3) / 3;
            System.out.println("su nombre es: " + nombre );
            System.out.println("Su edad es "+edad);
            System.out.println("Su nota final es "+promedio);
        }
    }


