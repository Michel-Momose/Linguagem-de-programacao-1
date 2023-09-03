import java.util.Scanner;

public class Exercício44 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double valor1, valor2, resultado;

        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextDouble();

        do {
            System.out.print("Digite o segundo valor (não pode ser zero): ");
            valor2 = scanner.nextDouble();
        } while (valor2 == 0);

        resultado = valor1 / valor2;

        System.out.println("Resultado da divisão: " + resultado);
        scanner.close();
    }
}

}
