package trabajos;

import java.util.Scanner;
// Opcional hacer un algoritmo que detecte en que mes estamos segun un numero del 1 al 12
// TRABAJO 3
public class Meses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Un numero del mes desde 1 hasta 12");
        int numeroMes= scanner.nextInt();
        //int numeroMes = 5; // Cambia este valor para probar con otros números
        String mes = detectarMes(numeroMes);
        System.out.println("El mes correspondiente al número " + numeroMes + " es: " + mes);
    }

    public static String detectarMes(int numero) {
        String mes;
        switch (numero) {
            case 1:
                mes = "Enero";
                break;
            case 2:
                mes = "Febrero";
                break;
            case 3:
                mes = "Marzo";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Mayo";
                break;
            case 6:
                mes = "Junio";
                break;
            case 7:
                mes = "Julio";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Septiembre";
                break;
            case 10:
                mes = "Octubre";
                break;
            case 11:
                mes = "Noviembre";
                break;
            case 12:
                mes = "Diciembre";
                break;
            default:
                mes = "Número de mes inválido";
        }
        return mes;
    }
}