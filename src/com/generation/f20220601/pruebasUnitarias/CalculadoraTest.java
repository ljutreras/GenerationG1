package com.generation.f20220601.pruebasUnitarias;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculadoraTest {

    @org.junit.Test
    public void suma() {
        Calculadora calcSuma = new Calculadora();
        int resultado = calcSuma.suma(12,42);//54

        //assertEquals(valorEsperado, Resultado);
        assertEquals(54, resultado);
    }

    @org.junit.Test
    public void resta() {
        Calculadora calcResta = new Calculadora();
        int resultado = calcResta.resta(12,6);

        assertEquals(6,resultado);

    }

    @org.junit.Test
    public void multiplicacion() {
        Calculadora calcMulti = new Calculadora();
        int resultado = calcMulti.Multiplicacion(3,4);

        assertEquals(12,resultado);

    }

    @org.junit.Test
    public void division() {
        Calculadora calcDiv = new Calculadora();
        String resultado = calcDiv.Division(0,0);

        assertNotNull(resultado);
    }


    @Test
    public void numerosPares() {
        Calculadora calcPar = new Calculadora();
        String resultadoPar = calcPar.numerosPares(0);

        assertEquals("Tu numero es par", resultadoPar);
        assertNotNull(resultadoPar);
        assertNotEquals("Tu numero es impar",resultadoPar);

    }

    @Test
    public void numerosImpares() {
    }
}