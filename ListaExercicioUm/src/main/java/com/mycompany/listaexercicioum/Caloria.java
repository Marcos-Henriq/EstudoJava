/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaexercicioum;

import java.util.Scanner;

public class Caloria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos tempo (minutos) você passou se aquecendo?");
        Integer minutoAquecendo = scan.nextInt();
        System.out.println("Quantos tempo (minutos) você passou fazendo exercicios aeróbicos?");
        Integer minutoAerobico = scan.nextInt();
        System.out.println("Quantos tempo (minutos) você fez musculação?");
        Integer minutoMusculacao = scan.nextInt();
        
        Integer caloriaAquecendo = 12 * minutoAquecendo;
        Integer caloriaAerobico = 20 * minutoAerobico;
        Integer caloriaMusculacao = 25 * minutoMusculacao;
        
        Integer perdaCalorias = caloriaAerobico + caloriaAquecendo + caloriaMusculacao;
        Integer totalMinutos = minutoAerobico + minutoAquecendo + minutoMusculacao;
        
        System.out.println(String.format("Olá, Jorge. Você fez um total de %d minutos de exercícios e perdeu cerca de %d calorias.",totalMinutos,perdaCalorias));
        
    }
}
