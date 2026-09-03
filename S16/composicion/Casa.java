package S16.composicion;

public class Casa {

    // Atributos
    private String direccion;
    private Habitacion habitacion;

    // Constructor
    public Casa(String direccion, String nombreHabitacion, double metrosCuadrados) {
        this.direccion = direccion;

        // La habitación se crea dentro de la Casa
        this.habitacion = new Habitacion(nombreHabitacion, metrosCuadrados);
    }

    // Método
    public void mostrarInformacion() {
        System.out.println("Dirección: " + direccion);
        System.out.println("Habitación: " + habitacion.getNombreHabitacion());
        System.out.println("Metros cuadrados: " + habitacion.getMetrosCuadrados() + " m2");
    }
}