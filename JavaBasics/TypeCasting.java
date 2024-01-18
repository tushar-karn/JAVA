package JavaBasics;
public class TypeCasting {
    public static void main(String[] args) {
        float floatvalue = 22.122f;
        // int num = floatvalue; // gives error
        int num = (int)floatvalue;
        System.out.println(num);
        double value = 882.34233;
        int no = (int)value;
        System.out.println(no);
        char ch = 'a';
        int ascii = ch;
        System.out.println(ascii);
    }
}