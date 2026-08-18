package S06Act;

public class Gerente extends Empleado {

    // Declaración de atributos
    private double bonoProductividad;

    // Constructor propio
    public Gerente(String nombre, int numeroEmpleado, double salarioBase, double bonoProductividad) {
        
        // Constructor de la clase padre
        super(nombre, numeroEmpleado, salarioBase);

        // Inicialización del atributo propio
        this.bonoProductividad = bonoProductividad;
    }

    // Método propio
    public void asignarNuevoBono(double monto) {
        this.bonoProductividad = monto;

        System.out.println("Nuevo bono de productividad asignado: $" + bonoProductividad);
    }
}