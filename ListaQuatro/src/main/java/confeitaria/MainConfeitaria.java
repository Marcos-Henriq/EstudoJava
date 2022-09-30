/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package confeitaria;

import java.util.Scanner;

public class MainConfeitaria {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Scanner text = new Scanner(System.in);
        Bolo bolo1 = new Bolo("morango", 35.0, 0);
        Bolo bolo2 = new Bolo("chocolate", 35.99, 0);
        Bolo bolo3 = new Bolo("abacaxi", 40.00, 0);

        Integer nDigitado;
        do {
            System.out.println("| 1 - Comprar um bolo |\n| 0 - sair |");
            nDigitado = in.nextInt();
            if (nDigitado > 1 || nDigitado < 0) {
                System.out.println("Numero Inválido");
            } else if (nDigitado == 0) {
                System.out.println("Tchau");
            } else {
                System.out.println("Qual bolo você deseja ? ");
                String sabor = text.nextLine();
                System.out.println("Quantos você quer? ");
                Integer quantidade = in.nextInt();
                if (quantidade <= 0) {
                    System.out.println("Nenhum Bolo? tente novamente");
                } else {
                    if (sabor.equals("morango")) {
                        bolo1.comprarBolo(quantidade);
                        System.out.println(bolo1.comprarBolo(quantidade));

                    } else if (sabor.equals("abacaxi")) {
                        bolo2.comprarBolo(quantidade);
                        System.out.println(bolo2.comprarBolo(quantidade));

                    } else if (sabor.equals("chocolate")) {
                        bolo3.comprarBolo(quantidade);
                        System.out.println(bolo3.comprarBolo(quantidade));

                    } else {
                        System.out.println("Esse bolo não existe, tente novamente");
                    }
                }

            }

        } while (nDigitado != 0);

        System.out.println(bolo1.exibirRelatorio());
        System.out.println(bolo2.exibirRelatorio());
        System.out.println(bolo3.exibirRelatorio());

    }
}
