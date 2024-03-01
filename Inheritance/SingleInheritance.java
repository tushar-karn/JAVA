import java.util.Scanner;

class BaseClass{
    int a,b;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        a= sc.nextInt();
        System.out.println("Enter Second Number");
        b = sc.nextInt();
    }
    void Add(){
        System.out.println("Addition is "+(a+b));
    }
}

class DerivedClass extends BaseClass{
    int c;
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER NO");
        c = sc.nextInt();
    }
    void display(){
        System.out.println("Adittion is "+(a+b+c));
    }
}

class SingleInheritance{
    public static void main(String[] args) {
        // we always create Object of Derived class ; 
        DerivedClass obj = new DerivedClass();
        obj.input();
        obj.getData();
        obj.display();
    }
}