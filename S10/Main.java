package S10;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=".repeat(80));
        System.out.println("COTIZACIÓN DE VIAJES");
        System.out.println("=".repeat(80));

        System.out.println("¿Cuántos kilómetros recorrerá el viaje?");
        double kilometros = scanner.nextDouble();

        ViajeEconomico economico = new ViajeEconomico(kilometros);
        ViajeVIP vip = new ViajeVIP(kilometros);

        System.out.println("=".repeat(80));
        System.out.println("COTIZACIÓN PARA " + kilometros + " KM");
        System.out.println("=".repeat(80));

        System.out.println("Viaje Económico: $" + economico.calcularTarifa());
        System.out.println("Viaje VIP: $" + vip.calcularTarifa());

        scanner.close();
    }
}