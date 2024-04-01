import java.time.LocalDateTime;

public class Mascota {
    private String nombre;
    private LocalDateTime fechaNacimiento; // Con ella podemos calcular la edad.
    private String microchip;
    //private Persona duenio;  
    private String nombreDuenio; // Porque todavía no hemos creado la clase Persona :(
    
    public Mascota(){
        this.nombre = "";
        this.fechaNacimiento = LocalDateTime.now();
        this.microchip = "000000000000000";
        this.nombreDuenio = "";
    }
    /*public Mascota(String nombre, LocalDateTime fechaNacimiento, String microchip, String nombreDuenio){
        this.nombre = ""; //Establecemos el valor por defecto y luego llamamos al set para cambiarlo si es posible.
        setNombre(nombre);
        this.fechaNacimiento = LocalDateTime.now();
        setFechaNacimiento(fechaNacimiento);
        this.microchip = "000000000000000";
        setMicrochip(microchip);
        this.nombreDuenio = "";
        setNombreDuenio(nombreDuenio);
    }*/
    /*
     * En este constructor con parámetros, en vez de inicializar los datos uno a uno,
     * llamamos al constructor por defecto con this() para que lo inicialice por
     * nosotros.
     * Objtivo: No repetir código.
     */
    public Mascota(String nombre, LocalDateTime fechaNacimiento, String microchip, String nombreDuenio){
        this(); // Está llamando al construcotor Mascota();
        setNombre(nombre);
        setFechaNacimiento(fechaNacimiento);
        setMicrochip(microchip);
        setNombreDuenio(nombreDuenio);
    }
    /*
     * En este constructor de copia, en vez de asignar los datos uno a uno,
     * llamamos al constructor por parametros con this(...) para que lo 
     * asigne por nosotros.
     * Objtivo: No repetir código.
     */
    public Mascota(Mascota m){
        this(m.nombre,m.fechaNacimiento,m.microchip,m.nombreDuenio);
        /*setNombre(m.nombre);
        setFechaNacimiento(m.fechaNacimiento);
        setMicrochip(m.microchip);
        setNombreDuenio(m.nombreDuenio);*/
    }

    // Gets
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
    // Sets
    public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setMicrochip(String microchip) {
        this.microchip = microchip;
    }
    public void setNombreDuenio(String nombreDuenio) {
        this.nombreDuenio = nombreDuenio;
    }
    //Metodos
    public String comer(){
        return "Comiendo...";
    }
    public String caca(){
        return "Haciendo caca...";
    }
    public String evacuar(){
        return "Evacuando...";
    }
    public String dormir(){
        return "Durmiendo...";
    }
    public String jugar(){
        return "Jugando...";
    }
    public String onomatopeyar(){
        return "*ruido de animales*";
    }

    public String toString() {
        return "Se llama " + this.nombre + ", nació el " + this.fechaNacimiento + " y su dueño/a es " + this.nombreDuenio + ".";
    }
    
    public static void main(String[] args){
        System.out.println("Hola, soy una mascota!");
        Mascota mascotaPorDefecto = new Mascota();
        System.out.println(mascotaPorDefecto);

        LocalDateTime fecha = LocalDateTime.now();
        Mascota mascotaParametros = new Mascota("mascota", fecha, "5", "dueño");
        System.out.println(mascotaParametros);

        mascotaParametros.setNombreDuenio("otroDuenio");
        Mascota mascotaPorCopia = new Mascota(mascotaParametros);
        System.out.println(mascotaPorCopia);

        System.out.println(mascotaPorDefecto.dormir());
        System.out.println(mascotaPorDefecto.evacuar());
    }
}