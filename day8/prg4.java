import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class prog5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Take first date input
        System.out.print("Enter first date (yyyy-MM-dd): ");
        LocalDate date1 = LocalDate.parse(sc.nextLine(), formatter);

        // Take second date input
        System.out.print("Enter second date (yyyy-MM-dd): ");
        LocalDate date2 = LocalDate.parse(sc.nextLine(), formatter);

        // Compare dates
        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is BEFORE " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is AFTER " + date2);
        } else if (date1.isEqual(date2)) {
            System.out.println(date1 + " is EQUAL to " + date2);
        }

        sc.close();
    }
}

