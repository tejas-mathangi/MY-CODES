public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
    //mountain array is called bitonic array
    //brute force LS
    //no duplicate elements present
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0 ;
        int end = arr.length-1 ;

        while (start < end ){
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]){
                //in decreasing part of array
                //this can be answer(end!=mid-1) but continue to check to the left
                end = mid ;
            }else {
                //in increasing part of array
                start = mid+1 ; //cuz we know that mid+1 element > mid element
            }
        }
        //after the while loop , start = end = mid and it will be at the index of largest element
        //elaboration : at every point of time for start and end , they have the best possible ans till that time
        //at the end that will be the best possible ans
        return start ;//start or end can be returned
    }

}
