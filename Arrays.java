import java.util.ArrayList;


public class Arrays {
    // SOBRECARGA DE FUNCIONES: PODEMOS TENER FUNCIONES CON EL MISMO NOMBRE
    // Y FUNCIONALIDAD, SIEMPRE Y CUANDO LOS ATRIBUTOS DE ENTRADA SEAN DISTINTOS
    // PARA PODER CAMBIAR LOS TIPOS DE DATOS PERO MANTENER LA FUNCIONALIDAD
    public static void imprimirArray(String[] lista) {
        for(String elemento : lista){
            System.out.println(elemento);
        }
    }
    public static void imprimirArrayInt(int[] lista) {
        for(int elemento : lista){
            System.out.println(elemento);
        }
    }
    public static void imprimirArrayChar(char[] lista) {
        for(char elemento : lista){
            System.out.println(elemento);
        }
    }
    
    public static void main(String[] args) {
        // ARRAYS ESTÁTICAS (LISTA)
        //Creacion de arrays estáticas
        // 1º FORMA
        String[] colores = {"azul","amarillo", "rojo", "verde"};
        String color;
        
        System.out.println(colores); // Para mostrar por pantalla saliendo
                                    // los datos y no la direccion 
                                    // tendriamos que hacer un bucle for
        
        //2º FORMA
                                    
        int[] numeros;
        numeros = new int[10];  // Array vacío con 10 huecos
        //3º FORMA
        char[] letras = new char[10]; // Lo creamos durante la 
                                    // declaracion
        colores[1] = "4m4r1ll0";
        colores[2] = "r0j0";
        String[] colores2 = colores; // Si modificamos colores
                                    // se modifica tambien colores2
                                    // porque estamos haciendo una copia
                                    //superficial que significa que es solo
                                    // del puntero quwe apunta a la lista de colores
        System.out.println(colores2);
        System.out.println("Imprimo colores");
        imprimirArray(colores);
        System.out.println("Imprimo colores2");
        imprimirArray(colores2);
        // PARA SACAR EL VALOR QUE HAY EN UNA POSICION
        color = colores[0];
        System.out.println("El color que hay en la primera posicion es: " + 
        color );
        // PROBAMOS LA LISTA DE NUMEROS
        System.out.println("Imprimo numeros: ");
        System.out.println(numeros); // POR DEFECTO SON 0s

        imprimirArrayInt(numeros);
        // IMPRIMO LETRAS
        // System.out.println("Imprimo letras: ");
        // System.out.println(letras); // POR DEFECTO SON ESPACIOS

        // imprimirArrayChar(letras);
        // EL TAMAÑO DE LA LISTA
        System.out.println("La lista tiene " + colores.length + " " + "elementos");
            

        //ARRAYS DINÁMICAS (LISTA)
        //Creacion de arrays dinámica
        // HAY QUE PONER ARRIBA EL IMPORT.UTIL.ARRAYLIST
        ArrayList<String> arrayColores = new ArrayList<String>();
        ArrayList<String> arrayColores2 = arrayColores;
       
       
        //AÑADIR ELEMENTOS
        arrayColores.add("Azul");
        arrayColores.add("Amarillo");
        arrayColores.add("Rojo");
        arrayColores.add("Verde");
        arrayColores.add("Blanco");
        arrayColores.add("Negro");
        
         // EL SIZE ES CON ARRAYS DINAMICAS
        System.out.println("La lista tiene " + arrayColores.size() + " " + "elementos");

        System.out.println("Imprimimos el arraylist de colores: ");
        System.out.println(arrayColores);
        System.out.println("Imprimimos el arraylist de colores2: ");
        System.out.println(arrayColores2);
        // FUNCION GET NOS MUESTRA UN VALOR O RECOGE UN VALOR DEL ARRAYLIST:
         color = arrayColores2.get(0); // array[0]
         System.out.println("El color que hay en la primera posicion es: " + 
        color );
        // FUNCION SET CAMBIA EL VALOR DEL ARRAYLIST
        arrayColores.set(1,"4m4r1ll0");// TENGO QUE INDICAR LA POSICION
        // Y EL VALOR QUE QUIERO PONER EN ELLA
        System.out.println("Imprimimos el arraylist de colores: ");
        System.out.println(arrayColores);
        System.out.println("Imprimimos el arraylist de colores2: ");
        System.out.println(arrayColores2);
        //ELIMINAR ELEMENTO
        arrayColores.remove(1);
        System.out.println("Imprimimos el arraylist de colores: ");
        System.out.println(arrayColores);
        arrayColores.clear();
        System.out.println("Imprimimos el arraylist de colores: ");
        // LIMPIA LA LISTA ENTERA DENTRO DEL ARRAYS
        System.out.println(arrayColores);
    }
}
