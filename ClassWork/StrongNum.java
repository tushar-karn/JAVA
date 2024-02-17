public class StrongNum {
    public static void main(String[] args) {
        int no = 145;
        int store =no ;
        int count = 0 ;
        while (no>0) {
            count++;
            no/=10;
        }
        int arr[] =new int[count];
        int i = 0 ;
        while (store>0) {
            arr[i++] = store%10;
            store/=10;
        }
    }
    public int find(){
        for
    }
}
