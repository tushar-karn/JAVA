package JavaBasics;
public class TypeConversion {
    public static void main(String[] args) {
        int a = 50;
        long b = a; // allowed long is larger data type then int
        System.out.println(b);
        long c= 50;
        int explicitConversion = (int)c;
        System.out.println(explicitConversion);
        // int d = c; // conversion not allowed from large to small data type
        // byte -> short -> int -> float -> long -> double allowed ; 
        byte value = 8;
        double d = value;
        System.out.println(d);
    }
}
