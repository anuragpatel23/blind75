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

    private static String callSolution(String getterName){
        String result = getterName.replaceFirst("get","");
        int index =0;

        StringBuilder finalResult= new StringBuilder();
        char finalResultChar;
        for ( char i : result.toCharArray() ) {
            if( index > 0 && index < (result.length() - 1) &&
                    ( (Character.isUpperCase(result.charAt(index)) &&
                            Character.isLowerCase(result.charAt(index-1) ) ) ||
                            Character.isUpperCase(result.charAt(index)) &&
                            Character.isLowerCase(result.charAt(index+1) ))){
                finalResultChar = '_';
                finalResult.append(finalResultChar);
            }
            finalResult.append(i);
            index++;
        }

        return finalResult.toString();
    }

    private static String callSolution1(String str){
        String[] r = str.substring(3).split("(?=[A-Z])");
        return String.join("_",r);
    }
}
