public class Ventana {
    
    private double tamanio;
    private int transparencia;
    private boolean estaAbierta;
    private Persiana persiana;
    
    public Ventana(){
        this.tamanio = 0;
        this.transparencia = 100;
        this.estaAbierta = false;
        this.persiana = new Persiana();

    }
    public Ventana(double tamanio, int transparencia, boolean estaAbierta){
        this.tamanio = 0;
        this.setTamanio(tamanio);
        this.transparencia = 100; // Restringir
        this.setTransparencia(transparencia);
        this.estaAbierta = estaAbierta;
        this.persiana = new Persiana(this.tamanio);
    }
    public Ventana(double tamanio, int transparencia, boolean estaAbierta, Persiana persiana){
        this.tamanio = 0;
        this.setTamanio(tamanio);
        this.transparencia = 100; // Restringir
        this.setTransparencia(transparencia);
        this.estaAbierta = estaAbierta;
        this.persiana = new Persiana(this.tamanio);
        this.setPersiana(persiana);
    }
    public Ventana(Ventana v){
        this.tamanio = v.tamanio;
        this.transparencia = v.transparencia; 
        this.estaAbierta = v.estaAbierta;
        this.persiana = new Persiana(this.tamanio);
    }

    public double getTamanio(){
        return this.tamanio;
    }
    public int getTransparencia(){
        return this.transparencia;
    }
    public boolean getEstaAbierta(){
        return this.estaAbierta;
    }
    public Persiana getPersiana(){
        return this.persiana;
    }
    public void setTamanio(double tamanio){
        if(this.tamanio > 0) this.tamanio = tamanio;
         this.tamanio = tamanio;
    }
    public void setTransparencia(int transparencia){
        if (transparencia >= 0 && transparencia <= 100) this.transparencia = transparencia;
    }
    public void setEstaAbierta(boolean estaAbierta){
        this.estaAbierta = estaAbierta;
    }
    public void setPersiana(Persiana persiana){
        if(persiana.getTamanio() <= this.tamanio) 
        //No hacer el this.persiana= persiana porque copiamos solo el puntero.
        // No podemos hacer: this.persiana.tamanio = persiana.tamanio;
        // Al no estar en la clase persiana no tenemos acceso a .tamanio de persiana
        // Para acceder a esa informacion tenemos que usar sus metodos publicos
        this.persiana.setTamanio(persiana.getTamanio());
        this.persiana.setEstaSubida(persiana.getEstaSubida());
    }
    public void abrir(){
        this.setEstaAbierta(true);
    }
    public void cerrar(){
        this.setEstaAbierta(false);
    }
    public String toString(){
        String salida = "La ventana, de cristales " + this.transparencia + "% transparentes está ";
        if(this.estaAbierta) salida += "abierta";
        else salida += "cerrada." ;
        
        return salida;
    }

    public static void main(String[] args){
    
       Persiana persiana1 = new Persiana(1.34,true);
       
        Ventana ventana1 = new Ventana();
        Ventana ventana2 = new Ventana(1.52,50,true);
        Ventana ventana3 = new Ventana(2.22,75,false,persiana1);
        Ventana ventana4 = new Ventana(ventana3);
        System.out.println("La ventana 1: " + ventana1);
        System.out.println("La ventana 2: " + ventana2);
        System.out.println("La ventana 3: " + ventana3);
        System.out.println("La ventana 4: " + ventana4);
        // System.out.println("La persiana 1: " + persiana1);
    //    System.out.println("La persiana 2: " + persiana2);
    //    System.out.println("La persiana 3: " + persiana3);


        ventana3.cerrar();
        System.out.println("Cerramos la ventana 3: " + ventana3);
        ventana3.abrir();
        System.out.println( "Abrimos la ventana 3: " + ventana3);
        //Bajar la persiana de la ventana 3
        ventana3.getPersiana().bajar();
    }
}
