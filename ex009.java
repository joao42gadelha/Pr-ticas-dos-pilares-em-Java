import java.util.Scanner;
public class ex009 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número para ver sua tábuada: ");
        int numero = leitura.nextInt();

        for (int i = 1; i <= 10; i++){
            int resultado = numero * i;

        System.out.println(numero + " x " + i + " = " + resultado);
        }
        leitura.close();
    }
}
