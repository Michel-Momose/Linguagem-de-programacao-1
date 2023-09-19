import java.util.Scanner;

public class Exercicio82Vetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Cria um vetor para armazenar os 10 números do vetor A
        double[] A = new double[10];

        // Faz a leitura dos 10 números
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            A[i] = scanner.nextDouble();
        }

        // Faz a leitura do número adicional X
        System.out.print("Digite o valor de X: ");
        double X = scanner.nextDouble();

        // Cria um vetor para armazenar o resultado da multiplicação
        double[] M = new double[10];

        // Calcula o resultado e armazena em M
        for (int i = 0; i < 10; i++) {
            M[i] = A[i] * X;
        }

        // Imprime o vetor M
        System.out.println("Vetor M (resultado da multiplicação): ");
        for (int i = 0; i < 10; i++) {
            System.out.println(M[i]);
        }

        scanner.close();
    }
}
