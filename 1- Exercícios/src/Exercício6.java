import java.util.Scanner;

public class Exercício6 {
    
	public static void main(String args[]) {

			Scanner scanner = new Scanner(System.in);			

			System.out.print("Fale a altura do retângulo: ");

			int base = scanner.nextInt();

			System.out.println("Fale o tamanho da base do retângulo: ");

			int altura = scanner.nextInt();

			float area = base * altura;

			System.out.print("\nA área do retângulo: " + area);

			scanner.close();
	}
}
