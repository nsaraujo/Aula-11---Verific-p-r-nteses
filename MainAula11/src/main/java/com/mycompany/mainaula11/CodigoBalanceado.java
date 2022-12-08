/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainaula11;


/**
 *
 * @author 55649
 */
public class CodigoBalanceado {
    Pilha top;

    void push(char caracter){
        Pilha novaLinha = new Pilha();
        novaLinha.setDado(caracter);
        novaLinha.setAnterior(this.top);
        this.top = novaLinha;
    }
    
    void pop(){
        if(!isEmpty()){
            this.top = this.top.getAnterior();
        }else{
            System.out.println("A Pilha está vazia!!!");
        }
    }
    
    boolean isEmpty(){
        if(this.top == null){
            return true;
        }else{
            return false;
        }
    }

    char top(){
        if(isEmpty()){
            System.out.println("A Pilha está vazia!!!");
        }
        return this.top.getDado();
    }
    
    void conferencia(String parentese){
        CodigoBalanceado pilhaDinamica = new CodigoBalanceado();
        
        for(int i = 0; i < parentese.length(); i++){
            
            if(parentese.charAt(i) == '(' || parentese.charAt(i) == '[' || parentese.charAt(i) == '{'){
                pilhaDinamica.push(parentese.charAt(i));
                
            }else if(parentese.charAt(i) == ')' || parentese.charAt(i) == ']' || parentese.charAt(i) == '}'){
                if(pilhaDinamica.isEmpty() == true){
                    System.out.println("A pilha está desbalanceada! " + parentese);
                    return;
                    
                }else if(pilhaDinamica.top() == '(' && parentese.charAt(i) == ')'){
                    pilhaDinamica.pop();
                    
                }else if(pilhaDinamica.top() =='[' && parentese.charAt(i) == ']'){
                    pilhaDinamica.pop();
                    
                }else if(pilhaDinamica.top() == '{' && parentese.charAt(i) == '}'){
                    pilhaDinamica.pop();
                }
            }
        }
        
        if(pilhaDinamica.isEmpty() == true){
            System.out.println("A pilha está balanceada! " + parentese);
        }else{
            System.out.println("A pilha está desbalanceada! " + parentese);
        }
    }    
    
}
    

