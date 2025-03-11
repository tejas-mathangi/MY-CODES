import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1={1,2,3};
        int[] nums2={1};
        int m=3;
        int n=0;
        merge(nums1,m,nums2,n);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int var = m+n-1;
        while (j>=0){
            if(i>0 && nums1[i]>nums2[j]){
                nums1[var--]=nums1[i--];
            }else{
                nums1[var--]=nums2[j--];
            }
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));
    }
}
