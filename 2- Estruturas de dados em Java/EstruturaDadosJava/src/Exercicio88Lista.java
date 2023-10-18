import java.util.ArrayList;
import java.util.Scanner;
    
    public class Exercicio88Lista {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            ArrayList<Integer> lista = new ArrayList<>();
    
            // Faz a leitura dos 20 números
            for (int i = 0; i < 20; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                int numero = scanner.nextInt();
                lista.add(numero);
            }
    
            // Faz a leitura do número a ser verificado
            System.out.print("Digite o número a ser verificado e removido: ");
            int numeroVerificado = scanner.nextInt();
    
            // Verifica se o número existe na lista
            boolean numeroEncontrado = lista.contains(numeroVerificado);
    
            if (numeroEncontrado) {
                // Remove o número encontrado da lista
                lista.remove(Integer.valueOf(numeroVerificado));
    
                // Imprime a lista atualizada
                System.out.println("Lista sem o número " + numeroVerificado + ":");
                for (int numero : lista) {
                    System.out.println(numero);
                }
            } else {
                System.out.println("O número " + numeroVerificado + " não foi encontrado na lista.");
            }
    
            scanner.close();
        }
}
