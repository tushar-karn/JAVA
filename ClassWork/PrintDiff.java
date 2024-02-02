import java.util.*;

public class PrintDiff {

    public static void computeDiff(int firstno, int secondno){
        int diff = firstno-secondno;
        if (diff <25 && diff>-25) {
            System.out.println(2*diff);
        }
        else{
            System.out.println(diff);
        }
    }
    
    public static void main(String[] args) {
        int firstno  =  Integer.parseInt(args[0]);
        int secondno  =  Integer.parseInt(args[1]);
        computeDiff(firstno,secondno);
    }
}