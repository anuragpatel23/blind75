package anurag.blind75.array;

public class _6_maximum_product_subarray {
    public static void main(String... args){
        int[] nums={2,3,-2,4};
        int result1=maxProductSubArrayBrutForce(nums);

        //using Dynamic programming
        int result2=maxProductSubArrayDP(nums);

        //it does not pass test case [0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0]
        //for this we need to use double value
        int[] nums1={0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0};
        int result3=maxProductSubArrayDouble(nums1);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    private static int maxProductSubArrayDouble(int[] nums) {
        int n = nums.length;
        double prefix=1,suffix=1;
        double ans=nums[0];

        for(int i=0;i<n;i++){

            //if any of l or r become 0 then update it to 1
            prefix = prefix==0 ? 1 : prefix;
            suffix = suffix==0 ? 1 : suffix;

            prefix *= (double) nums[i];   //prefix product
            suffix *= (double) nums[n-1-i];    //suffix product

            // System.out.println(l+" "+r);

            ans = Math.max(ans,Math.max(prefix,suffix));

        }

        return (int) ans;
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
