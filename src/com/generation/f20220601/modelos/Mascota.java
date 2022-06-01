package com.generation.f20220601.modelos;


public class Mascota {
    //Atributos
    private String nombre;
    private String color;
    private String especie;
    private String pelaje;
    private float peso;
    private String sexo;

    //Constructor Vacio
    public Mascota() {
    }

    //Constructor con Parametros
    public Mascota(String nombre, String color, String especie, String pelaje, float peso, String sexo) {
        this.nombre = nombre;
        this.color = color;
        this.especie = especie;
        this.pelaje = pelaje;
        this.peso = peso;
        this.sexo = sexo;
    }

    //Getter and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    //@Override es la sobreescritura del metodo
    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                ", especie='" + especie + '\'' +
                ", pelaje='" + pelaje + '\'' +
                ", peso=" + peso +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    //Metodo por default sin @Override
    public void hacerSonido(){
        System.out.println("Muuu");
    }
}
