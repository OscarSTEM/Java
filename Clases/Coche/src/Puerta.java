public class Puerta {
        private boolean pestillo; 
        private boolean estado; //subida o bajada
        private Ventanilla ventanilla;
    
        
        public Puerta(){
            this.pestillo= true; // Pestillo echado
            this.ventanilla = new Ventanilla();
          
        }
        public Puerta(boolean pestillo){
            this.pestillo = pestillo;
            this.ventanilla = new Ventanilla();
        }
        public Puerta(Puerta p){
            this.pestillo =p.pestillo;
            this.estado =p.estado;
           this.ventanilla = new Ventanilla(p.ventanilla);
        }
    
        //Gets
        public boolean getPestillo(){
            return this.pestillo;
        }

        public boolean getEstado(){
            return this.estado;
        }
        public Ventanilla getVentanilla(){
            return this.ventanilla;
        }
        // Sets
        private void setPestillo(boolean pestillo){
            this.pestillo = pestillo;
        }
        private void setEstado(boolean estado){
            this.estado = estado;
        }
        public void setVentanilla(Ventanilla ventanilla){
            this.ventanilla = ventanilla;
        }
        //Estos son metodos de la clase
        private void abrirPuerta(){
            if(!this.pestillo)this.setEstado(false); //Si no está echado el pestillo
            //podemos abrir la puerta
        }
        private void cerraPuerta(){
            this.setEstado(true);
        }
        private void echarPestillo(){
            if(this.estado)this.setPestillo(true);
            //Si la puerta esta cerrada podemos echar el pestillo
        }
        private void quitarPestillo(){
            this.setPestillo(false);
        }
    
    
    
        public String toString(){
            String salida = "La puerta está ";
            if(this.estado) salida += "cerrada.";
            else salida += "abierta.";

            salida += "El pestillo está "; 

            if(this.pestillo) salida += "echado. ";
            else salida += "sin echar. ";

            salida += this.ventanilla.toString();
          
            return salida;
        }
        
        
        
        public static void main(String[] args) {
            Puerta puerta1 = new Puerta();
            System.err.println(puerta1);
            
            puerta1.quitarPestillo();
            puerta1.abrirPuerta();
            System.out.println(puerta1);

            puerta1.echarPestillo();
            System.out.println(puerta1);

            puerta1.getVentanilla().bajar();
            System.out.println(puerta1);

            puerta1.getVentanilla().tintado();
            System.out.println(puerta1);
        }
    }
    
