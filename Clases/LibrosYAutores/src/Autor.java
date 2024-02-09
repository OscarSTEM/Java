import java.util.ArrayList;
public class Autor {
   
    private String nombre;
    private String nacionalidad;
    private int anioNacimiento;
    private int anioMuerte;

    private ArrayList<Libro> librosEscritos;
    
    private  static int maxLetras = 5;



    public Autor(String nombre, ArrayList<Libro> librosEscritos){
        this.nombre= nombre;
        this.nacionalidad = "";
        this.anioNacimiento = 0;
        this.anioMuerte = 0;
        this.librosEscritos = (ArrayList)librosEscritos.clone();
    }
    public Autor(String nombre, String nacionalidad, int anioNacimiento, 
    int anioMuerte, ArrayList<Libro> librosEscritos){
        this.nombre= nombre;
        this.nacionalidad = nacionalidad;
        this.anioNacimiento = anioNacimiento;
        this.anioMuerte = anioMuerte;
        this.librosEscritos = (ArrayList)librosEscritos.clone();
    }
    public Autor(Autor a){
        this.nombre= a.nombre;
        this.nacionalidad = a.nacionalidad;
        this.anioNacimiento = a.anioNacimiento;
        this.anioMuerte = a.anioMuerte;
        this.librosEscritos = (ArrayList)a.librosEscritos.clone();
    }

    public Autor(String nombre, String nacionalidad, int anioNacimiento, int anioMuerte, 
    Libro libro){
        this.nombre= nombre;
        this.nacionalidad = nacionalidad;
        this.anioNacimiento = anioNacimiento;
        this.anioMuerte = anioMuerte;
        this.librosEscritos.add(libro);
    }
    public String getNombre(){
        return this.nombre;
        // if(nombre.length() > this.maxLetras){
        //     String[] nombrePorPalabras = nombre.split(" ");
        //     for(int i = 0; i < nombrePorPalabras.length; i++){
        //         this.nombre += nombrePorPalabras[i].charAt(0) + ".";
        //     }
        // }
    }
    public String getNacionalidad(){
        return this.nacionalidad;
    }
    public int getAnioNacimiento(){
        return this.anioNacimiento;
    }
    public int getAnioMuerte(){
        return this.anioMuerte;
    }
    public ArrayList<Libro> getLibrosEscritos(){
        return this.librosEscritos;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }
    public void setAnioNacimiento(int anioNacimiento){
        this.anioNacimiento = anioNacimiento;
    }
    public void setAnioMuerte(int anioMuerte){
        this.anioMuerte = anioMuerte;
    }
    public void setLibrosEscritos(ArrayList<Libro> librosEscritos){
        this.librosEscritos=(ArrayList)librosEscritos.clone();
    }
    public String toString(){
        String salida = "El autor " + this.nacionalidad + " " + this.nombre + ", nacido en ";
         if(this.anioMuerte !=0) salida += " (" + this.anioNacimiento + "-" + this.anioMuerte + ")";
         else salida += ", nacido en " + this.anioMuerte;
        
        salida += ", ha escrito los siguientes libros : ";
        for(int i = 0 ; i < librosEscritos.size(); i++){
            salida += librosEscritos.get(i).getTitulo() + " ";
        }
        return salida;
    }
   
    public static void main(String[] args) {
        Libro libro1 = new Libro("El señor de los anillos: La comunidad del anillo","123456789");
        Libro libro2 = new Libro("Harry Potter la piedra filosofal","J.K.Rowling","123456788", 600, 0);
        ArrayList<Libro> listaLibros = new ArrayList<Libro>();
        listaLibros.add(libro1);
        listaLibros.add(libro2);

        Autor autor1 = new Autor("Gabriel Garcia Marquez", listaLibros);
        System.out.println(autor1);
    }
}
