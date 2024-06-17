package anurag.blind75.array;

public class _10_container_with_max_water {
    public static void main(String... args){
        int[] nums= {1,8,6,2,5,4,8,3,7};
        int result1=maxWaterBrutForce(nums);
        System.out.println(result1);
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

}
