import java.util.ArrayList;
import java.util.Scanner;
    
public class Exercicio82Lista {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Cria uma lista para armazenar os 10 números do vetor
            ArrayList<Double> A = new ArrayList<>();
    
            // Faz a leitura dos 10 números
            for (int i = 0; i < 10; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                double numero = scanner.nextDouble();
                A.add(numero);
            }
    
            // Faz a leitura do número adicional X
            System.out.print("Digite o valor de X: ");
            double X = scanner.nextDouble();
    
            // Cria uma lista para armazenar o resultado da multiplicação
            ArrayList<Double> M = new ArrayList<>();
    
            // Calcula o resultado e armazena em M
            for (int i = 0; i < A.size(); i++) {
                double resultado = A.get(i) * X;
                M.add(resultado);
            }
    
            // Imprime o vetor M
            System.out.println("Vetor M (resultado da multiplicação): ");
            for (int i = 0; i < M.size(); i++) {
                System.out.println(M.get(i));
            }
    
            scanner.close();
        }
}
