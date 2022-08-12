/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaexercicioum;

import java.util.Scanner;

/**
 *
 * @author marcos.silva
 */
public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o primeiro número: ");
        Integer numberUm = scan.nextInt();
        System.out.println("Insira o primeiro segundo: ");
        Integer numberDois = scan.nextInt();
        
        Integer soma = numberUm + numberDois;
        Integer multiplicacao = numberUm * numberDois;
        Integer divisao = numberUm / numberDois;
        Integer subtracao = numberUm - numberDois;
        
        System.out.println(String.format("Resultado da soma:%d\nResultado da subtração:%d\nResultado da multiplicação:%d\nResultado da divisão:%d\n",
                soma,subtracao,multiplicacao,divisao
));
        
    }
}
