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
public class BolsaFilho {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe quantos filhos de 0 a 3 anos você possui");
        Integer numFilhosZeroTres = scan.nextInt();
        System.out.println("Informe quantos filhos de 4 a 16 anos você possui.");
        Integer numFilhosQuatrDezesseis = scan.nextInt();
        System.out.println("Informe quantos filhos de 17 a 18 anos você possui.");
        Integer numFilhosDezesseteDezoito = scan.nextInt();
        
        Double valorFilhosZeroTres = 25.12 * numFilhosZeroTres;
        Double valorFilhosQuatroDezesseis = 15.88 * numFilhosQuatrDezesseis;
        Double valorFilhosDezesseteDezoito = 12.44 * numFilhosDezesseteDezoito;
        
        Double valorBolsa = valorFilhosZeroTres + valorFilhosQuatroDezesseis + valorFilhosDezesseteDezoito;
        
        System.out.println(valorFilhosZeroTres);
        System.out.println(valorFilhosQuatroDezesseis);
        System.out.println(valorFilhosDezesseteDezoito);
        System.out.println(valorBolsa);
        
        
    }
}
