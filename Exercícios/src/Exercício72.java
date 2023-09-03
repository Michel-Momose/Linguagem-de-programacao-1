import java.util.Scanner;

public class Exercício72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeProdutos = 15;
        double maiorPreco = Double.MIN_VALUE; // Inicializa com o menor valor possível
        double somaPrecos = 0;

        for (int i = 1; i <= quantidadeProdutos; i++) {
            System.out.print("Digite o código do produto #" + i + ": ");
            int codigo = scanner.nextInt();

            System.out.print("Digite o preço do produto #" + i + ": ");
            double preco = scanner.nextDouble();

            if (preco > maiorPreco) {
                maiorPreco = preco;
            }

            somaPrecos += preco;
        }

        double mediaPrecos = somaPrecos / quantidadeProdutos;

        System.out.println("O maior preço lido é: " + maiorPreco);
        System.out.println("A média dos preços dos produtos é: " + mediaPrecos);

        scanner.close();
    }
}
