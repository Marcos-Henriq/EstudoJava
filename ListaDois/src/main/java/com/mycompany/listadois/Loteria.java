
package com.mycompany.listadois;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Loteria {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número de um a 10");
        Integer numDigitado = scan.nextInt();
        Integer numAleatorio;
        Integer tentativa = 0;
        for(int i = 0;i <=10 ; i++){
            numAleatorio = ThreadLocalRandom.current().nextInt(0,10);
            System.out.println(numAleatorio);
            if(numAleatorio == numDigitado){
                tentativa = tentativa+1;
            }
        }
        System.out.println("NUMERO DE TENTATIVAS: "+tentativa);
    }
}
