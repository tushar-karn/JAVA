import java.util.Scanner;
public class Array_06_02 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Output ");
        for(int i : arr){
            System.out.println(i);
        }
    }
}
