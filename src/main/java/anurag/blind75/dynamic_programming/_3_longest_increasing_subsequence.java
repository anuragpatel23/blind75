package anurag.blind75.dynamic_programming;

import java.util.Arrays;

public class _3_longest_increasing_subsequence {
    public static void main(String... args){
        int[] nums={10,9,2,5,3,7,101,18};
        int result = lengthOfLIS(nums);
        System.out.println("Length of longest increasing subsequence is : "+result);
    }

    private static int lengthOfLIS(int[] nums){
        int[] LIS= new int[nums.length];
        Arrays.fill(LIS, 1);
        int max=1;

        for(int i=1; i<nums.length; i++){
            for(int j=0; j<i;j++){
                if(nums[i]>nums[j]){
                    //this is recurrence relation
                    LIS[i]=Math.max(LIS[i], 1+LIS[j]);
                    max=Math.max(max, LIS[i]);
                }
            }
        }

        return max;
    }
}
