package Functions;

import java.util.Scanner;

public class factorial {

    public static int findFactorial(int n){
        int fact = 1;
        for (int i = n; i >=1; i--) {
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int n = inputScanner.nextInt();
        int value = findFactorial(n);
        System.out.println(value);
    }
}
