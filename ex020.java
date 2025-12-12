import java.util.Scanner;

public class ex020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeros;
        System.out.print("Digite um número: ");
        numeros = scanner.nextInt();

        int soma = 0;
        for (int i = 0; i <= numeros; i++) {
            boolean par = i % 2 == 0;
            if (par) {
              soma += i;
            }

        }
        System.out.printf("A soma dos números pares é: %d", soma);
    }
}
