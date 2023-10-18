import java.util.Scanner;

public class Exercício83 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Defina o tamanho do vetor
        int tamanho = 20;

        // Crie o vetor para armazenar os 20 números
        double[] numeros = new double[tamanho];

        // Faça a leitura dos 20 números
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        // Imprima os números na ordem inversa
        System.out.println("Números na ordem inversa:");
        for (int i = tamanho - 1; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
