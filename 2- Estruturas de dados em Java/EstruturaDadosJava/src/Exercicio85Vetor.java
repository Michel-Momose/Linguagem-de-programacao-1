import java.util.Scanner;

    public class Exercicio85Vetor {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            int totalDias = 365; // Assumindo um ano comum
            double[] temperaturas = new double[totalDias];
            double somaTemperaturas = 0;
    
            // Faz a leitura das temperaturas médias diárias
            for (int dia = 0; dia < totalDias; dia++) {
                System.out.print("Digite a temperatura média para o dia " + (dia + 1) + ": ");
                temperaturas[dia] = scanner.nextDouble();
                somaTemperaturas += temperaturas[dia];
            }
    
            // Calcula a menor temperatura do ano
            double menorTemperatura = temperaturas[0];
            for (int dia = 1; dia < totalDias; dia++) {
                if (temperaturas[dia] < menorTemperatura) {
                    menorTemperatura = temperaturas[dia];
                }
            }
    
            // Calcula a maior temperatura do ano
            double maiorTemperatura = temperaturas[0];
            for (int dia = 1; dia < totalDias; dia++) {
                if (temperaturas[dia] > maiorTemperatura) {
                    maiorTemperatura = temperaturas[dia];
                }
            }
    
            // Calcula a temperatura média anual
            double temperaturaMediaAnual = somaTemperaturas / totalDias;
    
            // Conta o número de dias em que a temperatura foi inferior à média anual
            int diasInferioresMedia = 0;
            for (int dia = 0; dia < totalDias; dia++) {
                if (temperaturas[dia] < temperaturaMediaAnual) {
                    diasInferioresMedia++;
                }
            }
    
            // Exibe os resultados
            System.out.println("Menor temperatura do ano: " + menorTemperatura);
            System.out.println("Maior temperatura do ano: " + maiorTemperatura);
            System.out.println("Temperatura média anual: " + temperaturaMediaAnual);
            System.out.println("Número de dias no ano em que a temperatura foi inferior à média anual: " + diasInferioresMedia);
    
            scanner.close();
        }
}
