package anurag.blind75.binary;

import java.util.Arrays;

public class _3_counting_bits {
    public static void main(String... args){
        int[] result = countBits(5);
        System.out.println(Arrays.toString(result));
    }

    private static int[] countBits(int n){
        int[] ans = new int[n + 1];

        ans[0] = 0;
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }

        return ans;
    }
}
