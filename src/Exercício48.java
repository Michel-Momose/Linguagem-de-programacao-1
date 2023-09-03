import java.util.Scanner;

public class Exercício48 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1, nota2, media;

        do {
            System.out.print("Digite a nota da 1ª avaliação (0 a 10): ");
            nota1 = scanner.nextDouble();
        } while (nota1 < 0 || nota1 > 10);

        do {
            System.out.print("Digite a nota da 2ª avaliação (0 a 10): ");
            nota2 = scanner.nextDouble();
        } while (nota2 < 0 || nota2 > 10);

        media = (nota1 + nota2) / 2;

        System.out.println("Média do aluno: " + media);

        scanner.close();
    }
}