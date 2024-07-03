package anurag.blind75.others;

import java.util.HashSet;
import java.util.Set;

public class _771_jewels_and_stones {
    public static void main(String... args){
        String jewels="aA";
        String stones="aAAbc";
        int result =numJewelsInStones(jewels, stones);
        System.out.println("gems : "+result);
    }


    private static int numJewelsInStones(String jewels, String stones) {
        int count=0;

        Set<Character> jewel= new HashSet<>();
        for(char ch: jewels.toCharArray()){
            jewel.add(ch);
        }

        for(char stone: stones.toCharArray()){
            if(jewel.contains(stone)){
                count++;
            }
        }
        return count;
    }
}
