package com.generation.f20220525;

import java.util.Scanner;

public class BucleDoWhile {
    public static void main(String[] args) {
        //DoWhile
        //A lo menos se ejecutara una vez
        int termino = 9;
        do {
            System.out.println("el valor de termino es " + termino);
            termino++;
        }while (termino <= 10);

        System.out.println("******************");
        while (termino <= 10){
            System.out.println("Su valor de termino es "+termino);
            termino++;
        }

        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        do {
            System.out.println("0 Salir \n1 Sumar \n2 Restar \n3 multiplicar \n4 Dividir");
            opcion = sc.nextInt();
        }while (opcion < 0 || opcion > 4);

    }
}
