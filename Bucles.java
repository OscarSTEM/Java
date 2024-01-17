import java.util.Random;
import java.util.Scanner;
public class Bucles {
   //ASI ES COMO SE HACE UNA FUNCION
   public static boolean numeroEsPar(int numero){
      System.out.println("Estoy dentro del numero esPar");
      return numero%2 == 0;
   }
    public static void main(String[] args) {

        String palabra = ""; 
        boolean salir = false;
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numero;
        int num;
        boolean esPar = true;



      //   System.out.println("For each -> for color in listaColores");
      //   //Bucle For each (En python seria for color in listaColores) El for each es para recorres una lista
      //    String[] listaAzules = {"Azul","Añil","Indigo","Cobalto","Klein","Celeste"};
      //    for(String azul:listaAzules){
      //       System.out.println(azul);
      //    }

      //    // Si imprimes un string:
      //    System.out.println("Si imprimes un string");
      //    System.out.println(listaAzules);

      //    // For -> No existe en Python... El simbolo ("++") suma sería como el ("+=1") suma de 1 en 1.
      //    // Si queremos que sume mas como por ej 2 en 2 sería ("+=2")
      //    //Inicializamos las variables;mientras que/ condicion while; de cuanto en cuanto va aumentando las variables inicialiazadas
      //    for (int contador = 0; contador <= 10; contador++){
      //       System.out.println(contador);
      //    }
      //    // i de Iterador
      //    System.err.println("i de Iterador");
      //    for(int i = 0; i < 10; i++){
      //       System.out.println(i);
      //    }
      //    // Recorrer lista con bucle no-Each
      //    System.out.println("Recorrer lista con bucle no-Each");
      //    for(int i = 0; i < listaAzules.length; i++){
      //       System.out.println(listaAzules[i]);
      //    }
      //    // Bucles anidados// bucle for como while
      //    System.out.println("Bucles anidados");
      //    for(int i = 0; i < 3 ; i++){
      //       for(int j = 0; j < 3 ; j++){
      //           System.out.print("" + i + j + " ");
      //       }
      //       System.out.println();
      //    }
      //    // Bucle While
      //    // Lo utilizaremos para booleanos
      //    // Si tenemos un bucle con un if que se encarga de comprobar la condicion de salida, normalmente podremos poner
      //    //directamente esa condicion en el while
      //    System.out.println("Bucle While");
      //    while(!salir){
      //       System.out.println("Escribe salir");
      //       palabra = sc.nextLine();
      //       if(palabra.equals("salir")){
      //           salir=true;
      //       }
      //    }

      //    // Código refactorizado 
      //    System.out.println("Bucle while refactorizado");
      //    while(!palabra.equals("salir")){ // Para inicializar tiene que tener un valor
      //       System.out.println("Escribe salir");
      //       palabra = sc.nextLine();
      //    }




      //    // Comprobación de si salir es true con un for
      //    //OJO: CUIDADO CON LOS HUECOS!!
      //    for(salir = false ; !salir ; ){
      //       System.out.println("Escribe salir");
      //       palabra = sc.nextLine();
      //       if(palabra.equals("salir")){
      //           salir = true;
      //       }
      //    }
      //    // Codigo refactorizado
      //    palabra = "";
      //    for(/*solo se entra cuando llega al bucle for */ ; !palabra.equals("salir") ; /* */ ){
      //       System.out.println("Escribe salir");
      //       palabra = sc.nextLine();
      //    }



      //    // Bucle doWhile Sirve para solicitar datos
      //    System.out.println("Bucle doWhile");
      //    do{
      //       System.out.println("Escribe salir: ");
      //       palabra = sc.nextLine();
      //    }while(!palabra.equals("salir"));

      //    do{
      //       System.out.println("Introduce un numero entre el 1 y 50: ");
      //       numero = sc.nextInt();
      //    }while(numero<1||numero>50);
         
         numeroEsPar(6);
         // Genererar pruebas // SIRVE PARA HACER EL EXAMEN DE ENTORNOS LA BATERIA DE PRUEBAS
         for(int i = 0; i < 100 /*Hacemos 100 pruebas */; i++ ){
            num = (int)Math.floor(Math.random()*100);
            esPar = numeroEsPar(num);
            System.out.println("¿" + num  + " " + "es par?" + " "+ esPar);
         }

    }
}
