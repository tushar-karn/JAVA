import java.util.function.Predicate;
class question15 {
    public static void main(String[] args) {
        int a1[] = {10,45,67,89,90};
        Predicate<Integer> obj = a -> (a % 2 == 0);
        for(Integer i : a1){
            if (obj.test(i)) {
                System.out.println("Even");
            }
        }
    }
}