
public class maxInArray {
    public static void main(String[] args) {
       int arr[] = {5,4,7,2,6}; 
       int ans = maxarr(arr);
       System.out.println(ans);
    }
    public static int maxarr(int nums[]){
        int n = nums.length-1;
        int maxval = nums[0];
        for(int i = 0; i < n; i++){
            if(nums[i] > maxval){
                maxval = nums[i];
            }
        }
        return maxval;
    }
}
