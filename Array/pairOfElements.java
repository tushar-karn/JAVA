public class pairOfElements {
    public static void findPairs(int arr[]){
        for(int i = 0 ; i < arr.length ;i++){
            for(int j = i+1 ; j< arr.length ; j++){
                System.out.print("( "+arr[i]+","+arr[j]+")");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,4,5,7,8,9,11,13,15,17};
        findPairs(arr);
    }
}
