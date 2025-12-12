import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class ex028 {
    public static void main (String [] args)
    {
        String texto = "meu email é Joao42gadelha@gmail.com";
        Pattern pattern = Pattern.compile("\\w+@\\w+.\\w+");
        Matcher matcher = pattern.matcher(texto);

        if (matcher.find())

        {
            System.out.println(matcher.group());

        }

    }
}
