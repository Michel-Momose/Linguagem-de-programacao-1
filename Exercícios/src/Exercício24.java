import java.util.Scanner;

public class Exercício24 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário fixo do vendedor: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor das vendas efetuadas: ");
        double valorVendas = scanner.nextDouble();

        double comissao;
        if (valorVendas <= 1500.0) {
            comissao = valorVendas * 0.03;
        } else {
            comissao = 1500.0 * 0.03 + (valorVendas - 1500.0) * 0.05;
        }

        double salarioTotal = salarioFixo + comissao;

        System.out.println("O salário total do vendedor é: " + salarioTotal);

        scanner.close();
    }
}
