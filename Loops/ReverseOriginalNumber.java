package Loops;

import java.util.Scanner;

public class ReverseOriginalNumber {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int number = inputScanner.nextInt();
        int reversed = 0;
        while (number>0) {
            int lastDigit = number%10;
            reversed = (reversed*10) +lastDigit;  // Formula = reverse = (reverse * 10) + lastDigit;
            number/=10;
        }
        System.out.println(reversed);
    }
}
