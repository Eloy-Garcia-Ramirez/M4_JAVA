package S13;

public class PlanPremium extends Suscripcion {

    // Atributo propio
    private double cargoSpa;

    // Constructor
    public PlanPremium(String nombre, int meses, double cargoSpa) {
        super(nombre, meses);
        this.cargoSpa = cargoSpa;
    }

    // Sobreescritura del método abstracto
    @Override
    public double calcularTotal() {
        return (meses * 600.0) + cargoSpa;
    }
}