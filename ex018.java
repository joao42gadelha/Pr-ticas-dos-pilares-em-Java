import java.util.Scanner;
public class ex018 {
    public static void main (String  [] args)
    {
        Scanner scanner = new Scanner(System.in);
        int degraus = 0;
        System.out.println("Digite a quantidade de Degraus: ");
        degraus = scanner.nextInt();

        for (int i = 0; i <= degraus; i++)
        {
            System.out.println("Subindo o degrau " + i);
            if (i == degraus){
                System.out.println("Você chegou ao topo!");
            }
        }
        scanner.close();


    }
}
