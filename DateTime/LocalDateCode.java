import java.time.LocalDate;
import java.util.Scanner;
public class LocalDateCode {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String input = sc.nextLine();
        LocalDate d1 = LocalDate.now();
        System.out.println("Today's Date is "+d1);
        d1 = LocalDate.of(2020, 2, 22);
        System.out.println("Date is " + d1);

        System.out.println(d1.getYear());
        d1

        // d1 = LocalDate.parse(input);
        // System.out.println("New ONE IS "+ d1);
    }
}
