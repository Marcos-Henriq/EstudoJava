/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4;

public class DescontoProgressivo {
    Double calcularDesconto(Double valor,Integer quantidade){
        Double valorBruto = valor * quantidade;
        Double valorLiquido = 0.0;
        if(quantidade >= 3){
             valorLiquido = valorBruto * 0.30;
        }else if(quantidade == 2 ){
             valorLiquido = valorBruto * 0.20;
        
        }else if(quantidade == 1){
            valorLiquido = valorBruto * 0.10;
        }
        Double valorFinal = valorBruto - valorLiquido;
        return valorFinal;
    }
    String notaFiscal(Double valorUnitario,Integer qtdProduto,Double valorFinal){
        return String.format("-".repeat(50)+" \n Valor do Produto: \n %.2f \n Quantidae: \n %d \n"+"-".repeat(50)+"\nValor com Desconto: \n %.2f",valorUnitario,qtdProduto,valorFinal);
    
    }
}
