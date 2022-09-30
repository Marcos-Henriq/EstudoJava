/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio1;

public class RH {
    private Integer totalPromovidos = 0;
    private Integer totalSalariosReajustados = 0;
    
    public void reajustarSalario(Colaborador colaborador,Double reajuste){
        colaborador.setSalario(reajuste);
        this.totalSalariosReajustados ++;
    }
    
    public String getRH(){
        return "Promovidos: "+this.totalPromovidos+" Salarios Reajustados: "+this.totalSalariosReajustados;
    }
    
    public void promoverColaborador(Colaborador colaborador,String cargo,Double salario){
        colaborador.setCargo(cargo);
        colaborador.setSalario(salario);
        this.totalPromovidos++;
        
    }
    
}
