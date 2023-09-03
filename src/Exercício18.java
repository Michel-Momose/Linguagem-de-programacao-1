import java.util.Scanner;

public class Exercício18 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o ano atual:");
        float anoA = scanner.nextFloat();
        System.out.print("Digite o ano de nascimento:");
        float anoN = scanner.nextFloat();

        if (anoA - anoN >= 18) {
            System.out.println("Pode votar");
        } else {
            System.out.println("Não pode votar");
        }
    
    }
}
