package com.generation.f20220530;

import com.generation.f20220531.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Instancia de una clase
        // Se llama instancia a todo objeto que derive de algún otro.
        // De esta forma, todos los objetos son instancias de algún otro,
        // menos la clase Object que es la madre de todas. Clases: Descripción de de objeto.
        // Consta de una serie de métodos y datos que resumen las características de este objeto.

        //Definicion de un objeto, por lo tanto cuando nosotros queramos definir una variable de tipo objeto, solo la invocamos

        //Objeto/variable (Alumno) atributo (alumno) = Instancia de la clase (NEW) Constructor();
        //Es una costumbre el escribir el objeto igual al atributo

        //Constructor con parametros es cuando inicialicemos la variable con parametros por default
        //Alumno alumno = new Alumno ();

        /**Las interfaces solo van a definir los metodos
         * List, Amplía las opciones de un array
         * ArrayList contiene menos funciones
         */
        List <Alumno> ListaAlumnos = new ArrayList<Alumno>();

        Alumno alumno01 = new Alumno("Luis ","Mejias ",28," G1");
        Alumno alumno02 = new Alumno("Leonardo ","Utreras ",26," G1");
        Alumno alumno03 = new Alumno("Mary ","Aedo ",18," G1");
        Alumno alumno04 = new Alumno("Francisco ","Perez ",26," G1");
        Alumno alumno05 = new Alumno("Francisco ","Cid ",25," G1");
        Alumno alumno06 = new Alumno("Ignacio ","Romero ",23," G1");

        ListaAlumnos.add(alumno01);

        System.out.println(alumno01.getNombre() + alumno01.getApellido() + alumno01.getEdad() + alumno01.getCurso());
        System.out.println(alumno02.getNombre() + alumno02.getApellido() + alumno02.getEdad() + alumno02.getCurso());
        System.out.println(alumno03.getNombre() + alumno03.getApellido() + alumno03.getEdad() + alumno03.getCurso());
        System.out.println(alumno04.getNombre() + alumno04.getApellido() + alumno04.getEdad() + alumno04.getCurso());
        System.out.println(alumno05.getNombre() + alumno05.getApellido() + alumno05.getEdad() + alumno05.getCurso());
        System.out.println(alumno06.getNombre() + alumno06.getApellido() + alumno06.getEdad() + alumno06.getCurso());

        //System.out.println(alumno01.toString());

        //Setter

        for (Alumno dato:ListaAlumnos ) {
            System.out.println("For each "+dato);
        }

        for (int i=0; i < ListaAlumnos.size(); i++){
            System.out.println("For " + ListaAlumnos.get(i).getNombre());
            System.out.println("For " + ListaAlumnos.get(i).getApellido());
        }
        //Imprime los toString de cada objeto

    }

}
