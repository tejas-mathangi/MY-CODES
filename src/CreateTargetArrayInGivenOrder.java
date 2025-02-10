import java.util.Arrays;

public class CreateTargetArrayInGivenOrder {
    public static void main(String[] args) {
        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        System.out.println(Arrays.toString(createTargetArray(nums, index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        int[] targetArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int j = index[i];
            targetArray[j]=nums[i];
        }
        return targetArray;
    }
}
