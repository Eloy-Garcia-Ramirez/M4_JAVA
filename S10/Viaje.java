package S10;

public abstract class Viaje {

    // Atributo
    protected double distancia;

    // Constructor
    public Viaje(double distancia) {
        this.distancia = distancia;
    }

    // Método abstracto
    public abstract double calcularTarifa();
}