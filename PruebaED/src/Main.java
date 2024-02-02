import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Solicita 10 circulos y los mete en un ArrayList de Circulos
        // Muestra por pantalla los circulos introducidos
        Scanner sc = new Scanner(System.in);
        Circulo circulo;
        int radio;
        String color;
        ArrayList<Circulo> listaDeCirculos = new ArrayList<Circulo>();

        for(int i = 0; i < 2; i++){
        System.out.println("Introduce el radio de tu circulo");
        radio = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce el color de tu circulo");
        color = sc.nextLine();

        circulo = new Circulo(radio, color);
        System.out.println("El radio es " + radio +" y el color es " + color);

        listaDeCirculos.add(circulo);

        }
        
        for(Circulo c : listaDeCirculos){
            System.out.println(c);
        }

    }
}
