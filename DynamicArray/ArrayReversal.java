
import java.util.ArrayList;

public class ArrayReversal {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        reverseArray(arr);
    }
    public static void reverseArray(int nums[]){
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length-1;
        for(int i = n; i >= 0; i--){
            list.add(nums[i]);
        }
        System.out.println(list);
    }
}
