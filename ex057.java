import java.util.HashMap;
import java.util.Map;

public class ex057 {
    public static void main(String[] args){
        Map<Integer, String> clientes = new HashMap<>();
        clientes.put(1, "Maria");
        clientes.put(2, "Marcos");
        clientes.put(3, "Ana");
        clientes.put(4, "Joana");
        clientes.put(5, "Karen");

        System.out.println("O nome do cliente com ID 5: " + clientes.get(5));
        if(clientes.containsKey(6)){
            System.out.print("O nome do cliente com ID 6 é: " + clientes.get(6));
        }else {
            System.out.println("Cliente com ID 6 não encontrado.");
        }


    }
}
