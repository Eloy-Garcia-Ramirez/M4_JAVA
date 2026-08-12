package S03Act2;

public class Main {


    public static void main(String[] args) {


        // Objetos
        Estudiante p1 = new Estudiante("Carlos", "Derecho", 8);
        Estudiante p2 = new Estudiante("Patricia", "Medicina", (int) 9.9);
        Estudiante p3 = new Estudiante("Brenda","Trabajo Social", (int) 6.9);


        // Resultados
        p1.presentarse();
        p1.evaluarRendimiento();
        p2.presentarse();
        p2.evaluarRendimiento();
        p3.presentarse();
        p3.evaluarRendimiento();
    }
}
