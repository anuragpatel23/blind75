package anurag.blind75.array;

public class _5_maximum_subarray {
    public static void main(String... args){
        int[]  nums={-2,1,-3,4,-1,2,1,-5,4};
        int result1 = maximumSubArrayBruteForce(nums);
        int result2 = maximumSubArray(nums);

        System.out.println(result1);
        System.out.println(result2);
    }

    public static int maximumSubArrayBruteForce(int[] nums){
        int maxSubArraySum=0;
        for(int i=0;i<nums.length;i++){
            int localSum=0;
            for(int j=i;j<nums.length;j++){
                localSum=localSum+nums[j];
                if(localSum>maxSubArraySum)
                    maxSubArraySum=localSum;
            }
        }
        return maxSubArraySum;
    }

    public static int maximumSubArray(int[] nums){
        int currentSum=0;
        int maxSum=nums[0];
        for(int i=0;i<nums.length; i++){
            if(currentSum<0)
                currentSum=0;
            currentSum=currentSum+nums[i];
            maxSum=Math.max(currentSum,maxSum);
        }
        return maxSum;
    }
}
