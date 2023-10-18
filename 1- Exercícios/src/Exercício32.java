import java.util.Scanner;

public class Exercício32 {
    public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do time A: ");
        String timeA = scanner.next();
        System.out.print("Digite quantos gols o time A fez na partida: ");
        int golsA = scanner.nextInt();
        System.out.print("Digite o nome do time B: ");
        String timeB = scanner.next();
        System.out.print("Digite quantos gols o time B fez na partida: ");
        double golsB = scanner.nextDouble();

        if (golsA > golsB){
            System.out.println("O time " + timeA + " venceu a partida");
        } else if (golsB > golsA){
            System.out.println("O time " + timeB + " venceu a partida");
        } else {
            System.out.println("Empate");
        }
        scanner.close();
}
}
