import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ex044 {
    public static void main(String[] args){
    LocalDate vencimento = LocalDate.of(2025, 2, 4);
    int meses = 2;
    LocalDate prazoEntrega = vencimento.plusMonths(meses);

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataFormatada = prazoEntrega.format(formato);

        System.out.print("A nova data de entrega é: " + dataFormatada);
    }
}
