package com.generation.f20220601;

import com.generation.f20220601.modelos.Gato;
import com.generation.f20220601.modelos.Mascota;
import com.generation.f20220601.modelos.Michi;
import com.generation.f20220601.modelos.Perro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //herencia
        //con la palabra reservada EXTENDS hemos agregado los atributos de Mascota desde PERRO y GATO
        Mascota mascota = new Mascota();
        mascota.setColor("gris");

        Perro perro = new Perro();


        Gato gato = new Gato();
        gato.setNombre("Tom");
        gato.setColor("Azul");
        gato.setGarrasRetractil(true);
        gato.setSonidoVocal("Ronroneo");
        //System.out.println(gato.toString());

        Michi michi = new Michi(true);
        //System.out.println(michi.toString());

        /**POLIMORFISMO*/
        List<Mascota> listaMascota = new ArrayList<Mascota>();
        Mascota regalon = new Mascota("Negro", "Canes","Pelo","Firulais",1.5f,"Macho");
        listaMascota.add(regalon);


        Mascota felix = new Gato();
        felix.setColor("Negro");
        felix.setNombre("Felix");
        felix.setPeso(3);
        listaMascota.add(felix);

        Mascota chocolo = new Perro();
        chocolo.setNombre("Chocolo");
        chocolo.setColor("Cafe");
        chocolo.setPeso(10);
        listaMascota.add(chocolo);

        regalon.hacerSonido();//Llamando al metodo en mascota
        felix.hacerSonido();
        chocolo.hacerSonido();

        for (Mascota mascota2:listaMascota ) {  //De esta manera en vez de crear 3 lineas de codigo
                                                //Recorremos la lista e imprimimos el metodo
            mascota2.hacerSonido();
        }

        //Transformar el objeto
        Perro perroChocolo = (Perro) chocolo;






    }
}
