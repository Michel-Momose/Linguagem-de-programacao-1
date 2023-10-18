import java.util.Scanner;

public class Exercício54 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N;

        do {
            System.out.print("Digite um valor N (maior que zero): ");
            N = scanner.nextInt();

            if (N <= 0) {
                System.out.println("O valor de N deve ser maior que zero. Tente novamente.");
            }
        } while (N <= 0);

        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }

        scanner.close();
    }

}
