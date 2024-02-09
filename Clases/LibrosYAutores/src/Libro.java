import java.util.ArrayList;
public class Libro {
    //Atributo de instancia
    private String titulo;
    private String autor;
    private final String ISBN; // 978-84-19654-89-2 -> 13 numeros
    private int numPaginas;
    private int fechaPublicacion; // año
   
    //Esto es un atributo de la clase (en este caso de titulo)
    //Es propio de la clase y no de cada uno de los objetos que lo componen
    private  static int maxLetras = 15;


    /**
     * Constructor con parametros
     * Crea un libro con un titulo, autor, ISBN y un numero de paginas 
     * especificados
     * @param titulo El titulo del libro
     * @param ISBN El ISBN del libro
     */
    public Libro(String titulo, String ISBN){
       this.setTitulo(titulo);
        this.autor = ""; 
        this.ISBN = ISBN;
        this.numPaginas = 0;
    }
        /**
     * Constructor con parametros
     * Crea un libro con un titulo, autor, ISBN y un numero de paginas 
     * especificados
     * @param titulo El titulo del libro
     * @param ISBN El ISBN del libro
     * @param autor El autor del libro
     * @param numPaginas El numero de paginas
     */
    public Libro(String titulo,String autor, String ISBN, int numPaginas, int fechaPublicacion){
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.ISBN = ISBN;
        this.setNumPaginas(numPaginas);
        this.fechaPublicacion = fechaPublicacion; 
    }
    //1 GET
     /**
     * Obtener el titulo actual del libro.
     * @return El titulo del libro
     */
    public String getTitulo(){
        return this.titulo;
    }
    //1
     /**
     * Obtener el autor actual del libro.
     * @return El autor del libro
     */
    public String getAutor(){
        return this.autor;
    }

     /**
     * Obtener el ISBN actual del libro.
     * @return El ISBN del libro
     */
    public String getISBN(){
        return this.ISBN;
    }

     /**
     * Obtener el NumPaginas actual del libro.
     * @return El NumPaginas del libro
     */
    public int getNumPaginas(){
        return this.numPaginas;
    }
    public int getFechaPublicacion(){
        return this.fechaPublicacion;
    }
    /**
     * Establece el titulo del libro
     * @param titulo El nuevo titulo del libro
     */
    public void setTitulo(String titulo){
        this.titulo = titulo;
        if(titulo.length() > this.maxLetras) this.titulo=titulo.substring(0,this.maxLetras);
    }
    /* 
     * Nuestro SUBSTRING()
    */
    private static String nuestroSubString(String palabra, int inicio, int fin){
        String subPalabra = " ";
        for(int i = inicio ; i < fin && i < palabra.length() ; i++){
            subPalabra += palabra.charAt(i);
            System.out.println();
        }
        return subPalabra;
    }




    /* 
     * Nuestro SPLIT()
     * El since es para poner la fecha
     * @since 
    */
    private static void nuestroSplit(String frase, char separador){
        ArrayList<String> listaPalabras = new ArrayList<String>();
        String palabra = " ";
        for(int i = 0; i < frase.length() ; i ++){
            if(frase.charAt(i) != separador){
                palabra += frase.charAt(i);
            }else{
                listaPalabras.add(palabra);
                palabra = " ";
            }
           

        }
        if (!palabra.equals("")) listaPalabras.add(palabra);
        System.out.println(listaPalabras);
    }

    /**
     * Establece el Autor del libro
     * @param autor El nuevo Autor del libro
     */
    public void setAutor(String autor){
        this.autor = autor;
        if(autor.length() > this.maxLetras){
        String[] autorPorPalabras = autor.split(" ");
        for(int i = 0; i < autorPorPalabras.length; i++){
            this.autor += autorPorPalabras[i].charAt(0) + ".";
        }
        }
    }
     /**
     * Establece el NumPaginas del libro
     * @param numPaginas El nuevo NumPaginas del libro
     */
    public void setNumPaginas(int numPaginas){
        this.numPaginas = numPaginas;
        if (numPaginas <= 0) this.numPaginas = 1;
    }
    public void setFechaPublicacion(int fechaPublicacion){
        this.fechaPublicacion = fechaPublicacion;
    }
    

     /**
     * Devuelve la representacion en formato de cadena (String) del objeto lirbo
     * @return Una cadena que representa el objeto libro.
     */
    public String toString(){
        return "El libro es " + this.titulo + ", el autor del libro es: " + 
        this.autor + ", su ISB: " + this.ISBN + ". Tiene " + this.numPaginas + " paginas.";
    }
    public static void main(String[] args) {

        // if(valorISBN < 1000000)

        Libro libro1 = new Libro("El señor de los anillos: La comunidad del anillo","123456789");
        Libro libro2 = new Libro("Harry Potter la piedra filosofal","J.K.Rowling","123456788", 600, 0);
        
        System.out.println("El libro1 es: " + libro1);
        System.out.println("El libro2 es: " + libro2);
        /**
         * Tanto el titulo como el autor no pueden tener mas de 20 caracteres 
         * En caso de que tengan mas el titulo se corta y en el autor se pone las iniciales
         */
        libro1.setAutor("Gabriel Garcia Marquez");
        System.out.println("libro1 -> " + libro1);

        nuestroSplit("la casa verde", ' ');
        System.out.println(nuestroSubString("la casa verde", 0,7));
    }
}
