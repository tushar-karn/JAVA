package Conditionals;

import java.util.*;

public class CheckIfNoIsEvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num%2==0) {
            System.out.println(num + " Is Even ");
        }
        else{
            System.out.println(num + " is Odd");
        }
    }
}
