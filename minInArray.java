
public class minInArray {
    public static void main(String[] args) {
       int arr[] = {5,6,2,9,-2}; 
       int ans = minArr(arr);
       System.out.println(ans);
    }
    public static int minArr(int nums[]){
        int n = nums.length-1;
        int minval = nums[0];
        for(int i = 0; i < n; i++){
            if(nums[i] < minval){
                minval = nums[i];
            }
        }
        return minval;
    }
}
