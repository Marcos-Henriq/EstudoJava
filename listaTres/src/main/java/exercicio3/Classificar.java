/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

import java.util.Scanner;

public class Classificar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Metodo verificar = new Metodo();
        System.out.println("Informe a idade: ");
        Integer idade = in.nextInt();
        verificar.classificaIdade(idade);
        
    }
}
