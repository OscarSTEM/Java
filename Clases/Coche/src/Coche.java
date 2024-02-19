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
        this.cierreCentralizado = cierreCentralizado;
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

        coche1.getPuertaDer().quitarPestillo();
        coche1.getPuertaDer().abrirPuerta();;
        System.out.println(coche1);

        coche1.getPuertIzq().getVentanilla().bajar();
        System.out.println(coche1);
        
    }
}
