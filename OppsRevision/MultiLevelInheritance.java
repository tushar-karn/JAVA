import java.util.Scanner;

class A{
    int a;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A ");
        a=sc.nextInt();
    }
}
class B extends A{
    int b;
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter B");
        b=sc.nextInt();
    }
}

class C  extends B {
    void Sum(){
        System.out.println("Addition of 2 numbers are "+(a+b));
    }
    
}

class MultiLevelInheritance{
    public static void main(String[] args) {
        C obj = new C();
        obj.input();
        obj.getData();
        obj.Sum();
    }
}

