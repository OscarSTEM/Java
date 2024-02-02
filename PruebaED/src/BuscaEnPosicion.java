import java.util.ArrayList;

public class BuscaEnPosicion {
    public static int BuscaEnPosicion(int pos, ArrayList<Integer> lista){
        int numero = 1;
        if(pos >= 0 && pos < lista.size()){
            numero = lista.get(pos);
        }
        return numero;
    }
    public static void main(String[] args) {
       ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
       int numero ;
       int resultado;
       int[] numeroPrueba = {-2,0,3,5,10};
       for( int i = 0; i < 10; i++){
        numero = (int)Math.floor(Math.random()*20);
        listaNumeros.add(numero);
       }
       
        if(args.length == 1){
            int posicion = Integer.parseInt(args[0]);
            resultado = BuscaEnPosicion(posicion , listaNumeros);
            if (posicion >= 0 && posicion < listaNumeros.size()){
                System.out.println("La lista es " + listaNumeros);
                System.out.println("Lo que hay en la posicion " + args[0] + " es: " 
                                                    + resultado);
                                                    
            }
            
        }
    }
    
}
