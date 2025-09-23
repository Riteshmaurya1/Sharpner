public class MissingNumber {
    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        missing(arr);
    }
    public static void missing(int nums[]){
        int n = nums.length;
        int arrSum = 0;
        int totalSum = 0;
        for(int i = 1; i <= n+1; i++){
            totalSum += i;
        }
        for(int num: nums){
            arrSum += num;
        }
        // TC = O(n)
        // Sc = O(1);
        System.out.println(totalSum-arrSum);
    }
}