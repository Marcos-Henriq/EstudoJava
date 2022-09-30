/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package school.sptech.listatres.exercicio2;

public class ClassesSocial {
    Double qtdSalarioMinimo(Double salario){
        return salario / 1045;
    }
    String verificarClasse(Double salarioMinimo){
        if(salarioMinimo > 20){
            return "A";
        }else if(salarioMinimo >= 10){
            return "B";
        }else if(salarioMinimo >= 4){
            return "C";
        }else if(salarioMinimo >= 2 && salarioMinimo <=4){
            return "D";
        }else{
            return "E";
        }
    }
}
