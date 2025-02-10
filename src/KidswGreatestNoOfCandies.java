    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.List;

//    import static sun.swing.MenuItemLayoutHelper.max;

    public class KidswGreatestNoOfCandies {
        public static void main(String[] args) {
            int[] arr = {1,2,3,4,5};
            System.out.println(Arrays.toString(kidsWCandies(arr,3)));
            System.out.println(kidsWithCandies(arr,3));
            System.out.println(Arrays.toString(kidsWCandies1(arr, 3)));
            System.out.println(kidsWithCandies1(arr,3));
        }

        public static boolean[] kidsWCandies(int[] candies, int extraCandies) {
            int maxNoOfCandies=max(candies);
            boolean[] ans = new boolean[candies.length];
            for (int i = 0; i < candies.length; i++) {
                ans[i]=(candies[i]+extraCandies)>=maxNoOfCandies;
            }
            return ans;
        }
//        public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
//            ArrayList<Boolean> ls =new ArrayList<>();
//            int maxNoOfCandies=max(candies);
//            for (int i = 0; i < candies.length; i++) {
//                ls.add((candies[i]+extraCandies)>=maxNoOfCandies);
//            }
//            return ls;
//        }
        public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
            ArrayList<Boolean> ls =new ArrayList<>();
            int maxNoOfCandies=max(candies);
            for (int candy : candies) {
                ls.add((candy + extraCandies) >= maxNoOfCandies);
            }
            return ls;
        }

//
//        static int max(int[] arr){
//        int maxx=0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]>maxx){
//                 maxx=arr[i];
//            }
//         }
//         return maxx;
//        }
        static int max(int[] arr){
            int maxx=0;
            for (int j : arr) {
                if (j > maxx) {
                    maxx = j;
                }
            }
            return maxx;
        }
//        public static boolean[] kidsWCandies1(int[] candies, int extraCandies) {
//            int maxCandies = 0;
//            for (int i = 0; i < candies.length; i++) {
//                maxCandies = Math.max(maxCandies, candies[i]);
//            }
//            boolean[] ans = new boolean[candies.length];
//            for (int i = 0; i < candies.length; i++) {
//                ans[i]=(candies[i]+extraCandies)>=maxCandies;
//            }
//            return ans;
//        }
        public static boolean[] kidsWCandies1(int[] candies, int extraCandies) {
            int maxCandies = 0;
            for (int candy : candies) {
                maxCandies = Math.max(maxCandies, candy);
            }
            boolean[] ans = new boolean[candies.length];
            for (int i = 0; i < candies.length; i++) {
                ans[i]=(candies[i]+extraCandies)>=maxCandies;
            }
            return ans;
        }
//        public static List<Boolean> kidsWithCandies1(int[] candies, int extraCandies) {
//            ArrayList<Boolean> ls =new ArrayList<>();
//            int maxCandies = 0;
//            for (int i = 0; i < candies.length; i++) {
//                maxCandies = Math.max(maxCandies, candies[i]);
//            }
//            for (int i = 0; i < candies.length; i++) {
//                ls.add((candies[i]+extraCandies)>=maxCandies);
//            }
//            return ls;
//        }
        public static List<Boolean> kidsWithCandies1(int[] candies, int extraCandies) {
            ArrayList<Boolean> ls =new ArrayList<>();
            int maxCandies = 0;
            for (int candy : candies) {
                maxCandies = Math.max(maxCandies, candy);
            }
            for (int candy : candies) {
                ls.add((candy + extraCandies) >= maxCandies);
            }
            return ls;
        }
    }
