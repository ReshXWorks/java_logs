import java.time.YearMonth;
import java.time.LocalDate;
import java.util.Scanner;

public class CalendarApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==== Java Calendar ====");
        System.out.print("Enter year (e.g., 2025): ");
        int year = sc.nextInt();
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        // Validate month, wrong user input-what if
        if (month < 1 || month > 12) {
            System.out.println("Invalid month! Please enter between 1-12.");
            return;
        }
        printMonthCalendar(year, month);
        sc.close();  
    }
    public static void printMonthCalendar(int year, int month) {
        YearMonth ym = YearMonth.of(year, month);
        LocalDate firstDay = ym.atDay(1);
        int daysInMonth = ym.lengthOfMonth(); // handles leap years automatically!
        int startDay = firstDay.getDayOfWeek().getValue(); // 1 = Monday, 7 = Sunday
        System.out.println("\n    " + ym.getMonth() + " " + year);
        System.out.println("Su Mo Tu We Th Fr Sa");

        // Adjust starting position (Java’s DayOfWeek is Mon=1 ... Sun=7)
        int currentPos = 0;
        for (int i = 0; i < (startDay % 7); i++) {
            System.out.print("   ");
            currentPos++;
        }

        // Print all days of the month
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%2d ", day);
            currentPos++;
            if (currentPos % 7 == 0) {
                System.out.println(); // line break after Saturday
            }
        }
        System.out.println();
    }
}
