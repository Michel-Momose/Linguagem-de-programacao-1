import java.util.Scanner;

public class Exercício33 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();
        
        if (n1 == n2){
            System.out.println("Números iguais");
        } else if (n1 > n2){
            System.out.println("Primeiro é maior");
        } else {
            System.out.println("Segundo maior");
        }
        scanner.close();
}
}
