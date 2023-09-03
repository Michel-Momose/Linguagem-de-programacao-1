import java.util.Scanner;

public class Exercício38 {

    public static void main(String[] args) {

        int codigoCorreto = 1234;
        int senhaCorreta = 9999;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código de usuário: ");
        int codigoUsuario = scanner.nextInt();

        if (codigoUsuario != codigoCorreto) {
            System.out.println("Usuário inválido!");
        } else {

            System.out.print("Digite a senha: ");
            int senhaUsuario = scanner.nextInt();

            if (senhaUsuario != senhaCorreta) {
                System.out.println("Senha incorreta!");
            } else {
                System.out.println("Acesso permitido");
            }
        }

        scanner.close();
    }
}
