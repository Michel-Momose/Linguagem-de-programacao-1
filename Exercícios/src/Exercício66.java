import java.util.Scanner;

public class Exercício66 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int primeiroValor = scanner.nextInt();

        System.out.print("Digite o segundo valor: ");
        int segundoValor = scanner.nextInt();

        int menorValor = Math.min(primeiroValor, segundoValor);
        int maiorValor = Math.max(primeiroValor, segundoValor);

        int soma = 0;

        for (int i = menorValor; i <= maiorValor; i++) {
            soma += i;
        }

        System.out.println("A soma dos inteiros entre " + menorValor + " e " + maiorValor + " é: " + soma);

        scanner.close();
    }
}
