import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        
        //Generar un numero aleatorio hay que importar el random
        //OPCION 1: ESTA ES LA FORMA "DIFICIL DE HACERLO"
        Random rand = new Random();
        int numero;
        double numeroDouble;

        // numero = rand.nextInt(); // funciona como el scanner
        // System.out.println(numero);
        
        // Numero entre 0 y 4
        numero = rand.nextInt(5);
        System.out.println(numero);
        
        // Numero entre 0 y 5
        numero = rand.nextInt(5+1);
        System.out.println(numero);

        // Numero entre 1 y 5 el +1 fuera del parentesis
        numero = rand.nextInt(5)+1;
        System.out.println(numero);

        // OPCION 2: ESTA ES LA FORMA FÁCIL DE "HACERLO"
        // math.random es otra clase
        // Numero aleatorio entre 0 y 1 -> Siempre va a estar comprendido entre 0 y 1
        // con decimales
        numeroDouble = Math.random();
        System.out.println(numeroDouble); 
        
        // Numero aleatorio entre 0 y 10 -> poner el *10 con decimales
        numeroDouble = Math.random()*10;
        System.out.println(numeroDouble); 
       
        // Numero aleatorio entre 0 y 35 con decimales
        numeroDouble = Math.random()*35;
        System.out.println(numeroDouble);
        // Para convertirlo entre numeros ponemos el int delante 
        numeroDouble = Math.floor(Math.random()*35);
        System.out.println(numeroDouble);

        // Esto es para quitar los decimales que se quedan en 15."00"
        numero = (int)Math.floor(Math.random()*35);
        System.out.println(numero);

        //Numero aleatorio int entre 5 y 20
        System.out.println("Diferencia entre 5 y 20");
        int minimo = 5;
        int maximo = 20;
        int diferencia = maximo - minimo;
        numero = (int)Math.floor(Math.random()*diferencia)+minimo;
        System.out.println(numero);

       


    }
}
