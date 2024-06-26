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

    private static String callSolution(String s){
        String str=s.substring(3);
        StringBuffer sb = new StringBuffer();
        sb.append(str.charAt(0));
        for(int i=1; i<str.length(); i++){
            if(i==str.length()-1){
                continue;
            }else if(Character.isUpperCase(str.charAt(i)) &&
                    Character.isLowerCase(str.charAt(i+1)) &&
                    Character.isUpperCase(str.charAt(i-1))){
                sb.append("_");
            }else if(Character.isUpperCase(str.charAt(i)) &&
                    Character.isLowerCase(str.charAt(i-1)) &&
                    Character.isLowerCase(str.charAt(i+1))){
                sb.append("_");
            }
            sb.append(str.charAt(i));
        }
        sb.append(str.charAt(str.length()-1));
        return sb.toString();
    }

    private static String callSolution1(String str){
        String[] r = str.substring(3).split("(?=[A-Z])");
        return String.join("_",r);
    }
}
