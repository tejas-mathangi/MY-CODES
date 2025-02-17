public class Patterns {
    public static void main(String[] args) {
        //pattern1(5);
        //pattern2(5);
        //pattern3(6);
        //pattern4(5);
        //pattern5(5);
    }
    public static void pattern1(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for (int i = 0; i < n; i++) {
            for (int j = n-i; j >=1; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n) {
        for (int i = 1; i < 2 * n; i++) {
            int noOfColInRow = i>n ? 2*n-i : i ;
            for (int j = 1; j <= noOfColInRow; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
