import java.util.Scanner;


public class ex022 {
    public static void NumeroMaior(Scanner scanner){
    String[] numerosStr = scanner.nextLine().split(" ");
    int maior = Integer.MIN_VALUE; // Serve para verificar os números negativvos
    for (String numeStr: numerosStr)
    {
        int num = Integer.parseInt(numeStr);
        if (num > maior)
        {
            maior = num;
        }
    }
    System.out.printf("O maior valor é: %d", maior);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] listaDeNumeros = new int[5];

        for (int i = 0; i < listaDeNumeros.length; i++) {

            System.out.print("Digite um número para por na lista: ");
            listaDeNumeros[i] = scanner.nextInt();
        }
        int maior = listaDeNumeros[1];

        for (int i = 1; i < listaDeNumeros.length; i++)
        {
            if (listaDeNumeros[i] > maior) {
                maior = listaDeNumeros[i];
            }
            System.out.printf("O maior número é: %d",maior);
        }
    }
}
