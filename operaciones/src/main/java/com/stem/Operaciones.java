package com.stem;

import java.util.ArrayList;

/**
 * Clase que contiene diferentes operaciones matemáticas y de manipulación de
 * cadenas.
 */
public class Operaciones {

    /**
     * Realiza la suma de dos números enteros.
     *
     * @param a El primer número entero.
     * @param b El segundo número entero.
     * @return La suma de los dos números.
     */
    public int suma(int a, int b) {
        return a + b;
    }

    /**
     * Realiza la resta de dos números enteros.
     *
     * @param a El primer número entero.
     * @param b El segundo número entero.
     * @return La resta de los dos números.
     */
    public int resta(int a, int b) {
        return a - b;
    }

    /**
     * Realiza la mulitiplicación de dos números enteros.
     *
     * @param a El primer número entero.
     * @param b El segundo número entero.
     * @return La multiplicación de los dos números.
     */
    public int multiplicacion(int a, int b) {
        return a * b;
    }

    /**
     * Indica si el segundo valor es mayor que el primero.
     *
     * @param a El primer número entero.
     * @param b El segundo número entero.
     * @return True si el segundo valor es mayor que el primero.
     */
    public boolean esMayor(int a, int b){
        return b > a;
    }



    /**
     * Calcula la suma de los elementos de una lista de enteros.
     *
     * @param lista La lista de enteros.
     * @return La suma de los elementos de la lista.
     */
    public int sumaLista(ArrayList<Integer> lista) {
        int resultado = 0;
        for (int num : lista) {
            resultado += num;
        }
        return resultado;
    }

    /**
     * Trunca un string en el carácter 5 y rellena con guiones "-" si tiene menos de
     * 5 caracteres.
     *
     * @param texto El texto a truncar.
     * @return El texto truncado o rellenado con guiones.
     */
    public String truncar5(String texto) {
        if (texto.length() >= 5) {
            texto = texto.substring(0, 5);
        } else {
            while (texto.length() < 5) {
                texto += "-";
            }
        }
        return texto;
    }

    /**
     * Busca un número en la lista de números. -> indexOf(Object o)
     * @param numero Número que se quiere buscar.
     * @param listaNumeros Lista de números sobre la que se quiere buscar.
     * @return La posición en la que se ha encontrado el número. Si no se ha encontrado devuelve -1.
     */
    public int buscarNumeroEnLista(int numero, ArrayList<Integer> listaNumeros){
        int posicion = -1;
        boolean encontrado = false;
        for (int i = 0 ; i < listaNumeros.size() && !encontrado ; i++){
            if (listaNumeros.get(i) == numero){
                posicion = i;
                encontrado = true;
            } 
        }
        return posicion;
    }

    /**
     * Devuelve una lista con todas las posiciones en las que aparece un número dado.
     * @param numero Número que se va a buscar en la lista de números.
     * @return Lista con todas las posiciones en las que aparece el número.
     */
    public ArrayList<Integer> buscarTodasLasOcurrencias(int numero, ArrayList<Integer> listaNumeros){
        ArrayList<Integer> listaPosiciones = new ArrayList<Integer>();
        for (int i = 0 ; i < listaNumeros.size() ; i++){
            if (listaNumeros.get(i) == numero){
                listaPosiciones.add(i);
            } 
        }
        return listaPosiciones;
    }
}
