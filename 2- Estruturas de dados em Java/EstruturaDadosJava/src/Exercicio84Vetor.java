import java.util.Scanner;

public class Exercicio84Vetor {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Solicita o tamanho dos vetores A e B
            System.out.print("Digite o tamanho dos vetores (N): ");
            int N = scanner.nextInt();
    
            // Cria vetores para os vetores A, B e Soma
            int[] A = new int[N];
            int[] B = new int[N];
            int[] Soma = new int[N];
    
            // Faz a leitura dos elementos do vetor A
            System.out.println("Digite os elementos do vetor A:");
            for (int i = 0; i < N; i++) {
                System.out.print("Elemento " + (i + 1) + ": ");
                A[i] = scanner.nextInt();
            }
    
            // Faz a leitura dos elementos do vetor B
            System.out.println("Digite os elementos do vetor B:");
            for (int i = 0; i < N; i++) {
                System.out.print("Elemento " + (i + 1) + ": ");
                B[i] = scanner.nextInt();
            }
    
            // Calcula a soma dos elementos de A e B e armazena em Soma
            for (int i = 0; i < N; i++) {
                Soma[i] = A[i] + B[i];
            }
    
            // Imprime o vetor Soma
            System.out.println("Vetor Soma:");
            for (int i = 0; i < N; i++) {
                System.out.println(Soma[i]);
            }
    
            scanner.close();
        }
}
