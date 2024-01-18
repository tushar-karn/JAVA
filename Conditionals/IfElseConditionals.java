package Conditionals;
import java.util.*;
public class IfElseConditionals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if (num1>num2) {
            System.out.println("Num1 is Grater then Num2");
        }
        else if (num1==num2) {
            System.out.println("Num1 and Num2 are Equal");
        }
        else{
            System.out.println("Num2 is Grater");
        }
    }
}
