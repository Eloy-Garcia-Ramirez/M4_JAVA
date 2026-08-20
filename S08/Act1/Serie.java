package S08.Act1;

public class Serie extends Contenido {

    // Atributo propio de Serie
    private int temporadas;

    // Constructor
    public Serie(String titulo, int duracion, int temporadas) {
        super(titulo, duracion);
        this.temporadas = temporadas;
    }

    // Sobreescritura del método
    @Override
    void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Duración: " + duracion + " minutos");
        System.out.println("Temporadas: " + temporadas);
    }
}