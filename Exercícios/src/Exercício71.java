import java.util.Scanner;

public class Exercício71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números a serem lidos: ");
        int quantidade = scanner.nextInt();

        if (quantidade <= 0) {
            System.out.println("A quantidade deve ser maior que zero.");
        } else {
            int maiorNumero = Integer.MIN_VALUE;
            int soma = 0;

            for (int i = 1; i <= quantidade; i++) {
                System.out.print("Digite o número #" + i + ": ");
                int numero = scanner.nextInt();
                soma += numero;

                if (numero > maiorNumero) {
                    maiorNumero = numero;
                }
            }

            double media = (double) soma / quantidade;

            System.out.println("O maior número lido é: " + maiorNumero);
            System.out.println("A média dos números lidos é: " + media);
        }

        scanner.close();
    }
}
