package com.generation.f20220524;

public class CalculoPromedio {
    public static void main(String[] args) {

        //int cantidadNotas = 12;
        // ese INT cantidadNotas = 12 se reemplaza por el .length

        //Array de notas
        Integer[] notas = {20,5,67,9,-10,0,88,77,58,79,33,50};//Arrays comunes

        int sumaNotas = 0;
        int notasFueraDeRango = 0;

        //Como recorrer el array de notas
        //en JS es let para la variable, aqui es con int
        for (int i = 0; i < notas.length ; i++){
            //validar nota (negativa o mayor a 100)
            //||
            if (notas[i] < 0 || notas[i] > 100){
                System.out.println("La nota: " + notas[i] + " en la posicion " + (i+1) + " está fuera de rango");
                notasFueraDeRango++;
            }

            sumaNotas = sumaNotas + notas[i];//accedemos a los valores notas[i]
        }

        if(notasFueraDeRango == 0) {
            //promedio -> suma de todas las notas / cantidad de notas;
            float promedio = sumaNotas / notas.length;


            //PUNTO CRITICO
            if (promedio >= 50 && promedio <= 100) {//Primera opcion
                System.out.println("Alumno Aprobado");
            } else if (promedio >= 0 && promedio < 50) {//Segunda opcion
                System.out.println("Alumno Reprobado");//se debe colocar <50 por temas de los decimales que se pierden al colocar <=49

            } else {
                System.out.println("Error en el calculo del promedio, fuera de rango");
            }
        } else {
            System.out.println("Favor revisar notas");
        }

    }
}
