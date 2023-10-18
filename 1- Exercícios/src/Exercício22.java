import java.util.Scanner;

public class Exercício22 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int horasSemanais = 40;
        final int semanasPorMes = 4;

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o salário por hora: ");
        double salarioPorHora = scanner.nextDouble();

        double salarioTotal;

        if (horasTrabalhadas <= horasSemanais * semanasPorMes) {
            salarioTotal = horasTrabalhadas * salarioPorHora;
        } else {
            double horasExtras = horasTrabalhadas - (horasSemanais * semanasPorMes);
            double salarioHoraExtra = salarioPorHora * 1.5; // 50% de acréscimo
            salarioTotal = (horasSemanais * semanasPorMes * salarioPorHora) + (horasExtras * salarioHoraExtra);
        }

        System.out.println("O salário total do funcionário é: " + salarioTotal);

        scanner.close();
    }
}
