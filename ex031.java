import java.util.Scanner;
public class ex031 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String texto = "O gato caça o rato.";

        System.out.println("Texto original:" + texto);

        System.out.print(" texto que quer substituir: ");
        String antigo = scanner.nextLine();


        if (!texto.contains(antigo))
        {
            System.out.println("Palavra não encontrada.");
            scanner.close();
            return;
        }

            System.out.print(" novo texto: ");
        String novo = scanner.next();

        String texto02 = texto.replace(antigo, novo);

        System.out.println ("Texto atualizado: " + texto02);


    }
}
