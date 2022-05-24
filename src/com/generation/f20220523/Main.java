package com.generation.f20220523;


public class Main {
    public static void main(String[] args) {
        //variables
        //Se define el tipo de dato al cual pertenece la variable
        //Tipo de dato
        //Las variables se pueden tanto concatenar como sumar

        //Variable tipo String
        String nombre = "Leonardo";
        System.out.println(nombre);


        //Variable tipo char
        //Solo admite 1 caracter
        //16 Bits
        //Entre comillas simples ''
        char letraA = 'a';
        System.out.println(letraA);

        //Variable tipo Numerica
        //Nos permite hasta el numero 2147483647
        //32 Bits
        int numeroInt = 2147483647;
        System.out.println(numeroInt + 10);

        //Numero tipo Byte
        //nos permite hasta el numero 127
        //8 Bits
        byte numeroByte = 127;
        System.out.println(numeroByte);

        //Variable tipo short
        //Nos permite hasta el numero 32767
        //16 Bits
        short numerosShort = 32767;
        System.out.println(numerosShort);

        //variable tipo Long
        //64 Bits (2^263)
        long numeroLong = 2147483647;
        System.out.println(numeroLong);

        //Variable Booleana (true o false)
        boolean acepta = true;
        System.out.println(acepta);

        //float y double ( aceptan Decimales)
        int poblacion = 12342345;
        int edadEstudiante = 26;
        String nombreEstudiante = "Leonardo";
        String ocupacion = "Estudiante";
        String genero = "Masculino";
        System.out.println(poblacion +  nombreEstudiante + edadEstudiante + ocupacion +genero);

        //Float Objeto
        //float tipo primitivo


        //float numPrimitivo = 123.4f (sin la f es de tipo Double);
        //Float numObjeto = 123.45f;
        //numObjeto.(funcion)


        //Double/objeto lo pasamos a un numero primitivo .floatValue() luego ese valor lo pasamos a un objeto Float
        //El casteo es float variable = (float) 3/7
        //el (float) se le llama casteo
        Double peso2 = 75.9; // Objeto
        float peso2PF = peso2.floatValue(); //Primitivo
        Float peso2F = peso2PF; //Objeto


        //Como buena practica, el IF debe contener variables como parametro
        int numero1 = 2;
        int numero2 = 3;

        if( 5 == (numero1+numero2) ) {

        }

    }

}