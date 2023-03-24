/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_olc1_201807088;

/**
 *
 * @author Usuario
 */
public class Transiciones {
    private String inicio;
    private String alfabeto;
    private String fin;
    private String aceptacion;
    
    public Transiciones(String inicio, String alfabeto, String fin, String aceptacion){
        this.inicio = inicio;
        this.alfabeto = alfabeto;
        this.fin = fin;
        this.aceptacion = aceptacion;
    }
    
    public String getInicio(){
        return this.inicio;
    }
    
    public String getAlfabeto(){
        return this.alfabeto;
    }
    
    public String getFin(){
        return this.fin;
    }
    
    public String getAceptacion(){
        return this.aceptacion;
    }
}

