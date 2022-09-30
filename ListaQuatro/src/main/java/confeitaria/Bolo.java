/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package confeitaria;

public class Bolo {

    private String sabor;
    private Double valor;
    private Integer quantidadeVendida = 0;

    public Bolo(String sabor, Double valor, Integer quantidadeVendida) {
        if (validarSabor(sabor)) {
            this.sabor = sabor;
        } else {
            this.sabor = "inválido";
            
        }

        if (validarValor(valor)) {
            this.valor = 0.0;
        } else {
            this.valor = valor;
        }
        if (validarQuantidade(quantidadeVendida)) {
            this.quantidadeVendida = 0;

        } else {
            this.quantidadeVendida += quantidadeVendida;
        }
    }

    public String comprarBolo(Integer quantidade) {
        if (getQuantidadeVendida() + quantidade > 100) {
            return "Seu pedido ultrapassou noos limite diario para o bolo: " + getSabor();

        } else {
            setQuantidadeVendida(quantidade);
            return "Bolo Comprado";
        }

    }

    public String exibirRelatorio() {
        Double valorTotal = getValor() * getQuantidadeVendida();
        return String.format("O bolo sabor %s foi comprado %d vezes hoje, totalizando R$ %.2f",getSabor(),getQuantidadeVendida(),valorTotal);
    }

    public String getSabor() {
        return this.sabor;
    }

    public Double getValor() {
        return this.valor;
    }

    public Integer getQuantidadeVendida() {
        return this.quantidadeVendida;
    }

    public void setQuantidadeVendida(Integer quantidadeVendida) {
        this.quantidadeVendida += quantidadeVendida;
    }

    private Boolean validarSabor(String sabor) {
        return !sabor.equals("chocolate") || !sabor.equals("abacaxi") || !sabor.equals("morango");
    }

    private Boolean validarValor(Double valor) {
        return valor < 30 || valor > 50;
    }

    private Boolean validarQuantidade(Integer quantidadeVendida) {
        return quantidadeVendida <= 0 || quantidadeVendida > 100;
    }
}
