public class MismaInicial {
    public static boolean mismaInicial(String pal1, String pal2){
        return pal1.charAt(0) == pal2.charAt(0);
    }
       
    public static void main(String[] args) {
        String palabra1 = "";
        String palabra2 = "";
        String[] palabrasDePrueba = {"pomelo","melocoton","1234"}; 
        if(args.length == 1 && args[0].equals("probando"))
            palabra1 = palabrasDePrueba[0];

            // for(String palabra : palabrasDePrueba){
            //     System.out.println("Empiezan por la misma letra " + palabra1 + " y "+ palabra + ": ");
            //     System.out.println(mismaInicial(palabra1, palabra));
            // }
            // OTRA FORMA DE HACERLO
            // PARA NO COMPROBAR LA PALABRA CONSIGO MISMA:
            for(int i = 1; i < palabrasDePrueba.length; i++){
                palabra2 = palabrasDePrueba[i];
                System.out.println("Empiezan por la misma letra " + palabra1 + " y "+ palabra2 + ": ");
                System.out.println(mismaInicial(palabra1, palabra2));
            }
        if(args.length != 2){
            System.out.println("En proceso de ejecucion");
        }else{
            palabra1 = args[0];
            palabra2 = args[1];
            System.out.println(mismaInicial(palabra1, palabra2));
        }
    }
}
