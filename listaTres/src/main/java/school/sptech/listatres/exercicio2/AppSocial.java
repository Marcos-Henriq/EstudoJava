/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.sptech.listatres.exercicio2;

import java.util.Scanner;

public class AppSocial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ClassesSocial classe = new ClassesSocial();
        System.out.println("Digite sua Renda: ");
        Double salario = in.nextDouble();
        Double qtdMinimo = classe.qtdSalarioMinimo(salario);   
        String suaClasse = classe.verificarClasse(qtdMinimo);
        System.out.println("Classe: "+suaClasse);
        
    }
}
