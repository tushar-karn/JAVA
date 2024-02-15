// import java.util.Scanner;

// public class PrimeNumbersByOpps {
//     int no;
//     void getData(int val){
//         no = val;
//     }
//     void putData(){
//         int count =0;
//         for (int i = 1; i <= no; i++) {
//             if (no%i ==0) {
//                 count++;
//             }
//         }
//         if (count==2) {
//             System.out.println("No is Prime No ");
//         }else{
//             System.out.println("Number Is Not Prime ");
//         }
//     }
//     public static void main(String[] args) {
//         int input;
//         PrimeNumbersByOpps obj = new PrimeNumbersByOpps();
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter A Number ");
//         input = sc.nextInt();
//         obj.getData(input);
//         obj.putData();
//     }
// }

import java.util.Scanner;

public class PrimeNumbersByOpps {
    int num;
    void getInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER ");
        num = sc.nextInt();
    }
    void putData(){
        int count =0;
        for (int i = 1; i <= num; i++) {
            if (num%i==0) {
                count++;
            }
        }
        if (count==2) {
            System.out.println("PRIME NUMBER ");
        }else{
            System.out.println("NOT A PRIME NUMBER ");
        }
    }
    public static void main(String[] args) {
        PrimeNumbersByOpps obj = new PrimeNumbersByOpps();
        obj.getInput();
        obj.putData();
    }
}