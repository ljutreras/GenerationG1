package com.generation.f20220523;

public class CodigoProfe {
    public static void main(String[] args) {

                int iva = 20;
                int dos= 2;
                int tres = 3;

                // variables Primitivas

                // Se define el tipo de dato al cual pertenecera la variable
                // tipo de dato nombre_variable = asignacion;
                // se ocupa \n para dar un salto de linea
                String nombre = "Generation1234''\" \n\n\n 56787!·$%&/(";
                System.out.println(nombre);

                // 16 bit (un solo caracter, entre comillas simple)
                char letraA = 'a';

                // variables numericas
                // 32bits
                int numeroInt = 2147483647;
                System.out.println(numeroInt + 10);

                // 8bits
                byte numeroByte = 127;
                System.out.println(numeroByte);

                // 16bits
                short numeroShort = 32767;
                System.out.println(numeroShort);

                // 64bits (2^263)
                long numeroLong = 2147483647;
                System.out.println(numeroLong);

                // float y double (aceptan decimales)

                // variable booleana (true o false)
                boolean acepta = true;// false

                /***************************************/

                boolean compromiso = true;

                if (compromiso == true) {
                    System.out.println("Estoy comprometido");
                } else {
                    System.out.println("Me da lo mismo");
                }

                String poblacion = "356 mts^2";
                String velocidad = "100 m/s";

                // Variables Objeto
                // El agregar .charAt(4) utilizamos la funcion de traer el indice 4 de la variable VELOCIDAD
                System.out.println(velocidad.charAt(4)); //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<

                String curso = "G1";

                // los String se comparan con .equals
                if (curso.equals("g1")) {// el equals es un boolean
                    System.out.println("iguales");
                } else {
                    System.out.println("distintos");
                }

                if (curso.equalsIgnoreCase("g1")) {//compara el contenido ignorando mayuscula y minuscula
                    System.out.println("iguales");
                } else {
                    System.out.println("distintos");
                }

                if(curso.toLowerCase().equals("g1")) {//
                    System.out.println("iguales");
                }

                if(curso.equals("g1".toUpperCase())) {
                    System.out.println("iguales");
                }

                String curso2 = "";//vacio

                String curso3 = null;     //null
                //comparar un String con null
                if(null == curso3 ) {}

                //Float y Double
                //cast, es convertir un dato a otro tipo de dato
                float altura = (float) 1;//1.73f;

                Double peso1 = 85.5;
                Float peso =  peso1.floatValue();
                Float gravedad = Float.parseFloat("9.6");// parseFloat es la funcion de el objeto Float

                //PARSE: convertir String a un tipo de numero
                Integer.parseInt("23"); // metodo de la clase INTEGER
                Long.parseLong("123456787654"); // metodo de la clase LONG
                Float.parseFloat("85.5"); //metodo de la clase FLOAT
                Double.parseDouble("123245.56");//metodo de la clase DOUBLE

                //ejercicio
                int num1= 12;

                /*CONVERSION DE DATOS*/
                // automatica
                // byte>short>int>long>float>double

                int num4= 18;
                float num4f= num4;
                System.out.println(num4+" "+num4f);

                //manual
                //double>float>long>int>...
                Double peso2 = 75.9;
                float peso2PF = peso2.floatValue();
                Float peso2F =  peso2PF;
                //Float peso2F = peso2.floatValue();

                float numPrimitivo = 123.4f;
                double numero1 = 123.1234;
                Float numObjeto = 123.45f;

                // de float a int, SE PIERDEN LOS DECIMALES, te los trunca
                // Float a Integer, SE PIERDEN LOS DECIMALES, te los trunca


                // + - * / % (operadores) //
                // == != > >= < <= (comparacion)


                if( iva == (3 + dos) ) {

                }
    }
}
