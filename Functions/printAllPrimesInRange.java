import java.util.Scanner;

public class printAllPrimesInRange {
    public static boolean IsPrime(int n) {
        if (n == 2) {
            return true;
        }
        boolean prime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }

    public static void check(int n) {
        for (int i = 2; i <= n; i++) {
            if (IsPrime(i)) {
                System.out.println(i+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int no = input.nextInt();
        check(no);
    }
}
