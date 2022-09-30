/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio5;

import java.util.Scanner;

public class AppPeso {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Peso verificar = new Peso();
        
        System.out.println("Qual seu Sexo: M ou F?");
        String sexo = in.nextLine();
        System.out.println("Qual sua altura? ");
        Double altura = in.nextDouble();
        verificar.calculaPesoIdeal(altura, sexo);
        
    }
}
