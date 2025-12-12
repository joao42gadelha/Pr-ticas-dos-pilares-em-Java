import java.util.Scanner;

public class ex007 {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        String sair = "";
        
       
        while (!sair.equalsIgnoreCase("sair")) {
              System.out.println("Digite um número: ");
        int numero = leitura.nextInt();

            if (numero < 0) {
                System.out.println("Seu número é Negativo: " + numero);
            } else {
                System.out.println("Seu número é positivo: " + numero);
            }
            leitura.nextLine();

            System.out.println("Se você desja sair, digite 'Sair' ou presione Enter para continuar.");
            sair = leitura.nextLine();
        }

        System.out.println("Programa encerrado! ");
        leitura.close();
    }
}
