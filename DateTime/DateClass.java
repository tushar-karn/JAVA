import java.time.LocalDate;

public class DateClass {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.now(); // gets current system date
        LocalDate d2 = LocalDate.of(2024, 6, 12); // specify year, month, and day explicitly
    }
}
