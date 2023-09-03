import java.util.Scanner;

public class Exercício35 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite o número de litros vendidos: ");
        double litrosVendidos = scanner.nextDouble();
        System.out.print("Digite o tipo de combustível (A para álcool, G para gasolina): ");
        char tipoCombustivel = scanner.next().charAt(0);

        double precoGasolina = 3.30;
        double precoAlcool = 2.90;
        double desconto;
        double precoTotal;
        
        if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {
            if (litrosVendidos <= 20) {
                desconto = 0.03;
            } else {
                desconto = 0.05;
            }
            precoTotal = litrosVendidos * (precoAlcool - (precoAlcool * desconto));
        } else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') {
            if (litrosVendidos <= 20) {
                desconto = 0.04;
            } else {
                desconto = 0.06;
            }
            precoTotal = litrosVendidos * (precoGasolina - (precoGasolina * desconto));
        } else {
            System.out.println("Tipo de combustível inválido.");
            return;
        }

        System.out.printf("Valor a ser pago: R$ %.2f%n", precoTotal);

        scanner.close();
    }
}

}
