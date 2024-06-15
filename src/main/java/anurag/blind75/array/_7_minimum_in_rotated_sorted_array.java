package anurag.blind75.array;

public class _7_minimum_in_rotated_sorted_array {

    public static void main(String... args){
        int[] nums={3,4,5,1,2};
        int result= findMin(nums);
        System.out.println(result);
    }

    private static int findMin(int[] nums){
        int left=0;
        int right=nums.length-1;
        int res=nums[0];
        if(nums.length==1)
            return res;

        while (left<=right){
            if(nums[left] < nums[right]){
                res= Math.min(res, nums[left]);
            }
            int mid=(left+right)/2;
            res= Math.min(res, nums[mid]);
            if(nums[left] <= nums[mid]){
                left= mid+1;
            }else{
                right=mid-1;
            }
        }
        return res;
    }

}
