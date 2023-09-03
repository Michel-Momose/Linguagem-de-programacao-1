import java.util.Scanner;

public class Exercício31 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Digite o valor do lado A: ");
            double a = scanner.nextDouble();
            
            System.out.print("Digite o valor do lado B: ");
            double b = scanner.nextDouble();
            
            System.out.print("Digite o valor do lado C: ");
            double c = scanner.nextDouble();
            
            String resultado = verificaTriangulo(a, b, c);
            System.out.println(resultado);
            
            scanner.close();
        }
        
        public static String verificaTriangulo(double a, double b, double c) {
            if (a < b + c && b < a + c && c < a + b) {
                return "Forma um triângulo";
            } else {
                return "Não forma um triângulo";
            }
        }
    }
    
