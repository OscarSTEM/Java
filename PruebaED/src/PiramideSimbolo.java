public class PiramideSimbolo {
    public static void piramideSimbolos(int numero,String simbolo){
        String lista = simbolo;
        for(int i = 0; i < numero; i++){
            lista += simbolo;
            System.out.println(lista);
        } 
    }
    public static void main(String[] args) {
        int numero = 0;
        String simbolo = "";
        
        if(args.length != 2){
            System.out.println("Estoy pensando, espera");
        }else{
            numero = Integer.parseInt(args[0]);
            simbolo = args[1];
            piramideSimbolos(numero, simbolo);
        }
    }
}
