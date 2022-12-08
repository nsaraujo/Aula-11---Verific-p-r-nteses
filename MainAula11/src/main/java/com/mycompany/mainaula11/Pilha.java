/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainaula11;

/**
 *
 * @author 55649
 */
public class Pilha {
    char caracter;
    Pilha anterior;
    
    Pilha(){
    }
    
    Pilha(char caracter, Pilha anterior){
        this.caracter = caracter;
        this.anterior = anterior;
    }
    
    char getDado(){
        return this.caracter;
    }
    
    void setDado(char caracter){
        this.caracter = caracter;
    }

    Pilha getAnterior() {
        return this.anterior;
    }

    void setAnterior(Pilha anterior) {
        this.anterior = anterior;
    }
}