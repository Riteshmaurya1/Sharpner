import java.util.ArrayList;

public class ArrayConcatnation {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5};
        int arr2[] = {6,7,8,9};
        concatArr(arr1,arr2);
    }
    public static void concatArr(int nums1[], int nums2[]){
        ArrayList<Integer> fullList = new ArrayList<>();
        for(int i = 0; i < nums1.length; i++){
            fullList.add(nums1[i]);
        }
        for(int i = 0; i < nums2.length; i++){
            fullList.add(nums2[i]);
        }
        System.out.println(fullList);
    }
}