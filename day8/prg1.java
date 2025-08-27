import java.time.ZonedDateTime;
import java.time.ZoneId;

public class prog1 {
    public static void main(String[] args) {
    System.out.println(ZonedDateTime.now());
       ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
                System.out.println("IST Time : " + istTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z")));


                ZonedDateTime pstTime = istTime.withZoneSameInstant(ZoneId.of("America/Los_Angeles"));
                System.out.println("PST Time : " + pstTime.format(DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z")));
            
    }
}
