package com.generation.f20220601.Ejercicio;

public class Piso extends Edificio {
    //atributos
    private int cantidadDepto;
    private String tipoDepto;
    private int numeroPiso;

    //constructor Vacio

    public Piso() {
    }

    //constructor con parametros

    public Piso(int cantidadDepto, String tipoDepto, int numeroPiso) {
        this.cantidadDepto = cantidadDepto;
        this.tipoDepto = tipoDepto;
        this.numeroPiso = numeroPiso;
    }


    //Getter Setter

    public int getCantidadDepto() {
        return cantidadDepto;
    }

    public void setCantidadDepto(int cantidadDepto) {
        this.cantidadDepto = cantidadDepto;
    }

    public String getTipoDepto() {
        return tipoDepto;
    }

    public void setTipoDepto(String tipoDepto) {
        this.tipoDepto = tipoDepto;
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }


    //toString}

    @Override
    public String toString() {
        return "Piso{" +
                "cantidadDepto=" + cantidadDepto +
                ", tipoDepto='" + tipoDepto + '\'' +
                ", numeroPiso=" + numeroPiso +
                '}';
    }
}
