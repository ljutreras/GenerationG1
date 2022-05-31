package com.generation.f20220531.manager;

import com.generation.f20220531.Cliente;

import java.util.List;

public class ClienteManager {
    //recorrer el arreglo e imprimir
    //el static se utiliza cuando se utiliza la fucion dentro de la misma clase
    public void recorrerArregloCliente(List<Cliente> listaCliente){
        for (Cliente dato : listaCliente ) {
            System.out.println(dato);

        }



    }

}
