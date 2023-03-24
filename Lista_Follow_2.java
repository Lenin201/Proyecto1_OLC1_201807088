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
public class Lista_Follow_2 {
    private String Hoja;
    private String Numero;
    private LinkedList<Integer> Follow;

    public Lista_Follow_2(String Hoja, String Numero, LinkedList<Integer> Follow) {
        this.Hoja = Hoja;
        this.Numero = Numero;
        this.Follow = Follow;
    }

    public String getHoja() {
        return Hoja;
    }

    public String getNumero() {
        return Numero;
    }

    public LinkedList<Integer> getFollow() {
        return Follow;
    }

    public void setFollow(LinkedList<Integer> Follow) {
        this.Follow = Follow;
    }   
}

