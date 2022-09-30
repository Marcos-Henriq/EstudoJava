/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio5;

public class Peso {
    void calculaPesoIdeal(Double altura,String sexo){
        if(sexo.equals("M")){
            
            System.out.println((72.7 * altura) - 58);
        }else{
           
            System.out.println((62.1 * altura) - 44.7);
        }
    }
}
