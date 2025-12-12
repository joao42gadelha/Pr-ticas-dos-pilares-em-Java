import java.util.Scanner;
public class ex017 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double peso;
        int idade;
        System.out.println("Informe sua idade: ");
        idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Informe seu peso: ");
        peso = scanner.nextDouble();
        scanner.nextLine();

        if (idade >= 18 && idade <= 65){
            System.out.println("Idade permitida para doação");

        }else{
            System.out.println("Idade não permitida para doação");
        }
        if (peso > 50.0){
            System.out.println("peso permitido para doação");
        }else{
            System.out.println("Peso não permitido para doação");
        }
    }
}
 