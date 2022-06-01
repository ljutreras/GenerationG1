package com.generation.f20220601.Ejercicio;

public class Depto extends Piso{
    //Atributo
    private String nombreDueño;
    private int numPiezas;



    //Constructor Vacio

    public Depto() {
    }


    //constructor parametros

    public Depto(String nombreDueño, int numPiezas) {
        this.nombreDueño = nombreDueño;
        this.numPiezas = numPiezas;
    }


    //Setter Getter

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public int getNumPiezas() {
        return numPiezas;
    }

    public void setNumPiezas(int numPiezas) {
        this.numPiezas = numPiezas;
    }


    //toString


    @Override
    public String toString() {
        return "Depto{" +
                "nombreDueño='" + nombreDueño + '\'' +
                ", numPiezas=" + numPiezas +
                '}';
    }
}
