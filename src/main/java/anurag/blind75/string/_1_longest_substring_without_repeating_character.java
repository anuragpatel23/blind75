package anurag.blind75.string;

import java.util.HashMap;
import java.util.HashSet;

public class _1_longest_substring_without_repeating_character {
    public static void main(String... args){
        String s="abcabcbb";
        int result = lengthOfLongestSubstring(s);

        System.out.println("longest substring without repeating character "+result);

    }

    private static int lengthOfLongestSubstring(String s) {
        if (s == null)
            return 0;

        if(s.length()==1)
            return 1;

        int leftPointer=0;
        int rightPointer=0;
        int result=0;

        HashSet<Character> set = new HashSet<>();

        while (rightPointer<s.length()){
            char c = s.charAt(rightPointer);
            while (set.contains(c)){
                set.remove(s.charAt(leftPointer));
                leftPointer++;
            }
            set.add(c);
            result = Math.max(result, rightPointer-leftPointer+1);
            rightPointer++;
        }

        return result;
    }
}
