package com.generation.f20220530;

public class Alumno {
    //atributos
    //private protected o public
    //Encapsulacion/encapsulamiento
    //constructores
    //get y set
    //funciones

    //PRIVATE, solo se puede acceder dentro de la misma clase (Casa)
    //PROTECTED, se puede acceder tanto dentro de la misma clase como dentro del PACKAGE (Condominio)
    //PUBLIC, se accede como un parque, todos pueden ocupar dicha funcion

    //atributos > constructor > getter y setter > métodos

    //Get nos devuelve el valor
    //Set nos permite asignar el valor


    private String nombre;
    private String apellido;
    private int edad;
    private String curso;

    //Constructor Vacio
    public Alumno() {
    }

    //Constructor con parametros
    public Alumno(String nombre, String apellido, int edad, String curso) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.curso = curso;
    }


    //Get Obtenedor/Accesador
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    //Generate > ToString
    //De esta manera crea un metodo concatenando lo atributos que deriban de la clase Alumno
    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", curso='" + curso + '\'' +
                '}';
    }
    //SobreEscritura de metodos
    //SobreCarga de metodos
}
