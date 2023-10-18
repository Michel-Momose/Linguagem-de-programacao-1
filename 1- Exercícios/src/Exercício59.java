import java.util.Scanner;

public class Exercício59 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorNegativos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor #" + (i + 1) + ": ");
            int valor = scanner.nextInt();

            if (valor < 0) {
                contadorNegativos++;
            }
        }

        System.out.println("Quantidade de valores NEGATIVOS: " + contadorNegativos);

        scanner.close();
    }
}
