public class SubProdFromSum {
    public static void main(String[] args) {
        int n = 4421;
        System.out.println(subtractProductAndSum(n));

    }
    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum=0;
        while(n>0){
            sum+=n%10;
            product*=n%10;
            n=n/10;
        }
        return product-sum;
    }
}
