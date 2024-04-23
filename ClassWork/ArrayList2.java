import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(30);
        int max = list.get(0);
        // for (int i = 1; i < list.size(); i++) {
        //     if (list.get(i) > max) {
        //         max = list.get(i);
        //     }
        // }
        int ans = Collections.max(list);
        System.out.println("Largest number in the list is: " + ans);
        // System.out.println("Largest number in the list is: " + max);
    }
}

