import java.util.Scanner;
class temp {
    int num; 
    
    void getData(int num){
        this.num = num;
    }
    
    boolean putData(){
        if (num < 2) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
class primeNumberCode{


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       temp obj = new temp();
        System.out.println("Enter a number to check if it's prime or not: ");
        int no = sc.nextInt();
        obj.getData(no);
        boolean finalAns = obj.putData();
        if (finalAns) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }
    }
}
