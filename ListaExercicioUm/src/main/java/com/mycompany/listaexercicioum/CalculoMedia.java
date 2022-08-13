/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaexercicioum;

import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira seu nome:");
        String nome = scan.nextLine();
        System.out.println("Insira a nota 1:");
        Double notaUm = scan.nextDouble();
        System.out.println("Insira a nota 2:");
        Double notaDois = scan.nextDouble();
        
        Double media = (notaDois + notaUm) / 2;
        
        System.out.println(String.format("Olá, %s. Sua média foi de %.1f",nome,media));
        
    }
}
