import java.util.Scanner;

public class AddSecondMethod {
    int a,b;
    void getData(int a,int b){
        this.a = a;
        this.b=b;
    }
    void putData(){
        System.out.println("Addition of A & B is "+(a+b));
    }
    public static void main(String[] args) {
        AddSecondMethod obj = new AddSecondMethod();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd no ");
        int b = sc.nextInt();

        obj.getData(a, b);
        // obj.getData(5, 6);
        obj.putData();
    }
}
