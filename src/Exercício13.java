import java.util.Scanner;

public class Exercício13 {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota ");
        double n2 = scanner.nextDouble();
        System.out.print("Digite a terceira nota ");
        double n3 = scanner.nextDouble();

        double mediafinal = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10 ;

        System.out.println("Média final:" + mediafinal);

        scanner.close();
    }
}
