import java.util.HashMap;
import java.util.Map;

public class ex056 {
    public static void main(String[] args){
        Map<Integer, String> cliente = new HashMap<>();
        cliente.put(1, "ana");
        cliente.put(2, "Marcos");
        cliente.put(3, "Luiz");
        System.out.println("O nome do cliente com ID 2 é: " + cliente.get(2));
    }
}
