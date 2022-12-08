/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mainaula11;
//import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 55649
 */
public class MainAula11 {
    public static void main(String[] args) {
        String parentese = null;
        CodigoBalanceado Balanceado = new CodigoBalanceado();

        parentese = JOptionPane.showInputDialog("Digite uma expressão matemática: ");
        
        Balanceado.conferencia(parentese);
    }
}



