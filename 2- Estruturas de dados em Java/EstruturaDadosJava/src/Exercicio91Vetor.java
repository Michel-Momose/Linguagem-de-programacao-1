import java.util.Scanner;

    public class Exercicio91Vetor {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            int tamanhoVetor = 50;
            int[] vet = new int[tamanhoVetor];
    
            // Faz a leitura dos 50 números no vetor
            for (int i = 0; i < tamanhoVetor; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                vet[i] = scanner.nextInt();
            }
    
            boolean[] numerosRepetidos = new boolean[tamanhoVetor];
    
            // Inicializa o vetor de repetições como falso
            for (int i = 0; i < tamanhoVetor; i++) {
                numerosRepetidos[i] = false;
            }
    
            // Verifica se existem números repetidos e em que posições
            for (int i = 0; i < tamanhoVetor - 1; i++) {
                for (int j = i + 1; j < tamanhoVetor; j++) {
                    if (vet[i] == vet[j]) {
                        numerosRepetidos[i] = true;
                        numerosRepetidos[j] = true;
                    }
                }
            }
    
            // Imprime as posições dos números repetidos
            System.out.println("Números repetidos nas posições:");
    
            for (int i = 0; i < tamanhoVetor; i++) {
                if (numerosRepetidos[i]) {
                    System.out.println(vet[i] + " na posição " + (i + 1));
                }
            }
    
            scanner.close();
        }
}
