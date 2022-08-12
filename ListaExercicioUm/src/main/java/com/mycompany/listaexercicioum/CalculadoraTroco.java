/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaexercicioum;

import java.util.Scanner;

public class CalculadoraTroco {
    public static void main(String[] args) {
        Scanner scanInt = new Scanner(System.in);
        Scanner scanDouble = new Scanner(System.in);
        
        System.out.println("Digite o valor do seu produto:");
        Double valorProduto = scanDouble.nextDouble();
        
        System.out.println("Quantos produtos você comprou?");
        Integer qtdProduto = scanInt.nextInt();
        
        System.out.println("Qual o valor Pago?");
        Double valorPago = scanDouble.nextDouble();
        
        Double notaFiscal = valorProduto * qtdProduto;
        Double valorTroco = valorPago - notaFiscal;
        
        System.out.println(String.format("Seu troco será de R$ %.2f",valorTroco));
    }
}
