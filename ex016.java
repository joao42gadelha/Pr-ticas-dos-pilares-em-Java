import java.util.Scanner;

public class ex016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dia da semana: ");
        String dia = scanner.nextLine();
        scanner.close();
        if (dia.equalsIgnoreCase("Segunda") || dia.equalsIgnoreCase("Terca")
                || dia.equalsIgnoreCase("Quarta") || dia.equalsIgnoreCase("Quinta") ||
                dia.equalsIgnoreCase("Sexta")) {
                System.out.println("É um dia útil.");
        }else{
            System.out.println("Não é um dia útil.");
        }

    }
}
