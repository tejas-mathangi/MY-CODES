import java.util.Arrays;

public class ShuffleTheArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] sarr = suffledArray(arr,2);
        System.out.println(Arrays.toString(sarr));
    }

    private static int[] suffledArray(int[] arr, int n) {
        int[] sarr=new int[arr.length];
        for (int i = 0,j=0; i < n; i++,j=j+2) {
            sarr[j]=arr[i];
            sarr[j+1]=arr[n+i];
        }
        return sarr;
    }
}
