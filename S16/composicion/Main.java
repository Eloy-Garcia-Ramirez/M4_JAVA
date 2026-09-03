package S16.composicion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=".repeat(50));
        System.out.println("REGISTRO DE CASA");
        System.out.println("=".repeat(50));

        System.out.println("Ingrese la dirección de la casa:");
        String direccion = scanner.nextLine();

        System.out.println("Ingrese el nombre de la habitación:");
        String nombreHabitacion = scanner.nextLine();

        System.out.println("Ingrese los metros cuadrados de la habitación:");
        double metrosCuadrados = scanner.nextDouble();

        // Crear la casa
        Casa casa = new Casa(direccion, nombreHabitacion, metrosCuadrados);

        System.out.println("=".repeat(50));
        System.out.println("INFORMACIÓN DE LA CASA");
        System.out.println("=".repeat(50));

        casa.mostrarInformacion();

        scanner.close();
    }
}