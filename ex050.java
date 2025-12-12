import java.util.*;

public class ex050 {
    public static void main (String [] args){
        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("joão");
        funcionarios.add("maria");
        funcionarios.add("joão");

        System.out.println(funcionarios);

        Set<String> produtos = new HashSet<>();
        produtos.add("Agua");
        produtos.add("Coca-Cola");
        produtos.add("Agua");

        System.out.println(produtos);

        Map<Integer, String> cliente = new HashMap<>();
        cliente.put(1, "maria");
        cliente.put(2, "Marcos");
        cliente.put(3, "Ana");
        System.out.println(cliente);


    }
}
