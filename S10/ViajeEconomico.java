package S10;

public class ViajeEconomico extends Viaje {

    // Constructor
    public ViajeEconomico(double distancia) {
        super(distancia);
    }

    // Uso del método abstracto
    @Override
    public double calcularTarifa() {

        // Tarifa: $15 por kilómetro
        return distancia * 15;
    }
}