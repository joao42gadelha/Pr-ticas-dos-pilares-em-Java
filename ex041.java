import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class ex041 {
    public static void main(String[] args){

    LocalDate data = LocalDate.now();
    LocalTime horario = LocalTime.now();


    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    DateTimeFormatter horarioFormat = DateTimeFormatter.ofPattern("hh:mm");


    System.out.println("A data formatada: " + data.format(formato));
    System.out.print("O hórario formatado é: " + horario.format(horarioFormat));
    }
}
