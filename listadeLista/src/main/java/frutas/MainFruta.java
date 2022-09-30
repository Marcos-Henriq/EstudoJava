/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package frutas;

import java.util.Scanner;

public class MainFruta {
    public static void main(String[] args) {
        ListaFruta frutas = new ListaFruta();
        Scanner in = new Scanner(System.in);
        frutas.setListaFruta("banana");
        frutas.setListaFruta("morango");
        frutas.setListaFruta("uva");
        frutas.setListaFruta("abacaxi");
        frutas.setListaFruta("manga");
        frutas.setListaFruta("melao");
        
        System.out.println("Digite sua busca..");
        String frutaPesquisada = in.nextLine();
        System.out.println(frutas.buscarFruta(frutaPesquisada));
        
        
    }
}
