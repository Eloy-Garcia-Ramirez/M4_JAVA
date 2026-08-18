package S06Act;

public class Empleado {

    // Declaración de atributos
    protected String nombre;
    protected int numeroEmpleado;
    protected double salarioBase;

    // Constructor
    public Empleado(String nombre, int numeroEmpleado, double salarioBase) {
        this.nombre = nombre;
        this.numeroEmpleado = numeroEmpleado;
        this.salarioBase = salarioBase;
    }

    // Método
    public String obtenerIdentificacion() {
        return "Nombre: " + nombre + "\nNúmero de empleado: " + numeroEmpleado;
    }
}