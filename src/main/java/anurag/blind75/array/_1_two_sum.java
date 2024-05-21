package anurag.blind75.array;

public class _1_two_sum {
    public static void main(String... args){
        int[] nums={2,7,11,15};
        int target=9;

        //Basic approach to solve this would be Brute Force with 2 loops
        //but the improvement we can do is find the difference between the current number and
        //check what is the difference needed to meet the target. And then we search if the difference
        //number is present in the list/array or not.

        int[] result1 = bruteForce1(nums, target);
        int[] result2 = bruteForce2(nums, target);
        System.out.println("Result 1= ["+result1[0]+", "+result1[1]+"]");
        System.out.println("Result 2= ["+result2[0]+", "+result2[1]+"]");

    }

    public static int[] bruteForce1(int[] nums, int target){
        for(int i=0; i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static int[] bruteForce2(int[] nums, int target){

        for(int i=0; i<nums.length-1; i++){
            int diff=target-nums[i];
            for(int j=1; j<nums.length; j++){
                if(nums[j]==diff){
                    return new int[]{i,j};
                }
            }
        }
        System.out.println("Target is not present in the list");
        return new int[]{};
    }

}
