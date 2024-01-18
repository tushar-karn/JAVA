package Conditionals;

import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long income = input.nextLong();
        if (income<=500000) {
            System.out.println("You are in 0% Tax Slab");
        }
        else if (income>500000 && income<=1000000) {
            System.out.print("You are in 20% Tax Slab = ");
            System.out.println(income * 0.2);
        }
        else{
            System.out.print("You are in 40% Tax Slab = ");
            System.out.println(income * 0.4);
        }
    }
}
