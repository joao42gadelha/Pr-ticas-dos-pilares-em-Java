import java.util.Scanner;
public class ex008 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner (System.in);

        int num1, num2;
        String sair = "";

       while (!sair.equalsIgnoreCase("sair")){
        System.out.println("Número 1: ");
        num1 = leitura.nextInt();

        System.out.println("Número 2: ");
        num2 = leitura.nextInt();

        System.out.println("Os números escolhidos são: " + num1 + " e " + num2);
        if (num1 > num2){
            System.out.println("O número 1: " + num1 + ", é maior que o número 2: " +num2);
        }else{
            System.out.println("O número 2: " + num2 +  ", é maior que o número 1: " +num1);
        }
        leitura.nextLine();

        System.out.println("Se você deseja sair, digite 'sair' ou aperte Enter para continuar e escolher novos valores. ");

        sair = leitura.nextLine();

       }
       leitura.close();
    }
}
