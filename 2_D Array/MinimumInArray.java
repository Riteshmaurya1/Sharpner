public class MinimumInArray {
    public static void main(String[] args) {
        int arr[][] = {{5,2,3},{8,9,6},{7,8,10}};
        Min(arr);
    }
    public static void Min(int nums[][]){
        int min = nums[0][0];
        for(int row = 0; row < nums.length;row++){
            for(int cols = 0; cols <nums[row].length; cols++){
                min = Math.min(min,nums[row][cols]);
            }
        }
        System.out.println(min);
    }
}
