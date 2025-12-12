import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class ex036 {
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        String cpf;
        System.out.print("Digite seu CPF: ");
        cpf = scanner.nextLine();

        Pattern cpfPadrao = Pattern.compile("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");
        Matcher matcher = cpfPadrao.matcher(cpf);

        if (matcher.matches()) {
            System.out.println("CPF: " + matcher.group() + " está válido");
        }else{
            System.out.println("CPF INVÁLIDO.");
        }
        scanner.close();

    }
}
