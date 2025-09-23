public class Qs2 {
    public static void main(String[] args) {
        int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        diagonalSum(arr);
    }

    public static void diagonalSum(int nums[][]) {
        int n = nums.length;
        int firstSum = Integer.MIN_VALUE;
        int secondSum = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (nums[i][i] > firstSum) {
                firstSum = nums[i][i];
            }
            if (nums[i][n-1-i] > secondSum) {
                secondSum = nums[i][n-1-i];
            }
        }
        System.out.println("Max diagonal is : " + firstSum + "," + secondSum);
    }
}
