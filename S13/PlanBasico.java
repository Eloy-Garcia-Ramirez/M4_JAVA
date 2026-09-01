package S13;

public class PlanBasico extends Suscripcion {

    // Constructor
    public PlanBasico(String nombre, int meses) {
        super(nombre, meses);
    }

    // Sobreescritura del método abstracto
    @Override
    public double calcularTotal() {
        return meses * 400.0;
    }
}