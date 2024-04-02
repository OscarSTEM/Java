

import java.time.LocalDateTime;

public class Pajaro extends Mascota {
    public Pajaro(){

    }
    public Pajaro(String nombre, LocalDateTime fechaNacimiento, String microchip, String nombreDuenio){
        super(nombre,fechaNacimiento,microchip,nombreDuenio); // Llama al constructor  con parámetros del padre.
    }
    @Override
    public String onomatopeyar(){
        return "Hace: Pio! Pio!";
    }
    public String volar(){
        return "Volando...";
    }
    @Override
    public String toString() {
        return "El pajaro: " + super.toString();
    }
    public static void main(String[] args) {
        
    }
}
