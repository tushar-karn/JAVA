package Loops;

import java.util.Scanner;

public class PrintReverseOfANumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        while (num>0) {
            int value = num%10; // Last digit = num %10
            System.out.print(value);
            num/=10; // remove Last Digit = num /10
        }
    }
}
