import java.util.Scanner;

public class Exercício84 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicite o valor de N
        System.out.print("Digite o valor de N (tamanho dos vetores): ");
        int N = scanner.nextInt();

        // Crie os vetores A, B e Soma de tamanho N
        int[] A = new int[N];
        int[] B = new int[N];
        int[] Soma = new int[N];

        // Faça a leitura dos elementos do vetor A
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < N; i++) {
            System.out.print("A[" + i + "]: ");
            A[i] = scanner.nextInt();
        }

        // Faça a leitura dos elementos do vetor B
        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < N; i++) {
            System.out.print("B[" + i + "]: ");
            B[i] = scanner.nextInt();
        }

        // Calcule a soma dos elementos de A com B e armazene em Soma
        for (int i = 0; i < N; i++) {
            Soma[i] = A[i] + B[i];
        }

        // Imprima o vetor Soma
        System.out.println("Vetor Soma:");
        for (int i = 0; i < N; i++) {
            System.out.println("Soma[" + i + "]: " + Soma[i]);
        }

        scanner.close();
    }
}
