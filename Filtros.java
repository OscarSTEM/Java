import java.util.Scanner;
public class Filtros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        char letra;
        
        // 1 Solicita por consola un numero natural. Vuelve a solicitar el numero hasta que efectivamente sea un numero natural
        System.out.println("Numero natural");
        do{
            System.out.println("Introduce un numero natural: ");
            numero = sc.nextInt();
        }while(numero < 0);
        // 1.1 Solicita un numero entre 0 y 100. Asegurate de que está comprendido entre 0 y 100
        numero = 101;
        System.out.println("Numero comprendido entre 0 y 100");
        while(numero < 0 || numero > 100){
            System.out.println("Introduce un numero comprendido entre 0 y 100: ");
            numero = sc.nextInt();
        }
        // 1 Solicita una letra. Asegurate de que es una letra (a in lista)
        //sc.nextLine() devuelve un string
        // Con un string podemos llamar a la funcion charAt(indice)
        // que te devuelve el char que hay en la posicion indice
        // letra = sc.nextLine().charAt(0); 
        //Ejemplo Si introduce la palabra "patata" coge la 'p'
        // sc.nextLine();
        // System.out.println("Introduce una letra: ");
        // letraString = sc.nextLine();
        // letra = letraString.charAt(0);
        // System.out.println(letra);

        // if(letra >= 'a' && letra <= 'z'){
        //     System.out.println("Es una letra");
        // }
        sc.nextLine();
        do{
            System.out.println("Solicita una letra");
            letra = sc.nextLine().charAt(0);
        }while(!(letra >= 'a' && letra <= 'z' || letra >= 'A' && letra <= 'Z'));
        
    }
}
