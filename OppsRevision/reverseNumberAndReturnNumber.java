import java.util.Scanner;
public class reverseNumberAndReturnNumber {
    int num;
    void getData(int num){
        this.num = num;
    }
    int putData(){
        int rev = 0 ;
        while (num>0) {
            rev = (rev*10)+num%10;
            num/=10;
        }
        return rev;
    }
    public static void main(String[] args) {
        reverseNumberAndReturnNumber obj = new reverseNumberAndReturnNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to reverse ");
        int x = sc.nextInt();
        obj.getData(x);
        int ans = obj.putData();
        System.out.println("Reverse is "+ans);
    }
}
