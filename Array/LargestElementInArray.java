import java.util.*;
public class LargestElementInArray {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>maxi) {
                maxi=arr[i];
            }
        }
        System.out.println(maxi);
    }
}
