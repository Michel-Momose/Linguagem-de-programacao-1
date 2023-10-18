import java.util.Scanner;

public class Exercício65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int primeiroValor = scanner.nextInt();

        System.out.print("Digite o segundo valor (maior que o primeiro): ");
        int segundoValor = scanner.nextInt();

        int soma = 0;

        for (int i = primeiroValor; i <= segundoValor; i++) {
            soma += i;
        }

        System.out.println("A soma dos inteiros entre " + primeiroValor + " e " + segundoValor + " é: " + soma);

        scanner.close();
    }
}
