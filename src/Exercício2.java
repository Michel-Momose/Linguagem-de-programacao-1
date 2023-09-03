import java.util.Scanner;

public class Exercício2 {

	public static void main(String args[]) {

    // Exercício 2 	

// Letra A

		

		int a = 10;

		int b = 20;

		

		System.out.println("Variável B: " + b);

		

	    b = 5;

		

		System.out.println("Variável A: " +

		a + "\nVáriavel B: " + b);

 



// Letra B	

		int a = 30;

		int b = 20;

		int c = a + b;

		System.out.println("Variável C: " + c);

		System.out.println("Primeira mudança ---");

	    b = 10;

		

		System.out.println("Variável B: " + b + "\nVáriavel C: " + c);

		System.out.println("Segunda mudança ---");

		c = a + b;

		

		System.out.println("Variável A: " + a + "\nVariável B: " + b + "\nVariável C: " + c);

	}		

    
}
