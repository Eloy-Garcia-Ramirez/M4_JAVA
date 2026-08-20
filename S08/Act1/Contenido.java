package S08.Act1;

public class Contenido {

    // Atributos
    protected String titulo;
    protected int duracion;

    // Constructor
    public Contenido(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
    }

    // Método de la clase padre
    void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Duración: " + duracion + " minutos");
    }
}