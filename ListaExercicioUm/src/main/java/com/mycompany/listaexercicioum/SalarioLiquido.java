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
   
        System.out.println("Quanto você gasta de transporte da sua casa para o trabalho: ");
        Double vtPassagem = scan.nextDouble();
        
        Double descontoVt = vtPassagem * 2 * 22;
        Double inss = salarioBruto * 0.10;
        Double ir = salarioBruto * 0.20;
        
        Double totalDesconto = descontoVt + inss + ir;
        Double salarioLiquido = salarioBruto - totalDesconto;
        
        System.out.println(
                String.format("Seu salário bruto é R$%.2f, tem um total de R$%.2f em descontos e receberá um líquido de R$%.2f",
                       salarioBruto,totalDesconto,salarioLiquido));
}
}
