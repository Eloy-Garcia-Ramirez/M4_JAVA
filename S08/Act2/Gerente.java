package S08.Act2;

public class Gerente extends Empleado {
    double bono;

    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    @Override
    double calcularPago() {
        return salarioBase + bono;
    }
}