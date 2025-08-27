import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class prog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter a date (yyyy-MM-dd): ");
        String input = sc.nextLine();

        // Parse input string into LocalDate
        LocalDate date = LocalDate.parse(input, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Original Date: " + date);

        // Add 7 days, 1 month, and 2 years
        LocalDate modifiedDate = date.plusDays(7).plusMonths(1).plusYears(2);
        System.out.println("After adding 7 days, 1 month, 2 years: " + modifiedDate);

        // Subtract 3 weeks
        LocalDate finalDate = modifiedDate.minusWeeks(3);
        System.out.println("After subtracting 3 weeks: " + finalDate);

        sc.close();
    }
}
