import java.sql.Array;
import java.util.Arrays;

public class ConcatinationOfAnArray {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(getConcatenation(nums)));
    }
    public static int[] getConcatenation(int[] nums) {
        int[] arr = new int[2* nums.length];
        for (int i = 0; i < (2* nums.length); i++) {//Loop running till i < 2 * nums.length
            arr[i]=nums[i% nums.length];//to cycle through original array
        }
        return arr;
    }
}
