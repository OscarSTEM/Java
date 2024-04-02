
import java.time.LocalDateTime;

public class Gato extends Mascota{

    
    public Gato(){
        super();
    }
    public Gato(String nombre, LocalDateTime fechaNacimiento, String microchip, String nombreDuenio){
        super(nombre,fechaNacimiento,microchip,nombreDuenio); // Llama al constructor  con parámetros del padre.
    }

    @Override
    public String onomatopeyar(){
        return "Hace: Miau! Miau!";
    }

    @Override
    public String toString() {
        return "El gato: " + super.toString();
    }

    public static void main(String[] args){
    
    }
}