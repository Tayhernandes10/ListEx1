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
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        float v1, v2, v3, resultado;
        
        System.out.println("----MULTIPLICAÇÃO----");
        System.out.println("Digite um numero:");
        v1 = scanner.nextFloat();
        
        System.out.println("Digite outro numero:");
        v2= scanner.nextFloat();
        
        System.out.println("Digite mais um numero:");
        v3= scanner.nextFloat();
        
       resultado = v1 * v2 * v3;
        System.out.println("RESULTADO DA MULTIPLICAÇÃO: " + resultado);
    }        
}
