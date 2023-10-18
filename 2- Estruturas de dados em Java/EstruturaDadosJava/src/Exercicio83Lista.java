import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
    
public class Exercicio83Lista {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Cria uma lista para armazenar os 20 números
            ArrayList<Integer> numeros = new ArrayList<>();
    
            // Faz a leitura dos 20 números
            for (int i = 0; i < 20; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                int numero = scanner.nextInt();
                numeros.add(numero);
            }
    
            // Inverte a ordem dos números na lista
            Collections.reverse(numeros);
    
            // Imprime os números na ordem inversa
            System.out.println("Números na ordem inversa:");
            for (int i = 0; i < 20; i++) {
                System.out.println(numeros.get(i));
            }
    
            scanner.close();
        }
}
