/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gil.repasojava.herencia;

import com.gil.repasojava.herencia.servivo.comportamiento.detalle.SerVivoDetalleComportamiento;
import com.gil.repasojava.herencia.servivo.comportamiento.SerVivoComportamiento;
import com.gil.repasojava.herencia.servivo.tipoSerVivo.Humano;

/**
 *
 * @author Dell
 */
//punto de entrada para ejecutar la clase
public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n********************Invocacion de SerVivoComportamiento...*************");
        //Creacion de variable serVivo de tipo SerVivoComportamiento que hace referencia al objeto 
        //creado de tipo SerVivoDetalleComportamiento
        //SerVivoComportamiento es la interfaz que define los metodos(comportamientos) y para poder
        //SerVivoDetalleComportamiento es la clase que detallaba los comportamientos(metodos)
        //SerVivoDetalleComportamiento implementa la interfaz para detallar esos comportamientos.       
        SerVivoComportamiento serVivo = new SerVivoDetalleComportamiento();
        //Invocacion de comportamientos Detallados
        serVivo.comer();
        serVivo.despertar();
        serVivo.trasladarse();
        
        System.out.println("\n\n********************Invocacion de SerVivoDetalleComportamiento...*************");
        //Creacion de variable serVivo de tipo SerVivoDetalleComportamiento 
        //que hace referencia al objeto creado de tipo SerVivoDetalleComportamiento
        //al crear el objeto serVivoDetallado se permite el acceso al metodo que no se encuentra
        //en la interface ServivoComportamiento, por ende podemos accesar al metodo beber
        //esta practica sirve en ocasiones para seguridad de los datos
        SerVivoDetalleComportamiento serVivoDetallado = new SerVivoDetalleComportamiento();
        //Invocacion de comportamientos Detallados
        serVivoDetallado.comer();
        serVivoDetallado.despertar();
        serVivoDetallado.trasladarse();
        serVivoDetallado.beber();
        
        //Invocacion de Ser vivo Human
        System.out.println("\n\nInvocacion de Ser Vivo Humano...");
        SerVivoComportamiento serVivoComportamientoHumano = new Humano();
        serVivoComportamientoHumano.comer();
        serVivoComportamientoHumano.despertar();
        serVivoComportamientoHumano.trasladarse();
        //se creo un objeto SerVivoDetalleComportamiento de tipo humano
        //se invocan los metodos (comportamientos) con el nombre del objeto."metodos"
        System.out.println("\n\nInvocacion de Ser Vivo Humano con todos los comportamientos de la clase SerVivoDetalleComportamiento...");
        SerVivoDetalleComportamiento serVivoDetalleComportamientoHumano = new Humano ();
        serVivoDetalleComportamientoHumano.comer();
        serVivoDetalleComportamientoHumano.despertar();
        serVivoDetalleComportamientoHumano.trasladarse();
        serVivoDetalleComportamientoHumano.beber();
        
        
        //serVivoDetallado.beber();
        
    }
}
