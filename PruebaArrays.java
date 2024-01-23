import java.util.Scanner;
import java.util.ArrayList;

public class PruebaArrays{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numIntegrantes;
        String nombreEquipo;
        String nombresIntegrantes = "";
        String nombreIntegrante = "";
        ArrayList<String> arrayListaIntegrantes = new ArrayList<String>();
        int numJefe;
        String nombreJefe = "";
    
        if (args.length != 2){
            System.out.println("Versión del código en desarrollo... ¡Introduzca el nombre del equipo y el número de miembros!");
        }else{
            System.out.println("Ha introducido correctamente los datos.");
            nombreEquipo = args[0];
            numIntegrantes = Integer.parseInt(args[1]);


            numJefe = (int)Math.floor(Math.random()*numIntegrantes);
            

            for (int i = 0 ; i < numIntegrantes ; i++){
                System.out.println("Introduce el nombre del integrante " + (i+1) + ": ");
                nombreIntegrante = sc.nextLine();
                arrayListaIntegrantes.add(nombreIntegrante);
                // if (numJefe == i) nombreJefe = nombreIntegrante;
            }
            nombreJefe = arrayListaIntegrantes.get(numJefe);
            
            System.out.println( "El equipo " + nombreEquipo + 
                                " está compuesto por " + numIntegrantes + 
                                " integrantes, a saber: " + arrayListaIntegrantes + 
                                "-> El jefe de equipo es " + nombreJefe) ;
        }    
    }
        
        
}
