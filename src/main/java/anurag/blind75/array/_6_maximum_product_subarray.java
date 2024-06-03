package anurag.blind75.array;

public class _6_maximum_product_subarray {
    public static void main(String... args){
        int[] nums={2,3,-2,4};
        int result1=maxProductSubArrayBrutForce(nums);

        //using Dynamic programming
        int result2=maxProductSubArrayDP(nums);

        System.out.println(result1);
        System.out.println(result2);
    }

    public static int maxProductSubArrayBrutForce(int[] nums){
        int maxProd=nums[0];
        for(int i=0; i<nums.length; i++){
            int localProd=1;
            for(int j=i; j<nums.length; j++){
                localProd=localProd*nums[j];
                maxProd=Math.max(maxProd, localProd);
            }
        }
        return maxProd;
    }

    public static int maxProductSubArrayDP(int[] nums){
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }

            maxProduct = Math.max(nums[i], maxProduct * nums[i]);
            minProduct = Math.min(nums[i], minProduct * nums[i]);

            result = Math.max(result, maxProduct);
        }

        return result;
    }
}
