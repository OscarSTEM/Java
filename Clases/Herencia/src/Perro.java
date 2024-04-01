import java.time.LocalDateTime;

public class Perro extends Mascota {
    // No hace falta hacer un constructor en perro porque no tiene 
    //  nuevos atributos, basta con el de mascota
    private String raza;

    public Perro(){
        super(); // llama al constructor de padre
        this.raza = "Chucho";
    }
    public Perro(String nombre, LocalDateTime fechaNacimiento, String microchip, String nombreDuenio, String raza){
        super(nombre, fechaNacimiento, microchip, nombreDuenio);
        this.raza = raza;
    }
    public Perro(String nombre, LocalDateTime fechaNacimiento, String microchip, String nombreDuenio){
        super(nombre, fechaNacimiento, microchip, nombreDuenio);
    }
    @Override
    public String onomatopeyar(){
        return super.onomatopeyar() + " Guau,guau";
    }
    public String pasear(){
        return "Paseando...";
    }
    @Override
    public String toString() {
        return "El " + this.raza + ": " + super.toString(); //el super llama al string de mascota
    }
    public static void main(String[] args) {
        LocalDateTime fecha = LocalDateTime.now().minusYears(8);
        Perro miPerro = new Perro("Lata",fecha,"-----","Juana","Chucho");
        System.out.println(miPerro);
        System.out.println(miPerro.pasear());

        //Polimorfismo
        System.out.println(miPerro.onomatopeyar());
        Mascota miMascota = new Mascota();
        System.out.println(miMascota.onomatopeyar());
        
    }
}
