package anurag.blind75.others;

public class _169_majority_element {

    public static void main(String... args){
        int[] nums={3,2,3};
        int result = majorityElement(nums);
        System.out.println("majority element in array is : "+result);
    }
    private static int majorityElement(int[] nums) {
        int count=1;
        int curr=nums[0];
        for(int i=1; i<nums.length; i++){

            if(count==0){
                curr= nums[i];
                count = 1;
            } else if(curr == nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return curr;
    }
}