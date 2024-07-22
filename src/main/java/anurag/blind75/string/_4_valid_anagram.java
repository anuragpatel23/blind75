package anurag.blind75.string;

import java.util.*;
import java.util.stream.Collectors;

public class _4_valid_anagram {
    public static void main(String... args){
        String s = "anagram";
        String t = "gramana";

        boolean result1 = isAnagramBruteForce(s, t);
        boolean result2 = isAnagramSorting(s, t);
        System.out.println(result1);
        System.out.println(result2);
    }


    private static boolean isAnagramSorting(String s, String t){
        String str1 = Arrays.stream(s.split("")).sorted().collect(Collectors.joining(""));
        String str2 = Arrays.stream(t.split("")).sorted().collect(Collectors.joining(""));

        if(str1.equals(str2))
            return true;
        else
            return false;
    }

    private static boolean isAnagramBruteForce(String s, String t){
        List<Character> listS = new ArrayList<>();
        List<Character> listT = new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            listS.add(s.charAt(i));
            listT.add(t.charAt(i));
        }

        for(int i=0; i< listS.size(); i++){
            if(listT.contains(listS.get(i))){
                listT.remove(listS.get(i));
            }else{
                return false;
            }
        }

        return true;
    }

    
}
