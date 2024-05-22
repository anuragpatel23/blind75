package anurag.blind75.array;

import java.util.HashSet;
import java.util.Set;

public class _3_contains_duplicate {
    public static void main(String... args){
        int[] nums={1,2,3,1};
        boolean result= containsDuplicate(nums);
        System.out.println(result);
    }

    public static boolean containsDuplicate(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }
}
