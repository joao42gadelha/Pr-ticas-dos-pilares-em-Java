import java.util.Scanner;
public class ex030 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String world;
        System.out.println ("Digite o texto: Olá, mundo!!");
        world = scanner.nextLine();

        System.out.println("Texto em minusculo: "+ world.toLowerCase());
        System.out.println("Texto em minusculo: "+ world.toUpperCase());

    }
}
