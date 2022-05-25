package com.generation.f20220525;

import java.util.Scanner;

public class CondicionalSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //menu
        System.out.println("Ingrese una opcion: ");
        System.out.println("1 Sumar \n2 Restar \n3 multiplicar \n4 Dividir");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1: //Sumar
                    //El [1] representa la opcion capturada por el usuario, en este caso representa la opcion [1] Sumar
                System.out.println("** Suma");   //accion para la opcion 1

                break;
            case 2: //Restar
                System.out.println("** Restar");

                break;
            case 3: //Multiplicar
                System.out.println("** Multiplicar");

                break;
            case 4: //Dividir
                System.out.println("** Dividir");

                break;

            default:
                System.out.println("Opcion incorrecta");
                break;
        }

        System.out.println("Fuera del Switch");

    }
}
