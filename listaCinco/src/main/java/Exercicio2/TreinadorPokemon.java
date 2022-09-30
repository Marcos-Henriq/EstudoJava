
package Exercicio2;
public class TreinadorPokemon {
    private String nome;
    private Integer nivel = 0;
    
    public TreinadorPokemon(String nome,Integer nivel){
        this.nome = nome;
        this.nivel = nivel;
    }
    
    public String exibirStatus(){
        return "Treinador: "+this.nome+"\nnivel : "+this.nivel.toString();
    }
    
    public void treinarPokemon(Pokemon pokemon){
        this.nivel += 2;
        Double aumentoForca = (pokemon.getForca() * 0.10) + pokemon.getForca();
        pokemon.treinoPokemon(aumentoForca, 10);
        
    }
    public void evoluirPokemon(String nomeEvolucao,Pokemon pokemon){
        if(pokemon.getDoces() >= 50){
            this.nivel += 10;
            System.out.println(String.format("Pokemon %s evoluir -> %s",pokemon.getNome(),nomeEvolucao));
            pokemon.setNome(nomeEvolucao);
            pokemon.docesPosEvolucao();
        }else{
            System.out.println("Não foi possivel realizar essa operação.");
        }
        
    
    }
}
