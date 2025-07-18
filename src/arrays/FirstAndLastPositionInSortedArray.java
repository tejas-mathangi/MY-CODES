import java.util.Arrays;

public class FirstAndLastPositionInSortedArray {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums, target)));
        System.out.println(Arrays.toString(searchRange1(nums, target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1 , -1};
        //checking for occurrence using another function
        ans[0] = index(nums, target, true);
        if(ans[0] != -1){
            ans[1] = index(nums, target, false);
        }
        return ans;
    }
    //this function return the index value of target
    static int index(int[] nums, int target, boolean findStartIndex){
        int ans = -1 ;
        int start = 0 ;
        int end = nums.length - 1 ;

        while(start <= end) {
            int mid = start + (end - start) / 2 ;
            if (target < nums[mid]) {
                end = mid - 1 ;
            } else if (target > nums[mid]) {
                start = mid + 1 ;
            } else {
                //potential answer found
                ans = mid ;
                if(findStartIndex){
                    end = mid-1 ;
                }else{
                    start = mid +1 ;
                }
            }
        }
        return ans;
    }
    //bruteforce using linear search time-complexity-O(n)
    public static int[] searchRange1(int[] nums, int target) {
        int[] ans = {-1,-1};
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                ans[0] = i ;
                break;
            }
        }
        for (int i = nums.length-1 ; i >= 0; i--) {
            if(nums[i] == target){
                ans[1] = i ;
                break;
            }
        }
        return ans ;
    }
}
