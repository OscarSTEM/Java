
import java.time.LocalDateTime;

public class Mascota<DateTime>{
    private String nombre;
    private LocalDateTime fechaNacimiento;
    private String microchip;
    // private Persona duenio;
    private String nombreDuenio;
    //Constructor por defecto
    public Mascota(){
        this.nombre = "Scar";
        this.fechaNacimiento = LocalDateTime.now();
        this.microchip ="111111111111111";
        this.nombreDuenio= "Jose Alberto";

    }
    // public Mascota(String nombre, LocalDateTime fechaNacimiento, String microchip, String nombreDuenio){
    //     this.nombre = "Scar"; // Establecemos el nombre por defecto y llamamos al set para cambiarlo
    //     //si es posible
    //     setNombre(nombre);
    //     this.fechaNacimiento = LocalDateTime.now();
    //     setFechaNacimiento(fechaNacimiento);
    //     this.microchip ="111111111111111";
    //     setMicrochip(microchip);
    //     this.nombreDuenio= "Jose Alberto";
    //     setNombreDuenio(nombreDuenio);
    // }
    public Mascota(String nombre, LocalDateTime fechaNacimiento, String microchip, String nombreDuenio){
        Mascota nuevaMascota = new Mascota();
        nuevaMascota.setNombre(nombre);
        nuevaMascota.setFechaNacimiento(fechaNacimiento);
        nuevaMascota.setMicrochip(microchip);
        nuevaMascota.setNombreDuenio(nombreDuenio);
    }
    //Get
    public String getNombre() {
        return this.nombre;
    }
    public LocalDateTime getFechaNacimiento() {
        return this.fechaNacimiento;
    }
    public String getMicrochip() {
        return this.microchip;
    }
    public String getNombreDuenio() {
        return this.nombreDuenio;
    }
    //Set
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setMicrochip(String microchip) {
        this.microchip = microchip;
    }
    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }
    public String toString() {
        return this.nombre + " " + this.fechaNacimiento + ".";
    }
    public static void main(String[] args) {
        System.out.println("Hola, soy una mascota");
        Mascota mascotaPorDefecto = new Mascota();
        System.out.println(mascotaPorDefecto);
        LocalDateTime fecha = LocalDateTime.now();
        Mascota mascotaPorParametros = new Mascota("mascota", fecha, "5", "JB");

    }
}