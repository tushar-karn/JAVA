package Loops;

import java.util.Scanner;

public class ContinueWhenUserEnterMultipleOf10 {
    public static void main(String[] args) {
        while (true) {
            Scanner inputScanner = new Scanner(System.in);
            int value = inputScanner.nextInt();
            if (value%10==0) {
                System.out.println("Enter a value which is not a multiple of 10");
                continue;
            }
            System.out.println(value);
        }
    }
}
