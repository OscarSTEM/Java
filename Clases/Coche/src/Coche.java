public class Coche {
    private boolean cierreCentralizado; 
    private boolean estado; //parado o arrancado
    private Puerta puertaDer;
    private Puerta puertaIzq;

    
    public Coche(){
        this.cierreCentralizado = true; //Cerrado
        this.estado = false; // Apagado
        this.puertaDer = new Puerta();
        this.puertaIzq = new Puerta();
      
    }
    public Coche(boolean cierreCentralizado){
       this.cierreCentralizado = cierreCentralizado;
       this.estado = false;
        this.puertaDer = new Puerta();
        this.puertaIzq = new Puerta();
    }
    public Coche(Coche c){
        this.cierreCentralizado = c.cierreCentralizado;
        this.estado =c.estado;
        this.puertaDer = new Puerta(c.puertaDer);
        this.puertaIzq = new Puerta(c.puertaIzq);
    }

    //Gets
    public boolean getCierreCentralizado(){
        return this.cierreCentralizado;
    }

    public boolean getEstado(){
        return this.estado;
    }
    public Puerta getPuertaDer(){
        return this.puertaDer;
    }
    public Puerta getPuertIzq(){
        return this.puertaIzq;
    }
    // Sets
    private void setCierreCentralizado(boolean cierreCentralizado){
        this.cierreCentralizado = cierreCentralizado;
    }
    private void setEstado(boolean estado){
        this.estado = estado;
    }
    public void setPuertaDer(Puerta puertaDer){
        this.puertaDer = puertaDer;
    }
    public void setPuertaIzq(Puerta puertaIzq){
        this.puertaIzq = puertaIzq;
    }
    //Estos son metodos de la clase
    public void abrirCoche(){
       this.setCierreCentralizado(false);
       this.getPuertaDer().quitarPestillo();
       this.getPuertIzq().quitarPestillo();
        //podemos abrir la puerta
    }
    public void cerrarCoche(){
        if(this.puertaDer.getEstado() && this.puertaIzq.getEstado()){
            this.setCierreCentralizado(true);
        }
        //Para cerrar el coche tiene que estar las puertas cerradas
    }
    public void arrancar(){
       this.setEstado(true);
        //Si la puerta esta cerrada podemos echar el pestillo
    }
    public void apagar(){
        this.setEstado(false);
         //Si la puerta esta cerrada podemos echar el pestillo
    } 
    //Le pasamos un String para repasar los string
    //Para los String es .equals
    public void abrirPuertaCoche(String puerta){
       if(!this.cierreCentralizado){ //Si el cierre no esta echado: 
        if(puerta.equals("Der")){
            this.puertaDer.abrirPuerta();
        }else if(puerta.equals("Izq"))this.puertaIzq.abrirPuerta();
       }
    }
    //Se pueden llamar igual estos metodos porque los parametros son diferentes
    //Añadimos mensajes de error para poder testear

    /**
     * Abre la puerta del coche que se le pasa por parametros, teniendo
     * en cuenta si l cierre cent esta echado o no. No se puede abrir
     * si tiene el cierre echado
     * @param puerta Es la puerta que queremos abrir
     * @return Mensaje de error 1 se puede abrir la puerta y el -1 No se puede
     * abrir la puerta
     */
    public void abrirPuertaCoche(Puerta puerta){
        int salida = -1;
        if(!this.cierreCentralizado){
            puerta.abrirPuerta();
            salida = 1;
        }

    }


    public String toString(){
        String salida = "El coche está ";
        if(this.estado) salida += "arrancado.";
        else salida += "apagado.";

        salida += "El cierre centralizado está "; 

        if(this.cierreCentralizado) salida += "echado. ";
        else salida += "sin echar. ";

        salida += "\nPuerta del conductor: " + this.puertaIzq.toString() + "\n";
        salida += "\nPuerta del copiloto: " + this.puertaDer.toString() + "\n";
       
      
        return salida;
    }
    
    
    
    public static void main(String[] args) {
        Coche coche1 = new Coche();
        System.out.println(coche1);

        coche1.abrirCoche();
        System.out.println(coche1);
        //Abro la puerta del copiloto
        // coche1.getPuertaDer().quitarPestillo();
        
        // int salidaAbrirPuertaCoche = coche1.abrirPuerta(coche1.getPuertaDer());
        // if(salidaAbrirPuertaCoche == -1) System.out.println("Nose ha podido abrir el coche");
        System.out.println(coche1);
        //Bajo la ventanilla del conductor
        coche1.getPuertIzq().getVentanilla().bajar();
        System.out.println(coche1);
        
        coche1.abrirPuertaCoche(coche1.getPuertaDer());
        System.out.println(coche1);
    }
}
