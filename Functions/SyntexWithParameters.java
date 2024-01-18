package Functions;

import java.util.Scanner;

public class SyntexWithParameters {
    public static int addNumbers(int num1 , int num2){
        return num1+num2;
    }
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int num1 = inputScanner.nextInt();
        int num2 = inputScanner.nextInt();
        int output =addNumbers(num1,num2);
        System.out.println(output);
    }
}
