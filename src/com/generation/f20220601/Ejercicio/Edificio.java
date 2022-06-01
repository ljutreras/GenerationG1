package com.generation.f20220601.Ejercicio;

public class Edificio {

    //Atributo
    private String direccion;
    private int pisos;
    private String color;
    private int puntoDeAcceso;

    //Constructor Vacio

    public Edificio() {
    }

    public Edificio(String direccion, int pisos, String color, int puntoDeAcceso) {
        this.direccion = direccion;
        this.pisos = pisos;
        this.color = color;
        this.puntoDeAcceso = puntoDeAcceso;
    }

    //Setter Getter

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPuntoDeAcceso() {
        return puntoDeAcceso;
    }

    public void setPuntoDeAcceso(int puntoDeAcceso) {
        this.puntoDeAcceso = puntoDeAcceso;
    }


    //toString


    @Override
    public String toString() {
        return "Edificio{" +
                "direccion='" + direccion + '\'' +
                ", pisos=" + pisos +
                ", color='" + color + '\'' +
                ", puntoDeAcceso=" + puntoDeAcceso +
                '}';
    }
}
