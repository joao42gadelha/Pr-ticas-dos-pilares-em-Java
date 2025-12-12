import java.util.Scanner;
public class ex025 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        String sair = "";
        int positivos = 0;
        int negativos = 0;

        while(!sair.equalsIgnoreCase("sair"))
        {
            System.out.print("Digite um número (ou 'fim' para encerrar): ");
            sair = scanner.nextLine();
            int numero = Integer.parseInt(sair);


            if (numero > 0 )
            {
                positivos++;
                System.out.printf("Quantidade de números positivos: %d", positivos);
            }else{
                System.out.printf("Quantidade de números negativos: %d", negativos);
            }
        }
    }
}
