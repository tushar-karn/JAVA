public class ReverseAnArray {

    public static void reverse(int arr[]){
        int start = 0 ; 
        int end  = arr.length-1;
        while (start<=end) {
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90,100};
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

// Collections.swap method 


// import java.util.*;
// public class ReverseAnArray {

//     public static void reverse(int arr[]){
//         List<Integer> list = new ArrayList<>();
//         for (int num : arr) {
//             list.add(num);
//         }
        
//         int start = 0 ; 
//         int end  = arr.length-1;
//         while (start < end) {
//             Collections.swap(list, start, end);
//             start++;
//             end--;
//         }
        
//         // Convert the list back to an array
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = list.get(i);
//         }
//     }
    
//     public static void main(String[] args) {
//         int arr[] = {10,20,30,40,50,60,70,80,90,100};
        
//         // Call the reverse method
//         reverse(arr);
        
//         // Print the reversed array
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//     }
// }
