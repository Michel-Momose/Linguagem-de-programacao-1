import java.util.Scanner;

 

public class exercicios {

	public static void main(String args[]) {

/*		

		EXERCÍCIO 1 - JAVA

		int a = 10;

		int b = 20;

		System.out.println("Valor A: " + a);

		System.out.println("Valor B: " + b);

		

		int aux = a;

	    a = b;

	    b = aux;

	    

	    System.out.println("Valor A: " + a);

	    System.out.println("Valor B: " + b);		

*/

			

	  //EXERCÍCIO 2 - JAVA	

			

/* letra A)

		

		int a = 10;

		int b = 20;

		

		System.out.println("Variável B: " + b);

		

	    b = 5;

		

		System.out.println("Variável A: " +

		a + "\nVáriavel B: " + b);

 

*/

//letra B)	

			

			

//		int a = 30;

//		int b = 20;

//		int c = a + b;

//		System.out.println("Variável C: " + c);

//		System.out.println("Primeira mudança ---");

//	    b = 10;

//		

//		System.out.println("Variável B: " + b + "\nVáriavel C: " + c);

//		System.out.println("Segunda mudança ---");

//		c = a + b;

//		

//		System.out.println("Variável A: " + a + "\nVariável B: " + b + "\nVariável C: " + c);

		

//Exercicio 4

			

//		int a = 6 * (3+2);

//		int b = 2 + (6 * (3 + 2));

//		int c = 2+(3*6)/(2+4);

//		int d = 2+ 3*6/(2+4);

//		System.out.println("variavel C: " + c + "\nvariavel D: " + d);


// Letra D

//		int c = 2*(8/(3+1));

//		int d = 2* 8/(3+1);

//		System.out.println("variavel C: " + c + "\nvariavel D: " + d);	

			
// Letra E

//			int c = 3+(16-2)/(2*(9-2));

//			int d = 3+(16-2)/(2*(9-2));

//			System.out.println("variavel C: " + c + "\nvariavel D: " + d);

			

// Letra F

//			int c = 6/3+8/2;

//			int d = (6/3)+(8/2);

//			System.out.println("variavel C: " + c + "\nvariavel D: " + d);


//Letra G

//			int c = (3+8/2)*4+3*2;

//			int d = ((3+(8/2))*4)+(3*2);

//			System.out.println("variavel C: " + c + "\nvariavel D: " + d);

			
// Letra H

//			int c = 6*3*3+6-10;

//			int d = (6*(3*3)+6)-10;

//			System.out.println("variavel C: " + c + "\nvariavel D: " + d);

			
//Letra I			

//			int c = (10*8+3)*9;

//			int d = (((10*8)+3)*9);

//			System.out.println("variavel C: " + c + "\nvariavel D: " + d);		

			
//Letra J

//			int c =  -12*-4+3*-4;

//			int d =  ((-12)*(-4))+(3*(-4));

//			System.out.println("variavel C: " + c + "\nvariavel D: " + d);

			
// Exercício 5 -----------			

//			Scanner sc = new Scanner(System.in);			

//			System.out.print("Fale sua idade: ");

//			int num = sc.nextInt();

//			System.out.println("O número escolhido: " + num + "\nO Antecessor do número: " + (num - 1));
	

// Exercício 6 ----------

//			Scanner sc = new Scanner(System.in);			

//			System.out.print("Fale a altura do retângulo: ");

//			int base = sc.nextInt();

//			System.out.println("Fale o tamanho da base do retângulo: ");

//			int altura = sc.nextInt();

//			float area = base * altura;

//			System.out.print("\nA área do retângulo: " + area);

			
// Exercício 7 ------------

			// Scanner sc = new Scanner(System.in);			

			// System.out.print("Digite seu ano de nascimento: ");

			// int ano = sc.nextInt();

			// System.out.print("Digite seu mês de nascimento: ");
			// int mes = sc.nextInt();

			// System.out.print("Digite seu dia de nascimento: ");

			// int dia = sc.nextInt();

			// int ano2 = 2023 - ano;

			// int idadeEmDias = (ano2 * 365) + (mes * 30) + dia;

			// System.out.println("A idade em dias é: " + idadeEmDias + "dias");

 
// Exercício 8
		

	// 	public static void main(String[] args) {

	//         Scanner scanner = new Scanner(System.in);

	//         System.out.print("Digite o número total de eleitores: ");

	//         int totalEleitores = scanner.nextInt();

	//         System.out.print("Digite o número de votos brancos: ");

	//         int votosBrancos = scanner.nextInt();

	//         System.out.print("Digite o número de votos nulos: ");

	//         int votosNulos = scanner.nextInt();

	//         System.out.print("Digite o número de votos válidos: ");

	//         int votosValidos = scanner.nextInt();

	//         double percentualBrancos = (votosBrancos * 100.0) / totalEleitores;

	//         double percentualNulos = (votosNulos * 100.0) / totalEleitores;

	//         double percentualValidos = (votosValidos * 100.0) / totalEleitores;

	//         System.out.println("Percentual de votos brancos: " + percentualBrancos + "%");

	//         System.out.println("Percentual de votos nulos: " + percentualNulos + "%");

	//         System.out.println("Percentual de votos válidos: " + percentualValidos + "%");

	//         scanner.close();
	//     }

			
// Exercício 9 ---------
		

// 		Scanner scanner = new Scanner(System.in);

// 		System.out.print("Digite seu salário mensal: ");

// 		float salarioMensal = scanner.nextFloat();

// 		System.out.print("Digite o percentual de reajuste: ");

// 		float reajuste = scanner.nextFloat();


// 		float salarioR = ((salarioMensal * reajuste) - (salarioMensal));

// 		System.out.println("Salario atual:" + salarioR);
//      scanner.close();

		
// Exercicio 10 ---------------

		
// 		Scanner scanner = new Scanner(System.in);

// 		System.out.print("Digite o custo de fabrica do carro: ");

// 		float custoF = scanner.nextFloat();

// 		double valorFinal = (custoF * 0.28) + (custoF * 0.45) + custoF;

// 		System.out.println("Valor para o consumidor:" + valorFinal);

//      scanner.close();

		
// Exercicio 11

	// 	Scanner scanner = new Scanner(System.in);

	// 	System.out.print("Digite quantos carros foram vendidos: ");

	// 	float qtdcarros = scanner.nextFloat();

	// 	System.out.print("Digite o valor total das vendas: ");

	// 	float vendas = scanner.nextFloat();

	// 	System.out.print("Digite o salarios fixo: ");

	// 	float salario = scanner.nextFloat();

	// 	System.out.print("Digite a comissão por carro vendido: ");

	// 	float comissao = scanner.nextFloat();

	// 	double salarioFinal = ((qtdcarros * comissao ) + (vendas * 0.05) + salario );

	// 	System.out.println("Salario final: " + salarioFinal);

        // scanner.close();

// Exercicio 12

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Qual a temp em Fahrenheit? ");
        // double tempF = scanner.nextFloat();
        // double tempC = (tempF - 32) / 1.8;
        // System.out.println("Temperatura convertida em Celsius : " + tempC);

        // scanner.close();

// Exercicio 13


        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Digite a primeira nota ");
        // double n1 = scanner.nextDouble();
        // System.out.print("Digite a segunda nota ");
        // double n2 = scanner.nextDouble();
        // System.out.print("Digite a terceira nota ");
        // double n3 = scanner.nextDouble();

        // double mediafinal = ((n1 * 2) + (n2 * 3) + (n3 * 5)) / 10 ;

        // System.out.println("Média final:" + mediafinal);

        // scanner.close();

// Exercicio 14

        // Scanner scanner = new Scanner(System.in);
                
        // System.out.print("Digite um valor: ");
        // int valor = scanner.nextInt();

        // if (valor > 10) {
        //     System.out.println("É MAIOR QUE 10!");
        // } else {
        //     System.out.println("NÃO É MAIOR QUE 10!");
        // }

        // scanner.close();

// Exercicio 15

        // Scanner scanner = new Scanner(System.in);
                
        // System.out.print("Digite um valor: ");
        // int valor = scanner.nextInt();

        // if (valor >= 0) {
        //     System.out.println("Positivo");
        // } else {
        //     System.out.println("Negativo");
        // }

        // scanner.close();

// Exercicio 16

        // Scanner scanner = new Scanner(System.in);
                
        // System.out.print("Digite quantas maçãs foram compradas: ");
        // int maças = scanner.nextInt();

        // if (maças >= 12) {
        //     System.out.println("Valor a ser pago: R$" + maças);
        // } else {
        //     System.out.println("Valor a ser pago: R$" + (maças * 1.3));
        // }

        // scanner.close();

// Exercicio 17


        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Digite a primeira nota:");
        // float n1 = scanner.nextFloat();
        // System.out.print("Digite a segunda nota:");
        // float n2 = scanner.nextFloat();

        // float mediaA = (n1+n2)/2;

        // if (mediaA >=6 ) {
        //     System.out.println("Aprovado com média:" + mediaA);
        // } else {
        //     System.out.println("Reprovado com média" + mediaA);
        // }

        // scanner.close();

// Exercício 18 


        
    
		

		

		

		

		

		

		

		

		

		

		

		

		

		

		

		

		

		

		

		

		

		

		}

}

 