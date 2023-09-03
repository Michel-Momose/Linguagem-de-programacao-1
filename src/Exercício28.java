import java.util.Scanner;

public class Exercício28 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite um número: ");
        double n2 = scanner.nextDouble();
        System.out.print("Digite um número: ");
        double n3 = scanner.nextDouble();

        if (n1 > n2 && n1 > n3) {
            System.out.print(n1);
        }
        else if (n2 > n1 && n2 > n3) {
            System.out.print(n2);
        } else {
            System.out.print(n3);
        }
        scanner.close();
    }
}
