package S13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=".repeat(50));
        System.out.println("GIMNASIO - CÁLCULO DE SUSCRIPCIÓN");
        System.out.println("=".repeat(50));

        System.out.println("Ingrese el nombre del socio:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la cantidad de meses a pagar:");
        int meses = scanner.nextInt();

        System.out.println("Seleccione el tipo de plan:");
        System.out.println("1. Plan Básico");
        System.out.println("2. Plan Premium");
        int opcion = scanner.nextInt();

        System.out.println("=".repeat(50));

        if (opcion == 1) {

            PlanBasico pb = new PlanBasico(nombre, meses);

            System.out.println("Socio: " + nombre);
            System.out.println("Plan: Básico");
            System.out.println("Total a pagar: $" + pb.calcularTotal());

        } else if (opcion == 2) {

            System.out.println("Ingrese el cargo extra por uso de Spa:");
            double spa = scanner.nextDouble();
            System.out.println("=".repeat(50));
            PlanPremium pp = new PlanPremium(nombre, meses, spa);

            System.out.println("Socio: " + nombre);
            System.out.println("Plan: Premium");
            System.out.println("Total a pagar: $" + pp.calcularTotal());
            System.out.println("=".repeat(50));
        } else {
            System.out.println("=".repeat(50));
            System.out.println("Opción no válida.");
            System.out.println("=".repeat(50));
        }

        scanner.close();
    }
}