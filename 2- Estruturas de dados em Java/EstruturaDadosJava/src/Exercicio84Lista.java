import java.util.ArrayList;
import java.util.Scanner;
    
public class Exercicio84Lista {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Solicita o tamanho dos vetores A e B
            System.out.print("Digite o tamanho dos vetores (N): ");
            int N = scanner.nextInt();
    
            // Cria listas para os vetores A, B e Soma
            ArrayList<Integer> A = new ArrayList<>();
            ArrayList<Integer> B = new ArrayList<>();
            ArrayList<Integer> Soma = new ArrayList<>();
    
            // Faz a leitura dos elementos do vetor A
            System.out.println("Digite os elementos do vetor A:");
            for (int i = 0; i < N; i++) {
                System.out.print("Elemento " + (i + 1) + ": ");
                int elementoA = scanner.nextInt();
                A.add(elementoA);
            }
    
            // Faz a leitura dos elementos do vetor B
            System.out.println("Digite os elementos do vetor B:");
            for (int i = 0; i < N; i++) {
                System.out.print("Elemento " + (i + 1) + ": ");
                int elementoB = scanner.nextInt();
                B.add(elementoB);
            }
    
            // Calcula a soma dos elementos de A e B e armazena em Soma
            for (int i = 0; i < N; i++) {
                int soma = A.get(i) + B.get(i);
                Soma.add(soma);
            }
    
            // Imprime o vetor Soma
            System.out.println("Vetor Soma:");
            for (int i = 0; i < N; i++) {
                System.out.println(Soma.get(i));
            }
    
            scanner.close();
        }
}
