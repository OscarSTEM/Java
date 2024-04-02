public class SofaCama implements Sofa,Cama{
    private boolean esSofa;
    
    public void sofaCama(){
        esSofa = true;
    }
    //No podemos modificar el numero de plazas porque es un atributo
    //de la interfaz
    // public SofaCama(int numPlazas){
    //     esSofa = true;
    //     super.numPlazas = numPlazas;
    // }
    //Era obligatorio implementar sentarse() por la interfaz sofa
    public String sentarse(){
        return "Me siento...";
    }
    //Era obligatorio implementar dormir() por la interfaz cama                                      
    public String dormir(){
        return "Me duermo...";
    }
   
    public String abrir(){
        String salida = "";
        if (esSofa) salida = "Convierto el sofá en cama";
        return salida;
    }
    public String cerrar(){
        String salida = "";
        if (!esSofa) salida = "Convierto la cama en sofá";
        return salida;
    }
    @Override
    public String toString() {
        return "Mi sofa cama tiene " + this.numPlazas + " plazas.";
    }
    
    
    public static void main(String[] args) {
        SofaCama sofaCama = new SofaCama();
        System.out.println(sofaCama);
    }
}
