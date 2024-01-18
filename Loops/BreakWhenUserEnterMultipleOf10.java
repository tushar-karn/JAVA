package Loops;

import java.util.Scanner;

public class BreakWhenUserEnterMultipleOf10 {
    public static void main(String[] args) {
        while (true) {
            System.out.print("Enter Value : ");
            Scanner inputScanner = new Scanner(System.in);
            int number = inputScanner.nextInt();
            if (number%10==0) {
                break;
            }
            System.out.println(number);
        }

        //////////////////////////////////////////////////  with Do While Loop

        // do{
        //     Scanner newScanner = new Scanner(System.in);
        //     int value = newScanner.nextInt();
        //     if (value%10==0) {
        //         break;
        //     }
        //     System.out.println(value);
        // }while(true);

    }
}
