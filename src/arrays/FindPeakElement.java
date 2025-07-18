public class FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1,2,1,3,5,6,4};
        System.out.println(findPeakElement(nums));
    }
    //Constraints
    //~1 <= nums.length <= 1000
    //~-231 <= nums[i] <= 231 - 1
    //~nums[i] != nums[i + 1] for all valid i
    //literally the same code as PeakIndexInMountainArray question
    public static int findPeakElement(int[] nums) {
        int start = 0 ;
        int end = nums.length-1 ;

        while (start < end ){
            int mid = start + (end - start) / 2;
            if(nums[mid] > nums[mid+1]){
                //in decreasing part of array
                //this can be answer(end!=mid-1) but continue to check to the left
                end = mid ;
            }else {
                //in increasing part of array
                start = mid+1 ; //cuz we know that mid+1 element > mid element
            }
        }
        //after the while loop , start = end = mid and it will be at the index of largest element
        return start ;//start or end can be returned
    }
}
