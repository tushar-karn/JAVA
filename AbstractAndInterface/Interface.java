interface Aplus{
    int ans1  = 213;
}
class A implements Aplus{
    static int ans = 10;
}
public class Interface {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.ans);
        System.out.println(obj.ans1);
        System.out.println(Aplus.ans1);
    }
    
}
