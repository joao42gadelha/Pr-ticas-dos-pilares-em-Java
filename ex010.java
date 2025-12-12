import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        String sair = "";

        while (!sair.equalsIgnoreCase("sair")) {
            System.out.println("Digite um número: ");
            int numero = leitura.nextInt();

            if (numero % 2 == 0) {

                System.out.println("Seu número é par!");
            } else {
                System.out.println("Seu número é ímpa!");
            }

            leitura.nextLine();

            System.out.println("Digite 'sair' para encerrar o programa ou aperte Enter para continanuar");
            sair = leitura.nextLine();

        }
        leitura.close();
    }
}