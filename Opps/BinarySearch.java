import java.util.Scanner;

public class BinarySearch {
    int key;
    int arr[]= new int[10];
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER ARRAY ELEMENTS ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("ENTER KEY ");
        key = sc.nextInt();
    }
    int bSearch(){
        int start = 0 ;
        int end =  arr.length -1;
        int mid =  start + (end -start)/2;
        while (start<=end) {
            if (arr[mid]==key) {
                return mid;
            }
            else if (key<arr[mid]) {
                end = mid-1;
            }
            else{
                start =mid+1;
            }
            mid = start+ (end-start)/2;
        }
        return -1;
    }
    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        obj.getData();
        int ans = obj.bSearch();
        if (ans==-1) {
            System.out.println("ELEMENT NOT FOUND");
        }
        else{
            System.out.println("ELEMENT FOUND AT INDEX "+ans);
        }
    }
}
