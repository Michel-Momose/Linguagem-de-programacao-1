import java.util.Scanner;

public class Exercício7 {

    public static void main(String args[]) {

	Scanner sc = new Scanner(System.in);			
	System.out.print("Digite seu ano de nascimento: ");
	int ano = sc.nextInt();
	System.out.print("Digite seu mês de nascimento: ");
	int mes = sc.nextInt();
	System.out.print("Digite seu dia de nascimento: ");
	int dia = sc.nextInt();
	int ano2 = 2023 - ano;
	int idadeEmDias = (ano2 * 365) + (mes * 30) + dia;
	System.out.println("A idade em dias é: " + idadeEmDias + "dias");
    sc.close();
    }
}
