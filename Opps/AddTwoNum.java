import java.util.Scanner;

public class AddTwoNum {
    int a , b;
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER ");
        a = sc.nextInt();
        System.out.println("ENTER SECOND NUMBER ");
        b = sc.nextInt();
    }
    void putData(){
        System.out.println("SUM OF TWO NUMBERS IS "+(a+b));
    }
    public static void main(String[] args) {
        AddTwoNum obj = new AddTwoNum();
        obj.getData();
        obj.putData();
    }
}
