import java.util.Scanner;

public class Exercício89 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Defina o tamanho dos vetores
        int tamanho = 15;

        // Crie os vetores V1 e V2
        int[] V1 = new int[tamanho];
        int[] V2 = new int[tamanho];

        // Faça a leitura dos elementos dos vetores V1 e V2
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o elemento " + (i + 1) + " do vetor V1: ");
            V1[i] = scanner.nextInt();
        }

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o elemento " + (i + 1) + " do vetor V2: ");
            V2[i] = scanner.nextInt();
        }

        // Calcule a quantidade de vezes que os vetores têm os mesmos números nas mesmas posições
        int quantidade = 0;
        for (int i = 0; i < tamanho; i++) {
            if (V1[i] == V2[i]) {
                quantidade++;
            }
        }

        // Imprima a quantidade encontrada
        System.out.println("Quantidade de números iguais nas mesmas posições: " + quantidade);

        scanner.close();
    }
}
