public class CountDemo {
    public static void main(String[] args) {
        int Maths = Integer.parseInt(args[0]);
        int Science = Integer.parseInt(args[1]);
        int Social = Integer.parseInt(args[2]);
        int English = Integer.parseInt(args[3]);
        int passCount = 0;
        if (Maths>=50) {
            passCount++;
        }
        if (Science>=50) {
            passCount++;
        }
        if (Social>=50) {
            passCount++;
        }
        if (English>=50) {
            passCount++;
        }
        System.out.println(passCount);
    }
}