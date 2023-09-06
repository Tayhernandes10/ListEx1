/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listadeexercicio1;

import java.util.Scanner;

/**
 *
 * @author tayara.5970
 */
public class listadeexercicio4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    
   
    float num1, num2, num3, resultado;
            
    System.out.println("SELECIONE UMA OPCAO:");
    System.out.println(" 1 - SOMA");
    System.out.println(" 2 - MULTIPLICACAO");
    System.out.println(" 3 - DIVISAO");
    System.out.println(" 4 - SUBTRACAO");
    resultado = scanner.nextInt();
    
    System.out.println("----SOMA----");
    System.out.println("Informe o primeiro numero:");
    num1 = scanner.nextFloat();
    
    System.out.println("Informe segundo numero:");
    num2 = scanner.nextFloat();
    
    resultado = num1 + num2;
    
    System.out.println("O RESULTADO DA SOMA " + resultado);
            
    System.out.println("---MULTIPLICACAO----");
    System.out.println("Informe o primeiro numero:");
    num1 = scanner.nextFloat();
    
    System.out.println("Informe o segundo numero: ");
    num2 = scanner.nextFloat();
    
    resultado = num1 * num2;
    System.out.println("O RESULTADO DA MULTIPLICACAO " + resultado);
    
    System.out.println("---DIVISAO---");
    System.out.println("Informe o primeiro numero: ");
    num1 = scanner.nextFloat();
    
    System.out.println("Informe o segundo numero: ");
    num2 = scanner.nextFloat();
    
    resultado = num1 / num2;
    System.out.println("O RESULTADO DA DIVISAO " + resultado);
            
    
    
    }
}

