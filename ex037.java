import java.util.Scanner;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class ex037 {
    public static void main(String[] args)
    {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> hashtags = new ArrayList<>();

        System.out.println("Digite o texto: ");
        String texto = scanner.nextLine();

        Pattern hashtagPresente = Pattern.compile("#\\w+");


        while(!texto.equalsIgnoreCase("sair")) {
            Matcher matcher = hashtagPresente.matcher(texto);
            while (matcher.find()) {

                hashtags.add(matcher.group());
                System.out.println("Hashtags encontrados: " + matcher.group());
                System.out.println("Lista de Hashtags encontradas {" + hashtags + "}\n");


            }
            System.out.println("Digite o texto: ");
            texto = scanner.nextLine().trim();

        }
        scanner.close();

    }
}
