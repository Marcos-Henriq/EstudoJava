/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio6;

public class VerificarPrimo {

    void verificarPrimo(Integer numeroDigitado) {
        int divisoes = 0;
            
            for (int i = 1; i <= numeroDigitado; i++) {
                if (numeroDigitado % i == 0) {
                    divisoes = divisoes + 1;
                }
            }
            if (divisoes == 2) {
                System.out.println("é Primo");
            } else {
                System.out.println("Não é primo");
            }

    }
}
