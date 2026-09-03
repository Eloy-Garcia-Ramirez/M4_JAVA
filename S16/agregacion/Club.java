package S16.agregacion;

public class Club {

    // Atributos

    private String nombreClub;

    private Jugador jugador;

    // Constructor

    public Club(String nombreClub, Jugador jugador) {

        this.nombreClub = nombreClub;

        this.jugador = jugador;

    }

    // Método

    public void mostrarInformacion() {

        System.out.println("Club: " + nombreClub);

        System.out.println("Jugador estrella: " + jugador.getNombre());

        System.out.println("Posición: " + jugador.getPosicion());

    }

}