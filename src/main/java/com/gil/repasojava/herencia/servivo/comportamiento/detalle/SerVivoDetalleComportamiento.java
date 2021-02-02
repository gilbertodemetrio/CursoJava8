/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gil.repasojava.herencia.servivo.comportamiento.detalle;

import com.gil.repasojava.herencia.servivo.comportamiento.SerVivoComportamiento;

/**
 *
 * @author Dell
 */
//esta es la clase que implementa la interfaz serVivoComportamiento con la palabra reservada implements
public class SerVivoDetalleComportamiento implements SerVivoComportamiento{
    //el override es para sobrescritura y sobrescribir la funcionalidad de la interfaz
    @Override
    //a partir de aqui se declara el comportamiento detallado de cada metodo
    public void despertar() {
        System.out.println("\n**************despertar()********************");
        System.out.println("Superclase=>Hola me despierto a las 8 de la mañana.");
    }

    @Override
    public void trasladarse() {
        System.out.println("\n**************trasladarse()********************");
        System.out.println("Superclase=>Hola me traslado corriendo.");
    }

    @Override
    public void comer() {
        System.out.println("\n**************comer()********************");
        System.out.println("Superclase=>Hola soy carnivoro y como con las garras");
    }
    //metodo beber no sera visualizado en el main si no se
    //crea lavariable serVivo de tipo SerVivoDetalleComportamiento para accesar al comportamiento de beber
    public void beber(){
        System.out.println("\n**************beber()********************");
        System.out.println("SuperClase=>Hola Bebo o ingiero liquidos con la Boca.");
    }
    
}
