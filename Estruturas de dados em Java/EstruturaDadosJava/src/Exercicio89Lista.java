import java.util.ArrayList;
import java.util.Scanner;
    
    public class Exercicio89Lista {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            int tamanho = 15;
            ArrayList<Integer> l1 = new ArrayList<>();
            ArrayList<Integer> l2 = new ArrayList<>();
    
            // Faz a leitura da primeira lista L1
            System.out.println("Digite os elementos da lista L1:");
            for (int i = 0; i < tamanho; i++) {
                System.out.print("Elemento " + (i + 1) + ": ");
                int elemento = scanner.nextInt();
                l1.add(elemento);
            }
    
            // Faz a leitura da segunda lista L2
            System.out.println("Digite os elementos da lista L2:");
            for (int i = 0; i < tamanho; i++) {
                System.out.print("Elemento " + (i + 1) + ": ");
                int elemento = scanner.nextInt();
                l2.add(elemento);
            }
    
            // Calcula a quantidade de vezes que L1 e L2 possuem os mesmos números nas mesmas posições
            int contador = 0;
            for (int i = 0; i < tamanho; i++) {
                if (l1.get(i).equals(l2.get(i))) {
                    contador++;
                }
            }
    
            // Imprime a quantidade de correspondências
            System.out.println("Quantidade de vezes que L1 e L2 possuem os mesmos números nas mesmas posições: " + contador);
    
            scanner.close();
        }
}
