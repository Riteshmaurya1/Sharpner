public class RunnungSum {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        runningSum(arr);
    }

    public static void runningSum(int nums[]) {
        int n = nums.length;
        int currSum = 0;
        System.out.print('[');
        for (int i = 0; i < nums.length; i++) {
            currSum = currSum + nums[i];
            nums[i] = currSum;
            System.out.print(currSum+" ,");
        }
        System.out.print(']');
        // TC = O(n)
        // Sc = O(1);
    }
}
