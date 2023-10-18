import java.util.Scanner;

public class Exercício68 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número total de mercadorias em estoque: ");
        int numeroDeMercadorias = scanner.nextInt();

        double valorTotalEmEstoque = 0;

        for (int i = 1; i <= numeroDeMercadorias; i++) {
            System.out.print("Digite o valor da mercadoria #" + i + ": ");
            double valorMercadoria = scanner.nextDouble();
            valorTotalEmEstoque += valorMercadoria;
        }

        double mediaDeValor = valorTotalEmEstoque / numeroDeMercadorias;

        System.out.println("O valor total em estoque é: " + valorTotalEmEstoque);
        System.out.println("A média de valor das mercadorias é: " + mediaDeValor);

        scanner.close();
    }
}
