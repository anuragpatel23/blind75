package anurag.blind75.dynamic_programming;

public class _4_longestCommonSubsequence {
    public static void main(String... args){
        String text1="abcde";
        String text2="ace";
        int result=longestCommonSubsequence(text1, text2);
        System.out.println("The longest common subsequence is "+text2+" and its length is "+result);
    }

    private static int longestCommonSubsequence(String text1, String text2){
        int[][] matrix= new int[text1.length()+1][text2.length()+1];
        for(int i=text2.length() -1 ; i>=0; i--){
            for(int j=text1.length()-1; j>=0; j--){
                if(text1.charAt(j) == text2.charAt(i)){
                    matrix[j][i]= 1+ matrix[j+1][i+1];
                }else{
                    matrix[j][i]= Math.max(matrix[j+1][i], matrix[j][i+1]);
                }
            }

        }
        return matrix[0][0];
    }
}
