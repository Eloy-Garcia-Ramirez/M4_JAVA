package S03Act2;

public class Estudiante {
   
     String nombre; 
     String carrera;
     int promedio;
     public Object evaluarRendimiento; 


    public Estudiante(String nombre,String carrera, int promedio) {
        this.nombre = nombre;
        this.carrera = carrera;
        this.promedio = promedio;
    }



    void presentarse() {
        System.out.println("Hola, soy " + nombre + " estudio " + carrera + " y mi promedio es " + promedio );
    }

    void evaluarRendimiento() {
        if (promedio < 7) {

            System.out.println("Necesita mejorar");
            
        }
        if (promedio > 8.9) {

            System.out.println("Excelente Rendimiento");
            
        } else {

            System.out.println("Buen Rendimiento");
            
        }
    }
}
