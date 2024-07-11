package anurag.blind75.others;

import java.util.ArrayList;

public class _1598_crawler_log_folder {
    public static void main(String... args){
        String[] logs={"d1/","d2/","../","d21/","./"};
        int res1=minOperations1(logs);
        int res2=minOperations2(logs);
        System.out.println(res1);
        System.out.println(res2);
    }
    private static int minOperations1(String[] logs){
        String same="./";
        String back="../";
        int count=0;
        for(int i=0; i<logs.length; i++){
            if(logs[i].equals(same)){
                continue;
            } else if (logs[i].equals(back)) {
                if(count!=0){
                    count--;
                }
            }else {
                count++;
            }
        }
        return count;
    }

    private static int minOperations2(String[] logs){
        String same="./";
        String back="../";
        int count=0;
        int depth = 0;
        for (String log : logs) {
            if (log.equals(back)) {
                if (depth > 0) {
                    depth--;
                }
            } else if (!log.equals(same)) {
                depth++;
            }
        }
        return depth;
    }
}
