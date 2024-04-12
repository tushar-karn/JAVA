import java.util.*;
import java.io.*;
public class FileInputStreamEx {
    public static void main(String[] args) {
        FileInputStream input = new FileInputStream("./testout.txt");
        BufferedInputStream istr = new BufferedInputStream(input);
        Scanner sc = new Scanner(System.in);
        
    }
}
