import java.util.Scanner;

public class Exercício16 {
    
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
                
        System.out.print("Digite quantas maçãs foram compradas: ");
        int maças = scanner.nextInt();

        if (maças >= 12) {
            System.out.println("Valor a ser pago: R$" + maças);
        } else {
            System.out.println("Valor a ser pago: R$" + (maças * 1.3));
        }

        scanner.close();
    }
}
