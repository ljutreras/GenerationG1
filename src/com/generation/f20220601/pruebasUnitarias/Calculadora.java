package com.generation.f20220601.pruebasUnitarias;

public class Calculadora {
    // SUMA
    public int suma(int numero1 , int numero2){
        return numero1 + numero2;
    }

    //RESTA
    public int resta(int numero1 , int numero2){
        return numero1 - numero2;
    }

    //MULTIPLICACION
    public int Multiplicacion(int numero1 , int numero2){
        return numero1 * numero2;
    }

    //DIVISION
    public String Division(int numero1 , int numero2){
        if(numero2 !=0){
            String resultado = Integer.toString(numero1/numero2);
            return resultado;
        }
        return "No se puede dividir por cero";
    }

    //Pares
    public String numerosPares(int numero){
        if(numero % 2 == 0){
            String resultado = "Tu numero es par";
            return resultado;
        }
        return "Tu numero es Impar";
    }


    //Impares
    public String numerosImpares(int numero){
        if(numero % 2 != 0){
            String resultado = "Tu numero es impar";
            return resultado;
        }
        return "Tu numero es par";
    }





}
