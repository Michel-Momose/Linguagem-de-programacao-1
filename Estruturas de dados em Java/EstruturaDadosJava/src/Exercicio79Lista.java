import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio79Lista {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Cria uma lista para armazenar as notas dos alunos
        ArrayList<Double> notas = new ArrayList<>();
        
        // Faz a leitura das notas dos alunos
        for (int i = 0; i < 20; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            notas.add(nota);
        }
        
        // Calcula a média da turma
        double somaNotas = 0;
        for (double nota : notas) {
            somaNotas += nota;
        }
        double mediaTurma = somaNotas / notas.size(); // O tamanho da lista é o número de alunos
        
        // Conta quantos alunos obtiveram nota acima da média
        int alunosAcimaDaMedia = 0;
        for (double nota : notas) {
            if (nota > mediaTurma) {
                alunosAcimaDaMedia++;
            }
        }
        
        // Exibe a média da turma e o resultado da contagem
        System.out.println("Média da turma: " + mediaTurma);
        System.out.println("Número de alunos com nota acima da média: " + alunosAcimaDaMedia);
        
        scanner.close();
    }
}
