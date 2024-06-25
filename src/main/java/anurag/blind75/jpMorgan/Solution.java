package anurag.blind75.jpMorgan;

import java.util.Arrays;

public class Solution {
    public static void main(String... args){
        String str1="getCurrency";
        String str2="getAccountName";
        String str3="getTradeID";
        String str4="getSWIFTCode";
        String result1=callSolution(str1);
        String result2=callSolution(str2);
        String result3=callSolution(str3);
        String result4=callSolution(str4);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }

    private static String callSolution(String str){
        String s1=str.substring(3);
        String[] r = s1.split("");
        StringBuffer sb = new StringBuffer();
        sb.append(s1.charAt(0));
        for(int i=1; i<r.length; i++){
            if(Character.isUpperCase(s1.charAt(i)) && Character.isLowerCase(s1.charAt(i-1))){
                sb.append("_");
            }
            sb.append(s1.charAt(i));
        }
        return sb.toString();
    }

    private static String callSolution1(String str){
        String[] r = str.substring(3).split("(?=[A-Z])");
        return String.join("_",r);
    }
}
