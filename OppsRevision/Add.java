import java.util.Scanner;

public class Add {
    int a, b;
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st NO ");
        a = sc.nextInt();
        System.out.println("Enter 2nd NO ");
        b= sc.nextInt();
    }
    void putData(){
        System.out.println("Addition of A & B is "+(a+b));
    }

    public static void main(String[] args) {
        Add obj = new Add();
        obj.getData();
        obj.putData();
    }

}
