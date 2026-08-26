package S11;

public class AutoElectrico implements Recargable {

    private String modelo;

    // Constructor
    public AutoElectrico(String modelo) {
        this.modelo = modelo;
    }

    // Uso del método de la interfaz
    @Override
    public void iniciarCarga() {
        System.out.println("El auto " + modelo + " está iniciando su carga mediante un cable de alta tensión. -------[]=");
    }
}