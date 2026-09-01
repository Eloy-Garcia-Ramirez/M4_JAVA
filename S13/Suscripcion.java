package S13;

public abstract class Suscripcion {

    // Atributos
    protected String nombre;
    protected int meses;

    // Constructor
    public Suscripcion(String nombre, int meses) {
        this.nombre = nombre;
        this.meses = meses;
    }

    // Método abstracto
    public abstract double calcularTotal();
}