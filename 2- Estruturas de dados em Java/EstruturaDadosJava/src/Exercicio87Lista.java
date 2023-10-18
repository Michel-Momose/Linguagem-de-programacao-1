import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
    
    public class Exercicio87Lista {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            List<Integer> numeros = new ArrayList<>();
    
            // Faz a leitura dos 10 números
            for (int i = 0; i < 10; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                int numero = scanner.nextInt();
                numeros.add(numero);
            }
    
            // Ordena a lista em ordem crescente
            Collections.sort(numeros);
    
            // Imprime a lista ordenada
            System.out.println("Lista ordenada em ordem crescente:");
            for (int numero : numeros) {
                System.out.println(numero);
            }
    
            // Lê o novo número a ser inserido
            System.out.print("Digite um novo número: ");
            int novoNumero = scanner.nextInt();
    
            // Insere o novo número na posição correta mantendo a ordem crescente
            int indiceInsercao = encontrarIndiceInsercao(numeros, novoNumero);
            if (indiceInsercao < 10) {
                numeros.add(indiceInsercao, novoNumero);
            }
    
            // Imprime a lista com o novo número inserido
            System.out.println("Lista com o novo número inserido:");
            for (int numero : numeros) {
                System.out.println(numero);
            }
    
            scanner.close();
        }
    
        // Encontra o índice onde o novo número deve ser inserido para manter a ordem crescente
        private static int encontrarIndiceInsercao(List<Integer> lista, int novoNumero) {
            int i = 0;
            while (i < lista.size() && lista.get(i) < novoNumero) {
                i++;
            }
            return i;
        }
}
