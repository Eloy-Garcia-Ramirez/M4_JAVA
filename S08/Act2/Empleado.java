package S08.Act2;

public class Empleado {
    String nombre;
    double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    double calcularPago() {
        return salarioBase;
    }
}