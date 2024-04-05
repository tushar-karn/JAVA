class A{
    A(int a){
        System.out.println("Hello Tushar");
    }
    int num = 655;
}
class B extends A{
    B(){
        super(50);

    }
    int num = 643;
    void show(){
        System.out.println(super.num);
    }
}
public class SuperKewordConstructor {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
