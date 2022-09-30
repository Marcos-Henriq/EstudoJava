/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.sptech.listatres.exercicio1;

import java.util.Scanner;

public class AppMedia {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CalcularMedia calcularMedia = new CalcularMedia();

        System.out.println("Digite a primeira nota: ");
        Integer nota1 = in.nextInt();
        System.out.println("Digite a segunda nota: ");
        Integer nota2 = in.nextInt();

        Double media = calcularMedia.media(nota1, nota2);

        System.out.println(media);

    }
}
