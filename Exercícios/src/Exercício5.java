import java.util.Scanner;

public class Exercício5 {			

	public static void main(String args[]) {

			Scanner sc = new Scanner(System.in);			

			System.out.print("Fale sua idade: ");

			int num = sc.nextInt();

			System.out.println("O número escolhido: " + num + "\nO Antecessor do número: " + (num - 1));
	}
}
