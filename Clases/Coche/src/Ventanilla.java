import java.util.ArrayList;

public class Ventanilla {
    
    private boolean transparencia; 
    // Lo que no es transparente es tintado.
    private double tamanio;
    private boolean estado; //subida o bajada

    
    public Ventanilla(){
        this.transparencia= true;
        this.tamanio = 15;
        this.estado = true; //Subida
      
    }
    public Ventanilla(boolean transparencia, double tamanio, boolean estado){
        this.transparencia = transparencia;
        this.tamanio= tamanio;
        this.estado = estado;
    }
    public Ventanilla(Ventanilla v){
        this.transparencia = v.transparencia;
        this.tamanio = v.tamanio;
        this.estado = v.estado;
    }

    //Gets
    public boolean getTransparencia(){
        return this.transparencia;
    }
    public double getTamanio(){
        return this.tamanio;
    }
    public boolean getEstado(){
        return this.estado;
    }
    // Sets
    private void setTransparencia(boolean transparencia){
        this.transparencia = transparencia;
    }
    public void setTamanio(double tamanio){
        this.tamanio = tamanio;
    }
    private void setEstado(boolean estado){
        this.estado = estado;
    }
    //Estos son metodos de la clase
    public void subir(){
        this.setEstado(true);
    }
    public void bajar(){
        this.setEstado(false);
    }
    public void tintado(){
        this.setTransparencia(false);
    }
    public void noTintado(){
        this.setTransparencia(true);
    }



    public String toString(){
        String salida = "La ventanilla es ";
        if(this.transparencia) salida += "transparente. ";
        else salida += "de cristal tintado. ";
        salida += "Es de tamaño " + this.tamanio + " y está ";

        if(this.estado) salida += "subida.";
        else salida += "bajada.";
        return salida;
    }
    
    
    
    public static void main(String[] args) {
        Ventanilla ventanilla1 = new Ventanilla();
        System.err.println(ventanilla1);

        ventanilla1.bajar();
        ventanilla1.tintado();
        System.out.println(ventanilla1);
    }
}
