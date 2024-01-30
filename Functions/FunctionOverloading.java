public class FunctionOverloading {

    public static int sum(int a , int b)
    {
        return a+b;
    }
    public static int sum(int a , int b ,int c)
    {
        return a+b+c;
    }
    public static float sum(float a , float b ,float c)
    {
        return a+b+c;
    }
    public static void main(String[] args) {
        sum(5, 5);
        sum(0, 0, 0);
        System.out.println(sum(1.2f, 3.4f, 2.3f));
    }
}
