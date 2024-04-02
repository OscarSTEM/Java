

import java.time.LocalDateTime;

public class Perro extends Mascota{

    private String raza;

    public Perro(){
        super(); // Llama al constructor por defecto del padre.
        this.raza = "Chucho";
    }
    public Perro(String nombre, LocalDateTime fechaNacimiento, String microchip, String nombreDuenio){
        super(nombre,fechaNacimiento,microchip,nombreDuenio); // Llama al constructor  con parámetros del padre.
        this.raza = "Chucho";
    }
    public Perro(String nombre, LocalDateTime fechaNacimiento, String microchip, String nombreDuenio, String raza){
        super(nombre,fechaNacimiento,microchip,nombreDuenio); // Llama al constructor  con parámetros del padre.
        this.raza = raza;
    }

    @Override
    public String onomatopeyar(){
        //No podemos llamar al onomatopeyar de la clase padre porque 
        //ya no esta implementado al haberla convertido en una clase abstracta
        return  "Hace: Guau! Guau!";
    }
    public String pasear(){
        return "Paseando...";
    }

    @Override
    public String toString() {
        return "El " + this.raza + ": " + super.toString();
    }

    public static void main(String[] args){
        LocalDateTime fecha = LocalDateTime.now().minusYears(8);
        Perro miPerro = new Perro("Lata",fecha,"-----","Juana","Cucho");
        System.out.println(miPerro);
        System.out.println(miPerro.dormir());
        System.out.println(miPerro.onomatopeyar());
        System.out.println(miPerro.pasear());


        // Mascota miMascota = new Mascota();
        // System.out.println(miMascota.onomatopeyar());
        //System.out.println(miMascota.pasear());



    }
}
