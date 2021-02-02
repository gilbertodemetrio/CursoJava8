/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gil.repasojava.herencia.servivo.tipoSerVivo;

import com.gil.repasojava.herencia.servivo.comportamiento.detalle.SerVivoDetalleComportamiento;

/**
 *
 * @author Dell
 */
public class Humano extends SerVivoDetalleComportamiento{
    
   @Override
   public void beber(){
       System.out.println("\n**************SubClase beber()********************");
       System.out.println("SubClase Humano=> Hola Bebo agua dulce, con la boca");
   }
   
   @Override
   public void despertar(){
       System.out.println("\n**************SubClase despertar()********************");
       System.out.println("SubClase Humano=> Hola Despierto a las 10AM en mi cama");
   }
}
