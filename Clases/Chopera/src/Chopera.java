import java.util.Random;
import java.util.ArrayList;
public class Chopera {
    Random rand = new Random();
    private int numFilas;
    private int numColumnas;
    private int edadChopera;
    private ArrayList<ArrayList<Chopo>>matrizDeChopos;
    // 2 formas de hacer una lista contigua
    //1 forma: La expresion seria ArrayList<ArraysList<Chopo>> chopera;
    //2 forma: ArrayList<Chopo>[][] chopera; <- Esta es la correcta
    public Chopera(){
        this.numFilas = 0;
        this.numColumnas = 0;
        this.edadChopera = 0;
        this.matrizDeChopos = new  ArrayList<ArrayList<Chopo>>();
    }
    /*
     * El arraylist lo vamos a crear nosotros en vez de pasarlo por parametros
     */
    public Chopera(int numFilas, int numColumnas, int edadChopera){
        this.numFilas = 0;
        this.setNumFilas(numFilas);
        this.numColumnas = 0;
        this.setNumColumnas(numColumnas);
        this.edadChopera = 0;
        this.setEdadChopera(edadChopera);
        this.matrizDeChopos = new ArrayList<ArrayList<Chopo>>();
    }

    

    public Chopera( int numFilas, int numColumnas){
        this.numFilas = 0;
        this.setNumFilas(numFilas);
        this.numColumnas = 0;
        this.setNumColumnas(numColumnas);
        int edadMax = 0;
        this.matrizDeChopos = new ArrayList<ArrayList<Chopo>>();

        Chopo chopoAleatorio;
        for (int i = 0; i < numFilas ; i++){
            // Matriz es una ArrayList. Por cada fila de la matriz, creamos un arrayList de columnas de chopos.
            matrizDeChopos.add(new ArrayList<Chopo>());
            for (int j = 0 ; j < numColumnas ; j++){
                double altura = (Math.round(Math.random()*900))/100.0;
                double diametro = (Math.round(Math.random()*4500))/100.0;
                int edad = (int)Math.floor(Math.random()*3)+1;
                if (edad>edadMax) edadMax = edad; // Para que la chopera tenga la edad del más viejo de los chopos.
                chopoAleatorio = new Chopo(altura,diametro,edad);
                matrizDeChopos.get(i).add(chopoAleatorio);
            }
        }
        this.edadChopera = edadMax;
    }
    public Chopera(Chopera c){
        this.numFilas = c.numFilas;
        this.numColumnas = c.numColumnas;
        this.edadChopera = c.edadChopera;
        this.matrizDeChopos = (ArrayList<ArrayList<Chopo>>) c.matrizDeChopos.clone();
    }

    public int getNumFilas(){
        return this.numFilas;
    }
    public int getNumColumnas(){
        return this.numColumnas;
    }
    public int getEdadChopera(){
        return this.edadChopera;
    }
    public ArrayList<ArrayList<Chopo>> getMatrizDeChopos(){
        return this.matrizDeChopos;
    }
    public void setNumFilas(int numFilas){
        if(numFilas > 0)this.numFilas= numFilas;
    }
    public void setNumColumnas(int numColumnas){
        if(numColumnas > 0)this.numColumnas= numColumnas;
    }
    public void setEdadChopera(int edadChopera){
        if(edadChopera >= 0)this.edadChopera= edadChopera;
    }
    public void setMatrizDeChopos(ArrayList<ArrayList<Chopo>> matrizDeChopos){
        //Esta igualando las direcciones de memoria. No está copiando los datos
        // this.matrizDeChopos = matrizDeChopos;
     this.matrizDeChopos = (ArrayList<ArrayList<Chopo>>)matrizDeChopos.clone();
     this.numFilas = matrizDeChopos.size();
     this.numColumnas = matrizDeChopos.get(0).size();
    }
    public String toString(){
        String salida = "";
        for(ArrayList<Chopo> fila : matrizDeChopos){
            for(Chopo columna : fila){
                salida += columna + "\t";
            }
            salida += "\n";
        }
        return salida;
    }
    public static void main(String[] args) {
        Random rand = new Random();
        // int numFil = 1;
        // int numCol = 3;
        // ArrayList<ArrayList<Integer>> numeros = new ArrayList<ArrayList<Integer>>();
        
        // //Una matriz es una lista de listas
        // numeros.add(new ArrayList<Integer>()); //Primera lista con 3 elementos
        // numeros.get(0).add(1); 
        // numeros.get(0).add(2);
        // numeros.get(0).add(3);

        // System.out.println(numeros.size()); //Devuelve el numero de filas
        // System.out.println(numeros.get(0).size()); //Devuelve el numero 
        // // de elementos
        // // que es lo mismo que decir el num de columnas

        Chopera chopera1 = new Chopera(3, 3,1);
        System.out.println(chopera1);
        Chopera chopera2 = new Chopera(3, 3,1);
        Chopera chopera3 = new Chopera(3, 3,1);

        ArrayList<Chopera> listaChopos = new ArrayList<Chopera>();
        listaChopos.add(chopera1);
        listaChopos.add(chopera2);
        listaChopos.add(chopera3);

        System.out.println(listaChopos);

        //Sumamos de chopera3 la altura de todos los chopos
        // y el diametro de todos los chopos.
        double alturaTotal = 0.0;
        double diametroTotal = 0.0;
        for(ArrayList<Chopo> fila : chopera3.getMatrizDeChopos()){
            for(Chopo columna : fila){
                alturaTotal += columna.getAltura();
                diametroTotal += columna.getDiametro();
            }
        }

        System.out.println("La altura es : " + alturaTotal + ".");
        System.out.println("El diametro total es : " + diametroTotal + ".");;
        //Creamos una lista de alturas, en la que guardamos la suma
        // de la altura de cada una de las filas de chopos
    }
}
