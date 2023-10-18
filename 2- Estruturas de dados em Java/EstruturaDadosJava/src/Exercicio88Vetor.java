import java.util.Scanner;

    public class Exercicio88Vetor {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            int tamanhoVetor = 20;
            int[] vetor = new int[tamanhoVetor];
    
            // Faz a leitura dos 20 números
            for (int i = 0; i < tamanhoVetor; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                vetor[i] = scanner.nextInt();
            }
    
            // Faz a leitura do número a ser verificado
            System.out.print("Digite o número a ser verificado e removido: ");
            int numeroVerificado = scanner.nextInt();
    
            // Verifica se o número existe no vetor
            int indiceNumero = -1; // Inicializa como -1 para indicar que o número não foi encontrado
            for (int i = 0; i < tamanhoVetor; i++) {
                if (vetor[i] == numeroVerificado) {
                    indiceNumero = i;
                    break; // O número foi encontrado, não é necessário continuar procurando
                }
            }
    
            if (indiceNumero != -1) {
                // Remove o número encontrado do vetor criando um novo vetor sem ele
                int[] novoVetor = new int[tamanhoVetor - 1];
                for (int i = 0, j = 0; i < tamanhoVetor; i++) {
                    if (i != indiceNumero) {
                        novoVetor[j] = vetor[i];
                        j++;
                    }
                }
    
                // Imprime o novo vetor
                System.out.println("Vetor sem o número " + numeroVerificado + ":");
                for (int i = 0; i < novoVetor.length; i++) {
                    System.out.println(novoVetor[i]);
                }
            } else {
                System.out.println("O número " + numeroVerificado + " não foi encontrado no vetor.");
            }
    
            scanner.close();
        } 
}
