import java.util.Scanner;

public class ReverseByTakingCMDLInput {
    int no;
    void getData(int val){
        no = val;
    }
    void putData(){
        int reverse=0;
        while (no>0) {
            reverse = reverse*10+ no%10;
            no/=10;
        }
        System.out.println("Reverse Of Num Is "+reverse);
    }
    public static void main(String[] args) {
        int input;
        ReverseByTakingCMDLInput obj = new ReverseByTakingCMDLInput();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number ");
        input= sc.nextInt();
        obj.getData(input);
        obj.putData();
    }
}
