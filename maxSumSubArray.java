public class maxSumSubArray {
    public static void main(String[] args) {
        int arr[] = {5,2,-4,-5, 3,-1,2,3,1};
        int result = maxSum(arr);
        System.out.println(result);
    }
    public static int maxSum(int nums[]){
        int n = nums.length;
        int maxSum = 0;
        int currSum = 0;
        for(int i = 0; i < n; i++){
            currSum = Math.max(nums[i],currSum + nums[i]);
            maxSum = Math.max(currSum,maxSum);
        }
        return maxSum;
    }
}
