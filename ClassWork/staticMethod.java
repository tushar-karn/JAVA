@FunctionalInterface
interface A{
    void show1();
    public static void show(){
        System.out.println("JHElsl");
    }
}

public class staticMethod {
    public static void main(String[] args) {
        // A obj = new A(); 
        // A.show();
        A obj = () ->{
            System.out.println("hello");
        };
        obj.show1();
        A.show();
    }
}
