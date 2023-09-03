import java.util.Scanner;

public class Exercício53 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor N (maior que zero): ");
        int N = scanner.nextInt();

        if (N > 0) {
            for (int i = 1; i <= N; i++) {
                System.out.println(i);
            }
        } else {
            System.out.println("O valor de N deve ser maior que zero.");
        }

        scanner.close();
    }
}
