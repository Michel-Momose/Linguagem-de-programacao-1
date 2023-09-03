import java.util.Scanner;

public class Exercício73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double somaSalarios = 0;
        int somaFilhos = 0;
        double maiorSalario = Double.MIN_VALUE;
        int contadorPessoasMenorSalario = 0;
        int totalPessoas = 0;

        System.out.println("Digite os dados dos habitantes (salário e número de filhos) ou um salário negativo para encerrar:");

        while (true) {
            System.out.print("Salário: ");
            double salario = scanner.nextDouble();

            if (salario < 0) {
                break;
            }

            System.out.print("Número de filhos: ");
            int filhos = scanner.nextInt();

            somaSalarios += salario;
            somaFilhos += filhos;
            totalPessoas++;

            if (salario > maiorSalario) {
                maiorSalario = salario;
            }

            if (salario < 150) {
                contadorPessoasMenorSalario++;
            }
        }

        if (totalPessoas > 0) {
            double mediaSalarios = somaSalarios / totalPessoas;
            double mediaFilhos = (double) somaFilhos / totalPessoas;
            double percentualMenorSalario = (double) contadorPessoasMenorSalario / totalPessoas * 100;

            System.out.println("Média de salário da população: " + mediaSalarios);
            System.out.println("Média do número de filhos: " + mediaFilhos);
            System.out.println("Maior salário dos habitantes: " + maiorSalario);
            System.out.println("Percentual de pessoas com salário menor que R$ 150,00: " + percentualMenorSalario + "%");
        } else {
            System.out.println("Nenhum dado foi inserido.");
        }

        scanner.close();
    }
}
