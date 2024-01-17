import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int numero1,numero2;
        int mini = 0, maxi = 100;
        String palabra;
        if(args.length != 3){
            System.out.println("No has introducido el numero de argumentos necesarios");
            System.out.println("Necesitamos 3 numeros: El numero minimo, el valor máximo y el que esté comprendido entre ellos");
            System.out.println("Introduce al menos el numero y miro si esta en el rango de 1 y 100");
            numero = sc.nextInt();
        
        }else{
           mini = Integer.parseInt(args[0]);
           maxi = Integer.parseInt(args[1]);
           numero = Integer.parseInt(args[2]);
          
        }
         if (numero >= mini && numero >= maxi){
            System.out.println("Es correcto" +  numero + "Esta comprendido entre" + mini + "y" + maxi + "");
           }else{
            System.out.println("No esta comprendido");
           }
    }
}
