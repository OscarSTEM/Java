// print("Hola Mundo")
// IMPORTANTE PARA DECLARAR LAS VARIABLES SIEMPRE AL PRINCIPIO PARA QUE SEA MAS FACIL DE ENCONTRAR
class HolaMundo {
/*
    El nombre de la class siempre empieza por mayus 
        Tiene que llamarse igual que el archivo
            Para ejecutar el cod de Java
            1º compilar: javac nombreArchivo.java
                Esto genera un nombreArchivo.class
                2º Interpretar: java nombreArchivo
 */
    /*  El String[] args sirve para, en el momento de lanzar la ejecucion,
        pasarle informacion al programa o al proceso.
        ARGS significa argumento
        Como main es una funcion tambien podemos pasarle args 
        java nombreArchivo args1 args2 args3
    */  
    public static void main(String[] args){ // Para imrprimir hay que crear el cod principal (main)
        // Solicitamos argumentos en el momento de ejecutar el codigo
        if (args.length == 1){
            System.out.print("Hola " + args[0] + "!");
        }
        else{
            System.out.print("Hola Mundo!");
        }
        // Diferencia entre print y println
        System.out.print("Utilizando print...");
        System.out.println("Despues del print...");
        System.out.println("Utilizando el println..."); // esto es un salto de linea
        System.out.println("Despues del println...");
        System.out.println("\nUtilizando \nsaltos \nde \nlinea..."); // \n esto sirve para hacer saltos de linea. \\n para anular lo que hace la primera barra
        // Hacer operaciones en el print
        System.out.print("3+3: ");
        System.out.println(3+3);
        System.out.println("3+3: " + (3+3));
        System.out.println("3+3: " + 3+3);
        System.out.println("3*3: " + (3*3));
        // ERROR System.out.println("3*'n': " + ('3'*"n")); // esto en java no lo podemos hacer multiplicar un numero con tipo string
        // ERROR System.out.println("3*3: " + ('3'*'n')); Multiplica el ascii
        // TIPOS DE DATO:
        // VARIABLES DECLARADAS 
        // ESTO NO FUNCIONA PORQUE HAY QUE ESPECIFICARLO numero = 5 System.out.println(numero);
        int numeroInt = 5; //La declaracion de variables al principio
        System.out.println(numeroInt);
        System.out.println("El numero, de tipo int, es " + numeroInt + ".");
        double numeroDouble = 5;
        System.out.println("El numero, de tipo double, es " + numeroDouble + ".");
        float numeroFloat = 5;
        System.out.println("El numero, de tipo float, es " + numeroFloat + ".");
        int numeroInt1 = 5/2;
        System.out.println("El numero, de tipo int1, es " + numeroInt1 + ".");
         double numeroDouble1 = 5/2.0;
        System.out.println("El numero, de tipo double1, es " + numeroDouble1 + ".");
        float numeroFloat1 = 5/2.0f; // PARA HACERLO CON TIPO FLOAT HAY QUE PONER LA F
        System.out.println("El numero, de tipo float1, es " + numeroFloat1 + ".");
        double numeroDouble2 = 5/2.0f;
        System.out.println("El numero, de tipo double2, es " + numeroDouble2 + ".");
    }
    
}  // La clase se debe de crear con el nombre del archivo si o si, todo lo que quieras escribir debe ser dentro de los corchetes
// Hay que compilar siempre 
/*Para comentar trozos grandes es asi*/
// public sirve para nos da la info de quien puede verlo, public todos, privado quien este en el archivo 
// el nombre de la clase siempre va en Mayuscula
// static significa 
// void significa que no tiene return, no devuelve nada 