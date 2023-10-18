import java.util.Scanner;

public class Exercício12 {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual a temp em Fahrenheit? ");
        double tempF = scanner.nextFloat();
        double tempC = (tempF - 32) / 1.8;
        System.out.println("Temperatura convertida em Celsius : " + tempC);

        scanner.close();
    }
}
