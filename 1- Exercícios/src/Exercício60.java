import java.util.Scanner;

public class Exercício60 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int contadorNoIntervalo = 0;
        int contadorForaDoIntervalo = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor #" + (i + 1) + ": ");
            int valor = scanner.nextInt();

            if (valor >= 10 && valor <= 20) {
                contadorNoIntervalo++;
            } else {
                contadorForaDoIntervalo++;
            }
        }

        System.out.println("Quantidade de valores no intervalo [10,20]: " + contadorNoIntervalo);
        System.out.println("Quantidade de valores fora do intervalo [10,20]: " + contadorForaDoIntervalo);

        scanner.close();
    }
}
