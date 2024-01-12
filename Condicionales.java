import java.util.Scanner;
public class Condicionales {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero = 5;
        int numero1, numero2;
        String palabra;
    
        /* 
        if (numero < 5){
            System.out.println("El numero es menor que 5");
        } else if (numero == 5) {
            System.out.println("El numero es 5");
            
        }else {
            System.out.println("El numero es mayor de 5");
        }
        System.out.println("Introduce un numero: ");
        numero1 = sc.nextInt();
        if (numero1 >= 0){
            System.out.println(numero1 + "es positivo");
        }else{
            System.out.println(numero1 + "es negativo");
        }   

            sc.nextLine();
            System.out.println("Introduce una palabra y la repito: ");
            palabra = sc.nextLine();
            System.out.println(palabra);
        */
            //¿Cual es el numero mayor?
            // if(args.length < 2){
            //     System.out.println("Introduce dos números, separados por un espacio: ");
            //     numero1 = sc.nextInt();
            //     numero2 = sc.nextInt();
            // }else{
            //     numero1 = Integer.parseInt(args[0]);
            //     numero2= Integer.parseInt(args[1]);
            // }
            // if (numero1 > numero2){
            //     System.out.println("El numero mas grande es" + numero1);
            // } else if (numero2 > numero1){
            //         System.out.println("El mas grande es " + numero2);
            //     }else{
            //         System.out.println("Son iguales");
                // }
            // Si el argumento te pide dia print hoy es martes, y si pones mes que te diga, es enero ¿En que dia, mes estamos?
                System.out.println("Introduce la palabra dia o mes");
                palabra = sc.nextLine();
                if(palabra == "dia"){
                    System.out.println("Es Martes");
                }else if(palabra == "mes"){
                    System.out.println("Estamos en enero");
                }else{
                    System.out.println("Introduce una palabra valida...");
                }
    }    // 


// Imprime por pantalla un numero 