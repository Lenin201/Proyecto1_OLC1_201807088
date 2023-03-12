/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_olc1_201807088;

/**
 *
 * @author Usuario
 */
public class Lista_Follow {

    private String Hoja;
    private int Numero;
    private String Follow;

    public Lista_Follow(String Hoja, int Numero, String Follow) {
        this.Hoja = Hoja;
        this.Numero = Numero;
        this.Follow = Follow;
    }

    public String getHoja() {
        return Hoja;
    }

    public int getNumero() {
        return Numero;
    }

    public String getFollow() {
        return Follow;
    }

    public void setFollow(String Follo) {
        this.Follow = Follo;
    }   
}

