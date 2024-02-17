import java.util.Scanner;

public class PrimeInRange {
    int low;
    int high;
    int[] arr;

    PrimeInRange(int low, int high) {
        this.low = low;
        this.high = high;
        this.arr = new int[high - low + 1];
    }

    boolean isPrime(int num) {
        // if (num <= 1) {
        //     return false;
        // }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    void find() {
        for (int i = low, j = 0; i <= high; i++) {
            if (isPrime(i)) {
                arr[j++] = i;
            }
        }
    }

    void print() {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int low, high;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower bound: ");
        low = sc.nextInt();
        System.out.print("Enter the upper bound: ");
        high = sc.nextInt();
        PrimeInRange obj = new PrimeInRange(low, high);
        obj.find();
        obj.print();
    }
}
