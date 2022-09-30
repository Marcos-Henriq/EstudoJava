
package Exercicio1;

import java.util.Scanner;

public class TesteColaborador {
    public static void main(String[] args) {
        Colaborador c1 = new Colaborador("Rogerio", "Estagiario", 2000.00);
        Colaborador c2 = new Colaborador("Claudio", "Estagiario", 1800.00);
        
        RH rh = new RH();
        
        System.out.println("\nAntes\n");
        System.out.println(c1.getColaborador());
        System.out.println(c2.getColaborador());
        
        rh.promoverColaborador(c1, "Dev Junior", 3000.00);
        rh.reajustarSalario(c2, 2000.00);
        
        
        System.out.println("\nDepois\n");
        System.out.println(c1.getColaborador());
        System.out.println(c2.getColaborador());
        
        System.out.println(rh.getRH());
        
        
        
    }
}
