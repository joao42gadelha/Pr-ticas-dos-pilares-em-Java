import java.util.Scanner;
public class ex033 {
    public static void main(String[] args)
    {   Scanner scanner = new Scanner (System.in);
        System.out.print("Digite o texto: ");
        String texto = scanner.nextLine();

        System.out.print("Digite a palavra que quer encontrar: ");
        String palavraSeach = scanner.nextLine();

        if (texto.contains(palavraSeach))
        {
            System.out.print("A palavra " + palavraSeach + " está presente no texto.");
        }else{
            System.out.println("A palavra " + palavraSeach + " não está presente no texto");
        }
    }
}
