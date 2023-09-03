import java.util.Scanner;

public class Exercício91 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Defina o tamanho do vetor
        int tamanho = 50;

        // Crie o vetor para armazenar os números
        int[] VET = new int[tamanho];

        // Faça a leitura dos elementos do vetor
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            VET[i] = scanner.nextInt();
        }

        // Inicialize um vetor para verificar repetições
        boolean[] repetido = new boolean[tamanho];

        // Inicialize uma variável para controlar se há repetições
        boolean haRepeticoes = false;

        // Verifique se há números repetidos
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = i + 1; j < tamanho; j++) {
                if (VET[i] == VET[j]) {
                    repetido[i] = true;
                    repetido[j] = true;
                    haRepeticoes = true;
                }
            }
        }

        // Imprima as posições dos números repetidos, se houver
        if (haRepeticoes) {
            System.out.println("Números repetidos nas posições:");
            for (int i = 0; i < tamanho; i++) {
                if (repetido[i]) {
                    System.out.println("Número " + VET[i] + " na posição " + (i + 1));
                }
            }
        } else {
            System.out.println("Não há números repetidos no vetor.");
        }

        scanner.close();
    }
}
