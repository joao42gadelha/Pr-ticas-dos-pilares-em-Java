import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ex045 {
    public static void main(String[] args){
        LocalDate hoje = LocalDate.now();
        LocalDate dataEvento = LocalDate.of(2025,9,11);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Data do evento: " + dataEvento.format(formato));
        System.out.println("Data atual: " + hoje.format(formato));

        if (dataEvento.isAfter(hoje)){
            System.out.println("O Evento ainda está por vir");
        }else if (dataEvento.isBefore(hoje)) {
            System.out.print("O evento já ocorreu.");
        }
    }
}
