
package Exercicio2;

public class TestePokemon {
    public static void main(String[] args) {
        Pokemon pokemon1 = new Pokemon("Charmander","fogo",100.0,0);
        Pokemon pokemon2 = new Pokemon("larvitar","pedra",150.0,0);
        TreinadorPokemon treinador1 = new TreinadorPokemon("Marcos", 0);
        
        System.out.println("\nAntes\n");
        System.out.println(treinador1.exibirStatus());
        System.out.println(pokemon1.getPokemon());
        System.out.println(pokemon2.getPokemon());
        
        treinador1.treinarPokemon(pokemon1);
        treinador1.treinarPokemon(pokemon1);
        treinador1.treinarPokemon(pokemon1);
        treinador1.treinarPokemon(pokemon1);
        treinador1.treinarPokemon(pokemon1);
        treinador1.treinarPokemon(pokemon2);
        treinador1.treinarPokemon(pokemon2);
        
        
        System.out.println("\nDepois\n");
        treinador1.evoluirPokemon("Charmelion", pokemon1);
        treinador1.evoluirPokemon("Pupitar", pokemon2);
        System.out.println(treinador1.exibirStatus());
        System.out.println(pokemon1.getPokemon());
        System.out.println(pokemon2.getPokemon());
    }
 
}
