package trabajos;
//Van a crear un objeto de tipo vehiculo y va a tener 4 atributos
// y un constructor que me cree el objeto
// con los valores de los atributos
public class Vehiculo {
    // Atributos de la clase Vehiculo
    private String marca;
    private String modelo;
    private int año;
    private String color;

    // Constructor que inicializa los atributos
    public Vehiculo(String marca, String modelo, int año, String color) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
    }

    // Método principal para probar la clase Vehiculo
    public static void main(String[] args) {
        // Crear un objeto de tipo Vehiculo
        Vehiculo miVehiculo = new Vehiculo("Toyota", "Corolla", 2020, "Rojo");

        // Mostrar la información del vehículo
        System.out.println("Marca: " + miVehiculo.marca);
        System.out.println("Modelo: " + miVehiculo.modelo);
        System.out.println("Año: " + miVehiculo.año);
        System.out.println("Color: " + miVehiculo.color);
    }
}