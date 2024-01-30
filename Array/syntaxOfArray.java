public class syntaxOfArray {
    public static void main(String[] args) {
        int arr[]= new int[100]; // decleare array
        int brr[]; // initialise array 
        brr = new int[50];
        brr[0]=10;
        brr[1]=20;
        System.out.println(brr[0]);
        System.out.println(brr[1]);
        String crr[] = {"HELLO ","HI ","HOW ","ARE ","YOU"};
        for (int i = 0; i < crr.length; i++) {
            System.out.print(crr[i]);
        }
    }
}
