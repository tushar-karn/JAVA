public class StringConstructor {
    public static void main(String[] args) {
        char [] a = {65,66,67,68,69};
        String str = new String(a);
        System.out.println(str);
        
        String s = new String(); // empty Constructor
        System.out.println(s);

        byte [] c = {97,98,99,100};
        String ss = new String(c);
        System.out.println(ss);
    }

}
