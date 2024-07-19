package anurag.blind75.string;

import java.util.HashMap;
import java.util.Map;

public class _3_minimum_window_substring {
    public static void main(String... args){
        String s ="ADOBECODEBANC";
        String t ="ABC";
        String result = minWindow(s, t);
        System.out.println(result);
    }

    private static String minWindow(String s, String t) {
        if(s.length() == 0 || t.length() == 0 || s.length() < t.length())
            return "";

        Map<Character, Integer> tMap = new HashMap<>();

        for(int i=0; i< t.length(); i++){
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i),0) + 1);
        }

        int required = tMap.size();
        int l = 0, r =0;
        int create = 0;
        int[] result = {-1, 0, 0};
        Map<Character, Integer> subStringMap = new HashMap<>();

        while(r<s.length()){
            char c = s.charAt(r);
            int count = subStringMap.getOrDefault(c,0);
            subStringMap.put(c, count + 1);
            if(tMap.containsKey(c) && subStringMap.get(c).intValue() == tMap.get(c).intValue()){
                create++;
            }
            while(l <= r && required == create){
                c = s.charAt(l);
                if(result[0] == -1 || result[0] >= r-l+1){
                    result[0] = r -l +1;
                    result[1] = l;
                    result[2] = r;
                }

                subStringMap.put(c,subStringMap.get(c) - 1);
                if(tMap.containsKey(c) && subStringMap.get(c).intValue() < tMap.get(c).intValue()){
                    create--;
                }
                l++;
            }
            r++;
        }

        if(result[0] == -1){
            return "";
        }else{
            return s.substring(result[1], result[2]+1);
        }
    }
}
