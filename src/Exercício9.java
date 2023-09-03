import java.util.Scanner;

public class Exercício9 {

    public static void main(String args[]) {

	Scanner scanner = new Scanner(System.in);

	System.out.print("Digite seu salário mensal: ");

	float salarioMensal = scanner.nextFloat();

	System.out.print("Digite o percentual de reajuste: ");
	float reajuste = scanner.nextFloat();


	float salarioR = ((salarioMensal * reajuste) - (salarioMensal));

	System.out.println("Salario atual:" + salarioR);
     scanner.close();
    }
}
