public class CeilingAndFloorOfaNumber {
    //sorted array , so we are gonna use BS
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target = 1 ;
        System.out.println(ceiling(arr,target));
        System.out.println(floor(arr,target));
    }
   // smallest element which is greater than or equal to the target in an array is called the ceiling of a number(target)
   // return the index of smallest no >= target
    static int ceiling(int[] arr , int target ){
        // but what if the target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else{
                return mid;
            }
        }
        return start;
    }
    //greatest element which is lesser than or equal to the target in an arr is called the floor of a number(target)
    static int floor(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else{
                return mid;
            }
        }
        return end;
    }
}
