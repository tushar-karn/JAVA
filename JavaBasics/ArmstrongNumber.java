import java.util.Scanner;
public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        int store = no;
        int count = 0;
        while (no>0) {
            count ++ ;
            no /=10;
        }
        no=store;
        int arr[]= new int[count];
        for (int i = 0; i < count; i++) {
            arr[i]= store%10;
            store/=10;
        }
        int ans = 0;
        for (int i = 0; i < count; i++) {
                ans += Math.pow(arr[i], count);
            }
        
        if(ans==no){
            System.out.println("Angstrom no");
        }
        else{
            System.out.println("not an angstrom no");
        }

    }
}