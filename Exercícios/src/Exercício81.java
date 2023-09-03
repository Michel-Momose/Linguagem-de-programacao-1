import java.util.Scanner;

public class Exercício81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Defina o tamanho do vetor
        int tamanho = 20;

        // Crie o vetor para armazenar os números positivos
        double[] Q = new double[tamanho];

        // Faça a leitura dos números positivos
        for (int i = 0; i < tamanho; i++) {
            do {
                System.out.print("Digite um número positivo para a posição " + (i + 1) + ": ");
                Q[i] = scanner.nextDouble();
            } while (Q[i] < 0);
        }

        // Encontre o maior elemento e sua posição
        double maiorElemento = Q[0];
        int posicaoMaior = 0;

        for (int i = 1; i < tamanho; i++) {
            if (Q[i] > maiorElemento) {
                maiorElemento = Q[i];
                posicaoMaior = i;
            }
        }

        // Encontre o menor elemento e sua posição
        double menorElemento = Q[0];
        int posicaoMenor = 0;

        for (int i = 1; i < tamanho; i++) {
            if (Q[i] < menorElemento) {
                menorElemento = Q[i];
                posicaoMenor = i;
            }
        }

        // Imprima o maior e menor elementos e suas posições
        System.out.println("O maior elemento é " + maiorElemento + " e ocupa a posição " + (posicaoMaior + 1) + " no vetor.");
        System.out.println("O menor elemento é " + menorElemento + " e ocupa a posição " + (posicaoMenor + 1) + " no vetor.");

        scanner.close();
    }
}
