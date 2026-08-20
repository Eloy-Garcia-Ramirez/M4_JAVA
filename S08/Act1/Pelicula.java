package S08.Act1;

public class Pelicula extends Contenido {

    // Atributo propio de Pelicula
    private String director;

    // Constructor
    public Pelicula(String titulo, int duracion, String director) {
        super(titulo, duracion);
        this.director = director;
    }

    // Sobreescritura del método
    @Override
    void mostrarInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Duración: " + duracion + " minutos");
        System.out.println("Director: " + director);
    }
}