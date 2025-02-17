import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] digits = {1,2,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits) {
        //for increment of num in same
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        //for edge case 99,999,9999..
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
    //not accepted by leetcode
    public static int[] plusOne1(int[] digits) {
        digits[digits.length-1]=digits[digits.length-1]+1;
        if(digits[digits.length-1]>9){
            digits[digits.length-1]=0;
            digits[digits.length-2]=digits[digits.length-2]+1;
        }
        return digits;
    }
}
