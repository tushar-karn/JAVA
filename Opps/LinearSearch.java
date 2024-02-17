import java.util.Scanner;

public class LinearSearch {
    int arr[] =new int[10];
    int key;
    void getData(){
        Scanner sc  = new Scanner(System.in);
        System.out.println("ENTER ARRAY Elements ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter key ");
        key =sc.nextInt();
    }
    void search(){
        int flag =0;
        int pos =-1;
        for (int i = 0; i < arr.length && flag ==0; i++) {
            if (arr[i]==key) {
                flag+=1;
                pos = i;
                break;
            }
        }
        if (flag==1) {
            System.out.println("ELEMENT FOUND AT INDEX "+pos);
        }else{
            System.out.println("ELEMENT NOT FOUND");
        }
    }
    public static void main(String[] args) {
        LinearSearch obj = new LinearSearch();
        obj.getData();
        obj.search();
    }
}
