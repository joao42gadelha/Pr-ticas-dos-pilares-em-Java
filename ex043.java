import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.temporal.ChronoUnit;
public class ex043 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String prazo;

        System.out.print("Informe o prazo (dd/mm/yyyy): ");
        prazo = scanner.nextLine();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataPrazo =  LocalDate.parse(prazo, formato);
        LocalDate fimDoPrazo = LocalDate.of(2025, 9,23);

        long diasTotais = ChronoUnit.DAYS.between(dataPrazo, fimDoPrazo);
        System.out.println("Diferença total em dias: " + diasTotais);

        Period periodo = Period.between(dataPrazo, fimDoPrazo);
        System.out.println("Data de entrega: " + fimDoPrazo.format(formato));

        System.out.println("Diferença: "
                + periodo.getYears() + " anos, "
                + periodo.getMonths() + " meses e "
                + periodo.getDays() + " dias");




    }
}
