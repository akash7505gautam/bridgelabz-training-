import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class prog4 {
    public static void main(String[] args) {
        // Current date
        LocalDate today = LocalDate.now();

        // Different formatters
        DateTimeFormatter formatone = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formattwo= DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatthree = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Display in different formats
        System.out.println("(dd/MM/yyyy): " + today.format(formatone));
        System.out.println("(yyyy-MM-dd): " + today.format(formattwo));
        System.out.println("(EEE, MMM dd, yyyy): " + today.format(formatthree));
    }
}
