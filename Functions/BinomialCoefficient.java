import java.util.*;
public class BinomialCoefficient {
    public static int factorial(int n){
        int fact =1;
        for (int i = n; i>=1; i--) {
            fact = fact*i;
        }
        return fact;
    }
    public static int coefficient (int a , int b){
        int p = factorial(a);
        int q = factorial(b);
        int a_b= factorial(a-b);

        int binomial = p/(q*a_b);
        return binomial;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int ans = coefficient(num1, num2);
        System.out.println(ans);
    }
}