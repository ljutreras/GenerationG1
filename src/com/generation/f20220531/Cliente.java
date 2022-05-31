package com.generation.f20220531;

import java.util.List;

public class Cliente {
    //Cuando no se le agrega nada antes de la variable, se le llama por default
    //Solo funcionaria o solo podrían acceder dentro del mismo package
    //No asi desde otro package

    //Los PRIVATE solo pueden utilizarse dentro de la clase
    //Los PUBLICOS son utilizados desde cualquier package
    //los PROTECTED es similar al default, se pueden acceder desde el mismo package y las sub clases

    private String rut;
    private Integer id;
    private List<Integer> numerosVenta;
    private String nombre;
    private String correo;

    //Constructor Vacio
    //le asignamos los parametros depués
    public Cliente() {
    }

    //Constructor con parametros
    public Cliente(String rut, Integer id, List<Integer> numerosVenta, String nombre, String correo) {
        this.rut = rut;
        this.id = id;
        this.numerosVenta = numerosVenta;
        this.nombre = nombre;
        this.correo = correo;
    }

    //getter and setter
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Integer> getNumerosVenta() {
        return numerosVenta;
    }

    public void setNumerosVenta(List<Integer> numerosVenta) {
        this.numerosVenta = numerosVenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "rut='" + rut + '\'' +
                ", id=" + id +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                '}';
    }
}
