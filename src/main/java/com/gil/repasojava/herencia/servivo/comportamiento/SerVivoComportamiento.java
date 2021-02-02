/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gil.repasojava.herencia.servivo.comportamiento;

/**
 *
 * @author Dell
 */
//sintaxis para declarar una interface con modificador de acceso publico
public interface SerVivoComportamiento {
    //declaracion de una variable de clase
    public static int NUMERO_COLAS = 1;
    //en esta interface se declaran los metodos(comportamientos) mas no el detalle de cada metodo        
    public void despertar();
    public void trasladarse();
    public void comer();
}
