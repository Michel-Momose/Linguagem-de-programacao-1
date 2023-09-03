import java.util.Scanner;

public class Exercício17 {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a primeira nota:");
        float n1 = scanner.nextFloat();
        System.out.print("Digite a segunda nota:");
        float n2 = scanner.nextFloat();

        float mediaA = (n1+n2)/2;

        if (mediaA >=6 ) {
            System.out.println("Aprovado com média:" + mediaA);
        } else {
            System.out.println("Reprovado com média" + mediaA);
        }

        scanner.close();
    }
}
