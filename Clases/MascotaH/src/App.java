import java.time.LocalDateTime;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        LocalDateTime fecha = LocalDateTime.now().minusYears(8);
        Perro miPerro = new Perro("Lata",fecha,"----1","Juana","Cucho");
        
        fecha = LocalDateTime.now().minusYears(2);
        fecha = fecha.plusMonths(5);
        Perro miOtroPerro = new Perro("Luna",fecha,"----2","Juana","Perro Salchicha");
        
        fecha = LocalDateTime.of(2020, 5, 5, 5, 55, 0, 0);
        Gato miGato = new Gato("Lucas",fecha,"----3","Juana");

        fecha = LocalDateTime.of(2001, 1, 1, 1, 1, 1);
        Pajaro miPajaro = new Pajaro("Rio", fecha, "-----3", "Maribel");

        ArrayList<Mascota> listaMascotas = new ArrayList<Mascota>();
        listaMascotas.add(miPerro);
        listaMascotas.add(miOtroPerro);
        listaMascotas.add(miGato);
        listaMascotas.add(miPajaro);
        System.out.println(listaMascotas);

        
        System.out.println("Imprimimos el nombre de todas las mascotas:");
        for (Mascota m : listaMascotas){
            System.out.println(m.getNombre());
            System.out.println(m.onomatopeyar());
            if (m instanceof Perro){ // ¿Es m una instancia de la clase Perro?
                // Después de comprobar que m es un Perro...
                // Casteamos de mascota a perro -> (Perro)m
                // Como m ahora es un perro, podemos llamar al método pasear.
                System.out.println(((Perro)m).pasear()); 
            }
            if(m instanceof Pajaro){
                System.out.println(((Pajaro)m).volar());
            }
        }


    }
}