package inteiros;

public class MainInteiro {

    public static void main(String[] args) {
        ListaInteiro inteiros = new ListaInteiro();
        inteiros.setListaInteiro();
        System.out.println("Lista: " + inteiros.getListaInteiros());
        System.out.println("Numeros Pares: " + inteiros.getPares());
        System.out.println("Numeros Impares: " + inteiros.getImpares());
        System.out.println("Total: " + inteiros.getSomaTotal());
        System.out.println("Numero Menor: " + inteiros.getMenor());
        System.out.println("Numero Maior: " + inteiros.getMaior());

    }
}
