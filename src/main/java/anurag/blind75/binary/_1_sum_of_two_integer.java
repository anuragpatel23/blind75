package anurag.blind75.binary;

public class _1_sum_of_two_integer {
    public static void main(String... args){
        int result = integerSumWithoutPlusOperator(2,3);
        System.out.println(result);
    }

    private static int integerSumWithoutPlusOperator(int a, int b){
        while(b!=0){
            int currentSum= a^b;
            int carry = (a & b ) << 1;
            a=currentSum;
            b=carry;
        }
        return a;
    }
}
