/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio5a4;
import java.util.*;
/**
 *
 * @author USER
 */
public class ListaPersonas {
    Vector listaPersonas;
    public ListaPersonas() {
        listaPersonas = new Vector(); 
    }
    public void añadirPersona(Persona p) {
        listaPersonas.add(p);
    }
    public void eliminarPersona(int i) {
        listaPersonas.removeElementAt(i);
    }
    public void borrarLista() {
        listaPersonas.removeAllElements();
    }
}
