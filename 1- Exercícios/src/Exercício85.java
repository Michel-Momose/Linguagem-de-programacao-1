import java.util.Scanner;

public class Exercício85 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Defina o número de dias no ano (365 para um ano comum)
        int numeroDeDias = 365;

        // Crie um vetor para armazenar as temperaturas médias
        double[] temperaturas = new double[numeroDeDias];

        // Faça a leitura das temperaturas médias de todos os dias do ano
        for (int i = 0; i < numeroDeDias; i++) {
            System.out.print("Digite a temperatura média do dia " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
        }

        // Encontre a menor temperatura do ano
        double menorTemperatura = temperaturas[0];
        for (int i = 1; i < numeroDeDias; i++) {
            if (temperaturas[i] < menorTemperatura) {
                menorTemperatura = temperaturas[i];
            }
        }

        // Encontre a maior temperatura do ano
        double maiorTemperatura = temperaturas[0];
        for (int i = 1; i < numeroDeDias; i++) {
            if (temperaturas[i] > maiorTemperatura) {
                maiorTemperatura = temperaturas[i];
            }
        }

        // Calcule a temperatura média anual
        double somaDasTemperaturas = 0;
        for (int i = 0; i < numeroDeDias; i++) {
            somaDasTemperaturas += temperaturas[i];
        }
        double temperaturaMediaAnual = somaDasTemperaturas / numeroDeDias;

        // Conte o número de dias no ano em que a temperatura foi inferior à média anual
        int diasComTemperaturaAbaixoDaMedia = 0;
        for (int i = 0; i < numeroDeDias; i++) {
            if (temperaturas[i] < temperaturaMediaAnual) {
                diasComTemperaturaAbaixoDaMedia++;
            }
        }

        // Imprima os resultados
        System.out.println("Menor temperatura do ano: " + menorTemperatura);
        System.out.println("Maior temperatura do ano: " + maiorTemperatura);
        System.out.println("Temperatura média anual: " + temperaturaMediaAnual);
        System.out.println("Número de dias no ano com temperatura abaixo da média anual: " + diasComTemperaturaAbaixoDaMedia);

        scanner.close();
    }
}
