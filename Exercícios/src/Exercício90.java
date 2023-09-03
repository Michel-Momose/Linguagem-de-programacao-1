import java.util.Scanner;

public class Exercício90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Defina o tamanho do vetor
        int tamanho = 30;

        // Crie o vetor para armazenar os números
        int[] vetor = new int[tamanho];

        // Faça a leitura dos elementos do vetor
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o elemento " + (i + 1) + " do vetor: ");
            vetor[i] = scanner.nextInt();
        }

        // Leia o número a ser contado
        System.out.print("Digite um número para contar no vetor: ");
        int numero = scanner.nextInt();

        // Inicialize a variável para contar as ocorrências
        int contador = 0;

        // Percorra o vetor e conte as ocorrências do número
        for (int i = 0; i < tamanho; i++) {
            if (vetor[i] == numero) {
                contador++;
            }
        }

        // Imprima a quantidade de vezes que o número aparece no vetor
        System.out.println("O número " + numero + " aparece " + contador + " vezes no vetor.");

        scanner.close();
    }
}
