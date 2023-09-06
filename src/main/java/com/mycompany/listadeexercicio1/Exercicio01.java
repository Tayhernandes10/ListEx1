/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listadeexercicio1;

/**
 *
 * @author tayara.5970
 */
import java.util.Scanner;
public class Exercicio01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float v1, v2, v3, resultado;
        
        System.out.println("------SOMA------");
        System.out.println("Escolha um valor: ");
        v1 = scanner.nextFloat();

        System.out.println("Escolha outro valor: ");
        v2 = scanner.nextFloat();

        System.out.println("Escolha mais um valor: ");
        v3 = scanner.nextFloat();

        resultado = v1 + v2 + v3;

        System.out.println("Resultado da SOMA: " + resultado);
                
    }
}