import java.util.Scanner;

    public class Exercicio80Vetor {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Cria um vetor para armazenar os números positivos
            double[] Q = new double[20];
    
            // Faz a leitura dos números positivos
            for (int i = 0; i < 20; i++) {
                double numero;
                do {
                    System.out.print("Digite um número positivo para a posição " + (i + 1) + ": ");
                    numero = scanner.nextDouble();
                } while (numero < 0); // Continua pedindo entrada até que seja um número positivo
                Q[i] = numero;
            }
    
            // Encontra o maior elemento e sua posição
            double maiorElemento = Q[0];
            int posicaoMaior = 0;
    
            for (int i = 1; i < 20; i++) {
                if (Q[i] > maiorElemento) {
                    maiorElemento = Q[i];
                    posicaoMaior = i;
                }
            }
    
            // Exibe o valor do maior elemento e sua posição
            System.out.println("Maior elemento de Q: " + maiorElemento);
            System.out.println("Posição que ele ocupa no vetor: " + (posicaoMaior + 1)); // Adicionamos 1 para ajustar a posição para humanos (iniciando em 1)
    
            scanner.close();
        }
    }
