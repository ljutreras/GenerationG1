package com.generation.f20220527;

import java.util.ArrayList;
import java.util.HashMap;

public class ColeccionesMap {
    public static void main(String[] args) {
        //colecciones map
        //Pares clave <-> valor
        //HashMap<K, V> map = new HashMap<K, V>();
        //K key o clave; V value o valor
        //HashMap mapa = new HashMap(); //Este es el que mas se utiliza

        /**EL HASHMAP ES LO MAS CERCANO QUE TENDREMOS A UNA API**/

        //De esta manera le decimos explicitamente de que tipo se trata el HashMap <String, String>
        //HashMap<String, String> map = new HashMap<>();

        //De esta manera solo se permiten clases OBJETO
        HashMap objHashMap = new HashMap();

        objHashMap.put("Nombre", "Leonardo");
        objHashMap.put("ApellidoP", "Utreras");
        objHashMap.put("ApellidoM", "Montesinos");
        objHashMap.put("Edad", "26");

        System.out.println("Elementos del Mapa");
        System.out.println(objHashMap);

        //Para obtener un valor en especifico, no se trabaja con los indices
        //Se trabaja con el Get y las llaves, en este caso ApellidoM
        System.out.println(objHashMap.get("ApellidoM"));

        //Para remover la Key:Value se ocupa REMOVE y solo se agrega la llave
        System.out.println(objHashMap.remove("ApellidoM"));
        System.out.println(objHashMap);

        //Muestra las llaves disponibles
        System.out.println(objHashMap.keySet());

        //Muestra los valores disponibles
        System.out.println(objHashMap.values());

        ArrayList<String> vocales = new ArrayList<String>();
        vocales.add("a");
        vocales.add("e");
        vocales.add("i");
        vocales.add("o");
        vocales.add("u");

        //si no encuentra la clave, retorna Null
        objHashMap.put ("Vocales", vocales);
        System.out.println(objHashMap);

        //Crear un menu de comida
        //hashmap
        //Ingrese la opcion
        //solicitar al usuario
        //Elija el plato
        //Imprimir el plato

        //Como recorrer un HashMap
        for (Object clave : objHashMap.keySet()) {

            System.out.println("clave: "+clave+" - valor: "+objHashMap.get(clave));
        }



    }
}
