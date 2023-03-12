/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_olc1_201807088;

/**
 *
 * @author Usuario
 */
public class AFND {
    
    private int inicio,fin;
    private String valor,aceptacion;

    public AFND(int inicio, String valor, int fin) {
        this.inicio = inicio;
        this.fin = fin;
        this.valor = valor;
    }

    public int getInicio() {
        return inicio;
    }
    
    public String getAceptacion(){
        return this.aceptacion;
    }
    
    public void setAceptacion(String aceptacion){
        this.aceptacion = aceptacion;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
}
