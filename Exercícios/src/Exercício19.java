import java.util.Scanner;

public class Exercício19 {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número:");
        float n1 = scanner.nextFloat();
        System.out.print("Digite outro número (diferente):");
        float n2 = scanner.nextFloat();

        if (n1 > n2) {
            System.out.println("O maior valor é: " + n1);
        } else {
            System.out.println("O maior valor é: " + n2);
        }
    }
}
