import java.util.*;
public class linearSearch {
    public static int LSearch(int arr[], int key) {
     for (int i = 0; i < arr.length; i++) {
        if (arr[i]==key) {
            return i;
        }else{
            System.out.println("NOT FOUND");
        }
     }   
    }
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER ARRAY VALUES ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=input.nextInt();
        }
        System.out.print("ARRAY VALUES ARE ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        int key = input.nextInt();
        int value = LSearch(arr, key);
        System.out.println(value);
    }
}
