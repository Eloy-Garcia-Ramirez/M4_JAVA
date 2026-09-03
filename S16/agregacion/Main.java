package S16.agregacion;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=".repeat(50));

        System.out.println("REGISTRO DEL JUGADOR");

        System.out.println("=".repeat(50));

        System.out.println("Ingrese el nombre del jugador:");

        String nombre = scanner.nextLine();

        System.out.println("Ingrese la posición del jugador:");

        String posicion = scanner.nextLine();

        // Primero creamos al jugador

        Jugador jugador = new Jugador(nombre, posicion);

        System.out.println("Ingrese el nombre del club:");

        String nombreClub = scanner.nextLine();

        // Agregamos el jugador ya existente al club

        Club club = new Club(nombreClub, jugador);

        System.out.println("=".repeat(50));

        System.out.println("INFORMACIÓN DEL CLUB");

        System.out.println("=".repeat(50));

        club.mostrarInformacion();

        scanner.close();

    }

}