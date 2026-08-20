package S08.Act1;

public class Main {

    public static void main(String[] args) {

        System.out.println("==============================");
        System.out.println("      CATÁLOGO DE STREAMING");
        System.out.println("==============================");

        Contenido pelicula = new Pelicula(
                "The Matrix",
                136,
                "Larry y Andy Wachowski"
        );

        Contenido serie = new Serie(
                "Better Call Saul",
                50,
                6
        );

        System.out.println("\n--- PELÍCULA ---");
        pelicula.mostrarInfo();

        System.out.println("\n--- SERIE ---");
        serie.mostrarInfo();
    }
}