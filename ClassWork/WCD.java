import java.util.Arrays;
import java.util.List;
// lower bound 
public class WCD {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(4,5,6,7);

        pcs(list1);

        List<Double> list2 = Arrays.asList(4,5,6,7);
        pcs(list2);

    }
    public static void pcs(List<? super Integer> list){
        System.out.println(list);
    }
}
