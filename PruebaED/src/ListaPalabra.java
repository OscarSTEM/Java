import java.util.ArrayList;
import java.util.Scanner;
public class ListaPalabra{
    public static void imprimirArray(String[] lista) {
        for(String elemento : lista){
            System.out.println(elemento);
        }
    }
    public static void main(String[] args) {
        ArrayList<String> arrayListaPalabras = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        String palabra = " "; 
        Boolean salir = false;

        while(!salir){
        System.out.println("Escribe palabras para meterlas en la lista o escribe salir");
        palabra = sc.nextLine();
        if(palabra.equals("salir")){
        salir=true;
        }else{
            arrayListaPalabras.add(palabra);
        }
       
        System.out.println("La lista tiene " + arrayListaPalabras + " " + "elementos");
        }
    }
}
