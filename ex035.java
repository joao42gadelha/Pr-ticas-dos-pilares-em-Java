import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ex035 {
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Digite o código de entrada: ");
        String codigoReference = scanner.nextLine();

        Pattern codigoFormatado = Pattern.compile("^[A-Z]{3}-\\d{4}$");
        Matcher matcher = codigoFormatado.matcher(codigoReference);

        if (matcher.matches())
        {
            System.out.println("codigo válido: " + matcher.group());
        }else
        {
            System.out.println("Código inválido");
        }
        scanner.close();
    }
}
