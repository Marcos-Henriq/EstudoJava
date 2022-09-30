/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio6;

import java.util.Scanner;

public class AppNumero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        VerificarPrimo verificar = new VerificarPrimo();
        System.out.println("Digite um número: ");
        Integer numeroDigitado = in.nextInt();
        while(numeroDigitado >= 0){
            verificar.verificarPrimo(numeroDigitado);
            System.out.println("Digite um número: ");
        numeroDigitado = in.nextInt();
        }
        System.out.println("Numero inválido");
        
        
     
       
       
    }
}
