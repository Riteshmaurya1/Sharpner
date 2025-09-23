class BubbleSort{
    public static void main(String[] args) {
        int arr[] = {2,9,0,3,2};
        bubblesort(arr);
    }
    public static void bubblesort(int nums[]){
        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < nums.length-i-1; j++){
                if(nums[i] < nums[j+1]){
                    int temp = nums[i];
                    nums[i] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }

}