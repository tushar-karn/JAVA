import java.util.Scanner;

class A{
    int a,b;
    void input(){
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
    }
}
class B extends A {
    void Add(){
        System.out.println("Add is "+ (a+b));
    }
}
class C extends A{
    void Multiply(){
        System.out.println("Multiplication is "+ (a*b));
    }
}
public class HierarchicalInterface {
   public static void main(String[] args) {
    B obj1 = new B();
    obj1.input();
    obj1.Add();
    C obj2 = new C();
    obj2.input();
    obj2.Multiply();
   }
}
