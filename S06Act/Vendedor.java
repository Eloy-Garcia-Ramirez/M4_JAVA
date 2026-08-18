package S06Act;

public class Vendedor extends Empleado {

    // Declaración de atributos propios
    private double porcentajeComision;
    private int ventasExitosas;

    // Constructor propio
    public Vendedor(String nombre, int numeroEmpleado, double salarioBase, double porcentajeComision) {
        
        // Constructor de la clase padre
        super(nombre, numeroEmpleado, salarioBase);

        // Inicialización de los atributos propios
        this.porcentajeComision = porcentajeComision;
        this.ventasExitosas = 0;
    }

    // Método propio
    public void registrarVentaExitosa() {
        ventasExitosas++;

        System.out.println("Venta exitosa registrada.");
        System.out.println("Total de ventas exitosas: " + ventasExitosas);
    }
}