import java.util.Scanner;
class IsPrime{
    int num ; 
    void input(){
        System.out.println("Enter Number to check Prime ");
        Scanner sc = new Scanner(System.in);
        num= sc.nextInt();
    }
    boolean checkPrimeOrNotOptimised(){
        boolean prime = true;
        if (num<2) {
            return false;
        }
        if (num==2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num%i==0) {
                prime= false;
                break;
            }
        }
        return prime;
    }
}

class Reverse extends IsPrime{
    void revFunction(){
        int rev = 0;
        while (num>0) {
            rev = rev * 10 + num %10;
            num/=10;
        }
        System.out.println("Reverse is "+ rev);
    }
}

public class SingleInheritanceNew {
    public static void main(String[] args) {
        Reverse obj = new Reverse();
        obj.input();
        boolean ans = obj.checkPrimeOrNotOptimised();
        if (ans) {
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
        obj.revFunction();
    }
}
