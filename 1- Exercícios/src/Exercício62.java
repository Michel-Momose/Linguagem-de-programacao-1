import java.util.Scanner;

public class Exercício62 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Digite o número de alunos na turma: ");
            int numeroDeAlunos = scanner.nextInt();
    
            double somaDasNotas = 0;
    
            for (int i = 1; i <= numeroDeAlunos; i++) {
                System.out.print("Digite a nota do aluno #" + i + ": ");
                double nota = scanner.nextDouble();
                somaDasNotas += nota;
            }
    
            double mediaAritmetica = somaDasNotas / numeroDeAlunos;
    
            System.out.println("A média aritmética das notas dos alunos é: " + mediaAritmetica);
    
            scanner.close();
        }
    
}