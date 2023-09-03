import java.util.Scanner;

public class Exercício11 {

    public static void main(String args[]) {
        
    	Scanner scanner = new Scanner(System.in);

		System.out.print("Digite quantos carros foram vendidos: ");

		float qtdcarros = scanner.nextFloat();

		System.out.print("Digite o valor total das vendas: ");

		float vendas = scanner.nextFloat();

		System.out.print("Digite o salarios fixo: ");

		float salario = scanner.nextFloat();

		System.out.print("Digite a comissão por carro vendido: ");

		float comissao = scanner.nextFloat();

		double salarioFinal = ((qtdcarros * comissao ) + (vendas * 0.05) + salario );

		System.out.println("Salario final: " + salarioFinal);

        scanner.close();
    }
}
