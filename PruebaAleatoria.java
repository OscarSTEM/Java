import java.util.Random;
public class PruebaAleatoria {
    //ASI SE CREA UNA FUNCIÓN
    public static boolean numeroEsPar(int numero){
        System.out.println("Estoy dentro del numero esPar");
        return numero%2 == 0;
    }
    public static void main(String[] args) {
        Random rand = new Random();
        int numero;
        numeroEsPar(6);
    }
}
