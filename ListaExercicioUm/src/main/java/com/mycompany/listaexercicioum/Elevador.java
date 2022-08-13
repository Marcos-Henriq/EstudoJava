/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaexercicioum;

import java.util.Scanner;

public class Elevador {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o limite de peso de um elevador: ");
        Double limitePeso = scan.nextDouble();
        System.out.println("Insira o limite de pessoas em um elevador: ");
        Integer limitePessoas = scan.nextInt();
        System.out.println("Insira o peso da 1ª pessoa que entrou no elevador: ");
        Double pesoPessoaUm = scan.nextDouble();
        System.out.println("Insira  o peso da 2ª pessoa que entrou no elevador: ");
        Double pesoPessoaDois = scan.nextDouble();
        System.out.println("Insira  o peso da 3ª pessoa que entrou no elevador: ");
        Double pesoPessoaTres = scan.nextDouble();
        
        Double pesoTotal = pesoPessoaUm + pesoPessoaDois + pesoPessoaTres;
        System.out.println(
                String.format
 ("Entraram 3 pessoas no elevador, no qual cabem %d pessoas. O peso total no elevador é de %.2f, sendo que ele suporta %.2f",
                limitePessoas,pesoTotal,limitePeso));
        
    }
}
