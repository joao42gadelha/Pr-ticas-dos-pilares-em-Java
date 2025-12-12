import java.util.Scanner;

public class ex038 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner (System.in);
        String senha;
         System.out.print("Digite a senha: ");
         senha = scanner.nextLine();

         String regex = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*\\W).{8,}$";

        if(senha.matches(regex))
        {
            System.out.print("Senha válida.");
        }else{
            System.out.print("Senha inválida");
        }

    }
}
