import java.util.Scanner;

public class Exercício38 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade (em Kg) de morangos adquiridos: ");
        double kgMorangos = scanner.nextDouble();
        System.out.print("Digite a quantidade (em Kg) de maçãs adquiridas: ");
        double kgMaca = scanner.nextDouble();

        double precoMorango;
        double precoMaca;

        if (kgMorangos <= 5) {
            precoMorango = 2.50;
        } else {
            precoMorango = 2.20;
        }

        if (kgMaca <= 5) {
            precoMaca = 1.80;
        } else {
            precoMaca = 1.50;
        }

        double valorTotal = (kgMorangos * precoMorango) + (kgMaca * precoMaca);

        if (kgMorangos + kgMaca > 8 || valorTotal > 25) {
            valorTotal *= 0.9; // Aplica um desconto de 10%
        }

        System.out.printf("Valor a ser pago pelo cliente: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}
