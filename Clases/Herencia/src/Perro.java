public class Perro extends Mascota {
    // No hace falta hacer un constructor en perro porque no tiene 
    //  nuevos atributos, basta con el de mascota
    @Override
    public String onomatopeyar(){
        return "Guau,guau";
    }
    public static void main(String[] args) {
        Perro miPerro = new Perro();
        System.out.println(miPerro);

        //Polimorfismo
        System.out.println(miPerro.onomatopeyar());
        Mascota miMascota = new Mascota();
        System.out.println(miMascota.onomatopeyar());
    }
}
