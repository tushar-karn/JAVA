class A{
    public void Show(){
        System.out.println("Hello World! ");
    }
    class B{
        public void printName(){
            System.out.println("Hello Tushar");
        }
    }
    static class C{
        public void game(){
            System.out.println("Game is GTA");
        }
    }
}

public class NestedClass {
    public static void main(String[] args) {
        A obj = new A();
        A.B obj1 = obj.new B();
        obj1.printName();
        obj.Show();
        A.C obj2 = new A.C();
        obj2.game();
    }
}
