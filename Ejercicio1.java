import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero1, numero2;
        String palabra;
        // if(args.length < 1){
        //     System.out.println("Introduce la palabra dia o mes");
        //     palabra = sc.nextLine();
        // }else{
        //     palabra = args[0];
        // }
        // if(palabra.equals("dia")){
        //     System.out.println("Es Martes");
        // }else if(palabra.equals("mes")){
        //     System.out.println("Estamos en enero");
        // }else{
        //     System.out.println("Introduce una palabra valida...");
        // }

        // System.out.println("Introduce un numero: ");
        // numero = sc.nextInt();
        //  //¿No seria mas facil usar una lista o un map?, Si, pero queremos aprender el switch case
        // if (numero == 1){
        //     System.out.println("Es lunes...");
        // }else if(numero == 2){
        //     System.out.println("Es martes...");
        // }else if(numero == 3){
        //     System.out.println("Es miercoles....");
        // }else{
        //     System.out.println("Otros....");
        // }

        // En los switch case se puede poner break 
    // System.out.println("Introduce un numero: ");
        // numero = sc.nextInt();
    //     switch(numero){
    //         case 1:
    //                 System.out.println("Es lunes....");
    //             break;
    //         case 2:
    //                 System.out.println("Es martes...");
    //             break;
    //         case 3:
    //                 System.out.println("Es miercoles...");
    //             break;
    //         case 4:
    //                 System.out.println("Es jueves...");
    //             break;
    //         case 5:
    //                 System.out.println("Es viernes....");
    //             break;
    //         case 6:
    //                 System.out.println("Es sabado....");
    //             break;
    //         case 7:
    //                 System.out.println("Es domingo....");
    //             break;
    //         default:
    //             break;

            
    //     }
        //  System.out.println("Introduce cual es tu nota: ");
        // numero = sc.nextInt();
        // switch(numero){
        //     case 0:
        //             System.out.println("Insuficiente");
        //         break;
        //     case 1:
        //             System.out.println("Insuficiente");
        //         break;
        //     case 2:
        //             System.out.println("Insuficiente");
        //         break;
        //     case 3:
        //             System.out.println("Insuficiente");
        //         break;
        //      case 4:
        //             System.out.println("Insuficiente");
        //         break;
        //     case 5:
        //             System.out.println("Suficiente");
        //         break;
        //     case 6:
        //             System.out.println("Notable");
        //         break;
        //     case 7:
        //             System.out.println("Notable");
        //         break;
        //     case 8:
        //             System.out.println("Sobresaliente");
        //         break;
        //     case 9:
        //             System.out.println("Sobresaliente");
        //         break;
        //     case 10:
        //             System.out.println("Sobresaliente");
        //         break;
        // }
        //  System.out.println("Introduce un dia de la semana: ");
        //     palabra = sc.nextLine();
        //     switch(palabra){
        //         case "Lunes":
        //             System.out.println("Es el dia 1 ");
        //             break;
        //         case "Martes":
        //              System.out.println("Es el dia 2 ");
        //               break;
        //         case "Miercoles":
        //              System.out.println("Es el dia 3 ");
        //               break;
        //         case "Jueves":
        //              System.out.println("Es el dia 4 ");
        //               break;
        //         case "Viernes":
        //              System.out.println("Es el dia 5 ");
        //               break;
        //         case "Sabado":
        //              System.out.println("Es el dia 6 ");
        //               break;
        //         case "Domingo":
        //              System.out.println("Es el dia 7 ");
        //               break;
        //     }
        //     switch(palabra){
        //         case "Lunes" -> System.out.println("Es el dia 1 ");
        //         case "Martes" -> System.out.println("Es el dia 2 ");
        //         case "Miercoles" -> System.out.println("Es el dia 3 ");
        //         case "Jueves" -> System.out.println("Es el dia 4 ");
        //         case "Viernes" -> System.out.println("Es el dia 5 ");
        //         case "Sabado"-> System.out.println("Es el dia 6 ");
        //         case "Domingo" -> System.out.println("Es el dia 7 ");
        //         case "Otro valor" -> System.out.println("Otra cosa mariposa ");
        //     }
        // if(args.length < 3){
        //     System.out.println("Introduce 2 numeros y una palabra: ");
        //     numero1= sc.nextInt();
        //     numero2= sc.nextInt();
        //     palabra=sc.nextLine();
        //  }else{
        //     numero1 = Integer.parseInt(args[0]);
        //     numero2 = Integer.parseInt(args[1]);
        //     palabra = args[0];
        // }
            System.out.println("Introduce 2 numeros: ");
            numero1= sc.nextInt();
            numero2= sc.nextInt();
            System.out.println("Introduce una palabra suma, resta, multiplicacion,division");
            palabra = sc.nextLine();
            
    }
    
}
