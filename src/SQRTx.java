public class SQRTx {
    public static void main(String[] args) {
        int x = 8;
        System.out.println(mySqrt(x));
    }
    public static int mySqrt(int x) {
        for (int i = 0; i <= x / 2; i++) {
            if(x==i*i){
                return i;
            }
        }
        return -1;
    }
}
