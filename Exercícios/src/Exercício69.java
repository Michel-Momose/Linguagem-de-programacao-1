import java.util.Scanner;

public class Exercício69 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorTotalEmEstoque = 0;
        int numeroDeMercadorias = 0;
        char continuar;

        do {
            System.out.print("Digite o valor da mercadoria: ");
            double valorMercadoria = scanner.nextDouble();
            valorTotalEmEstoque += valorMercadoria;
            numeroDeMercadorias++;

            System.out.print("Mais mercadorias (S/N)? ");
            continuar = scanner.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        double mediaDeValor = valorTotalEmEstoque / numeroDeMercadorias;

        System.out.println("O valor total em estoque é: " + valorTotalEmEstoque);
        System.out.println("A média de valor das mercadorias é: " + mediaDeValor);

        scanner.close();
    }
}
