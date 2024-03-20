import java.util.Scanner;

public class StaticDataMember {
    int roll;
    String name;
    static String c_name = "LPU";

    StaticDataMember(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    void putData() {
        System.out.println("Student roll is " + roll);
        System.out.println("Student name is " + name);
        System.out.println("College name is " + c_name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll");
        int x = sc.nextInt();
        // Consume the newline character
        sc.nextLine();
        System.out.println("Enter name");
        String y = sc.nextLine();
        StaticDataMember obj = new StaticDataMember(x, y);
        obj.putData();
    }
}
