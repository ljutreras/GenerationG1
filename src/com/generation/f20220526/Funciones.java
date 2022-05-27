package com.generation.f20220526;

public class Funciones {
    public static void main(String[] args) {//Es una funcion
        //Funciones
        //Public, Privated, Protected

        //4 tipos de funciones
        //2 retornan
        //Metodo a retornar (int, String, float, Integer,...)
        //No puede CREAR un metodo dentro de otro metodo,si puede LLAMAR a otro metodo

        //2 no retornan
        //Void no retorna nada, solo ejecuta codigo

        //nombreFuncion se escriben con minuscula la primera letra (calculoSuma)
        //Se debe definir el tipo de parametro de la funcion (int numero1, float numero2, ....)

        saludo();//llamado al metodo
        calculoSumaPares(1,2,"a");

        //Las funciones con retorno se pueden guardar en una variable
        Integer edad = obtenerEdad();
        System.out.println(edad);

        //La variable es definida en funcion a la FUNCION
        //la funcion es un Boolean, por ende, debemos guardarlo en una variable Boolean(Objeto)/boolean(Primitivo)
        boolean validacion = validarMayorEdad(edad);
        System.out.println(validacion);

    }

    //Accesador + tipoDeRetorno + nombreFuncion + (parametrosRecibir){}
    public static void calculoSumaPares(int numero1, Integer numero2,String numero3){
        //Solicitar el ingreso de datos
        //Integer num3 = Integer.parseInt(numero3)
        System.out.println(numero1 + numero2);

    }


    //STATIC nos permite acceder al metodo
    public static void saludo(){
        System.out.println("Buenos dias");
    }

    //Funciones que retornan un tipo de dato
    public static int obtenerEdad(){
        //Debe contener un return
        //Asignamos una variable con un valor

        int edad = 18;
        return edad;//Retorna el contenido de la variable
    }


    public static boolean validarMayorEdad(Integer edad){

        if(edad >= 18){
            return true;
        }else {
            return false;
        }

        //return true;//false
    }

}
