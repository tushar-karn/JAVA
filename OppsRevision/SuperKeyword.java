class A {
    int num = 20;
    void Show(){
        System.out.println("Hello World! ");
    }
}
class B extends A{
    int num = 30;
    void Show(){
        super.Show();
        System.out.println(super.num);
        System.out.println(num);
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        B obj = new B();
        obj.Show();
    }
}
