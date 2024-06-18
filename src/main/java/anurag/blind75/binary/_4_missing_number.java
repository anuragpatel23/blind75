package anurag.blind75.binary;

import java.util.Arrays;

public class _4_missing_number {

    public static void main(String... args){
        int[] nums= {0,1};
        int result1 = missingNumber(nums);
        int result2 = missingNumber2(nums);
        System.out.println(result1);
        System.out.println(result2);
    }

    private static int missingNumber(int[] nums){
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i!=nums[i]){
                return i;
            }
        }
        return 0;
    }

    private static int missingNumber2(int[] nums){
        int res = nums.length;

        for (int i = 0; i < nums.length; i++) {
            res += i - nums[i];
        }

        return res;
    }


}
