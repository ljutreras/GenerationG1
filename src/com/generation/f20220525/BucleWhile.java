package com.generation.f20220525;

import java.util.Scanner;

public class BucleWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //While solo se repite si es verdadero, de manera que sea falso, se saldra del bucle y continuara el programa
        //DoWhile es lo mismo no obstante al menos se ejecuta una vez

        System.out.println("0 Salir \n1 Sumar \n2 Restar \n3 multiplicar \n4 Dividir");//Solicitando el ingreso de las opciones
        int opcion = sc.nextInt();//Capturando el ingreso por consola

        //Esta es una segunda forma de ultilizar una variable boolean y a su vez un IF para luego agregarlo al While
        boolean errorIngreso = false;
        if (opcion < 0 || opcion > 4){
            errorIngreso = true;
        }


        //while valida que la condicion sea verdadera
        while (errorIngreso) {
            System.out.println("0 Salir \n1 Sumar \n2 Restar \n3 multiplicar \n4 Dividir");//Solicitando el ingreso de las opciones nuevamente
            opcion = sc.nextInt();//Capturando el ingreso por consola

            //Este IF corresponde a la segunda opcion de la variable Boolean
            if (opcion < 0 || opcion > 4){
                errorIngreso = true;
            }else {
                errorIngreso = false;
            }

        }
        System.out.println("Fuera del codigo");

        int termino =0;
        while (termino <= 10){
            System.out.println("Su valor de termino es "+termino);
            termino++;
        }
    }
}



