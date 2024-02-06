

public class Persiana {
    
    private double tamanio;
    private boolean estaSubida;

    public Persiana(){
        this.tamanio = 0;
        this.estaSubida = false;

    }
    public Persiana(double tamanio){
        this.tamanio = 0;
        this.setTamanio(tamanio);
        this.estaSubida = false;
    }
    public Persiana(double tamanio,boolean estaSubida){
        this.tamanio = 0;
        this.setTamanio(tamanio);
        this.estaSubida = estaSubida;
    }
    public Persiana(Persiana p){
        this.tamanio = p.tamanio;
        this.estaSubida = p.estaSubida;
    }
    public double getTamanio(){
        return this.tamanio;
    }
    public boolean getEstaSubida(){
        return this.estaSubida;
    }
    public void setTamanio(double tamanio){
        if(this.tamanio > 0) this.tamanio = tamanio;
    }
    //Podemos hacer privado el set, porque al tener los metodos subir() y bajar()
    //que realizan la funcion
    public void setEstaSubida(boolean estaSubida){
        this.estaSubida = estaSubida;
    }
    public void subir(){
        this.setEstaSubida(true);
    }
    public void bajar(){
        this.setEstaSubida(false);
    }
    public String toString(){
        String salida = "La persiana esta: ";
        if(this.estaSubida) salida += "subida";
        else salida += "bajada ";
        return salida;
    }
    public static void main(String[] args) {
       Persiana persiana1 = new Persiana();
       Persiana persiana2 = new Persiana(1.34,true);
       Persiana persiana3 = new Persiana(persiana2);

       System.out.println("La persiana 1: " + persiana1);
       System.out.println("La persiana 2: " + persiana2);
       System.out.println("La persiana 3: " + persiana3);


       persiana3.bajar();
       System.out.println( persiana3);
       persiana3.subir();
       System.out.println( persiana3);


    }
}
