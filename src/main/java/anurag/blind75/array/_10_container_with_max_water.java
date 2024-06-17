package anurag.blind75.array;

public class _10_container_with_max_water {
    public static void main(String... args){
        int[] nums= {1,8,6,2,5,4,8,3,7};
        int result1=maxWaterBrutForce(nums);
        int result2=maxWaterTwoPointer(nums);
        System.out.println(result1);
        System.out.println(result2);
    }

    private static int maxWaterBrutForce(int[] height){
        int max=1;
        for(int i=0; i<height.length; i++){
            for(int j=i; j<height.length; j++){
                int maxHeight=Math.min(height[i], height[j]);
                int length=j-i;
                int area=maxHeight * length;
                if(area>max)
                    max=area;
            }
        }
        return max;
    }

    private static int maxWaterTwoPointer(int[] height) {
        int max=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int width= right-left;
            int area=Math.min(height[left], height[right])*width;

            max=Math.max(max, area);

            if(height[left]<=height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}
