package S11;

public class TelefonoMovil implements Recargable {

    private String marca;

    // Constructor
    public TelefonoMovil(String marca) {
        this.marca = marca;
    }

    // Uso del método de la interfaz
    @Override
    public void iniciarCarga() {
        System.out.println("El teléfono " + marca + " está iniciando su carga mediante un cable USB.            [---]");
    }
}