import java.util.ArrayList;

public class ex054 {
    public static void main(String[] args){
        ArrayList<String> funcionarios = new ArrayList<>();
        funcionarios.add("João");
        funcionarios.add("Maria");
        funcionarios.add("Ana");
        funcionarios.add("Pedro");
        funcionarios.add("Antônio");

        System.out.println("A segunda pessoa da lista é: " + funcionarios.get(1));
        System.out.println("O numero de elementos na lista é: " + funcionarios.size());
    }
}
