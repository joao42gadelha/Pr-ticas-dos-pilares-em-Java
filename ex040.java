
import java.time.LocalDate;
import java.time.LocalTime;

public class ex040 {
    public static void main(String[] args)
    {
        String tarefa = "Enviar relatório semanal";
        System.out.println("Tarefa: \"" + tarefa + "\"");

        LocalTime horarioDeCriacao = LocalTime.now();
        System.out.println("orário de criação: " +horarioDeCriacao);

        LocalDate dataDeCriacao = LocalDate.of(2025, 8, 28);
        System.out.println("Data de criação: " + dataDeCriacao);



    }
}
