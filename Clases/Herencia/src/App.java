import java.util.ArrayList;
import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) throws Exception {
        LocalDateTime fecha = LocalDateTime.now().minusYears(8);
        Perro miPerro = new Perro("Lata",fecha,"-----","Juana","Chucho");
        fecha = LocalDateTime.now().minusYears(2);
        fecha = fecha.plusMonths(5);
        Perro miOtroPerro = new Perro("Luna", fecha, "----2", "JB", "Husky");

        fecha = LocalDateTime.of(2020, 5, 5, 5, 5, 5);
        Gato miGato = new Gato("Luca", fecha, "-----3", "JB");

        ArrayList<Mascota> listaMascota = new ArrayList<Mascota>();
        listaMascota.add(miPerro);
        listaMascota.add(miOtroPerro);
        listaMascota.add(miGato);
        System.out.println(listaMascota);

        for(Mascota m : listaMascota){
            System.out.println(m.getNombre());
            System.out.println(m.onomatopeyar());
            if(m instanceof Perro){
                //Después de comprobar que es m es un perro
                //Casteamos de mascota a perro 
                //Como m ahora es un perro, podemos llamar al metodo pasear
                System.out.println(((Perro)m).pasear());
            }
        }
    }
}
