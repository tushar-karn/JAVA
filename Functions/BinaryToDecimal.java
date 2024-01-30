public class BinaryToDecimal {
    
    public static void BinToDec(int BinNo){
        int mynu = BinNo;
        int pow =0;
        int decNum = 0;

        while (BinNo>0) {
            int lastDigit = BinNo%10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            BinNo/=10;
        }
        System.out.println("decimal of "+mynu + " is "+decNum);
    }
    
    public static void main(String[] args) {
        BinToDec(111);
    }
}
