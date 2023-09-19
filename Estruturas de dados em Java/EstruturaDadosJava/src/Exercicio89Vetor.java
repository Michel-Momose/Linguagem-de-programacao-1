import java.util.Scanner;

    public class Exercicio89Vetor {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            int tamanho = 15;
            int[] v1 = new int[tamanho];
            int[] v2 = new int[tamanho];
    
            // Faz a leitura do primeiro vetor V1
            System.out.println("Digite os elementos do vetor V1:");
            for (int i = 0; i < tamanho; i++) {
                System.out.print("Elemento " + (i + 1) + ": ");
                v1[i] = scanner.nextInt();
            }
    
            // Faz a leitura do segundo vetor V2
            System.out.println("Digite os elementos do vetor V2:");
            for (int i = 0; i < tamanho; i++) {
                System.out.print("Elemento " + (i + 1) + ": ");
                v2[i] = scanner.nextInt();
            }
    
            // Calcula a quantidade de vezes que V1 e V2 possuem os mesmos números nas mesmas posições
            int contador = 0;
            for (int i = 0; i < tamanho; i++) {
                if (v1[i] == v2[i]) {
                    contador++;
                }
            }
    
            // Imprime a quantidade de correspondências
            System.out.println("Quantidade de vezes que V1 e V2 possuem os mesmos números nas mesmas posições: " + contador);
    
            scanner.close();
        } 
}
