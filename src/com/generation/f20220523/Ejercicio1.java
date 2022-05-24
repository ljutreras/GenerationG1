package com.generation.f20220523;

public class Ejercicio1 {
    public static void main(String[] args) {
        //calculo area y perimetro
        //variables

        //formula area triangulo
        //impresion

        int dos = 2;
        float diametro = 4f;//Deben asignar un valor
        double PI = 3.1415;//Valor de PI
        float radio = diametro / dos;//Formula de radio


        float formulaCirculo = (float) (dos * PI * radio);
        System.out.println(formulaCirculo);
        //formula perimetro circulo
        //impresion




        //double > float > long > int > short > byte
        double v1 = 2.9;
        Double variable = v1; // numero float
        Integer variable2 = variable.intValue();
        System.out.println(variable2);


        Integer var1 = 10;
        String varStr = var1.toString();
        System.out.println(varStr);

        int calificacion = 49 ;

        if(calificacion >= 50 ){
            System.out.println("Aprobo");
        }else{
            System.out.println("No Aprobo");

        }

    }
}
