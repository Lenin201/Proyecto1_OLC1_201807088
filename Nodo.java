/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1_olc1_201807088;

public class Nodo {
    public Nodo hizquierdo;
    public Nodo hderecho;
    public String valor;
    public int id;
    public int identificador; 
    public String anulable;
    public String  primero;
    public String ultimo;

    public Nodo(Nodo hizquierdo, Nodo hderecho, String valor, int id, int identificador, String anulable, String primero, String ultimo) {
        this.hizquierdo = hizquierdo;
        this.hderecho = hderecho;
        this.valor = valor;
        this.id = id;
        this.identificador = identificador;
        this.anulable = anulable;
        this.primero = primero;
        this.ultimo = ultimo;
    }

    public Nodo getHizquierdo() {
        return hizquierdo;
    }

    public Nodo getHderecho() {
        return hderecho;
    }

    public String getValor() {
        return valor;
    }

    public int getId() {
        return id;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getAnulable() {
        return anulable;
    }

    public String getPrimero() {
        return primero;
    }

    public String getUltimo() {
        return ultimo;
    }

    public void setHizquierdo(Nodo hizquierdo) {
        this.hizquierdo = hizquierdo;
    }

    public void setHderecho(Nodo hderecho) {
        this.hderecho = hderecho;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setAnulable(String anulable) {
        this.anulable = anulable;
    }

    public void setPrimero(String primero) {
        this.primero = primero;
    }

    public void setUltimo(String ultimo) {
        this.ultimo = ultimo;
    }
    
    public String getCodigoInterno(){
        String etiqueta;
        String texto = valor.replaceAll("\"", "");
        if(hizquierdo == null && hderecho == null){
            etiqueta = "nodo" + id + "[ \n"
                    +"label="+"\""+texto+"\""+"\n"
                    //+"<tr><td>"+anulable+"</td></tr>\n"
                    //+"<tr><td>"+primero+"</td></td>\n"+valor+"</td><td>"+ultimo+"</td></tr>\n"
                    //+"<tr><td>"+identificador+"</td></tr>\n"
                    +"];\n";
        }else{
            etiqueta = "nodo" + id + "[ \n"
                    +"label="+'"'+texto+'"'+"\n"
                    //+"<tr><td>"+anulable+"</td></tr>\n"
                    //+"<tr><td>"+primero+"</td></td>\n"+valor+"</td><td>"+ultimo+"</td></tr>\n"
                    //+"<tr><td>"+identificador+"</td></tr>\n"
                    +"];\n";
        }
        if (hizquierdo != null){
            etiqueta = etiqueta + hizquierdo.getCodigoInterno()
                    + "nodo" +id+"->nodo"+hizquierdo.id+"\n";
        }
        if (hderecho != null){
            etiqueta = etiqueta+hderecho.getCodigoInterno()
                    +"nodo"+id +"->nodo"+hderecho.id+"\n";
        }
        return etiqueta;
    }
    
}