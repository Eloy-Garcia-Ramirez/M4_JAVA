package S06Act;

public class Main {
    public static void main(String[] args) {

        System.out.println("=============================================");

        // Crear objeto Gerente
        Gerente miGerente = new Gerente(
                "Carlos Machique",
                101,
                25000,
                5000
        );

        // Crear objeto Vendedor
        Vendedor miVendedor = new Vendedor(
                "Eloy Garcia",
                102,
                12000,
                10
        );

        // Obtener identificación del Gerente
        System.out.println("\n--- INFORMACION DEL GERENTE ---");
        System.out.println(miGerente.obtenerIdentificacion());

        // Utilizar método propio del Gerente
        miGerente.asignarNuevoBono(6000);

        System.out.println("=============================================");

        // Obtener identificación del Vendedor
        System.out.println("\n--- INFORMACION DEL VENDEDOR ---");
        System.out.println(miVendedor.obtenerIdentificacion());

        // Utilizar método propio del Vendedor
        miVendedor.registrarVentaExitosa();
        miVendedor.registrarVentaExitosa();

        System.out.println("=============================================");
    }
}