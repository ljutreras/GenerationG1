package com.generation.f20220526;

import java.util.ArrayList;
import java.util.Collections;

public class ColeccionArrayList {
    public static void main(String[] args) {
        // ArrayList
        //Tipo de dato de el arrayList
        //Esto es un array de tipo objeto
        //Instancia de clase , definicion de arreglo
        ArrayList<String> colores = new ArrayList<String>();
        ArrayList<Integer> numerosPares = new ArrayList<Integer>();

        //Agregar un elemento a la lista
        colores.add("Rojo");
        //Imprimir el contenido del ArralyList
        System.out.println(colores);

        //se agrega un elemento en el indice asignado (1) luego el elemento a agregar (,"azul")
        colores.add(1,"azul");
        System.out.println(colores);

        //se agrega un elemento al indice indicado (1), desplazando hacia la derecha los elementos existentes en el array
        colores.add(1,"verde");
        System.out.println(colores);

        //Imprime el elemento del indice 2
        System.out.println(colores.get(2));

        //.SIZE para imprimir la cantidad de elementos del array en un array Dinamico
        //.LENGHT es similar pero para los Arrays estaticos
        System.out.println(colores.size());

        //recorrer el array
        for (int i = 0; i < colores.size(); i++){
            System.out.println(colores.get(i));

        }

        System.out.println("*************************");

        for (String color:colores) {
            System.out.println(color);

        }

        System.out.println("*****************");

        //Ordenar el Array de forma ascendente
        //Afecta directamente al arreglo, desde que se llama en adelante se encontrara ordenado
        Collections.sort(colores);

        numerosPares.add(14);
        numerosPares.add(2);
        numerosPares.add(8);
        numerosPares.add(6);
        numerosPares.add(10);
        numerosPares.add(20);
        System.out.println();
        System.out.println(numerosPares+" ");

        //Revierte el orden que ya tenias
        Collections.reverse(numerosPares);
        System.out.println(numerosPares);

        System.out.println();
        Collections.sort(numerosPares);
        System.out.println(numerosPares+" ");

        System.out.println();
        //No ordena de forma descendente
        //Revierte el orden que ya tenias
        Collections.reverse(numerosPares);
        System.out.println(numerosPares);

        System.out.println();
        System.out.println("**************************");



        //modificar un elemento
        //.SET se le indica el indice a reemplazar (1,) luego el elemento a ingresar (,"negro")
        //.SET es el similar a [] para reemplazar el indice
        //[] es para los Arrays Estaticos
        colores.set(1,"Negro");
        System.out.println(colores);

        //quitar un elemento
        //.REMOVE elimina un elemento segun el indice indicado (2)
        colores.remove(1);
        System.out.println(colores);

        //quitar todos los elementos modo THANOS
        colores.clear();
        System.out.println(colores);




    }
}
