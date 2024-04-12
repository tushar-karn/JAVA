import java.util.*;
import java.io.*;
public class ConsoleClass {
    public static void main(String[] args) {
        String str; char ch[];
        Console obj = System.console();
        System.out.println("Enter Username : ");
        str = obj.readLine();
        System.out.println("Enter Password : ");
        ch = obj.readPassword();
        System.out.println("Username is "+ str);
        System.out.println("Password  is "+ ch);

        String a = String.valueOf(ch);
        System.out.println("password is : "+a);
    }
}
