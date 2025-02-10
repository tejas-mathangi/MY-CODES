import java.util.Arrays;

public class BuildArrFroPermutations {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,0,5};
        System.out.println(Arrays.toString(ansArray(arr)));
    }
    static int[] ansArray(int[] nums){
        int[] ans = new int[nums.length];
        for(int i = 0 ; i <nums.length ; i++ ) {
        ans[i] = nums[nums[i]];
        }
        return ans ;
    }
}
