import java.util.Scanner;

public class BinarySearch {
    public static int binSearch(int arr[], int key){
        int start = 0 ;
        int end = arr.length-1;
        int mid = start + (end-start)/2;
        while (start<=end) {
            if (arr[mid]==key) {
                return mid;
            }
            else if (arr[mid]>key) {
                end = mid - 1;
            }
            else{
                start = mid +1;
            }
            mid = start + (end-start)/2;
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER ARRAY ELEMENTS ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= input.nextInt();
        }
        System.out.println();
        System.out.print("Enter key to Search ");
        int key = input.nextInt();
        int ans = binSearch(arr,key);
        if (ans==-1) {
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("ELEMENT IS AT INDEX "+ans);
        }
    }
}
