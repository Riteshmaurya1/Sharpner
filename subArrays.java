public class subArrays {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        subarrays(arr);
    }

    public static void subarrays(int nums[]) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
               for(int k = i; k <= j; k++){
                System.out.print(nums[k]);
               }
               System.out.println();
            }
        }
    }
}
