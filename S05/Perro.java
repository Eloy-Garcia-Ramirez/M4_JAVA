package S05;

public class Perro extends Animal {


    // Declaración de atributos propios
    private String raza;
   
    // Constructor de la clase Animal
    public Perro(String nombre, int edad, String raza) {
        // Llamado del constructor de la clase padre
        super(nombre, edad);
        this.raza = raza;
    }


   
    @Override
    void sonido(){
        System.out.println(nombre + " ladra: ¡Guau!");
    }




}
