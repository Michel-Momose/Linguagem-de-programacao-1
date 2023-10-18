import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio78Lista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Cria uma lista para armazenar os nomes das pessoas
        ArrayList<String> nomes = new ArrayList<String>();
        
        // Faz a leitura dos nomes das 10 pessoas e os armazena na lista
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome da " + (i + 1) + "ª pessoa: ");
            String nome = scanner.nextLine();
            nomes.add(nome);
        }
        
        // Faz a leitura do nome da pessoa a ser verificada
        System.out.print("Digite o nome que deseja procurar: ");
        String nomeProcurado = scanner.nextLine();
        
        // Verifica se o nome está presente na lista de nomes
        if (nomes.contains(nomeProcurado)) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }
        
        scanner.close();
    }
}