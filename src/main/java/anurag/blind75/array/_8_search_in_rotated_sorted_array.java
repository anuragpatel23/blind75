package anurag.blind75.array;

public class _8_search_in_rotated_sorted_array {

    public static void main(String... args){
        int[] nums={4,5,6,7,0,1,2};
        int target=4;
        int result= searchMin(nums, target);
        System.out.println(result);
    }

    private static int searchMin(int[] nums, int target){
        int left=0;
        int right=nums.length-1;
        while(left <= right){
            int mid = (left+right)/2;
            if(nums[mid]==target){
                return mid;
            }

            if(nums[left] <= nums[mid]){
                if(target <nums[left] || target > nums[mid]){
                    left = mid+1;
                }else{
                    right= mid-1;
                }
            }else{
                if(target > nums[right] || target < nums[mid]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
        }
        return -1;
    }

}
