import java.util.ArrayList;
public class ex053 {
    public static void main(String[] args){
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Joana");
        nomes.add("Lucas");
        nomes.add("Pedro");
        nomes.add("Antonio");

        System.out.println("Lista inicial: " + nomes);
        nomes.remove("Pedro");

        System.out.println("Lista atual: " + nomes);




    }
}
