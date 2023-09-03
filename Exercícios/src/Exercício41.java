import java.util.Scanner;

public class Exercício41 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da primeira verificação: ");
        double N1 = scanner.nextDouble();
        System.out.print("Digite a nota da segunda verificação: ");
        double N2 = scanner.nextDouble();
        System.out.print("Digite a nota da terceira verificação: ");
        double N3 = scanner.nextDouble();

        System.out.print("Digite a média dos exercícios: ");
        double mediaExercicios = scanner.nextDouble();

        double mediaAproveitamento = (N1 + N2 * 2 + N3 * 3 + mediaExercicios) / 7;

        char conceito;
        if (mediaAproveitamento >= 9.0) {
            conceito = 'A';
        } else if (mediaAproveitamento >= 7.5) {
            conceito = 'B';
        } else if (mediaAproveitamento >= 6.0) {
            conceito = 'C';
        } else if (mediaAproveitamento >= 4.0) {
            conceito = 'D';
        } else {
            conceito = 'E';
        }

        System.out.printf("Média de Aproveitamento: %.2f%n", mediaAproveitamento);
        System.out.println("Conceito do Aluno: " + conceito);

        scanner.close();
    }
}

}
