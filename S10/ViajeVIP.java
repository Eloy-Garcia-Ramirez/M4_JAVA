package S10;

public class ViajeVIP extends Viaje {

    // Constructor
    public ViajeVIP(double distancia) {
        super(distancia);
    }

    // Uso del método abstracto
    @Override
    public double calcularTarifa() {

        // Tarifa: $25 por kilómetro + $50 de cuota base
        return (distancia * 25) + 50;
    }
}