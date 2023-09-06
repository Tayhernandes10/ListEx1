/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listadeexercicio1;

import java.util.Scanner;

/**
 *
 * @author tayara.5970
 */
public class Listadeexercicio1 {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    float v1, v2, resultado;
    
    System.out.println("-----SOMA-----");
    System.out.println("Digite um valor: ");
    v1 = scanner.nextFloat();
    
    System.out.println("Digite outro valor: ");
    v2 = scanner.nextFloat();
    
    resultado = v1 + v2;
    System.out.println("RESULTADO DA SOMA " + resultado);
      
    }
}

