public class sumOfOddLengthSubArraysSum {
    public static void main(String[] args) {

        int arr[] = { 1, 4, 2, 5, 3 };
        int result = sumOfOddLength(arr);
        System.out.println(result);
    }

    public static int sumOfOddLength(int arr[]) {
        int n = arr.length;
        int result = 0;
        for (int i = 0; i < n; i++) {
            // Total number of subarrays including element arr[i]
            int totalSubarrays = (i + 1) * (n - i);

            // Number of odd length subarrays including arr[i]
            int oddCount = totalSubarrays / 2;
            if (totalSubarrays % 2 == 1) {
                oddCount++;
            }

            // Add contribution of arr[i]
            result += oddCount * arr[i];
        }
        return result;
    }
}
