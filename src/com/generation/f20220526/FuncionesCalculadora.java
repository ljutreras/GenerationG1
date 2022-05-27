package com.generation.f20220526;

public class FuncionesCalculadora {
    public static void main(String[] args) {

        //Math

        //Elevar (^) o Potencia
        //Math.pow realiza el elevado al numero, (2 es el numero a elevar, 3 es el exponente)
        double numeroElevado = Math.pow(4.5,7);
        System.out.println(numeroElevado);

        //Redondearal entero Mayor
        double enteroMayor = Math.ceil(numeroElevado);
        System.out.println(enteroMayor);

        //Redondear al entero Menor
        double enteroMenor = Math.floor(numeroElevado);
        System.out.println(enteroMenor);

        //Redondeo segun decimal
        double enteroRedondeado = Math.round(numeroElevado);
        System.out.println(enteroRedondeado);

        //Numero Aleatorios
        //Math.random() >= 0.0 y < 1.0
        double aleatorio = Math.random();
        System.out.println(aleatorio);

        //numeros aleatorios entre 0 y 10
        double num010 = Math.random() * 10;
        System.out.println(num010);

        //numeros aleatorios entre 2 y 8
        //(Math.random() * (max - min)) + min;
        double num28 = (Math.random() * (8-2)) + 2;
        System.out.println(num28);

    }
}
