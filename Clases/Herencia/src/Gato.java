import java.time.LocalDateTime;

public class Gato extends Mascota {
    public Gato(){
        super();
    }
     public Gato(String nombre, LocalDateTime fechaNacimiento, String microchip, String nombreDuenio){
        super(nombre, fechaNacimiento, microchip, nombreDuenio);
    }
    
    public String onomatopeyar(){
        return super.onomatopeyar() + " Miau,Miau";
    }
}
