
public interface Sofa{
   
    /**
     * No puede ser un atributo privado porque no tiene sentido que 
     * solo pueda utilizarse dentro de la interfaz
     * Tiene que estar siempre inicializado un valor por defecto
     * Como el atributo es de la interfaz es final y estatico aunque
     * no se ponga
     */
    
    int numPlazas = 2;
    /**
     * 
     * @return Devuelve el texto "Me siento..."
     */
    public String sentarse();
    
}