package Loops;

public class PrintSquarePattern {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println("* * * * "); // basic code 
        }
        System.out.println("\n");
        int line = 1;
        while (line<=4) {
            System.out.println("* * * * ");
            line++;
        }
        // for (int i = 0; i <4; i++) {  
        //     for (int j = 0; j < 4; j++) {
        //         System.out.print("* ");
        //     }  
        //     System.out.print("\n");
        // }
    }
}
