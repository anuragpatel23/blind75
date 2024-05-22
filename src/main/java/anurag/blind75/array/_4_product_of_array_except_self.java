package anurag.blind75.array;

import java.util.Arrays;

public class _4_product_of_array_except_self {
    public static void main(String... args){
        int[] nums={1,2,3,4};
        int[] result=productExceptSelf(nums);
        System.out.println("["+result[0]+","+result[1]+","+result[2]+","+result[3]+"]");
    }

    public static int[] productExceptSelf(int[] nums){
        int[] result= new int[nums.length];
        Arrays.fill(result, 1);
        int pre=1, post=1;

        for(int i=0; i<nums.length; i++){
            result[i]=pre;
            pre= nums[i]*pre;
        }

        for(int i=nums.length-1; i>=0; i--){
            result[i] = result[i]*post;
            post= post*nums[i];
        }

        return result;
    }
}
