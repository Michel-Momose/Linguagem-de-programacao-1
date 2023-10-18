import java.util.Scanner;

    public class Exercicio87Vetor {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            int[] numeros = new int[10];
    
            // Faz a leitura dos 10 números
            for (int i = 0; i < 10; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();
            }
    
            // Ordena o vetor em ordem crescente usando o Selection Sort
            for (int i = 0; i < numeros.length - 1; i++) {
                int indiceMenor = i;
                for (int j = i + 1; j < numeros.length; j++) {
                    if (numeros[j] < numeros[indiceMenor]) {
                        indiceMenor = j;
                    }
                }
                if (indiceMenor != i) {
                    int temp = numeros[i];
                    numeros[i] = numeros[indiceMenor];
                    numeros[indiceMenor] = temp;
                }
            }
    
            // Imprime o vetor ordenado
            System.out.println("Vetor ordenado em ordem crescente:");
            for (int numero : numeros) {
                System.out.println(numero);
            }
    
            // Lê o novo número a ser inserido
            System.out.print("Digite um novo número: ");
            int novoNumero = scanner.nextInt();
    
            // Insere o novo número na posição correta mantendo a ordem crescente
            int indiceInsercao = encontrarIndiceInsercao(numeros, novoNumero);
            if (indiceInsercao < 10) {
                inserirNumero(numeros, novoNumero, indiceInsercao);
            }
    
            // Imprime o vetor com o novo número inserido
            System.out.println("Vetor com o novo número inserido:");
            for (int numero : numeros) {
                System.out.println(numero);
            }
    
            scanner.close();
        }
    
        // Encontra o índice onde o novo número deve ser inserido para manter a ordem crescente
        private static int encontrarIndiceInsercao(int[] vetor, int novoNumero) {
            int i = 0;
            while (i < vetor.length && vetor[i] < novoNumero) {
                i++;
            }
            return i;
        }
    
        // Insere o novo número na posição correta no vetor
        private static void inserirNumero(int[] vetor, int novoNumero, int indice) {
            for (int i = vetor.length - 1; i > indice; i--) {
                vetor[i] = vetor[i - 1];
            }
            vetor[indice] = novoNumero;
        }
}
