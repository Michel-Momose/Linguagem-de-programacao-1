import java.util.Scanner;

public class Exercício82 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Defina o tamanho do vetor
        int tamanho = 10;

        // Crie o vetor A para armazenar os 10 números
        double[] A = new double[tamanho];

        // Faça a leitura dos 10 números do vetor A
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o elemento " + (i + 1) + " do vetor A: ");
            A[i] = scanner.nextDouble();
        }

        // Faça a leitura do número adicional X
        System.out.print("Digite o valor de X: ");
        double X = scanner.nextDouble();

        // Crie o vetor M para armazenar os resultados da multiplicação
        double[] M = new double[tamanho];

        // Realize a multiplicação e armazene em M
        for (int i = 0; i < tamanho; i++) {
            M[i] = A[i] * X;
        }

        // Imprima o vetor M
        System.out.print("Vetor M: ");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(M[i] + " ");
        }

        scanner.close();
    }
}
