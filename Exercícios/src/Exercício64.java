import java.util.Scanner;

public class Exercício64 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double soma = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número #" + i + ": ");
            double numero = scanner.nextDouble();
            
            if (numero < 40) {
                soma += numero;
            }
        }

        System.out.println("A soma dos números menores que 40 é: " + soma);

        scanner.close();
    }
}
