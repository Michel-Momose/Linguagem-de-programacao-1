import java.util.Scanner;

public class Exercício86 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Defina o tamanho do vetor
        int tamanho = 10;

        // Crie um vetor para armazenar os números
        int[] numeros = new int[tamanho];

        // Faça a leitura dos 10 números
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Ordenação em ordem crescente usando Bubble Sort
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    // Troque os elementos se estiverem fora de ordem
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        // Imprima o vetor ordenado
        System.out.println("Vetor ordenado em ordem crescente:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(numeros[i] + " ");
        }

        scanner.close();
    }
}
