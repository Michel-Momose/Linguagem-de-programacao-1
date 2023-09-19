import java.util.Scanner;

public class Exercicio78Vetor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crie um vetor para armazenar os nomes
        String[] nomes = new String[10];

        // Faça a leitura dos 10 nomes
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        // Solicite o nome a ser procurado
        System.out.print("Digite um nome para buscar: ");
        String nomeProcurado = scanner.nextLine();

        // Verifique se o nome está no vetor
        boolean encontrado = false;
        for (int i = 0; i < 10; i++) {
            if (nomes[i].equalsIgnoreCase(nomeProcurado)) {
                encontrado = true;
                break; // Encerra o loop assim que o nome for encontrado
            }
        }

        // Imprima a mensagem adequada
        if (encontrado) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }

        scanner.close();
    }
}
