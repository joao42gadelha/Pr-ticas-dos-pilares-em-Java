import java.util.Scanner;
public class ex060 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        int opcao;
        String sair = "";
        while(!sair.equalsIgnoreCase("sair")){
        System.out.println("Culto de Jovens");
        System.out.println("A cor favorita da galera é azul.");
        System.out.println("A primeira cor que os bebes veem é vermelho");
        System.out.println("Preto é ausencia das cores e branco é a presença de todas as cores.");
        System.out.println("Veja os tópicos do culto:");
        System.out.println("""
               
               [1] - Cores;
               [2] - Cor da alegria;
               [3] - Musicas;
               [4] - meditação;
               [5] - O livro sem palavras;
               
                """);
        System.out.println("Escolha uma opção: ");
        opcao = scanner.nextInt();

        switch(opcao) {
            case 1:
                System.out.println("Cores influenciam");
                break;
            case 2:
                System.out.println("""
                        As cor da alegria é que Jesus caminha com a gente!
                        Sorria mais! O sorriso diminui o Stress, e melhora sua saúde.
                        Sorriso abre portas.
                        Evite o preto.
                        Invista em boas cores.
                        o preto não emagrece.
                        """);
                break;
            case 3:
                System.out.println("""
                        Escute músicas alegres!
                        Musica te deixa triste meu brother.
                        
                        """);
                break;
            case 4:
                System.out.println("""
                        
                        Medite Sempre, Evita muitas tristezas.
                        Jesus venceu o mundo para que tenhamos bom ânimo.
                        O mundo não muda porque você tá triste.
                        Jesus é alegria.
                        A vida com Jesus é cheia de alegria.
                        Provérbios 17:22: "o coração alegre é bom remédio, mas o espírito abatido faz secar os ossos"
                        
                        """);
                break;
            case 5:
                System.out.println("""
                        Cor amarela = O céu é a morada de Deus
                        Cor preta = O pecado nos separa de Deus
                        cor vermelha - Jesus se sacrificou por nós para que possamos voltar de volta para Deus Jo 16:33
                        cor branca - Jesus quer nos limpar do pecado, quando o aceitamos, recebemos o espirito santo;
                        cor verde - Se você o espirito santo, é nova criatura, agora é possivel ter  crescimento em Cristo.
                        """);
                break;
            default:
                System.out.println("Número não corresponde a lista.");
                return;
        }
        System.out.println("Se você deseja continuar, insira outro número, se não, digite 'sair'.");
            opcao = scanner.nextInt();
        }
    }
}
