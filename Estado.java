/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_olc1_201807088;
import java.util.LinkedList;

/**
 *
 * @author Usuario
 */
public class Estado {

    private String estado;
    private LinkedList<Integer> siguientes;
    private String transicion, aceptacion;

    public Estado(String estado, LinkedList<Integer> lista, String aceptacion) { //{1,2,3} {1,4,5}
        this.estado = estado;
        this.siguientes = lista;
        this.aceptacion = aceptacion;
    }

    public void setAceptacion(String aceptacion){
        this.aceptacion = aceptacion;
    }
    
    public String getAceptacion(){
        return this.aceptacion;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public LinkedList getSiguientes() {
        return siguientes;
    }

    public void setSiguientes(LinkedList siguientes) {
        this.siguientes = siguientes;
    }

    public String getTransicion() {
        return this.transicion;
    }

    public void setTransision(String simbolo) {
        this.transicion = simbolo;
    }
    

}

