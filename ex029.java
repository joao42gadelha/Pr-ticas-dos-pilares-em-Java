import java.util.Scanner;
public class ex029 {
    public static void main(String[] args)
    {
        String nome;
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite seu nome: ");
        nome = scanner.nextLine();

        System.out.print("O seu nome é: " + nome.trim());
        scanner.close();
    }
}
