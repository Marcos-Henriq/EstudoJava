/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4;

import java.util.Scanner;

public class AppDesconto {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DescontoProgressivo verificar = new DescontoProgressivo();
        System.out.println("Digite o valor do Produto: ");
        Double valor = in.nextDouble();
        System.out.println("Digite a quantidade do Produto: ");
        Integer quantidade = in.nextInt();
        Double resultado = verificar.calcularDesconto(valor, quantidade);
        
        String apresentar =verificar.notaFiscal(valor, quantidade,resultado);;
        System.out.println(apresentar);
        
        
        
        
    }
 
}
