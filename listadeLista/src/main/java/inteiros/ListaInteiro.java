package inteiros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaInteiro {

    private Scanner in = new Scanner(System.in);
    private List<Integer> listaInteiros = new ArrayList();

    public ListaInteiro() {

    }

    public void setListaInteiro() {
        Integer numero = 0;
        Boolean isValido = true;
        do {
            System.out.println("Digite seu numero inteiro - (digite 0 para sair)");
            numero = in.nextInt();
            if (numero.equals(0)) {
                isValido = false;
            } else if (numero < 0) {
                System.out.println("Valor Inválido, tente novamente! ");
            } else {
                this.listaInteiros.add(numero);
            }
        } while (isValido);
    }

    public List<Integer> getListaInteiros() {
        return listaInteiros;
    }

    private Boolean verificarTamanho() {
        return this.listaInteiros.isEmpty();
    }

    public List<Integer> getPares() {
        List<Integer> pares = new ArrayList();
        if (verificarTamanho()) {
            pares.add(0);
        } else {
            for (int i = 0; i < this.listaInteiros.size(); i++) {
                if (this.listaInteiros.get(i) % 2 == 0) {
                    pares.add(this.listaInteiros.get(i));
                }
            }
        }
        return pares;
    }

    public List<Integer> getImpares() {
        List<Integer> impares = new ArrayList();
        if (verificarTamanho()) {
            impares.add(0);
        } else {
            for (int i = 0; i < this.listaInteiros.size(); i++) {
                if (this.listaInteiros.get(i) % 2 != 0) {
                    impares.add(this.listaInteiros.get(i));
                }
            }
        }
        return impares;
    }

    public Integer getSomaTotal() {
        Integer total = 0;
        if (verificarTamanho()) {
            total = 0;
        } else {
            total = this.listaInteiros.get(0);
            for (int i = 1; i < this.listaInteiros.size(); i++) {
                total += this.listaInteiros.get(i);
            }
        }
        return total;
    }
    
    public Integer getMenor(){
        Integer numeroMenor = this.listaInteiros.get(0);
        if (verificarTamanho()) {
        } else {
            numeroMenor = this.listaInteiros.get(0);
            for (int i = 1; i < this.listaInteiros.size(); i++) {
                if(numeroMenor > this.listaInteiros.get(i)){
                    numeroMenor = this.listaInteiros.get(i);
                }
            }
        }
        return numeroMenor;
    }
    
    public Integer getMaior(){
        Integer numeroMaior = this.listaInteiros.get(0);
        if (verificarTamanho()) {
        } else {
            numeroMaior = this.listaInteiros.get(0);
            for (int i = 1; i < this.listaInteiros.size(); i++) {
                if(numeroMaior < this.listaInteiros.get(i)){
                    numeroMaior = this.listaInteiros.get(i);
                }
            }
        }
        return numeroMaior;
    }

}
