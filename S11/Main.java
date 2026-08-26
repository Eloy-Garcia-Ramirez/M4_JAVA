package S11;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=".repeat(80));
        System.out.println("ESTACIÓN DE CARGA INTELIGENTE");
        System.out.println("=".repeat(80));

        // Datos del teléfono
        System.out.println("Ingrese la marca de su teléfono:");
        String marca = scanner.nextLine();

        // Datos del auto
        System.out.println("Ingrese el modelo de su auto eléctrico:");
        String modelo = scanner.nextLine();

        // Crear objetos
        TelefonoMovil telefono = new TelefonoMovil(marca);
        AutoElectrico auto = new AutoElectrico(modelo);

        System.out.println("=".repeat(80));
        System.out.println("INICIANDO CARGA :bulb:");
        System.out.println("=".repeat(80));

        // Iniciar carga del teléfono
        telefono.iniciarCarga();
        System.out.println("");
        // Iniciar carga del auto
        auto.iniciarCarga();

        scanner.close();
    }
}