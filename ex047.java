
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ex047 {
public static void main(String[]args){
    ZonedDateTime today = ZonedDateTime.now();
    ZonedDateTime todayJapan = today.withZoneSameInstant(ZoneId.of("Asia/Tokyo"));


    System.out.println(todayJapan);
System.out.println("selcoo meo");
}
}
