import java.util.ArrayList;
import java.util.Scanner;
    
    public class Exercicio90Lista {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            ArrayList<Integer> lista = new ArrayList<>();
    
            // Faz a leitura dos 30 números na lista
            for (int i = 0; i < 30; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                int numero = scanner.nextInt();
                lista.add(numero);
            }
    
            // Faz a leitura do número a ser contado
            System.out.print("Digite o número a ser contado: ");
            int numeroAContar = scanner.nextInt();
    
            // Inicializa o contador de ocorrências
            int contador = 0;
    
            // Percorre a lista e conta as ocorrências do número
            for (int i = 0; i < lista.size(); i++) {
                if (lista.get(i) == numeroAContar) {
                    contador++;
                }
            }
    
            // Imprime a quantidade de ocorrências
            System.out.println("O número " + numeroAContar + " aparece " + contador + " vezes na lista.");
    
            scanner.close();
        }
}
