import java.util.Scanner;

public class ParameterizedConstructor {
    int no;
    ParameterizedConstructor(int x){
        no =x;
        for (int i = 2; i < no; i++) {
            if (no%i==0) {
                System.out.println("NOT A PRIME NO ");
                break;
            }
        }
    }
    public static void main(String[] args) {
        int noo ;
        Scanner sc = new Scanner(System.in);
        noo = sc.nextInt();
        ParameterizedConstructor obj = new ParameterizedConstructor(noo);
    }
}
