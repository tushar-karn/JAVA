import java.util.*;
import java.io.*;
public class BufferString {
    public static void main(String[] args) throws Exception {
        FileOutputStream fout = new FileOutputStream("./testout.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        Scanner sc = new Scanner(System.in);
        String s1  = new String();
        byte b[] = s1.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("Successfull");
    }
}
