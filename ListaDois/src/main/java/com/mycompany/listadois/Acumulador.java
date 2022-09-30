/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listadois;

import java.util.Scanner;

public class Acumulador {
//    Integer numero = ThreadLocalRandom.current().nextInt(0,11);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Tente adivinhar meu numero: ");
        Integer numeroDigitado = scan.nextInt();
        Integer soma = 0;

        while (numeroDigitado != 0) {
            System.out.println("Errado, Tente denovo:");
            numeroDigitado = scan.nextInt();
            soma = soma + numeroDigitado;
        }
        System.out.println("Certo");
        System.out.println(soma);
    }
}
