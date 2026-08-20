package S08.Act2;

public class Vendedor extends Empleado {
    double comision;

    public Vendedor(String nombre, double salarioBase, double comision) {
        super(nombre, salarioBase);
        this.comision = comision;
    }

    @Override
    double calcularPago() {
        return salarioBase + comision;
    }
}