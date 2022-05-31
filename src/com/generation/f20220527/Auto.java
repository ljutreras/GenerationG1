package com.generation.f20220527;

public class Auto {
    //Una clase es un modelo o prototipo
    //Objeto, Nace a partir de la clase
    //Es una caracteristica o atributo
    //tiene Metodos o Funciones
    //Se basa en algo concreto
    //Se convierte en algo abstracto / No tangible
    //tangible: usamos los 5 sentidos para describir

    /**
     * Atributo de colaboracion
     **/
    //Tomar un objeto y usarlo como atributo

    //Atributo
    //Accesador tipo nombreDelAtributo
    private String color;
    private String marca;
    private String modelo;
    private Double velocidad;

    //constructores
    public Auto(String color, String marca, String modelo, Double velocidad) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }


    //Constructor Vacio
    public Auto() {

    }

    // accesadores y mutadores (get y set)

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }


    // metodos o funciones personalizadas, nosotros las creamos desde cero

    public void aumentarVelocidad() {
        //En este objeto (this) a este atributo (velocidad) le asigno este valor (10d)
        this.velocidad = 10d; //a la variable Velocidad, le asignamos un valor Double
    }


}
