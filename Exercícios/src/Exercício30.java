import java.util.Scanner;

public class Exercício30 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            
            if (b > c) {
                int temp = b;
                b = c;
                c = temp;
            }
            
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            
            System.out.println(a + " " + b + " " + c);

            scanner.close();
        }
}