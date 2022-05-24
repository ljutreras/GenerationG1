package com.generation.f20220524;

import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        /* //Capturar el ingreso por consola
        Scanner sc = new Scanner(System.in);

        //validar la mayoria de edad
        //establecer punto critico -> 18 años

        int mayoriaEdad = 18;

        //solicitar el ingreso de edad
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();//Capturando el ingreso por consola

        if(edad >= mayoriaEdad){
            System.out.println("Usted es mayor de edad");
        }else{
            System.out.println("No esta permitido su ingreso");
        }*/

        //_____________________________________________________//

        //String nombre = sc.nextLine();
        Scanner sc = new Scanner(System.in);

        //Solicitar todos los string

        //nombre
        System.out.println("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        //apellido
        System.out.println("Ingrese su apellido: ");
        String apellido = sc.nextLine();

        //direccion
        System.out.println("Ingrese su direccion: ");
        String direccion = sc.nextLine();

        //numero direccion
        System.out.println("Ingrese el numero de su direccion: ");
        int numeroDireccion = sc.nextInt();

        //edad
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();

        //saldo($)
        System.out.println("Ingrese su saldo actual sin puntos, solo numeros: ");
        int saldo = sc.nextInt();


        //Mayoria de edad
        int mayoriaEdad = 18;
        int saldoMinimo = 50000;
        int apuestaMinima = 10000;

        //condicional mayoriaEdad y saldo minimo 50.000
        if(edad >= mayoriaEdad && saldo >= saldoMinimo ){
            System.out.println("Usted cumple la mayoria de edad y su saldo es suficiente, puede ingresar, pero antes");
            System.out.println("Cuanto quieres apostar? (requisito minimo $10000: ");
            int apuesta = sc.nextInt();

            if (apuesta >= apuestaMinima){
                System.out.println("Bienvenido");
            }else if (apuesta > saldo ){
                System.out.println("Su monto es insuficiente");
            }else if (apuesta < apuestaMinima){
                System.out.println("Debe alcanzar la apuesta minima de $10000, intentelo nuevamente");
                return;
            }
        }else{
            System.out.println("No esta permitido su ingreso");
        }



        //validar el saldo, no puede apostar

        //cuanto va a apostar
        //Minimo apuesta 10.000




    }
}
