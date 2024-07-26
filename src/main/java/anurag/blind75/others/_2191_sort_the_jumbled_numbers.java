package anurag.blind75.others;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _2191_sort_the_jumbled_numbers {
    public static void main(String... args){
        int[] mapping= {8,9,4,0,2,1,3,5,7,6};
        int[] nums = {991,338,38};
        int[] result = sortJumbled(mapping, nums);

    }
    private static int[] sortJumbled(int[] mapping, int[] nums) {
        int length = nums.length;
        List<int[]> list= new ArrayList<>();
        for(int i=0; i< length; i++){
            int index=1;
            int encodedValue=0;
            int temp= nums[i];

            if(temp==0){
                list.add(new int[]{
                        mapping[0], i
                });
                continue;
            }

            while(temp !=0){
                int rem =mapping[temp% 10];
                encodedValue =index* rem +encodedValue;
                index = index*10;
                temp = temp/10;
            }
            list.add(new int[]{
                    encodedValue, i
            });
        }

        Collections.sort(list, (a, b)-> a[0] -b[0]);
        int[] result = new int[length];

        for(int i=0; i<length; i++){
            result[i] = nums[list.get(i)[1]];
        }

        return result;
    }
}
