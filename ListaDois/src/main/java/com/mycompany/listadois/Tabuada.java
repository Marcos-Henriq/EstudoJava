/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listadois;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        Integer numeroDigitado = scan.nextInt();
        for(int i = 0;i <= 10;i++){
            System.out.println(numeroDigitado +"X"+i+"="+numeroDigitado*i);
        }
    }
}
