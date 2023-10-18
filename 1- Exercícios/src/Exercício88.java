import java.util.Scanner;

public class Exercício88 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Defina o tamanho do vetor
        int tamanho = 20;

        // Crie um vetor para armazenar os números
        int[] numeros = new int[tamanho];

        // Faça a leitura dos 20 números
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Leia o número a ser verificado
        System.out.print("Digite um número para verificar se existe no vetor: ");
        int numeroVerificar = scanner.nextInt();

        // Verifique se o número existe no vetor
        boolean numeroEncontrado = false;
        for (int i = 0; i < tamanho; i++) {
            if (numeros[i] == numeroVerificar) {
                numeroEncontrado = true;
                break;
            }
        }

        if (numeroEncontrado) {
            // Crie um novo vetor sem o número encontrado
            int[] novoVetor = new int[tamanho - 1];
            int novoIndice = 0;

            for (int i = 0; i < tamanho; i++) {
                if (numeros[i] != numeroVerificar) {
                    novoVetor[novoIndice] = numeros[i];
                    novoIndice++;
                }
            }

            // Imprima o novo vetor
            System.out.println("O número foi encontrado no vetor e removido.");
            System.out.println("Novo vetor:");
            for (int i = 0; i < novoVetor.length; i++) {
                System.out.print(novoVetor[i] + " ");
            }
        } else {
            System.out.println("O número não foi encontrado no vetor.");
        }

        scanner.close();
    }
}
