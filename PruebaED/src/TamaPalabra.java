public class TamaPalabra {
    public static String TamaPalabra(int n, String palabra){
        int longitudPalabra = palabra.length();
        if(longitudPalabra < n){
            for(int i = longitudPalabra; i < n; i++){
                palabra += "-";
            }
        }else if(longitudPalabra > n){
            String palabraRecortada = "";
            for(int i = 0; i < n; i++){
                palabraRecortada += palabra.charAt(i);
            }
            palabra = palabraRecortada;

        }

        return palabra;
    }
    public static void imprimirNumero(int[] lista) {
        for(int elemento : lista){
            System.out.println(elemento);
        }
    }
    public static void main(String[] args) {
        String palabra = "";
        int numero = 5;
        //ESTO ES PARA HACER LAS PRUEBAS BATERIA DE PRUEBAS
        int[] numerosPrueba = {-2,0,3,5,10};
        String[] palabrasPrueba = {"", "pan","verde","patata", "hipopotamo","esternocleidomastoideo"}; 
        
        if(args.length == 1 && args[0].equals("probando")){
            for(int numeroPrueba : numerosPrueba){
                System.out.println("Para el numero: " + numeroPrueba);
                for(String palabraPrueba : palabrasPrueba){
                    System.out.println(TamaPalabra(numeroPrueba,palabraPrueba));
                }
            }


        }else if(args.length != 2){
            System.out.println("Numero de argumentos incorrecto int - String");
        }else{
            System.out.println("Has introducido correctamente los datos");
            numero = Integer.parseInt(args[0]);
            palabra = args[1];
            System.out.println(TamaPalabra(numero,palabra));
        }
        //javac ../src/TamaPalabra.java -d . Comando para compilar


    }
}
