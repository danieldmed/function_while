import java.util.Scanner;

public class FuncWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senhaCorreta = 1234;
        int senhaDigitada;

        do { 
            System.out.print("Digite a senha: ");
            senhaDigitada = scanner.nextInt();
        if (senhaDigitada != senhaCorreta) {
            System.out.println("Senha incorreta. Tente novamente.");
        }
        } while (senhaDigitada != senhaCorreta);
            System.out.println("Senha correta. Seja bem-vindo!");
    }
}