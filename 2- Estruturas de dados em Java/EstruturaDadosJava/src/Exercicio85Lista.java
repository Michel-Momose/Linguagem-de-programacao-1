import java.util.ArrayList;
import java.util.Scanner;
    
    public class Exercicio85Lista {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            int totalDias = 365; // Assumindo um ano comum
            ArrayList<Double> temperaturas = new ArrayList<>();
            double somaTemperaturas = 0;
    
            // Faz a leitura das temperaturas médias diárias
            for (int dia = 0; dia < totalDias; dia++) {
                System.out.print("Digite a temperatura média para o dia " + (dia + 1) + ": ");
                double temperatura = scanner.nextDouble();
                temperaturas.add(temperatura);
                somaTemperaturas += temperatura;
            }
    
            // Calcula a menor temperatura do ano
            double menorTemperatura = temperaturas.get(0);
            for (int dia = 1; dia < totalDias; dia++) {
                if (temperaturas.get(dia) < menorTemperatura) {
                    menorTemperatura = temperaturas.get(dia);
                }
            }
    
            // Calcula a maior temperatura do ano
            double maiorTemperatura = temperaturas.get(0);
            for (int dia = 1; dia < totalDias; dia++) {
                if (temperaturas.get(dia) > maiorTemperatura) {
                    maiorTemperatura = temperaturas.get(dia);
                }
            }
    
            // Calcula a temperatura média anual
            double temperaturaMediaAnual = somaTemperaturas / totalDias;
    
            // Conta o número de dias em que a temperatura foi inferior à média anual
            int diasInferioresMedia = 0;
            for (int dia = 0; dia < totalDias; dia++) {
                if (temperaturas.get(dia) < temperaturaMediaAnual) {
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
