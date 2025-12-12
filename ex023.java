import java.util.Scanner;

public class ex023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senha;
        int tentativas = 4;
        for (int i = 0; i <= tentativas; i++) {

            System.out.print("Digite sua senha: ");
            senha = scanner.nextInt();
            if (senha == 12345) {
                System.out.println("Senha autorizada, seja bem vindo!");
                break;
            } else if ((tentativas - i) != 0) {
                System.out.println("Senha incorreta");
                System.out.println("Número de tentativas restante:" + (tentativas - i));
            } else {
                System.out.print("Conta bloqueada temporariamente.");
            }
        }
    }
}
