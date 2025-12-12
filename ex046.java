import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ex046 {
    public static void main(String[] args){
        LocalDate dateCurrent = LocalDate.of(2025,3,30);
        int reminder = 5;

        LocalDate dateDelivery = dateCurrent.minusDays(reminder);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        if(dateDelivery.isBefore(dateCurrent)){
            System.out.print("Data do lembrete: " + dateDelivery.format(formato));
        }else{
            System.out.println("Não é o dia.");
        }
    }
}
