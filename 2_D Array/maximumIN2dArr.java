class maximumIN2dArr{
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{8,9,6},{7,8,10}};
        maxi(arr);
    }
    public static void maxi(int nums[][]){
        int max = 0;
        for(int row = 0; row < nums.length;row++){
            for(int cols = 0; cols <nums[row].length; cols++){
                if(nums[row][cols] > max){
                    max = nums[row][cols];
                }
            }
            System.out.println(max);
        }
    }
}