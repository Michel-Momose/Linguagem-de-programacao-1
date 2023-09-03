import java.util.Scanner;

public class Exercício27 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double n = scanner.nextDouble();

        if (n>0) {
            System.out.println("Número positivo.");
        } else if (n ==0){
            System.out.println("Zero.");
        } else if (n<0) {
            System.out.println("Número negativo.");
        }
        scanner.close();
    }  
}
