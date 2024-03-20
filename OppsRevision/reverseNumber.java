import java.util.Scanner;

public class reverseNumber {
    int num;
    void getData(int num){
        this.num=num;
    }
    void putData(){
        int rev = 0;
        while (num>0) {
            rev = (rev*10) + num%10;
            num/=10;
        }
        System.out.println("Reverse of Number is "+rev);
    }
    public static void main(String[] args) {
        reverseNumber obj = new reverseNumber();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to reverse ");
        int x = sc .nextInt();
        obj.getData(x);
        obj.putData();
    }
}
