import java.util.Scanner;

 class A {
    int a;
    void input(){
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
    }
}

 class B extends A{
    int b;
    void getData(){
        Scanner sc = new Scanner(System.in);
        b=sc.nextInt();
    }
}

 class C extends B{
    void sum(){
        System.out.println("SUM IS "+(a+b));
    }
}


class MultilevelInheritance {
public static void main(String[] args) {
    C obj = new C();
    obj.input();
    obj.getData();
    obj.sum();
}
    
}