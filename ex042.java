import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;
public class ex042 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o horário de entrada (Formato (HH:mm):  ");
        String entrada = scanner.nextLine();

        System.out.print("Informe o horário de saída (Formato (HH:mm):  ");
        String saida = scanner.nextLine();


        LocalTime dataInicio = LocalTime.parse(entrada);
        LocalTime dataFinal = LocalTime.parse(saida);
        Duration periodo = Duration.between(dataInicio, dataFinal);

                System.out.println(entrada);
                System.out.println(saida);

       System.out.println("Duração do expediente: " + periodo.toHours() + " Horas e " + periodo.toMinutesPart() + "Minutos");

    }
}
