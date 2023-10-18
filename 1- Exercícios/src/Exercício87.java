import java.util.Scanner;

public class Exercício87 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Defina o tamanho do vetor (incluindo o espaço para o novo número)
        int tamanho = 11;

        // Crie um vetor para armazenar os números
        int[] numeros = new int[tamanho];

        // Faça a leitura dos 10 números
        for (int i = 0; i < tamanho - 1; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Ordenação em ordem crescente usando Bubble Sort
        for (int i = 0; i < tamanho - 1; i++) {
            for (int j = 0; j < tamanho - i - 2; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    // Troque os elementos se estiverem fora de ordem
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        // Leitura do novo número
        System.out.print("Digite um novo número: ");
        int novoNumero = scanner.nextInt();

        // Encontre a posição correta para inserir o novo número
        int posicaoInsercao = 0;
        while (posicaoInsercao < tamanho - 1 && novoNumero > numeros[posicaoInsercao]) {
            posicaoInsercao++;
        }

        // Desloque os elementos para abrir espaço para o novo número
        for (int i = tamanho - 2; i >= posicaoInsercao; i--) {
            numeros[i + 1] = numeros[i];
        }

        // Insira o novo número na posição correta
        numeros[posicaoInsercao] = novoNumero;

        // Imprima o vetor atualizado
        System.out.println("Vetor ordenado com o novo número inserido:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(numeros[i] + " ");
        }

        scanner.close();
    }
}
