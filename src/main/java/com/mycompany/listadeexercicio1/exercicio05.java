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
public class exercicio05 {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String nome, cpf, endereco, dados;
 
        System.out.println("Informe seu nome: ");
        nome = scanner.nextLine();
        
        System.out.println("Informe seu cpf: ");
        cpf = scanner.nextLine();
        
        System.out.println("Informe seu endereco:");
        endereco = scanner.nextLine();
        
        dados = nome + " " + cpf +" " + endereco;
        System.out.println("dados: " + dados);
}       
      
}
