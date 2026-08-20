package S08.Act2;

public class Main {
    public static void main(String[] args) {

        Gerente g = new Gerente("Carlos", 15000, 3000);
        Vendedor v = new Vendedor("Ana", 10000, 2500);

        System.out.println("=".repeat(50));
        System.out.println("Pago del Gerente: " + g.calcularPago());
        System.out.println("=".repeat(50));
        System.out.println("Pago del Vendedor: " + v.calcularPago());
        System.out.println("=".repeat(50));
    }
}