import java.util.Arrays;

public class Running_Sum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] sum = runningSum(arr);
        System.out.println(Arrays.toString(sum));
    }

    public static int[] runningSum(int[] arr) {
        int[] rsum = new int[arr.length];
            rsum[0]=arr[0];
        for (int i = 1; i < arr.length ; i++) {
            rsum[i]=arr[i]+rsum[i-1];
        }
        return rsum;
    }


}