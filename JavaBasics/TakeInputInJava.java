package JavaBasics;
import java.util.*;
public class TakeInputInJava {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        Scanner input2 = new Scanner(System.in);
        String tony = input2.nextLine();
        System.out.println(name);
        System.out.println(tony);
    }
}
