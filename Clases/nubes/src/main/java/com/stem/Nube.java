package com.stem;
import java.util.Scanner;


public class Nube {
    //El ENUM es un tipo de clase (mas pequeña)
    public enum TiposDeNube{
        CIRROS,
        CUMULOS,
        ESTRATOS,
        NIMBOS;
        public static String mostrar(){
            return "[CIRROS, CUMULOS, ESTRATOS, NIMBOS]";
        }
    }
    public double unir(Nube n){
        //Para hacer los test debe tener una salida
        double salida = -1;
       if(this.altura == n.altura){
        this.tamanio += n.tamanio;
        n.tamanio = 0;
        n.altura = 0;
        salida = this.tamanio;

       }
        return salida;
    }
    /*
     * Aumenta el tamaño de la nube en un 50%
     */
    public double crecer(){
        this.tamanio *= 1.5;
        return this.tamanio;
    }
    /**
     * La nube sube los metros indicados
     * @param metros Indica el numeros de metros que sube la nube
     */
   public double subir(double metros){
    if(metros > 0) this.altura += metros;
    //Si los metros son negativos, llamamos a bajar con el numero 
    //de metros en positivo
    else this.bajar(-metros);
    return this.altura;
   }

    /*
     * La nube baja los metros indicados
     */
    public double bajar(double metros){
        if(metros > 0) this.altura -= metros;
        if(this.altura < 0) this.altura = 0;
        return this.altura;
    }
    /**
     * ¿Puede llover? Puede llover si la altura de la nube es mayor que
     * 1000 y su tamanio es mayor de 200
     */
    public boolean llover(){
      return this.tamanio >= 200 && this.altura >= 1000;
    }
      /**
     * Llueve si puede llover.
     * El volumen se reduce a un tercio del tamaño de la nube inicial.
     * 
     */
    public double forma(){
        if(this.llover());
        this.tamanio /= 3;
        return this.tamanio;   
    }

        
    public String toString(){
        return "altura: " + this.altura + ". tamaño: " + this.tamanio;
    }
    private TiposDeNube tipo;

    private double altura;
    private double tamanio;
    //Constructor por defecto
    public Nube(){
        this.tipo = TiposDeNube.CIRROS;
        altura = 3000.0;
        tamanio = 1000.50;
    }
    //Constructor por parametros
    public Nube(TiposDeNube tipo, double altura, double tamanio){
        this.tipo = tipo;
        this.altura = altura;
        this.tamanio = tamanio;
    }
    //Constructor de copia
    public Nube(Nube n){
        this.tipo = n.tipo;
        this.altura = n.altura;
        this.tamanio = n.tamanio;
    }
    public double getAltura(){
        return this.altura;
    }
    public double getTamanio(){
        return this.altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public void  setTamanio(double tamanio){
        this.tamanio = tamanio;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Nube nube1 = new Nube(TiposDeNube.NIMBOS,10,30);
        // Nube nube2 = new Nube(NIMBOS,10,30); -> Error
        System.out.println("Introduce el tipo de nube [" + TiposDeNube.mostrar() + "]");
        String tipoString = sc.nextLine().toUpperCase(); //el tipo de nube en formato string 
        TiposDeNube tipoEnum = TiposDeNube.valueOf(tipoString); //ESTO TRANSFORMA EN ESTE CASO
        //LO QUE HAY EN EL ENUM A STRING

        Nube nube2 = new Nube(tipoEnum,10,30);
        System.out.println(nube1);
        System.out.println(nube2);
        nube1.unir(nube2);
        System.out.println(nube1);
       
    }
}
