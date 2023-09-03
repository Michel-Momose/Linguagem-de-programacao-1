import java.util.Scanner;

public class Exercício79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Defina o número de alunos na turma
        int numAlunos = 20;

        // Crie um vetor para armazenar as notas dos alunos
        double[] notas = new double[numAlunos];

        // Faça a leitura das notas dos alunos
        for (int i = 0; i < numAlunos; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Calcule a média da turma
        double soma = 0;
        for (int i = 0; i < numAlunos; i++) {
            soma += notas[i];
        }
        double mediaTurma = soma / numAlunos;

        // Conte quantos alunos obtiveram nota acima da média
        int acimaDaMedia = 0;
        for (int i = 0; i < numAlunos; i++) {
            if (notas[i] > mediaTurma) {
                acimaDaMedia++;
            }
        }

        // Imprima a média da turma e o resultado da contagem
        System.out.println("Média da turma: " + mediaTurma);
        System.out.println("Alunos com nota acima da média: " + acimaDaMedia);

        scanner.close();
    }
}
