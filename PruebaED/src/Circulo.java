// Esto es una clase 
/** Define un circulo con su radio y su color
 * @author Oscar Manuel Benito Martin
 * @version 1.0. 
 * 
 */
import java.util.Scanner;
public class Circulo {
    
    //1º paso: definir sus caracteristicas (atributos de la clase)
    //2º atributos son privados en lenguajes de programacion estructurados
    private int radio ;
    private String color;
     
    //3º Metodos de la clase
    //Constructor() -> por defecto
    // Identificamos el this para los atributos de la clase
    //1º Forma

    /**
     * Constructor por defecto, llamado tambien predeterminado
     * Crea un circulo con radio 1 y de color blanco
     */
    public Circulo(){
        this.radio=1;
        this.color="blanco";
    }
    // Constructor(int radio, String color) -> con parametros
    //2º Forma
    /**
     * Constructor con parametros
     * Crea un circulo con un radio y color especificados
     * @param radio El radio del circulo
     * @param color El color del circulo
     * @see Circulo#setRadio(int radio)
     */
    public Circulo(int radio, String color){
        this.setRadio(radio);
        this.color= color;
    }
    //Constructor(Circulo c) -> De copia.
    //3º Forma
    /**
     * Constructor de copia
     * Crea un circulo con un radio y color obtenido a partir de otro circulo
     * @param c El circulo a copiar 
     */
    public Circulo(Circulo c){
        this.radio = c.radio;
        this.color = c.color;
    }
    // Get -> Conseguir la informacion de los atributos
    /**
     * Obtener el radio actual del circulo.
     * @return El radio del circulo
     */
    public int getRadio(){
        return this.radio;
    }
    /**
     * Obtener el color actual del circulo
     * @return devuelve el color del circulo
     */
    public String getColor(){
        return this.color;
    }
    // Set -> Establecer la informacion a los atributos.
    /**
     * Establece el radio del circulo 
     * En caso de que el radio sea menor que 0, lo establece a 1
     * @param radio El nuevo radio del circulo.
     * 
     */
    public void setRadio(int radio){
        this.radio = radio;
        if (radio <= 0) this.radio = 1;
    }
    /**
     * Establece el color del circulo
     * @param color El nuevo color del circulo
     */
    public void setColor(String color){
        this.color = color;
    }

    /**
     * Calcular el area del circulo
     * @return area El area del circulo
     */
    public double calcularArea(){
        double area;
        area = Math.PI*this.radio*this.radio; //Se podria hacer con el Math.pow(this.radio,2)
        return area;
    }
    /**
     * Calcular el perimetro del circulo
     * @return perimetro El perimetro del circulo
     */
    public double calcularPerimetro(){
        double perimetro;
        perimetro = 2*Math.PI*this.radio;
        return perimetro;
    }

    //Funcion para mostrar el circulo, siempre se tiene que llamar toString
    //Java asume que cuando queremos mostrar por pantalla un circulo
    //(print) tienes que llamar a toString()
    // toString siempre al final
    /**
     * Devuelve la representacion en formato de cadena (String) del objeto circulo
     * @return Una cadena que representa el objeto circulo en forma de texto.
     */
    public String toString(){
        return "El radio es " + this.radio + " y el color es " + this.color + ".";
    }

    public static void main(String[] args) {
        System.out.println("Hola circulo");
        Scanner sc = new Scanner(System.in);

        Circulo circulitoPorDefecto = new Circulo(); //Llamamos al constructor por defecto que no le pasamos nada, 
                                                //y nos da un radio y un color

        // Constructor por parametros
        Circulo circulitoConParametros = new Circulo(2,"Azul");
        //Constructor de copia
        Circulo circulitoDeCopia = new Circulo(circulitoConParametros);
        
        //Para llamar a la funcion
        // System.out.println(circulitoPorDefecto.toString());


        System.out.println(circulitoPorDefecto);
        System.out.println(circulitoConParametros);
        System.out.println(circulitoDeCopia);

        System.out.println(circulitoConParametros.getRadio());
        System.out.println(circulitoConParametros.getColor());

        circulitoDeCopia.setColor("rojo");
        circulitoDeCopia.setRadio(5);
        System.out.println(circulitoDeCopia);
        //Para demostrar si el circuloPorDefecto es igual que el circulitoDeCopia
        System.out.println("¿El circuloPorDefecto tiene el mismo radio que el circuloDeCopia?");
        System.out.println(circulitoPorDefecto.getRadio() == circulitoDeCopia.getRadio());

        System.out.println("El area del circulo " + circulitoDeCopia + " es " + circulitoDeCopia.calcularArea());
        System.out.println("El perimetro del circulo " + circulitoDeCopia + " es " + circulitoDeCopia.calcularPerimetro());
        // javadoc ../src/Circulo.java -d ../docs  COMANDO PARA EL JAVADOC



    }   
    
}
