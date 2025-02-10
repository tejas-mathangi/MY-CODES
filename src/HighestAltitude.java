public class HighestAltitude {
    public static void main(String[] args) {
        int[] arr = {52,-91,72};
        System.out.println(largestAltitude(arr));
    }
    public static int largestAltitude(int[] gain) {
        int counter=0;
        int high=0;
        for (int i = 0; i < gain.length; i++) {
            counter=counter+gain[i];
            if (counter>high){
                high=counter;
            }
        }
        if (high<0){
            return 0;
        }
        return high;
    }
}
