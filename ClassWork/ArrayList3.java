import java.util.ArrayList;

public class ArrayList3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("Bsnl");
        System.out.println("Returning element : "+list.get(1));
        list.set(1, "Dates");
        for (String s : list) {
            System.out.println(s);
        }
    }
}