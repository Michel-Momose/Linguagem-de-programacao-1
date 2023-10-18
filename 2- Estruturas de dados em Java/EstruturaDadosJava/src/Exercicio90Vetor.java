import java.util.Scanner;

    public class Exercicio90Vetor {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            int tamanhoVetor = 30;
            int[] vetor = new int[tamanhoVetor];
    
            // Faz a leitura dos 30 números no vetor
            for (int i = 0; i < tamanhoVetor; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                vetor[i] = scanner.nextInt();
            }
    
            // Faz a leitura do número a ser contado
            System.out.print("Digite o número a ser contado: ");
            int numeroAContar = scanner.nextInt();
    
            // Inicializa o contador de ocorrências
            int contador = 0;
    
            // Percorre o vetor e conta as ocorrências do número
            for (int i = 0; i < tamanhoVetor; i++) {
                if (vetor[i] == numeroAContar) {
                    contador++;
                }
            }
    
            // Imprime a quantidade de ocorrências
            System.out.println("O número " + numeroAContar + " aparece " + contador + " vezes no vetor.");
    
            scanner.close();
        } 
}
