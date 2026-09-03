package S16.composicion;

public class Habitacion {

    // Atributos
    private String nombreHabitacion;
    private double metrosCuadrados;

    // Constructor
    public Habitacion(String nombreHabitacion, double metrosCuadrados) {
        this.nombreHabitacion = nombreHabitacion;
        this.metrosCuadrados = metrosCuadrados;
    }

    // Getters
    public String getNombreHabitacion() {
        return nombreHabitacion;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }
}