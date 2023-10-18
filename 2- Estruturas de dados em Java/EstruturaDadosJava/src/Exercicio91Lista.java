import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
    
    public class Exercicio91Lista {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            List<Integer> lista = new ArrayList<>();
    
            // Faz a leitura dos 50 números na lista
            for (int i = 0; i < 50; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                int numero = scanner.nextInt();
                lista.add(numero);
            }
    
            // Cria um mapa para rastrear as posições dos números repetidos
            Map<Integer, List<Integer>> posicoesNumerosRepetidos = new HashMap<>();
    
            // Verifica se existem números repetidos e em que posições
            for (int i = 0; i < lista.size(); i++) {
                int numeroAtual = lista.get(i);
    
                if (!posicoesNumerosRepetidos.containsKey(numeroAtual)) {
                    posicoesNumerosRepetidos.put(numeroAtual, new ArrayList<>());
                }
    
                posicoesNumerosRepetidos.get(numeroAtual).add(i + 1);
            }
    
            // Imprime as posições dos números repetidos
            System.out.println("Números repetidos nas posições:");
    
            for (int numero : posicoesNumerosRepetidos.keySet()) {
                List<Integer> posicoes = posicoesNumerosRepetidos.get(numero);
                if (posicoes.size() > 1) {
                    System.out.println(numero + " nas posições: " + posicoes);
                }
            }
    
            scanner.close();
        }
}
