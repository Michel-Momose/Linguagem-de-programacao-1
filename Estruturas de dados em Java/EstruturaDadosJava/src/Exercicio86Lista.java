import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
    
    public class Exercicio86Lista {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            ArrayList<Integer> numeros = new ArrayList<>();
    
            // Faz a leitura dos 10 números
            for (int i = 0; i < 10; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                int numero = scanner.nextInt();
                numeros.add(numero);
            }
    
            // Ordena a lista em ordem crescente
            Collections.sort(numeros);
    
            // Imprime a lista ordenada
            System.out.println("Lista ordenada em ordem crescente:");
            for (int numero : numeros) {
                System.out.println(numero);
            }
    
            scanner.close();
        }
}
