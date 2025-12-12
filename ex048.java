import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ex048 {
    public static void main (String [] args){
        ZonedDateTime today = ZonedDateTime.now();
        ZonedDateTime todaySydiney = today.withZoneSameInstant(ZoneId.of("Australia/Sydney"));

        DateTimeFormatter format = DateTimeFormatter.ofPattern("HH:mm");

        System.out.println("Horário hoje: " + today.format(format));
        System.out.println("Horário em Sydney: " + todaySydiney.format(format));
    }
}
