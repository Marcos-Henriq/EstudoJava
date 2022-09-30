/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listadois;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        System.out.println("FAÇA LOGIN \nEMAIL: ");
        String email = scan.nextLine();
        System.out.println("FAÇA LOGIN '\n'Senha: ");
        String senha = scan2.nextLine();
        while(!senha.equals("#SPtech2022") && !email.equals("admin") ){
            System.out.println("Login e/ou senha inválidos\nDigite novamente seu email:");
            email = scan.nextLine();
            System.out.println("Digite novamente sua senha:");
            senha = scan2.nextLine();
        }
        System.out.println("Login realizado com sucesso");
    }
}
