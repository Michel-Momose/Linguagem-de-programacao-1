import java.util.Scanner;

    public class Exercicio86Vetor {
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
    
            scanner.close();
        }  
}
