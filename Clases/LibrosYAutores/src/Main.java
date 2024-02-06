import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
      
        Libro libro2 = new Libro("Harry Potter la piedra filosofal","J.K.Rowling",2345678, 600, 0);
        Libro libro3 = new Libro("El hobbit: un viaje inesperado","J.R.R Tolkien",3456789, 600,1937 );
        ArrayList<Libro> librosAutor1 = new ArrayList<Libro>();
        librosAutor1.add(libro2);
        librosAutor1.add(libro3);
        
        Libro libro4 = new Libro("Harry Potter la piedra filosofal","J.K.Rowling",456788, 600, 1997);
        Libro libro5 = new Libro("Harry Potter la camara secreta","J.K.Rowling",123456789,500,1999);
        Libro libro6 = new Libro("El señor de los anillos: las dos torres","J.R.R.Tolkien",56788123, 600, 1979);
        ArrayList<Libro> librosAutor2 = new ArrayList<Libro>();
        librosAutor1.add(libro4);
        librosAutor1.add(libro5);
        librosAutor1.add(libro6);
        Libro libro7 = new Libro("Crimen y castigo","Dostoyesvki", 678912345, 200,1800);
        Libro libro8 = new Libro("La cantina de media noche","Yaro Abel",788123456, 600, 2020);
        Libro libro9 = new Libro("El proceso","Kafka",891234567, 1800,200);
        ArrayList<Libro> librosAutor3 = new ArrayList<Libro>();
        librosAutor1.add(libro7);
        librosAutor1.add(libro8);
        librosAutor1.add(libro9);

        Autor autor1 = new Autor("Georgi Gospidinov", "Bulgaro",1970, 0,librosAutor1);
        Autor autor2 = new Autor("Jane Austen", "Inglesa",1790, 1850,librosAutor2);
        Autor autor3 = new Autor("Kafka", "Aleman",1883, 1924,librosAutor3);
        
        System.out.println(autor1);
        System.out.println(autor2);
        System.out.println(autor3);

        ArrayList<Autor> listaAutores = new ArrayList<Autor>();
        listaAutores.add(autor1);
        listaAutores.add(autor2);
        listaAutores.add(autor3);
        
        System.out.println("Muestra el nombre de los autores que no están muertos");
        for(Autor autor : listaAutores){
            if(autor.getAnioMuerte() == 0) System.out.println(autor.getNombre()); 
        }
        System.out.println("Muestra el nombre de los libros que tenga mas de 200 paginas");
        for(Autor autor : listaAutores){
            for(Libro libro : autor.getLibrosEscritos()){
                if(libro.getNumPaginas() >= 200) System.out.println(libro.getTitulo());
            }
        }
        System.out.println("Muestra el nombre de los autores que tengan mas de 30 años");
        for(Autor autor : listaAutores){
            if(autor.getAnioMuerte() == 0 && ((2024 - autor.getAnioNacimiento()) > 30)){
                System.out.println(autor.getNombre());
            }
        }
        System.out.println("Muestra el nombre de los libros que fueron escritos cuando sus autores teian menos de 30 años");
        // en los for each podemos declarar variables que fuera del for desaparecen 
        for(Autor autor : listaAutores){
            for(Libro libro : autor.getLibrosEscritos()){
                if(libro.getFechaPublicacion() - autor.getAnioNacimiento() < 30)
                    System.out.println(libro.getTitulo());
            }
        }
        System.out.println("Muestra el nombre de los autores cuyos libros no tengan mas de 500 pags");
        for(Autor autor : listaAutores){
            boolean sonLibrosChicos = true;
            for(Libro libro : autor.getLibrosEscritos()){
                if(libro.getNumPaginas() > 500) sonLibrosChicos = false;
            }
            if(sonLibrosChicos)System.out.println(autor.getNombre());
        }
        // System.out.println("Arraylist con size(): " + listaAutores.size() );
        // listaAutores.size();
        // String palabra = "palabra";
        // System.out.println("String con length(): " + palabra.length());
        
        // String[] listaStatica = {"hola","adios"};
        // System.out.println("Lista Statica con length "+ listaStatica.length);
    }
}
