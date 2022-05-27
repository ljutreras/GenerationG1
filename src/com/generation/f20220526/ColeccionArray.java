package com.generation.f20220526;

import java.util.Arrays;

public class ColeccionArray {
    public static void main(String[] args) {
        // ARRAYS ESTATICOS
        //A diferencia de JS el Array solo se limita al tipo de dato establecido
        //En este caso String
        String[] colores = {"red","blue","yellow","orange","black"};
        Integer[] numerosPares = {2,4,6,8,10,12};
        int[] primerosNumeros = {1,2,3,4,5,6,7,8,9,0};

        //posicion inicial es cero (0)
        System.out.println(colores[0]);
        System.out.println(numerosPares[0]);
        System.out.println(primerosNumeros[0]);

        //nombreArray [posicion] -> accedientdo al elemento del arreglo en esa posicion
        System.out.println(numerosPares[3]);

        numerosPares[3] = 14;//Modificando el elemento del array en la posicion 3
        System.out.println(numerosPares[3]);

        //numerosPares[7] = 14; //error fuera del indice, no podemos agregar por posicion si no existe un elemento
                                //Solo se sobreescribe el elemento del array, no asi agrega un nuevo elemento

        System.out.println("Array Colores "+colores.length);//Muestra la cantidad de elementos dentro del Array colores
        System.out.println("Array numerosPares " + numerosPares.length);//Muestra la cantidad de elementos dentro del Array numerosPares
        System.out.println("Array primerosNumeros "+ primerosNumeros.length);//Muestra la cantidad de elementos dentro del Array primerosNumeros

        System.out.println(colores.toString()); //muestra el tipo de dato/array en colores
        System.out.println(numerosPares.toString());//muestra el tipo de dato/array en numerosPares
        System.out.println(primerosNumeros.toString());//muestra el tipo de dato/array en primerosNumeros

        System.out.println(Arrays.toString(colores));//Imprime el array COLORES
        System.out.println(Arrays.toString(numerosPares));//Imprime el array numerosPares
        System.out.println(Arrays.toString(primerosNumeros));//Imprime el array primerosNumeros


        //FOR
        //Recorre el array pero dandole un termino, puede ser por completo como también puede ser una parte (<5)
        for (int i = 0; i < primerosNumeros.length; i++) {
            System.out.println(primerosNumeros[i]);//println significa PrintNewLine, por ende lo realiza con saltos de linea

        }
        for (int i = 0; i < primerosNumeros.length; i++) {
            System.out.print(primerosNumeros[i]);//imprime sin salto de linea, pegadito al costado
        }

        for (int i = 0; i < primerosNumeros.length; i++) {
            System.out.print(primerosNumeros[i] + " ");//imprime para el costado con un espacion concatenado

        }

        //FOR EACH
        //Recorre por completo el array, y los van agregando a la variable
        for (int elemento: primerosNumeros) {
            System.out.print(elemento+" ");//va recorriendo el array y asignando los elementos a la variable ELEMENTO

        }

        for (String color : colores ) {//va recorriendo el array y asignando los elementos a la variable COLOR
            System.out.print(color+" ");

        }

        for (int num:numerosPares ) {//va recorriendo el array y asignando los elementos a la variable NUM
            System.out.print(num+" ");
        }


    }
}
