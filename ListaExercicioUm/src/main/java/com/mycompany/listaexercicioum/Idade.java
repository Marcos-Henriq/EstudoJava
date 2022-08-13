/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaexercicioum;

import java.util.Scanner;

public class Idade {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira seu nome: ");
        String nome = scan.nextLine();
        System.out.println(String.format("Olá,%s Qual o ano de seu nascimento?",nome));
        Integer nascimento = scan.nextInt();
        
        Integer previsaoIdade = 2030 - nascimento;
        System.out.println(String.format("Em 2030 você terá %d anos.",previsaoIdade));
        
    }
}
