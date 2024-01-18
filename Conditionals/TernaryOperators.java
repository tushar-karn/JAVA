package Conditionals;

import java.util.Scanner;

public class TernaryOperators {
    public static void main(String[] args) {
        String element = (5>3)? "5 is grater " :"3 is grater";
        System.out.println(element);
        Scanner input = new Scanner(System.in);
        int val = input.nextInt();
        String isEvenOrOdd = (val%2==0)? "Even": "Odd";
        System.out.println(isEvenOrOdd);
    }
}
