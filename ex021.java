import java.util.Scanner;
public class ex021 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= numero; i++)
        {
        fatorial *= i;
        }


        System.out.printf("O resultado é: %d", fatorial);
    }
}
