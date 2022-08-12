/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaexercicioum;

import java.util.Scanner;

/**
 *
 * @author marcos.silva
 */
public class CadastroUsuario {
    public static void main(String[]args){
        
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite seu email:");
    String email = scan.nextLine();
    System.out.println("Digite sua senha: ");
    String senha = scan.nextLine();
    System.out.println("Numero de Tentativas maximo: ");
    Integer numTentativas = scan.nextInt();
    
    System.out.println(String.format("Seu login é %s e sua senha é %s. Você tem %d tentativas antes de ser bloqueado.",email,senha,numTentativas));
    }
    
            
            
}
