// Importa a classe Scanner, usada para ler entradas do teclado (console)
import java.util.Scanner;

public class ex024 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para capturar o que o usuário digitar
        Scanner scanner = new Scanner(System.in);

        // Declara uma variável para armazenar o nome digitado
        String nome;

        // Início de um laço do-while: executa ao menos uma vez
        do {
            // Solicita que o usuário digite o nome
            System.out.print("Digite seu nome: ");

            // Lê a linha completa digitada pelo usuário e armazena em 'nome'
            nome = scanner.nextLine();

            // Verifica se o nome tem menos de 3 caracteres
            if (nome.length() < 3) {
                // Mostra uma mensagem de erro se o nome for muito curto
                System.out.println("Nome inválido. Digite novamente.");
            }

            // Continua repetindo enquanto o nome tiver menos de 3 caracteres
        } while (nome.length() < 3);

        // Se chegou aqui, o nome é válido e o loop terminou
        // Mostra mensagem de sucesso com o nome digitado
        System.out.println("Nome \"" + nome + "\" cadastrado com sucesso!");

        // Fecha o scanner para liberar o recurso de entrada
        scanner.close();
    }
}
