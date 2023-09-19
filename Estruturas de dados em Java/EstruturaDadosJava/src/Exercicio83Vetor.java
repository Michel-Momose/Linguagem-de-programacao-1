import java.util.Scanner;

public class Exercicio83Vetor {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Cria um vetor para armazenar os 20 números
            int[] numeros = new int[20];
    
            // Faz a leitura dos 20 números
            for (int i = 0; i < 20; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();
            }
    
            // Imprime os números na ordem inversa
            System.out.println("Números na ordem inversa:");
            for (int i = 19; i >= 0; i--) {
                System.out.println(numeros[i]);
            }
    
            scanner.close();
        }
}
