package com.generation.f20220523;

public class CalculoPromedio {
    public static void main(String[] args) {

        //int cantidadNotas = 12;
        // ese INT cantidadNotas = 12 se reemplaza por el .length
        //Array de notas
        Integer[] notas = {20,50,67,99,10,0,88,77,58,79,33,50};//Arrays comunes



        int sumaNotas = 0;
        //Como recorrer el array de notas
        //en JS es let para la variable, aqui es con int
        for (int i = 0; i < notas.length ; i++){
            sumaNotas = sumaNotas + notas[i];
        }
        System.out.println("suma de notas: " + sumaNotas);

        //promedio -> suma de todas las notas / cantidad de notas;
        float promedio = sumaNotas / notas.length;

        if(promedio >= 50 && promedio <= 100){

        }else{

        }



    }
}
