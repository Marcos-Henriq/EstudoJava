/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaexercicioum;

import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite seu salário bruto:");
        Double salarioBruto = scan.nextDouble();
        
        Double inss = salarioBruto * 0.10;
            
    }
}
