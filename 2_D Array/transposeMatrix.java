public class transposeMatrix {
    public static void main(String[] args) {
        int arr[][] = {{5,2,3},{8,9,6},{7,8,10}};
        Min(arr);
    }
    public static void Min(int nums[][]){
        int rows = nums.length;
        int cols = nums.length;
        int matrix[][] = new int[cols][rows];
        for(int i = 0; i < nums.length;i++){
            for(int j = 0; j <nums[i].length; j++){
              matrix[i][j] = nums[j][i];
            }
        }
        System.out.println("Original Matrix..........");
        for(int i = 0; i < nums.length;i++){
            for(int j = 0; j <nums[i].length; j++){
              System.out.print(nums[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("TransPosed Matrix/............");
        for(int i = 0; i < matrix.length;i++){
            for(int j = 0; j <matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
