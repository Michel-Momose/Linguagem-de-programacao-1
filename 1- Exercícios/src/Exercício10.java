import java.util.Scanner;

public class Exercício10 {

    public static void main(String args[]) {

 	    Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o custo de fabrica do carro: ");

		float custoF = scanner.nextFloat();

		double valorFinal = (custoF * 0.28) + (custoF * 0.45) + custoF;

		System.out.println("Valor para o consumidor:" + valorFinal);

     scanner.close();
    }
}
