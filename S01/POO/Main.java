package S01.POO;

public class Main {
    public static void main(String[] args) {
        Triangulo fig1 = new Triangulo(10, 6);
        Triangulo fig2 = new Triangulo(15, 5);
        Triangulo fig3 = new Triangulo(18, 9);


        System.out.println("El área del triangulo es: " + fig1.calcularArea());
        System.out.println("El área del triangulo es: " + fig2.calcularArea());
        System.out.println("El área del triangulo es: " + fig3.calcularArea());
    }
}
