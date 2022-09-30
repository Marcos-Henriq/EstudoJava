
package Exercicio2;
public class Pokemon {
    private String nome;
    private String tipo;
    private Double forca = 0.0; 
    private Integer doces = 0;
    
    public Pokemon(String nome, String tipo,Double forca,Integer doces){
        this.nome = nome;
        this.tipo = tipo;
        this.forca = forca;
        this.doces = doces;
    
    }
    public String getPokemon(){
        return "\nPokemon: "+this.nome+"\nTipo: "+this.tipo+"\nforça: "+this.forca+"\ndoces: "+this.doces;
    }
    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getForca() {
        return forca;
    }

    public Integer getDoces() {
        return doces;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setForca(Double forca) {
        this.forca = forca;
    }

    public void docesPosEvolucao() {
        this.doces -= 50;
    }

    public void treinoPokemon(Double forca,Integer doces){
        this.forca = forca;
        this.doces += doces;
    
    }
    
}
