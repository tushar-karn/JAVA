import java.util.Scanner;
class A{
    int a,b;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no ");
        a=sc.nextInt();
        System.out.println("Enter 2nd no ");
        b=sc.nextInt();
    }
    void add(){
        System.out.println("Addition of A & B is "+(a+b));
    }
}
class B extends A{
    int c;
    void getData(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter 3rd number ");
        c= sc.nextInt();
    }
    void display(){
        System.out.println("Addition of A & B & C is "+(a+b+c));
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.input();
        obj.getData();
        obj.add();
        obj.display();
    }
}
